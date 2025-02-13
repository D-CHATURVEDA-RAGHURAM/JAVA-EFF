import React, { useEffect, useState } from "react";
<<<<<<< HEAD
import { Button, Container, Form, FormGroup, Input, Label } from "reactstrap";
=======
import { Button, Container, Form, FormGroup, Input } from "reactstrap";
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
<<<<<<< HEAD
import Header from "./Header"; 
=======
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e

const UpdateEmployee = () => {
    const { employeeId } = useParams();
    const navigate = useNavigate();
<<<<<<< HEAD

    const [employee, setEmployee] = useState({
        employeeName: "",
        employeeDesig: "",
    });

    // Fetch employee details when component loads
    useEffect(() => {
        axios.get(`${base_url}/get/${employeeId}`)
            .then((response) => {
                setEmployee({
                    employeeName: response.data.employeeName,
                    employeeDesig: response.data.employeeDesig,
                });
            })
            .catch(() => toast.error("Error fetching employee details!"));
=======
    
    const [employee, setEmployee] = useState({
        employeeId: "",
        employeeName: "",
        employeeDesig: ""
    });

    // Fetch employee details on page load
    useEffect(() => {
        axios.get(`${base_url}/get/${employeeId}`)
            .then((response) => {
                setEmployee(response.data);
            })
            .catch((error) => {
                toast.error("Error fetching employee details!");
            });
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
    }, [employeeId]);

    // Handle form submission
    const handleForm = (e) => {
        e.preventDefault();
<<<<<<< HEAD

        axios.put(`${base_url}/update/${employeeId}`, employee)
        .then(() => {
            toast.success("Employee Updated Successfully!");
            navigate("/view-employee"); // Redirect after update
        })
        .catch(() => toast.error("Error updating employee!"));
    };

    // Handle input changes
    const handleChange = (e) => {
        setEmployee({ ...employee, [e.target.name]: e.target.value });
    };

    // Handle Employee ID click
    const handleIdClick = () => {
        alert("You cannot edit ID");
    };

    return (
        <>
            <Header />
            <Container>
                <h1 className="text-center my-3">Update Employee Details</h1>
                <Form onSubmit={handleForm}>
                    
                    {/* Employee ID - Read-only */}
                    <FormGroup>
                        <Label>Employee ID</Label>
                        <Input 
                            type="text" 
                            value={employeeId} 
                            readOnly 
                            onClick={handleIdClick} 
                            style={{ backgroundColor: "#f0f0f0", cursor: "not-allowed" }}
                        />
                    </FormGroup>

                    {/* Employee Name */}
                    <FormGroup>
                        <Label>Employee Name</Label>
                        <Input 
                            type="text" 
                            name="employeeName" 
                            value={employee.employeeName}
                            onChange={handleChange}
                            required
                        />
                    </FormGroup>

                    {/* Employee Designation */}
                    <FormGroup>
                        <Label>Employee Designation</Label>
                        <Input 
                            type="select" 
                            name="employeeDesig" 
                            value={employee.employeeDesig}
                            onChange={handleChange}
                            required
                        >
                            <option value="">Select Designation</option> {/* Default Option */}
                            <option value="Full Stack">Full Stack</option>
                            <option value="QA">QA</option>
                            <option value="BA">BA</option>
                        </Input>
                    </FormGroup>


                    {/* Buttons */}
                    <Container className="text-center d-flex justify-content-between">
                        <Button type="button" color="secondary" onClick={() => navigate(-1)}>Back</Button>
                        <Button type="submit" color="success">Save & Update</Button>
                    </Container>
                </Form>
            </Container>
        </>
=======
        axios.put(`${base_url}/update/${employeeId}`, employee)
            .then(() => {
                toast.success("Employee Updated Successfully!");
                navigate("/view-employee");  // Redirect to View Employees
            })
            .catch(() => {
                toast.error("Error updating employee!");
            });
    };

    const handleIdClick = () => {
        toast.warn("You Cannot Edit Employee Id", {
            position: "top-center",
            autoClose: 3000,
        });
    };

    return (
        <Container>
            <h1 className="text-center my-3">Update Employee Details</h1>
            <Form onSubmit={handleForm}>
                <FormGroup>
                    <label>Employee ID</label>
                    <Input 
                    type="text" 
                    value={employee.employeeId} 
                    readOnly 
                    onClick={handleIdClick}
                    style={{ cursor: "not-allowed", backgroundColor: "#f8f9fa" }} />
                </FormGroup>

                <FormGroup>
                    <label>Employee Name</label>
                    <Input
                        type="text"
                        value={employee.employeeName}
                        onChange={(e) => setEmployee({ ...employee, employeeName: e.target.value })}
                    />
                </FormGroup>

                <FormGroup>
                    <label>Employee Designation</label>
                    <Input
                        type="text"
                        value={employee.employeeDesig}
                        onChange={(e) => setEmployee({ ...employee, employeeDesig: e.target.value })}
                    />
                </FormGroup>

                <Container className="text-center">
                    <Button type="submit" color="success">Save & Update</Button>
                </Container>
            </Form>
        </Container>
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
    );
};

export default UpdateEmployee;
