import React from 'react';

const Projectile = ({ position }) => {
    return (
        <div
            className="absolute w-2 h-6 bg-yellow-400 rounded-full shadow-[0_0_10px_rgba(250,204,21,0.8)]"
            style={{ left: position.x, top: position.y }}
        />
    );
};

export default Projectile;
