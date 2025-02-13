import React from "react";
import { BrowserRouter as Router, Routes, Route, Navigate, useLocation } from "react-router-dom";
import Home from "./components/Home";
import Allemployees from "./components/Allemployees";
import AddEmployee from "./components/AddEmployee";
import Menus from "./components/Menus";
import UpdateEmployee from "./components/UpdateEmployee";
import Login from "./components/Login";
import { Container } from "reactstrap";

function App() {
    return (
        <Router>
            <Main />
        </Router>
    );
}

function Main() {
    const location = useLocation();
    const showMenus = location.pathname !== "/login"; // Hide menu on login page

    return (
        <Container>
            {showMenus && <Menus />}
            <Routes>
                <Route path="/" element={<Navigate to="/login" />} />
                <Route path="/login" element={<Login />} />
                <Route path="/home" element={<Home />} />
                <Route path="/add-employee" element={<AddEmployee />} />
                <Route path="/view-employee" element={<Allemployees />} />
                <Route path="/update-employee/:employeeId" element={<UpdateEmployee />} />
            </Routes>
        </Container>
    );
}

export default App;
