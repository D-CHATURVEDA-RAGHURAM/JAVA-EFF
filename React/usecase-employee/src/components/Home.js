import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { Box, Button, Typography } from "@mui/material";

const Home = () => {
  const navigate = useNavigate();
  const [username, setUsername] = useState("");

  useEffect(() => {
    const storedUser = localStorage.getItem("username");
    if (storedUser) {
      setUsername(storedUser);
    } else {
      navigate("/login"); // Redirect if not logged in
    }
  }, [navigate]);

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
        Welcome {username ? username : "Guest"}
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
