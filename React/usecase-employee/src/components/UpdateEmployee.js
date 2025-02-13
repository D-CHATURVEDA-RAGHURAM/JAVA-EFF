import React, { useEffect, useState } from "react";
import { Button, Container, Form, FormGroup, Input, Label } from "reactstrap";
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import Header from "./Header"; 

const UpdateEmployee = () => {
    const { employeeId } = useParams();
    const navigate = useNavigate();

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
    }, [employeeId]);

    // Handle form submission
    const handleForm = (e) => {
        e.preventDefault();

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
    );
};

export default UpdateEmployee;
