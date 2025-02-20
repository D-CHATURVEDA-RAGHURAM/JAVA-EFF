// src/components/EmployeeModal.js
import React from "react";
import {
  Dialog,
  DialogTitle,
  DialogContent,
  Box,
  Typography,
  IconButton,
} from "@mui/material";
import CloseIcon from "@mui/icons-material/Close";

// 1. Reintroduce the helper function
const getImageForDesignation = (designation) => {
  const imageMap = {
    "Full Stack": "/uploads/fullstack.png",
    QA: "/uploads/qa.png",
    BA: "/uploads/ba.png",
  };
  return imageMap[designation] || "/uploads/default.png";
};

const EmployeeModal = ({ isOpen, toggle, employee }) => {
  if (!employee) return null;

  // 2. Decide which image to use
  const imageSrc =
    employee.employeeImage && employee.employeeImage.trim() !== ""
      ? `/uploads/${employee.employeeImage}`
      : getImageForDesignation(employee.employeeDesig);

  return (
    <Dialog open={isOpen} onClose={toggle} maxWidth="xs" fullWidth>
      <DialogTitle sx={{ display: "flex", justifyContent: "space-between" }}>
        Employee ID Card
        <IconButton onClick={toggle}>
          <CloseIcon />
        </IconButton>
      </DialogTitle>
      <DialogContent>
        <Box
          sx={{
            display: "flex",
            alignItems: "center",
            flexDirection: "column",
            p: 2,
          }}
        >
          <img
            src={imageSrc}
            alt="Employee"
            width="80"
            height="80"
            style={{ borderRadius: "50%", marginBottom: "1rem" }}
            onError={(e) => (e.target.src = "/uploads/default.png")}
          />
          <Typography variant="h6">ID: {employee.employeeId}</Typography>
          <Typography variant="h5" sx={{ fontWeight: "bold" }}>
            {employee.employeeName}
          </Typography>
          <Typography variant="body1" sx={{ color: "text.secondary" }}>
            {employee.employeeDesig || "Not Assigned"}
          </Typography>
        </Box>
      </DialogContent>
    </Dialog>
  );
};

export default EmployeeModal;



// import React from "react";
// import { Modal, ModalHeader, ModalBody } from "reactstrap";
// import "../styles/EmployeeModal.css"; // ✅ Import the CSS file

// const EmployeeModal = ({ isOpen, toggle, employee, getImageForDesignation }) => {
//     if (!employee) return null;

//     return (
//         <Modal isOpen={isOpen} toggle={toggle} centered>
//             <ModalHeader toggle={toggle}>Employee ID Card</ModalHeader>
//             <ModalBody className="id-card">
//                 <div className="id-card-container">
//                     {/* Employee Image */}
//                     <img
//                         src={getImageForDesignation(employee.employeeDesig)}
//                         alt="Employee"
//                         className="employee-img"
//                         onError={(e) => (e.target.src = "/uploads/default.png")}
//                     />

//                     {/* Employee Details */}
//                     <div className="employee-details">
//                         <h4>ID: {employee.employeeId}</h4>
//                         <h3>{employee.employeeName}</h3>
//                         <p className="designation">{employee.employeeDesig || "Not Assigned"}</p>
//                     </div>
//                 </div>
//             </ModalBody>
//         </Modal>
//     );
// };

// export default EmployeeModal;
