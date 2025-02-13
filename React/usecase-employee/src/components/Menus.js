import React from "react";
import { Button } from "reactstrap";
import {useNavigate, useLocation } from "react-router-dom";

const Menus = () => {
    const navigate = useNavigate();
    const location = useLocation();

    const handleLogout = () => {
        localStorage.removeItem("token");
        navigate("/login");
    };

    if (location.pathname === "/login") return null;

    return (
        <div className="menu-bar">
            <Button className="menu-link" to="/home">Home</Button>
            <Button color="danger" onClick={handleLogout}>Logout</Button>
        </div>
    );
};

export default Menus;
