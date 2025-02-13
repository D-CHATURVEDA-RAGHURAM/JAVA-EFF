import React, { useState, useEffect } from "react";
import Employee from "./Employee";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
<<<<<<< HEAD
import { Button, Container, Table } from "reactstrap";
import Header from "./Header";
import { useNavigate } from "react-router-dom";
import EmployeeModal from "./EmployeeModal"; // ✅ Import EmployeeModal

const Allemployees = () => {
    const [employees, setEmployees] = useState([]);
    const [selectedEmployee, setSelectedEmployee] = useState(null);
    const [isModalOpen, setIsModalOpen] = useState(false);
    const navigate = useNavigate();
=======
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
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e

    useEffect(() => {
        getAllEmployeesFromServer();
    }, []);

<<<<<<< HEAD
    const getAllEmployeesFromServer = () => {
        axios.get(`${base_url}/display`)
            .then((response) => setEmployees(response.data))
            .catch(() => toast.error("Something went wrong"));
    };

    const updateAfterDelete = (employeeId) => {
        setEmployees((prevEmployees) => prevEmployees.filter(emp => emp.employeeId !== employeeId));
    };

    const handleViewEmployee = (employee) => {
        setSelectedEmployee(employee);
        setIsModalOpen(true);
    };

    const getImageForDesignation = (designation) => {
        const imageMap = {
            "Full Stack": "/uploads/fullstack.png",
            "QA": "/uploads/qa.png",
            "BA": "/uploads/ba.png",
        };
        return imageMap[designation] || "/uploads/default.png";
    };

    return (
        <>
            <Header />
            <Container className="text-center">
                <h3 className="mb-4">All Employee Details</h3>

                <Button color="primary" className="m-2" onClick={() => navigate("/home")}>
                    Go to Home
                </Button>
                <Button color="success" className="m-2" onClick={() => navigate("/add-employee")}>
                    Add Employee
                </Button>

                <Table bordered striped responsive className="mt-3">
                    <thead className="bg-dark text-white">
                        <tr>
                            <th>Employee ID</th>
                            <th>Employee Name</th>
                            <th>Designation</th>
                            <th>Image</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {employees.length > 0 ? (
                            employees
                                .sort((a, b) => a.employeeId - b.employeeId)
                                .map((item) => (
                                    <Employee key={item.employeeId} employee={item} update={updateAfterDelete} onView={handleViewEmployee} />
                                ))
                        ) : (
                            <tr>
                                <td colSpan="5" className="text-center">No Employees Found</td>
                            </tr>
                        )}
                    </tbody>
                </Table>
            </Container>

            {/* ✅ Employee Details Modal */}
            <EmployeeModal 
                isOpen={isModalOpen} 
                toggle={() => setIsModalOpen(!isModalOpen)} 
                employee={selectedEmployee} 
                getImageForDesignation={getImageForDesignation} 
            />
        </>
=======
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
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
    );
};

export default Allemployees;
