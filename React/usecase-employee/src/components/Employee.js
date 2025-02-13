import React from "react";
import { Button } from "reactstrap";
import axios from "axios";
import { toast } from "react-toastify";
import base_url from "../api/bootapi";
import { useNavigate } from "react-router-dom";

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
    );
};

export default Employee;
