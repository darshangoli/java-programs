import React, { useEffect, useState } from 'react';

const Starfield = () => {
    const [stars, setStars] = useState([]);

    useEffect(() => {
        const generateStars = () => {
            const newStars = [];
            for (let i = 0; i < 100; i++) {
                newStars.push({
                    id: i,
                    x: Math.random() * 100,
                    y: Math.random() * 100,
                    size: Math.random() * 2 + 1,
                    opacity: Math.random(),
                    speed: Math.random() * 0.5 + 0.1
                });
            }
            setStars(newStars);
        };
        generateStars();
    }, []);

    return (
        <div className="absolute inset-0 overflow-hidden pointer-events-none">
            {stars.map(star => (
                <div
                    key={star.id}
                    className="absolute bg-white rounded-full"
                    style={{
                        left: `${star.x}%`,
                        top: `${star.y}%`,
                        width: `${star.size}px`,
                        height: `${star.size}px`,
                        opacity: star.opacity,
                        animation: `twinkle ${1 / star.speed}s infinite alternate`
                    }}
                />
            ))}
            <style>{`
        @keyframes twinkle {
          0% { opacity: 0.3; }
          100% { opacity: 1; }
        }
      `}</style>
        </div>
    );
};

export default Starfield;
