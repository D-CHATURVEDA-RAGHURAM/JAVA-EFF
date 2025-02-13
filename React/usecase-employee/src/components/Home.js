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
