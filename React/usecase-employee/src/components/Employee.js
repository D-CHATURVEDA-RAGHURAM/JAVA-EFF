// Employee.js
import React from "react";
import { TableRow, TableCell, Button } from "@mui/material";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

// Function to get image based on designation
const getImageForDesignation = (designation) => {
  const imageMap = {
    "Full Stack": "/uploads/fullstack.png",
    "QA": "/uploads/qa.png",
    "BA": "/uploads/ba.png",
  };
  return imageMap[designation] || "/uploads/default.png";
};

const Employee = ({ employee, update, onView }) => {
  const handleDelete = () => {
    axios
      .delete(`${base_url}/delete/${employee.employeeId}`)
      .then(() => {
        toast.success("Employee deleted");
        update(employee.employeeId);
      })
      .catch(() => toast.error("Error deleting employee"));
  };

  const handleUpdate = () => {
    window.location = `/update-employee/${employee.employeeId}`;
  };

  return (
    <TableRow>
      <TableCell>{employee.employeeId}</TableCell>
      <TableCell>{employee.employeeName}</TableCell>
      <TableCell>{employee.employeeDesig}</TableCell>
      <TableCell>
        <img
          src={
            employee.employeeImage && employee.employeeImage.trim() !== ""
              ? `/uploads/${employee.employeeImage}`
              : getImageForDesignation(employee.employeeDesig)
          }
          alt="Employee"
          width="40"
          height="40"
          style={{ borderRadius: "50%" }}
          onError={(e) => (e.target.src = "/uploads/default.png")}
        />
      </TableCell>
      <TableCell align="center">
        <Button
          variant="outlined"
          color="info"
          sx={{ mr: 1, mb: 1 }}
          onClick={() => onView(employee)}
        >
          View
        </Button>
        <Button
          variant="outlined"
          color="warning"
          sx={{ mr: 1, mb: 1 }}
          onClick={handleUpdate}
        >
          Update
        </Button>
        <Button variant="outlined" color="error" sx={{ mr: 1, mb: 1 }} onClick={handleDelete}>
          Delete
        </Button>
      </TableCell>
    </TableRow>
  );
};

export default Employee;



// import React from "react";
// import { Button } from "reactstrap";
// import axios from "axios";
// import { toast } from "react-toastify";
// import base_url from "../api/bootapi";
// import { useNavigate } from "react-router-dom";

// const Employee = ({ employee, update, onView }) => {
//     const navigate = useNavigate();

//     // ✅ Mapping designations to specific images
//     const getImageForDesignation = (designation) => {
//         const imageMap = {
//             "Full Stack": "/uploads/fullstack.png",
//             "QA": "/uploads/qa.png",
//             "BA": "/uploads/ba.png",
//         };
//         return imageMap[designation] || "/uploads/default.png"; // Default image if no match
//     };

//     const deleteEmployee = (employeeId) => {
//         axios.delete(`${base_url}/delete/${employeeId}`)
//             .then(() => {
//                 toast.success("Employee deleted successfully");
//                 update(employeeId);
//             })
//             .catch(() => {
//                 toast.error("Error deleting employee");
//             });
//     };

//     return (
//         <tr>
//             <td>{employee.employeeId}</td>
//             <td>{employee.employeeName}</td>
//             <td>{employee.employeeDesig}</td>
//             <td>
//                 <img 
//                     src={getImageForDesignation(employee.employeeDesig)} 
//                     alt={employee.employeeDesig} 
//                     width="50" 
//                     height="50" 
//                     onError={(e) => e.target.src = "/uploads/default.png"} // Fallback if image is missing
//                 />
//             </td>
//             <td>
//                 <Button color="info" className="m-1" onClick={() => onView(employee)}>
//                     View
//                 </Button>
//                 <Button color="warning" className="m-1" onClick={() => navigate(`/update-employee/${employee.employeeId}`)}>
//                     Update
//                 </Button>
//                 <Button color="danger" className="m-1" onClick={() => deleteEmployee(employee.employeeId)}>
//                     Delete
//                 </Button>
//             </td>
//         </tr>
//     );
// };

// export default Employee;
