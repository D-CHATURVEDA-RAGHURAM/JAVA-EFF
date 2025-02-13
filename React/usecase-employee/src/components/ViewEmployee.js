import React from "react";
import { Modal, ModalHeader, ModalBody } from "reactstrap";

const ViewEmployee = ({ employee, isOpen, toggle }) => {
    if (!employee) return null;

    return (
        <Modal isOpen={isOpen} toggle={toggle}>
            <ModalHeader toggle={toggle}>Employee Details</ModalHeader>
            <ModalBody>
                <p><strong>ID:</strong> {employee.employeeId}</p>
                <p><strong>Name:</strong> {employee.employeeName}</p>
                <p><strong>Designation:</strong> {employee.employeeDesig}</p>
                <img src={`/uploads/${employee.employeeImage}`} alt="Employee" width="100%" />
            </ModalBody>
        </Modal>
    );
};

export default ViewEmployee;
