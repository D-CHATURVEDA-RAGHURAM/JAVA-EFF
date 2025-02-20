// src/components/Login.js
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
// MUI imports
import { Box, Paper, Typography, TextField, Button, Alert } from "@mui/material";

const Login = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
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
        navigate("/home");
      } else {
        setError(data.error || "Invalid credentials!");
      }
    } catch (error) {
      console.error("Login error:", error);
      setError("Something went wrong. Try again!");
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
          Smart Login System
        </Typography>

        {error && (
          <Alert severity="error" sx={{ mb: 2 }}>
            {error}
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


// import React, { useState } from "react";
// import { useNavigate } from "react-router-dom";
// import "../styles/Login.css"; // Import the CSS file

// const Login = () => {
//   const [username, setUsername] = useState("");
//   const [password, setPassword] = useState("");
//   const [error, setError] = useState(""); // For error messages
//   const navigate = useNavigate();

//   const handleLogin = async (e) => {
//     e.preventDefault();
//     setError(""); // Clear previous errors

//     try {
//       const response = await fetch("http://localhost:8080/auth/login", {
//         method: "POST",
//         headers: { "Content-Type": "application/json" },
//         body: JSON.stringify({ username, password }),
//       });

//       const data = await response.json();
//       console.log("Login Response:", data);

//       if (response.ok) {
//         localStorage.setItem("token", data.token); // Store JWT token
//         navigate("/home"); // Redirect to home
//       } else {
//         setError(data.error || "Invalid credentials!"); // Show error from backend
//       }
//     } catch (error) {
//       console.error("Login error:", error);
//       setError("Something went wrong. Try again!");
//     }
//   };

//   return (
//     <div className="login-container">
//       <div className="login-box">
//         <h2>Smart Login System</h2>
//         {error && <p className="error-message">{error}</p>}
//         <form onSubmit={handleLogin}>
//           <input
//             type="text"
//             placeholder="Username"
//             value={username}
//             onChange={(e) => setUsername(e.target.value)}
//             required
//           />
//           <input
//             type="password"
//             placeholder="Password"
//             value={password}
//             onChange={(e) => setPassword(e.target.value)}
//             required
//           />
//           <button type="submit">Log in</button>
//         </form>
//         {/* <p>
//           Don't have an account? <a href="#">Sign up</a>
//         </p> */}
//       </div>
//     </div>
//   );
// };

// export default Login;
