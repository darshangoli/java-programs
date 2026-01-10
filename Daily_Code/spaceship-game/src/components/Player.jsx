import React, { useEffect } from 'react';
import { Rocket } from 'lucide-react';

const Player = ({ position }) => {
    return (
        <div
            className="absolute transform -translate-x-1/2 -translate-y-1/2 text-blue-400"
            style={{ left: position.x, top: position.y }}
        >
            <Rocket size={48} />
        </div>
    );
};

export default Player;
