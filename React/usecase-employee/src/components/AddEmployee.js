import React, { useState } from "react";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { useNavigate } from "react-router-dom";
import Header from "./Header";
// MUI
import {
  Box,
  Container,
  Typography,
  TextField,
  Button,
  FormControl,
  InputLabel,
  Select,
  MenuItem,
  Card,
  CardContent,
} from "@mui/material";

const AddEmployee = () => {
  const [employees, setEmployees] = useState({
    employeeName: "",
    employeeDesig: "",
    employeeImage: "",
  });

  const [errors, setErrors] = useState({
    employeeName: false,
    employeeDesig: false,
  });

  const navigate = useNavigate();

  const handleDesignationChange = (e) => {
    const selectedDesig = e.target.value;
    let image = "";
    if (selectedDesig === "Full Stack") image = "fullstack.png";
    if (selectedDesig === "QA") image = "qa.png";
    if (selectedDesig === "BA") image = "ba.png";

    setEmployees({
      ...employees,
      employeeDesig: selectedDesig,
      employeeImage: image,
    });
  };

  const handleForm = (e) => {
    e.preventDefault();

    const newErrors = {
      employeeName: !employees.employeeName.trim(),
      employeeDesig: !employees.employeeDesig.trim(),
    };
    setErrors(newErrors);

    if (Object.values(newErrors).some((err) => err)) {
      toast.error("Please fill all the fields before submitting!");
      return;
    }

    const employeeData = {
      employeeName: employees.employeeName,
      employeeDesig: employees.employeeDesig,
      employeeImage: employees.employeeImage,
    };

    postDataToServer(employeeData);
  };

  const postDataToServer = (data) => {
    axios
      .post(`${base_url}/insert`, data)
      .then(() => {
        toast.success("Employee Added Successfully!");
        setEmployees({ employeeName: "", employeeDesig: "", employeeImage: "" });
        navigate("/view-employee");
      })
      .catch(() => {
        toast.error("Error Adding Employee!");
      });
  };

  return (
    <>
      <Header />
      <Container sx={{ mt: 2 }}>
        {/*
          We create a single row with display="flex" and position="relative".
          The Back button is absolutely positioned on the left,
          while the heading is centered via margin="0 auto".
        */}
        <Box
          display="flex"
          alignItems="center"
          sx={{ position: "relative", mb: 3 }}
        >
          <Button
            variant="outlined"
            onClick={() => navigate("/view-employee")}
            sx={{ position: "absolute", left: 0 }}
          >
            Back
          </Button>

          <Typography variant="h4" sx={{ margin: "0 auto" }}>
            Add Employee
          </Typography>
        </Box>

        <Card>
          <CardContent>
            <Box component="form" onSubmit={handleForm}>
              <TextField
                fullWidth
                margin="normal"
                label="Employee Name"
                value={employees.employeeName}
                onChange={(e) =>
                  setEmployees({ ...employees, employeeName: e.target.value })
                }
                error={errors.employeeName}
                helperText={errors.employeeName && "Employee Name is required"}
              />

              <FormControl fullWidth margin="normal" error={errors.employeeDesig}>
                <InputLabel>Employee Designation</InputLabel>
                <Select
                  value={employees.employeeDesig}
                  label="Employee Designation"
                  onChange={handleDesignationChange}
                >
                  <MenuItem value="">Select Designation</MenuItem>
                  <MenuItem value="Full Stack">Full Stack</MenuItem>
                  <MenuItem value="QA">QA</MenuItem>
                  <MenuItem value="BA">BA</MenuItem>
                </Select>
              </FormControl>

              {/* Image Preview */}
              {employees.employeeImage && (
                <Box sx={{ mt: 2 }}>
                  <Typography variant="body1">Preview:</Typography>
                  <img
                    src={`/uploads/${employees.employeeImage}`}
                    alt="Selected"
                    width="100"
                    height="100"
                    style={{
                      border: "1px solid #ddd",
                      borderRadius: "5px",
                      padding: "5px",
                    }}
                  />
                </Box>
              )}

              <Box textAlign="center" mt={2}>
                <Button type="submit" variant="contained" color="success">
                  Add Employee
                </Button>
                <Button
                  type="reset"
                  variant="outlined"
                  color="warning"
                  sx={{ ml: 2 }}
                  onClick={() =>
                    setEmployees({
                      employeeName: "",
                      employeeDesig: "",
                      employeeImage: "",
                    })
                  }
                >
                  Clear
                </Button>
              </Box>
            </Box>
          </CardContent>
        </Card>
      </Container>
    </>
  );
};

export default AddEmployee;



// import React, { useState } from "react";
// import { Button, Container, Form, FormGroup, Input, FormFeedback } from "reactstrap";
// import axios from "axios";
// import base_url from "../api/bootapi";
// import { toast } from "react-toastify";
// import { useNavigate } from "react-router-dom";
// import Header from "./Header";

