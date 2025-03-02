import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Box, Paper, Typography, TextField, Button, Alert } from "@mui/material";

const Login = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const [token, setToken] = useState(""); // Store JWT token
  const navigate = useNavigate();

  const handleLogin = async (e) => {
    e.preventDefault();
    setError("");

    try {
      const response = await fetch("http://localhost:8080/auth/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password }),
      });

      const data = await response.json();

      if (response.ok) {
        localStorage.setItem("token", data.token);
        setToken(data.token);
        validateToken(data.token); // Validate token immediately
      } else {
        setError(data.error || "Invalid credentials!");
      }
    } catch (error) {
      console.error("Login error:", error);
      setError("Something went wrong. Try again!");
    }
  };

  const validateToken = async (token) => {
    try {
      const response = await fetch("http://localhost:8080/auth/validate", {
        method: "GET",
        headers: {
          "Authorization": `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      });

      if (response.ok) {
        alert("JWT Token is valid ✅");
        navigate("/home"); // Navigate to home if token is valid
      } else {
        setError("Invalid JWT Token ❌");
      }
    } catch (error) {
      console.error("Token validation error:", error);
      setError("Error validating token!");
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
      <Paper
        elevation={6}
        sx={{ p: 4, width: 300, textAlign: "center", borderRadius: 2 }}
      >
        <Typography variant="h5" gutterBottom>
          Login System
        </Typography>

        {error && (
          <Alert severity="error" sx={{ mb: 2 }}>
            {error}
          </Alert>
        )}

        {token && (
          <Alert severity="success" sx={{ mb: 2 }}>
            Token Generated Successfully!
          </Alert>
        )}

        <Box component="form" onSubmit={handleLogin}>
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

          <Button
            type="submit"
            variant="contained"
            color="primary"
            fullWidth
            sx={{ mt: 2 }}
          >
            Log in
          </Button>
        </Box>
      </Paper>
    </Box>
  );
};

export default Login;
