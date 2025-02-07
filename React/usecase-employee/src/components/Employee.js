import React from "react";
import {
    Card,
    CardBody,
    CardTitle,
    CardSubtitle,
    CardText,
    CardFooter,
    Button,
    Container,
} from "reactstrap";
import axios from "axios";
import { toast } from "react-toastify";
import base_url from "../api/bootapi";
import { useNavigate } from "react-router-dom";

const Employee = ({ employee , update}) => {
    const navigate = useNavigate();
    const deleteEmployee=(employeeId)=>{
        axios.delete(`${base_url}/delete/${employeeId}`).then(
            (response)=>{
                toast.success("employee deleted successfully");
                update(employeeId);
            },
            (error)=>{
                toast.error("employee not deleted");
            }
        )
    }

    const updateEmployee = (employeeId) => {
        const updatedEmployee = {
            employeeName: employee.employeeName,
            employeeDesig: employee.employeeDesig
        };
    
        axios.put(`${base_url}/update/${employeeId}`, updatedEmployee)
            .then((response) => {
                navigate(`/update-employee/${employeeId}`);
            })
            .catch((error) => {
                toast.error("Employee update failed");
                console.error("Error updating employee:", error);
            });
    };
    

    return (
        <Card className="text-center">
            <CardBody>
                <CardTitle className="font-weight-bold">{employee.employeeName}</CardTitle>
                <CardSubtitle>Designation: {employee.employeeDesig}</CardSubtitle>
                <Container className="text-center mt-2">
                    <Button color="warning" onClick={()=>{
                        deleteEmployee(employee.employeeId);
                    }}>Delete</Button>
                    <Button color="danger" className="ms-2" onClick={()=>{
                        updateEmployee(employee.employeeId);
                        }}>Update</Button>
                </Container>
            </CardBody>
        </Card>
    );
};

export default Employee;
