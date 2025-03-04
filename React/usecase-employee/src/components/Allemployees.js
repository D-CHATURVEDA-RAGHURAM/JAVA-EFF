import React, { useState, useEffect } from "react";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { useNavigate } from "react-router-dom";
import {
  Box,
  Container,
  Typography,
  Button,
  Table,
  TableHead,
  TableBody,
  TableRow,
  TableCell,
  Paper,
  TableContainer,
  TablePagination,
  TableSortLabel,
} from "@mui/material";
import Header from "./Header";
import Employee from "./Employee";
import EmployeeModal from "./EmployeeModal";

const Allemployees = () => {
  const [employees, setEmployees] = useState([]);
  const [originalEmployees, setOriginalEmployees] = useState([]);
  const [selectedEmployee, setSelectedEmployee] = useState(null);
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [sortConfig, setSortConfig] = useState({ key: null, direction: "asc" });

  const [page, setPage] = useState(0);
  const [rowsPerPage, setRowsPerPage] = useState(10);

  const navigate = useNavigate();

  useEffect(() => {
    getAllEmployeesFromServer();
  }, []);

  const getAllEmployeesFromServer = () => {
    axios
      .get(`${base_url}/display`)
      .then((response) => {
        setEmployees(response.data);
        setOriginalEmployees(response.data);
      })
      .catch(() => toast.error("Something went wrong"));
  };

  const updateAfterDelete = (employeeId) => {
    setEmployees((prev) => prev.filter((emp) => emp.employeeId !== employeeId));
  };

  const handleViewEmployee = (employee) => {
    setSelectedEmployee(employee);
    setIsModalOpen(true);
  };

  const handleSort = (key) => {
    let direction = "asc";
    if (sortConfig.key === key && sortConfig.direction === "asc") {
      direction = "desc";
    } else if (sortConfig.key === key && sortConfig.direction === "desc") {
      setEmployees([...originalEmployees]); // Reset order
      setSortConfig({ key: null, direction: "asc" });
      return;
    }
  
    const sortedData = [...employees].sort((a, b) => {
      if (a[key] < b[key]) return direction === "asc" ? -1 : 1;
      if (a[key] > b[key]) return direction === "asc" ? 1 : -1;
      return 0;
    });
  
    setSortConfig({ key, direction });
    setEmployees(sortedData);
  };
  

  const handleChangePage = (event, newPage) => {
    setPage(newPage);
  };

  const handleChangeRowsPerPage = (event) => {
    setRowsPerPage(+event.target.value);
    setPage(0);
  };

  const paginatedEmployees = employees.slice(
    page * rowsPerPage,
    page * rowsPerPage + rowsPerPage
  );

  return (
    <>
      <Header />
      <Container sx={{ mt: 2 }}>
        <Box sx={{ textAlign: "center", mb: 3 }}>
          <Typography variant="h5" gutterBottom>
            All Employee Details
          </Typography>
          <Button variant="contained" color="primary" sx={{ m: 1 }} onClick={() => navigate("/home")}>
            Go to Home
          </Button>
          <Button variant="contained" color="success" sx={{ m: 1 }} onClick={() => navigate("/add-employee")}>
            Add Employee
          </Button>
        </Box>

        <Paper>
          <TableContainer sx={{ maxHeight: 400 }}>
            <Table stickyHeader>
              <TableHead>
                <TableRow>
                  <TableCell sx={{ backgroundColor: "#424242", color: "#fff", fontWeight: "bold" }}>
                  <TableSortLabel
                    active={sortConfig.key === "employeeId"}
                    direction={sortConfig.key === "employeeId" ? sortConfig.direction : "asc"}
                    onClick={() => handleSort("employeeId")}
                    sx={{ color: "white !important" }} // Keeps text white even when hovered
                    >
                    Employee ID
                  </TableSortLabel>
                  </TableCell>
                  <TableCell sx={{ backgroundColor: "#424242", color: "#fff", fontWeight: "bold" }}>
                  <TableSortLabel
                    active={sortConfig.key === "employeeName"}
                    direction={sortConfig.key === "employeeName" ? sortConfig.direction : "asc"}
                    onClick={() => handleSort("employeeName")}
                    sx={{ color: "white !important" }} // Keeps text white even when hovered
                    >
                    Employee Name
                  </TableSortLabel>
                  </TableCell>
                  <TableCell sx={{ backgroundColor: "#424242", color: "#fff", fontWeight: "bold" }}>Designation</TableCell>
                  
                  <TableCell sx={{ backgroundColor: "#424242", color: "#fff", fontWeight: "bold" }}>Image</TableCell>
                  <TableCell align="center" sx={{ backgroundColor: "#424242", color: "#fff", fontWeight: "bold" }}>Actions</TableCell>
                </TableRow>
              </TableHead>
              <TableBody>
                {paginatedEmployees.length > 0 ? (
                  paginatedEmployees.map((item) => (
                    <Employee key={item.employeeId} employee={item} update={updateAfterDelete} onView={handleViewEmployee} />
                  ))
                ) : (
                  <TableRow>
                    <TableCell colSpan={5} align="center">No Employees Found</TableCell>
                  </TableRow>
                )}
              </TableBody>
            </Table>
          </TableContainer>

          <Box sx={{ display: "flex", justifyContent: "center", p: 1 }}>
            <TablePagination
              component="div"
              count={employees.length}
              page={page}
              onPageChange={handleChangePage}
              rowsPerPage={rowsPerPage}
              onRowsPerPageChange={handleChangeRowsPerPage}
              rowsPerPageOptions={[5, 10, 25, 50]}
              sx={{
                // Make the pagination bar itself centered
                "& .MuiTablePagination-toolbar": {
                  justifyContent: "center",
                  alignItems: "center",
                  gap: 2,
                },
                // Remove or reduce the default spacer
                "& .MuiTablePagination-spacer": {
                  flex: "0 0 auto",
                },
                "& .MuiTablePagination-selectLabel, .MuiTablePagination-displayedRows": {
                  margin: 0,
                  lineHeight: "1.4375em",
                },
                "& .MuiTablePagination-select": {
                  margin: "0 4px",
                },
              }}
            />
          </Box>
        </Paper>
      </Container>

      <EmployeeModal isOpen={isModalOpen} toggle={() => setIsModalOpen(!isModalOpen)} employee={selectedEmployee} />
    </>
  );
};

