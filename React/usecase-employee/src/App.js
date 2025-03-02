import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

// Import your components
import Login from "./components/Login";
import Signup from "./components/Signup";
import Home from "./components/Home";
import Menus from "./components/Menus";
import Allemployees from "./components/Allemployees";
import AddEmployee from "./components/AddEmployee";
import UpdateEmployee from "./components/UpdateEmployee";
import ProtectedRoute from "./components/ProtectedRoute"; // Import ProtectedRoute

const theme = createTheme({
  palette: {
    primary: { main: "#1976d2" },
    secondary: { main: "#9c27b0" },
    success: { main: "#2e7d32" },
    warning: { main: "#ed6c02" },
  },
});

function App() {
  return (
    <ThemeProvider theme={theme}>
      <Router>
        <ToastContainer position="top-right" autoClose={3000} />
        <Menus />

        <Routes>
          {/* Public Routes */}
          <Route path="/" element={<Login />} />
          <Route path="/login" element={<Login />} />
          <Route path="/signup" element={<Signup />} />

          {/* Protected Routes */}
          <Route element={<ProtectedRoute />}>
            <Route path="/home" element={<Home />} />
            <Route path="/view-employee" element={<Allemployees />} />
            <Route path="/add-employee" element={<AddEmployee />} />
            <Route path="/update-employee/:employeeId" element={<UpdateEmployee />} />
          </Route>
        </Routes>
      </Router>
    </ThemeProvider>
  );
}

export default App;