// const AddEmployee = () => {
//     const [employees, setEmployees] = useState({
//         employeeName: "",
//         employeeDesig: "",
//         employeeImage: "",  // Add employeeImage field
//     });

//     const [errors, setErrors] = useState({
//         employeeName: false,
//         employeeDesig: false,
//         employeeImage: false,
//     });

//     const navigate = useNavigate();

//     // Function to handle Designation change
//     const handleDesignationChange = (e) => {
//         const selectedDesig = e.target.value;
//         let image = "";

//         // Automatically select an image based on designation
//         if (selectedDesig === "Full Stack") image = "fullstack.png";
//         if (selectedDesig === "QA") image = "qa.png";
//         if (selectedDesig === "BA") image = "ba.png";

//         setEmployees({ ...employees, employeeDesig: selectedDesig, employeeImage: image });
//     };

//     const handleForm = (e) => {
//         e.preventDefault();

//         let newErrors = {
//             employeeName: !employees.employeeName.trim(),
//             employeeDesig: !employees.employeeDesig.trim(),
//             employeeImage: !employees.employeeImage.trim(), // Ensure image is selected
//         };

//         setErrors(newErrors);

//         if (Object.values(newErrors).some(error => error)) {
//             toast.error("Please fill all the fields before submitting!");
//             return;
//         }

//         // Prepare data to send to the backend
//         const employeeData = {
//             employeeName: employees.employeeName,
//             employeeDesig: employees.employeeDesig,
//             employeeImage: employees.employeeImage, // Send the image name
//         };

//         postDataToServer(employeeData);
//     };

//     const postDataToServer = (data) => {
//         axios.post(`${base_url}/insert`, data)
//             .then(() => {
//                 toast.success("Employee Added Successfully!");
//                 setEmployees({ employeeName: "", employeeDesig: "", employeeImage: "" });
//                 navigate("/view-employee");
//             })
//             .catch(() => {
//                 toast.error("Error Adding Employee!");
//             });
//     };

//     return (
//         <>
//             <Header />
//             <Container>
//                 <div className="d-flex justify-content-between align-items-center mb-3">
//                     <Button color="secondary" onClick={() => navigate("/view-employee")}>Back</Button>
//                     <h1 className="text-center flex-grow-1">Add Employee</h1>
//                 </div>

//                 <Form onSubmit={handleForm}>
//                     <FormGroup>
//                         <label>Employee Name</label>
//                         <Input 
//                             type="text" 
//                             placeholder="Enter Employee Name"
//                             value={employees.employeeName}
//                             onChange={(e) => setEmployees({ ...employees, employeeName: e.target.value })}
//                             invalid={errors.employeeName}
//                         />
//                         <FormFeedback>Employee Name is required!</FormFeedback>
//                     </FormGroup>

//                     {/* Designation Dropdown */}
//                     <FormGroup>
//                         <label>Employee Designation</label>
//                         <Input 
//                             type="select"
//                             value={employees.employeeDesig}
//                             onChange={handleDesignationChange}  // Auto-update image
//                             invalid={errors.employeeDesig}
//                         >
//                             <option value="">Select Designation</option>
//                             <option value="Full Stack">Full Stack</option>
//                             <option value="QA">QA</option>
//                             <option value="BA">BA</option>
//                         </Input>
//                         <FormFeedback>Please select a designation!</FormFeedback>
//                     </FormGroup>

//                     {/* Image Dropdown (Disabled - Auto Selected) */}
//                     <FormGroup>
//                         <label>Employee Image</label>
//                         <Input 
//                             type="select"
//                             value={employees.employeeImage}
//                             disabled  // User can't change, it's auto-set
//                         >
//                             <option value="">Select Image</option>
//                             <option value="fullstack.png">Full Stack</option>
//                             <option value="qa.png">QA</option>
//                             <option value="ba.png">BA</option>
//                         </Input>
//                     </FormGroup>

//                     {/* Display Selected Image */}
//                     {employees.employeeImage && (
//                         <FormGroup>
//                             <label>Preview:</label>
//                             <img 
//                                 src={`/uploads/${employees.employeeImage}`} 
//                                 alt="Selected"
//                                 width="100" 
//                                 height="100" 
//                                 style={{ border: "1px solid #ddd", borderRadius: "5px", padding: "5px" }}
//                             />
//                         </FormGroup>
//                     )}

//                     <Container className="text-center">
//                         <Button type="submit" color="success">Add Employee</Button>
//                         <Button 
//                             type="reset" 
//                             color="warning" 
//                             className="ms-2"
//                             onClick={() => setEmployees({ employeeName: "", employeeDesig: "", employeeImage: "" })}
//                         >
//                             Clear
//                         </Button>
//                     </Container>
//                 </Form>
//             </Container>
//         </>
//     );
// };

// export default AddEmployee;
