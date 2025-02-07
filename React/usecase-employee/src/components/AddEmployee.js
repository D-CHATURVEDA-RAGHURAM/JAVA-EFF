import React, { Fragment, useState } from "react";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { useNavigate } from "react-router-dom";

const AddEmployee = () => {
    const [employees, setEmployees] = useState({
        employeeId: "",
        employeeName: "",
        employeeDesig: ""
    });

    const [showViewButton, setShowViewButton] = useState(false); // State to show/hide button
    const navigate = useNavigate();

    // Form handler function
    const handleForm = (e) => {
        e.preventDefault();
        console.log("Submitted Employee Data:", employees);

        // Prepare employee data
        const employeeData = {
            ...(employees.employeeId.trim() !== "" && { employeeId: Number(employees.employeeId) }),
            employeeName: employees.employeeName.trim() !== "" ? employees.employeeName : null,
            employeeDesig: employees.employeeDesig.trim() !== "" ? employees.employeeDesig : null
        };

        postDataToServer(employeeData);
    };

    // Function to send data to the backend
    const postDataToServer = (data) => {
        console.log("Final Data Sent to Backend:", data); // Debugging

        axios.post(`${base_url}/insert`, data)
            .then((response) => {
                console.log("Success:", response);
                toast.success("Employee Details Added Successfully!");
                setEmployees({ employeeId: "", employeeName: "", employeeDesig: "" });
                setShowViewButton(true); // Show button after adding employee
            })
            .catch((error) => {
                console.error("Error Response:", error.response);
                toast.error("Something went wrong!");
            });
    };

    return (
        <Fragment>
            <h1 className="text-center my-3">Fill Employee Details</h1>
            <Form onSubmit={handleForm}>
                <FormGroup>
                    <label htmlFor="userId">Employee ID</label>
                    <Input
                        type="text"
                        placeholder="Enter Employee ID"
                        id="userId"
                        value={employees.employeeId}
                        onChange={(e) => setEmployees({ ...employees, employeeId: e.target.value })}
                    />
                </FormGroup>

                <FormGroup>
                    <label htmlFor="name">Employee Name</label>
                    <Input
                        type="text"
                        placeholder="Enter Employee Name"
                        id="name"
                        value={employees.employeeName}
                        onChange={(e) => setEmployees({ ...employees, employeeName: e.target.value })}
                    />
                </FormGroup>

                <FormGroup>
                    <label htmlFor="designation">Employee Designation</label>
                    <Input
                        type="text"
                        placeholder="Enter Employee Designation"
                        id="designation"
                        value={employees.employeeDesig}
                        onChange={(e) => setEmployees({ ...employees, employeeDesig: e.target.value })}
                    />
                </FormGroup>

                <Container className="text-center">
                    <Button type="submit" color="success">Add Employee</Button>
                    <Button 
                        type="reset" 
                        color="warning" 
                        className="ms-2" 
                        onClick={() => {
                            setEmployees({ employeeId: "", employeeName: "", employeeDesig: "" });
                            setShowViewButton(false); // Hide button on reset
                        }}
                    >Clear
                    </Button>
                </Container>
            </Form>

            {/* Show "Show Added Employee" button only after successful addition */}
            {showViewButton && (
                <Container className="text-center mt-3">
                    <Button color="info" onClick={() => navigate("/view-employee")}>
                        Show Added Employee
                    </Button>
                </Container>
            )}
        </Fragment>
    );
};

export default AddEmployee;
