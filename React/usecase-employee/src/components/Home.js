// src/components/Home.js
import React from "react";
import { useNavigate } from "react-router-dom";
// MUI
import { Box, Button, Typography } from "@mui/material";

const Home = () => {
  const navigate = useNavigate();

  return (
    <Box
      sx={{
        minHeight: "100vh",
        bgcolor: "#bbdefb",
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <Typography variant="h3" gutterBottom>
        Welcome to Employee Manager
      </Typography>
      <Typography variant="subtitle1" gutterBottom>
        Select an option below:
      </Typography>
      <Box sx={{ mt: 2 }}>
        <Button
          variant="contained"
          color="primary"
          sx={{ mr: 2 }}
          onClick={() => navigate("/add-employee")}
        >
          Add Employee
        </Button>
        <Button
          variant="contained"
          color="secondary"
          onClick={() => navigate("/view-employee")}
        >
          View Employees
        </Button>
      </Box>
    </Box>
  );
};

export default Home;


// import React from "react";
// import { Container, Button } from "reactstrap";
// import { useNavigate } from "react-router-dom";
// import "../styles/Home.css"; // Import the updated CSS file

// const Home = () => {
//     const navigate = useNavigate();

//     return (
//         <Container className="container">
//             <h1>Welcome to Employee Manager</h1>
//             <p>Select an option below:</p>
//             <div className="button-container">
//                 <Button className="add-btn" onClick={() => navigate("/add-employee")}>
//                     Add Employee
//                 </Button>
//                 <Button className="view-btn" onClick={() => navigate("/view-employee")}>
//                     View Employees
//                 </Button>
//             </div>
//         </Container>
//     );
// };

// export default Home;