export default Allemployees;







// import React, { useState, useEffect } from "react";
// import Employee from "./Employee";
// import axios from "axios";
// import base_url from "../api/bootapi";
// import { toast } from "react-toastify";
// import { Button, Container, Table } from "reactstrap";
// import Header from "./Header";
// import { useNavigate } from "react-router-dom";
// import EmployeeModal from "./EmployeeModal"; // ✅ Import EmployeeModal

// const Allemployees = () => {
//     const [employees, setEmployees] = useState([]);
//     const [selectedEmployee, setSelectedEmployee] = useState(null);
//     const [isModalOpen, setIsModalOpen] = useState(false);
//     const navigate = useNavigate();

//     useEffect(() => {
//         getAllEmployeesFromServer();
//     }, []);

//     const getAllEmployeesFromServer = () => {
//         axios.get(`${base_url}/display`)
//             .then((response) => setEmployees(response.data))
//             .catch(() => toast.error("Something went wrong"));
//     };

//     const updateAfterDelete = (employeeId) => {
//         setEmployees((prevEmployees) => prevEmployees.filter(emp => emp.employeeId !== employeeId));
//     };

//     const handleViewEmployee = (employee) => {
//         setSelectedEmployee(employee);
//         setIsModalOpen(true);
//     };

//     const getImageForDesignation = (designation) => {
//         const imageMap = {
//             "Full Stack": "/uploads/fullstack.png",
//             "QA": "/uploads/qa.png",
//             "BA": "/uploads/ba.png",
//         };
//         return imageMap[designation] || "/uploads/default.png";
//     };

//     return (
//         <>
//             <Header />
//             <Container className="text-center">
//                 <h3 className="mb-4">All Employee Details</h3>

//                 <Button color="primary" className="m-2" onClick={() => navigate("/home")}>
//                     Go to Home
//                 </Button>
//                 <Button color="success" className="m-2" onClick={() => navigate("/add-employee")}>
//                     Add Employee
//                 </Button>

//                 <Table bordered striped responsive className="mt-3">
//                     <thead className="bg-dark text-white">
//                         <tr>
//                             <th>Employee ID</th>
//                             <th>Employee Name</th>
//                             <th>Designation</th>
//                             <th>Image</th>
//                             <th>Actions</th>
//                         </tr>
//                     </thead>
//                     <tbody>
//                         {employees.length > 0 ? (
//                             employees
//                                 .sort((a, b) => a.employeeId - b.employeeId)
//                                 .map((item) => (
//                                     <Employee key={item.employeeId} employee={item} update={updateAfterDelete} onView={handleViewEmployee} />
//                                 ))
//                         ) : (
//                             <tr>
//                                 <td colSpan="5" className="text-center">No Employees Found</td>
//                             </tr>
//                         )}
//                     </tbody>
//                 </Table>
//             </Container>

//             {/* ✅ Employee Details Modal */}
//             <EmployeeModal 
//                 isOpen={isModalOpen} 
//                 toggle={() => setIsModalOpen(!isModalOpen)} 
//                 employee={selectedEmployee} 
//                 getImageForDesignation={getImageForDesignation} 
//             />
//         </>
//     );
// };

// export default Allemployees;
