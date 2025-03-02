// src/components/Signup.js
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Box, Paper, Typography, TextField, Button, MenuItem, Alert } from "@mui/material";

const Signup = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [roles, setRoles] = useState("USER"); // Updated "role" to "roles"
  const [error, setError] = useState("");
  const [success, setSuccess] = useState("");
  const navigate = useNavigate();

  const handleSignup = async (e) => {
    e.preventDefault();
    setError("");
    setSuccess("");

    const userData = {
      username: username.trim(),
      password: password.trim(),
      roles, // Ensure correct field name
    };

    try {
      const response = await fetch("http://localhost:8080/users/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(userData),
      });

      const data = await response.json();
      if (response.ok) {
        setSuccess("User registered successfully! Redirecting...");
        setTimeout(() => navigate("/login"), 2000);
      } else {
        setError(data.error || "Signup failed! Please try again.");
      }
    } catch (error) {
      console.error("Signup error:", error);
      setError("Something went wrong. Try again later!");
    }
  };

  return (
    <Box
      sx={{
        minHeight: "100vh",
        bgcolor: "#e0f7fa",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <Paper elevation={6} sx={{ p: 4, width: 320, textAlign: "center", borderRadius: 2 }}>
        <Typography variant="h5" gutterBottom>
          Signup for Smart Login System
        </Typography>

        {error && <Alert severity="error" sx={{ mb: 2 }}>{error}</Alert>}
        {success && <Alert severity="success" sx={{ mb: 2 }}>{success}</Alert>}

        <Box component="form" onSubmit={handleSignup}>
          <TextField
            fullWidth
            margin="normal"
            label="Username"
            variant="outlined"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            required
          />
          <TextField
            fullWidth
            margin="normal"
            label="Password"
            variant="outlined"
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
          <TextField
            fullWidth
            select
            margin="normal"
            label="Role"
            variant="outlined"
            value={roles}
            onChange={(e) => setRoles(e.target.value)}
          >
            <MenuItem value="USER">User</MenuItem>
            <MenuItem value="ADMIN">Admin</MenuItem>
          </TextField>

          <Button type="submit" variant="contained" color="primary" fullWidth sx={{ mt: 2 }}>
            Sign Up
          </Button>
        </Box>
        <Typography variant="body2" sx={{ mt: 2 }}>
          Already have an account?{" "}
          <a href="/login" style={{ textDecoration: "none", color: "#1976d2" }}>
            Log in
          </a>
        </Typography>
      </Paper>
    </Box>
  );
};

export default Signup;
