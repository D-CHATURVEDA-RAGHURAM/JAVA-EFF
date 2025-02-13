import React from "react";
<<<<<<< HEAD
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
=======
import { ListGroup, ListGroupItem } from "reactstrap";
import { Link } from "react-router-dom";

const Menus=()=>{
    return (
        <ListGroup>
            <Link className="list-group-item list-group-item-action" tag="a" to="/" action>
                Home
            </Link>
            <Link className="list-group-item list-group-item-action" tag="a" to="/add-employee" action>
                Add Employee
            </Link>
            <Link className="list-group-item list-group-item-action" tag="a" to="/view-employee" action>
                View Employees
            </Link>
            <Link className="list-group-item list-group-item-action" tag="a" to="#!" action>
                About
            </Link>
            <Link className="list-group-item list-group-item-action" tag="a" to="#!" action>
                Contact
            </Link>
        </ListGroup>
    )
}

export default Menus;
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
