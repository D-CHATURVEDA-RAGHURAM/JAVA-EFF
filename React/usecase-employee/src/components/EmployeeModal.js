import React from "react";
import { Modal, ModalHeader, ModalBody } from "reactstrap";
import "../styles/EmployeeModal.css"; // ✅ Import the CSS file

const EmployeeModal = ({ isOpen, toggle, employee, getImageForDesignation }) => {
    if (!employee) return null;

    return (
        <Modal isOpen={isOpen} toggle={toggle} centered>
            <ModalHeader toggle={toggle}>Employee ID Card</ModalHeader>
            <ModalBody className="id-card">
                <div className="id-card-container">
                    {/* Employee Image */}
                    <img
                        src={getImageForDesignation(employee.employeeDesig)}
                        alt="Employee"
                        className="employee-img"
                        onError={(e) => (e.target.src = "/uploads/default.png")}
                    />

                    {/* Employee Details */}
                    <div className="employee-details">
                        <h4>ID: {employee.employeeId}</h4>
                        <h3>{employee.employeeName}</h3>
                        <p className="designation">{employee.employeeDesig || "Not Assigned"}</p>
                    </div>
                </div>
            </ModalBody>
        </Modal>
    );
};

export default EmployeeModal;
