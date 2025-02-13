import React from "react";
<<<<<<< HEAD
import { Button } from "reactstrap";
=======
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
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
import axios from "axios";
import { toast } from "react-toastify";
import base_url from "../api/bootapi";
import { useNavigate } from "react-router-dom";

<<<<<<< HEAD
const Employee = ({ employee, update, onView }) => {
    const navigate = useNavigate();

    // ✅ Mapping designations to specific images
    const getImageForDesignation = (designation) => {
        const imageMap = {
            "Full Stack": "/uploads/fullstack.png",
            "QA": "/uploads/qa.png",
            "BA": "/uploads/ba.png",
        };
        return imageMap[designation] || "/uploads/default.png"; // Default image if no match
    };

    const deleteEmployee = (employeeId) => {
        axios.delete(`${base_url}/delete/${employeeId}`)
            .then(() => {
                toast.success("Employee deleted successfully");
                update(employeeId);
            })
            .catch(() => {
                toast.error("Error deleting employee");
            });
    };

    return (
        <tr>
            <td>{employee.employeeId}</td>
            <td>{employee.employeeName}</td>
            <td>{employee.employeeDesig}</td>
            <td>
                <img 
                    src={getImageForDesignation(employee.employeeDesig)} 
                    alt={employee.employeeDesig} 
                    width="50" 
                    height="50" 
                    onError={(e) => e.target.src = "/uploads/default.png"} // Fallback if image is missing
                />
            </td>
            <td>
                <Button color="info" className="m-1" onClick={() => onView(employee)}>
                    View
                </Button>
                <Button color="warning" className="m-1" onClick={() => navigate(`/update-employee/${employee.employeeId}`)}>
                    Update
                </Button>
                <Button color="danger" className="m-1" onClick={() => deleteEmployee(employee.employeeId)}>
                    Delete
                </Button>
            </td>
        </tr>
=======
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
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
    );
};

export default Employee;
