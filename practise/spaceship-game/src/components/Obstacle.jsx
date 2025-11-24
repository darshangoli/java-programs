import React from 'react';

const Obstacle = ({ position }) => {
    return (
        <div
            className="absolute w-10 h-10 bg-gray-600 rounded-full border-2 border-gray-400"
            style={{ left: position.x, top: position.y }}
        />
    );
};

export default Obstacle;
