import React, { useEffect, useState } from "react";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const UpdateEmployee = () => {
    const { employeeId } = useParams();
    const navigate = useNavigate();
    
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
    }, [employeeId]);

    // Handle form submission
    const handleForm = (e) => {
        e.preventDefault();
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
    );
};

export default UpdateEmployee;
