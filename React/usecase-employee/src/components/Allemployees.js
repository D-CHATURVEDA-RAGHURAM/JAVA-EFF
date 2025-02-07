import React, { useState, useEffect } from "react";
import Employee from "./Employee";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { Button, Container } from "reactstrap";

const Allemployees = () => {
    const [employees, setEmployees] = useState([]);

    // Fetch employees from the server
    const getAllEmployeesFromServer = () => {
        axios.get(`${base_url}/display`)
            .then((response) => {
                console.log("API Response:", response.data);
                setEmployees(response.data);
            })
            .catch((error) => {
                console.error("Error fetching employees:", error);
                toast.error("Something went wrong");
            });
    };

    useEffect(() => {
        getAllEmployeesFromServer();
    }, []);

    // Delete function to update UI
    const deleteEmployeeById = (employeeId) => {
        setEmployees(employees.filter((c) => c.employeeId !== employeeId));
    };

    // Sort by ascending order (by name)
    const sortByAscendingOrder = () => {
        setEmployees([...employees].sort((a, b) => a.employeeName.localeCompare(b.employeeName)));
    };

    // Sort by descending order (by name)
    const sortByDescendingOrder = () => {
        setEmployees([...employees].sort((a, b) => b.employeeName.localeCompare(a.employeeName)));
    };

    return (
        <div className="text-center">
            <h3>All Employee Details</h3>
            <Container className="mb-3">
                <Button color="primary" className="me-2" onClick={sortByAscendingOrder}>Ascending Order</Button>
                <Button color="success" onClick={sortByDescendingOrder}>Descending Order</Button>
            </Container>

            {employees.length > 0 ? (
                employees.map((item) => (
                    <Employee key={item.employeeId} employee={item} update={deleteEmployeeById} />
                ))
            ) : (
                <p>No Employees Found</p>
            )}
        </div>
    );
};

export default Allemployees;
