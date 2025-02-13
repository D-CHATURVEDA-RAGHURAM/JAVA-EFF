<<<<<<< HEAD
import React, { useState } from "react";
import { Button, Container, Form, FormGroup, Input, FormFeedback } from "reactstrap";
=======
import React, { Fragment, useState } from "react";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { useNavigate } from "react-router-dom";
<<<<<<< HEAD
import Header from "./Header";

const AddEmployee = () => {
    const [employees, setEmployees] = useState({
        employeeName: "",
        employeeDesig: "",
        employeeImage: "",  // Add employeeImage field
    });

    const [errors, setErrors] = useState({
        employeeName: false,
        employeeDesig: false,
        employeeImage: false,
    });

    const navigate = useNavigate();

    // Function to handle Designation change
    const handleDesignationChange = (e) => {
        const selectedDesig = e.target.value;
        let image = "";

        // Automatically select an image based on designation
        if (selectedDesig === "Full Stack") image = "fullstack.png";
        if (selectedDesig === "QA") image = "qa.png";
        if (selectedDesig === "BA") image = "ba.png";

        setEmployees({ ...employees, employeeDesig: selectedDesig, employeeImage: image });
    };

    const handleForm = (e) => {
        e.preventDefault();

        let newErrors = {
            employeeName: !employees.employeeName.trim(),
            employeeDesig: !employees.employeeDesig.trim(),
            employeeImage: !employees.employeeImage.trim(), // Ensure image is selected
        };

        setErrors(newErrors);

        if (Object.values(newErrors).some(error => error)) {
            toast.error("Please fill all the fields before submitting!");
            return;
        }

        // Prepare data to send to the backend
        const employeeData = {
            employeeName: employees.employeeName,
            employeeDesig: employees.employeeDesig,
            employeeImage: employees.employeeImage, // Send the image name
=======

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
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
        };

        postDataToServer(employeeData);
    };

<<<<<<< HEAD
    const postDataToServer = (data) => {
        axios.post(`${base_url}/insert`, data)
            .then(() => {
                toast.success("Employee Added Successfully!");
                setEmployees({ employeeName: "", employeeDesig: "", employeeImage: "" });
                navigate("/view-employee");
            })
            .catch(() => {
                toast.error("Error Adding Employee!");
=======
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
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
            });
    };

    return (
<<<<<<< HEAD
        <>
            <Header />
            <Container>
                <div className="d-flex justify-content-between align-items-center mb-3">
                    <Button color="secondary" onClick={() => navigate("/view-employee")}>Back</Button>
                    <h1 className="text-center flex-grow-1">Add Employee</h1>
                </div>

                <Form onSubmit={handleForm}>
                    <FormGroup>
                        <label>Employee Name</label>
                        <Input 
                            type="text" 
                            placeholder="Enter Employee Name"
                            value={employees.employeeName}
                            onChange={(e) => setEmployees({ ...employees, employeeName: e.target.value })}
                            invalid={errors.employeeName}
                        />
                        <FormFeedback>Employee Name is required!</FormFeedback>
                    </FormGroup>

                    {/* Designation Dropdown */}
                    <FormGroup>
                        <label>Employee Designation</label>
                        <Input 
                            type="select"
                            value={employees.employeeDesig}
                            onChange={handleDesignationChange}  // Auto-update image
                            invalid={errors.employeeDesig}
                        >
                            <option value="">Select Designation</option>
                            <option value="Full Stack">Full Stack</option>
                            <option value="QA">QA</option>
                            <option value="BA">BA</option>
                        </Input>
                        <FormFeedback>Please select a designation!</FormFeedback>
                    </FormGroup>

                    {/* Image Dropdown (Disabled - Auto Selected) */}
                    <FormGroup>
                        <label>Employee Image</label>
                        <Input 
                            type="select"
                            value={employees.employeeImage}
                            disabled  // User can't change, it's auto-set
                        >
                            <option value="">Select Image</option>
                            <option value="fullstack.png">Full Stack</option>
                            <option value="qa.png">QA</option>
                            <option value="ba.png">BA</option>
                        </Input>
                    </FormGroup>

                    {/* Display Selected Image */}
                    {employees.employeeImage && (
                        <FormGroup>
                            <label>Preview:</label>
                            <img 
                                src={`/uploads/${employees.employeeImage}`} 
                                alt="Selected"
                                width="100" 
                                height="100" 
                                style={{ border: "1px solid #ddd", borderRadius: "5px", padding: "5px" }}
                            />
                        </FormGroup>
                    )}

                    <Container className="text-center">
                        <Button type="submit" color="success">Add Employee</Button>
                        <Button 
                            type="reset" 
                            color="warning" 
                            className="ms-2"
                            onClick={() => setEmployees({ employeeName: "", employeeDesig: "", employeeImage: "" })}
                        >
                            Clear
                        </Button>
                    </Container>
                </Form>
            </Container>
        </>
=======
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
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
    );
};

export default AddEmployee;
