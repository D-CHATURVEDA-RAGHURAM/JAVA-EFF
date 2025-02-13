<<<<<<< HEAD
import React from "react";
import { Container, Button } from "reactstrap";
import { useNavigate } from "react-router-dom";
import "../styles/Home.css"; // Import the updated CSS file

const Home = () => {
    const navigate = useNavigate();

    return (
        <Container className="container">
            <h1>Welcome to Employee Manager</h1>
            <p>Select an option below:</p>
            <div className="button-container">
                <Button className="add-btn" onClick={() => navigate("/add-employee")}>
                    Add Employee
                </Button>
                <Button className="view-btn" onClick={() => navigate("/view-employee")}>
                    View Employees
                </Button>
            </div>
        </Container>
    );
};

export default Home;
=======
import React, { useEffect } from "react";
import {Container} from "reactstrap";
import { Button } from 'reactstrap';


const Home=()=>{

    return (
        <div>
    <Container className="text-center">
        <h1>This is my HomePage</h1>
        <p>In this page, you can select whether you are a student or employee.</p>
        <Button color="primary">Start Using</Button>
    </Container>
        </div>
    )
}

export default Home;
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
