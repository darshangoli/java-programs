import React, { useEffect, useRef, useState, useCallback } from 'react';
import Player from './Player';
import Projectile from './Projectile';
import Obstacle from './Obstacle';
import Starfield from './Starfield';

const GameLoop = () => {
  const [gameState, setGameState] = useState('start'); // start, playing, gameover
  const [score, setScore] = useState(0);
  const [lives, setLives] = useState(3);

  const requestRef = useRef();
  const previousTimeRef = useRef();
  const lastSpawnTimeRef = useRef(0);
  const lastShotTimeRef = useRef(0);

  const [playerPos, setPlayerPos] = useState({ x: window.innerWidth / 2, y: window.innerHeight - 100 });
  const [projectiles, setProjectiles] = useState([]);
  const [obstacles, setObstacles] = useState([]);

  // Input state
  const keysPressed = useRef({});

  // Game constants
  const PROJECTILE_SPEED = 10;
  const OBSTACLE_SPEED = 4;
  const SPAWN_RATE = 1500; // ms
  const FIRE_RATE = 200; // ms
  const PLAYER_SPEED = 7;
  const PLAYER_SIZE = 48;
  const OBSTACLE_SIZE = 40;
  const PROJECTILE_WIDTH = 8;
  const PROJECTILE_HEIGHT = 24;

  const spawnObstacle = (time) => {
    if (time - lastSpawnTimeRef.current > SPAWN_RATE) {
      const x = Math.random() * (window.innerWidth - OBSTACLE_SIZE) + OBSTACLE_SIZE / 2;
      setObstacles(prev => [...prev, {
        id: Date.now(),
        x,
        y: -OBSTACLE_SIZE
      }]);
      lastSpawnTimeRef.current = time;
    }
  };

  const handleKeyDown = useCallback((e) => {
    keysPressed.current[e.code] = true;
  }, []);

  const handleKeyUp = useCallback((e) => {
    keysPressed.current[e.code] = false;
  }, []);

  useEffect(() => {
    window.addEventListener('keydown', handleKeyDown);
    window.addEventListener('keyup', handleKeyUp);
    return () => {
      window.removeEventListener('keydown', handleKeyDown);
      window.removeEventListener('keyup', handleKeyUp);
    };
  }, [handleKeyDown, handleKeyUp]);

  const handleInput = (time) => {
    if (gameState !== 'playing') return;

    // Movement
    if (keysPressed.current['ArrowLeft']) {
      setPlayerPos(prev => ({
        ...prev,
        x: Math.max(PLAYER_SIZE / 2, prev.x - PLAYER_SPEED)
      }));
    }
    if (keysPressed.current['ArrowRight']) {
      setPlayerPos(prev => ({
        ...prev,
        x: Math.min(window.innerWidth - PLAYER_SIZE / 2, prev.x + PLAYER_SPEED)
      }));
    }

    // Shooting
    if (keysPressed.current['Space']) {
      if (time - lastShotTimeRef.current > FIRE_RATE) {
        setProjectiles(prev => [...prev, {
          id: Date.now(),
          x: playerPos.x,
          y: playerPos.y - PLAYER_SIZE / 2
        }]);
        lastShotTimeRef.current = time;
      }
    }
  };

  const checkCollisions = () => {
    setProjectiles(prevProjectiles => {
      let nextProjectiles = [...prevProjectiles];
      let scoreIncrement = 0;

      setObstacles(prevObstacles => {
        const survivingObstacles = [];
        const projectileHits = new Set();

        prevObstacles.forEach(obstacle => {
          let obstacleHit = false;

          for (let i = 0; i < nextProjectiles.length; i++) {
            const projectile = nextProjectiles[i];
            if (projectileHits.has(projectile.id)) continue;

            if (
              projectile.x < obstacle.x + OBSTACLE_SIZE / 2 &&
              projectile.x + PROJECTILE_WIDTH > obstacle.x - OBSTACLE_SIZE / 2 &&
              projectile.y < obstacle.y + OBSTACLE_SIZE / 2 &&
              projectile.y + PROJECTILE_HEIGHT > obstacle.y - OBSTACLE_SIZE / 2
            ) {
              obstacleHit = true;
              projectileHits.add(projectile.id);
              scoreIncrement += 10;
              break;
            }
          }

          if (!obstacleHit) {
            survivingObstacles.push(obstacle);
          }
        });

        // Filter projectiles that hit
        nextProjectiles = nextProjectiles.filter(p => !projectileHits.has(p.id));

        if (scoreIncrement > 0) {
          setScore(s => s + scoreIncrement);
        }

        return survivingObstacles;
      });

      return nextProjectiles;
    });

    // Check player collision
    setObstacles(prevObstacles => {
      const remainingObstacles = [];
      let hitPlayer = false;
      prevObstacles.forEach(o => {
        if (
          o.x < playerPos.x + PLAYER_SIZE / 2 &&
          o.x + OBSTACLE_SIZE > playerPos.x - PLAYER_SIZE / 2 &&
          o.y < playerPos.y + PLAYER_SIZE / 2 &&
          o.y + OBSTACLE_SIZE > playerPos.y - PLAYER_SIZE / 2
        ) {
          hitPlayer = true;
        } else {
          remainingObstacles.push(o);
        }
      });

      if (hitPlayer) {
        setLives(l => {
          const newLives = l - 1;
          if (newLives <= 0) setGameState('gameover');
          return newLives;
        });
      }

      return remainingObstacles;
    });
  };

  const updateGame = (time) => {
    spawnObstacle(time);
    handleInput(time);

    setProjectiles(prev => prev.map(p => ({ ...p, y: p.y - PROJECTILE_SPEED })).filter(p => p.y > -50));
    setObstacles(prev => prev.map(o => ({ ...o, y: o.y + OBSTACLE_SPEED })).filter(o => o.y < window.innerHeight + 50));

    checkCollisions();
  };

  const animate = (time) => {
    if (previousTimeRef.current !== undefined) {
      updateGame(time);
    }
    previousTimeRef.current = time;
    if (gameState === 'playing') {
      requestRef.current = requestAnimationFrame(animate);
    }
  };

  useEffect(() => {
    if (gameState === 'playing') {
      requestRef.current = requestAnimationFrame(animate);
    } else {
      cancelAnimationFrame(requestRef.current);
    }
    return () => cancelAnimationFrame(requestRef.current);
  }, [gameState]);

  const startGame = () => {
    setGameState('playing');
    setScore(0);
    setLives(3);
    setProjectiles([]);
    setObstacles([]);
    previousTimeRef.current = undefined;
    lastSpawnTimeRef.current = 0;
    setPlayerPos({ x: window.innerWidth / 2, y: window.innerHeight - 100 });
  };

  return (
    <div className="relative w-full h-screen bg-slate-900 overflow-hidden cursor-none">
      <Starfield />

      {gameState === 'start' && (
        <div className="absolute inset-0 flex flex-col items-center justify-center text-white z-10 bg-black/80">
          <h1 className="text-6xl font-bold mb-8 text-transparent bg-clip-text bg-gradient-to-r from-blue-400 to-purple-600">
            SPACE SHOOTER
          </h1>
          <div className="mb-8 text-center text-gray-300">
            <p className="mb-2">Controls:</p>
            <p>⬅️ ➡️ Arrow Keys to Move</p>
            <p>SPACE to Shoot</p>
          </div>
          <button
            onClick={startGame}
            className="px-8 py-4 bg-blue-600 rounded-full text-2xl font-bold hover:bg-blue-500 transition shadow-[0_0_20px_rgba(37,99,235,0.5)]"
          >
            Start Mission
          </button>
        </div>
      )}

      {gameState === 'playing' && (
        <>
          <div className="absolute top-4 left-4 text-white text-xl font-mono z-10">
            Score: <span className="text-yellow-400">{score}</span>
          </div>
          <div className="absolute top-4 right-4 text-white text-xl font-mono z-10">
            Lives: <span className="text-red-400">{'♥'.repeat(lives)}</span>
          </div>

          <Player position={playerPos} />

          {projectiles.map((p) => (
            <Projectile key={p.id} position={p} />
          ))}

          {obstacles.map((o) => (
            <Obstacle key={o.id} position={o} />
          ))}
        </>
      )}

      {gameState === 'gameover' && (
        <div className="absolute inset-0 flex flex-col items-center justify-center text-white z-10 bg-black/90">
          <h1 className="text-6xl font-bold mb-4 text-red-500">GAME OVER</h1>
          <p className="text-3xl mb-8">Final Score: {score}</p>
          <button
            onClick={startGame}
            className="px-8 py-4 bg-white text-black rounded-full text-xl font-bold hover:bg-gray-200 transition"
          >
            Try Again
          </button>
        </div>
      )}
    </div>
  );
};

export default GameLoop;
