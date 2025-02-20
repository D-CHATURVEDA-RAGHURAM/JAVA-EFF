// src/App.js
import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

// Import your components
import Login from "./components/Login";
import Home from "./components/Home";
import Menus from "./components/Menus";
import Allemployees from "./components/Allemployees";
import AddEmployee from "./components/AddEmployee";
import UpdateEmployee from "./components/UpdateEmployee";

const theme = createTheme({
  palette: {
    primary: {
      main: "#1976d2", // Default MUI Blue
    },
    secondary: {
      main: "#9c27b0", // MUI Purple
    },
    success: {
      main: "#2e7d32",
    },
    warning: {
      main: "#ed6c02",
    },
  },
});

function App() {
  return (
    <ThemeProvider theme={theme}>
      <Router>
        {/* Toastify Container */}
        <ToastContainer position="top-right" autoClose={3000} />
        {/* Menus (AppBar) */}
        <Menus />

        {/* Main Routes */}
        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/login" element={<Login />} />
          <Route path="/home" element={<Home />} />
          <Route path="/view-employee" element={<Allemployees />} />
          <Route path="/add-employee" element={<AddEmployee />} />
          <Route path="/update-employee/:employeeId" element={<UpdateEmployee />} />
        </Routes>
      </Router>
    </ThemeProvider>
  );
}

export default App;


// import React from "react";
// import { BrowserRouter as Router, Routes, Route, Navigate, useLocation } from "react-router-dom";
// import Home from "./components/Home";
// import Allemployees from "./components/Allemployees";
// import AddEmployee from "./components/AddEmployee";
// import Menus from "./components/Menus";
// import UpdateEmployee from "./components/UpdateEmployee";
// import Login from "./components/Login";
// import { Container } from "reactstrap";

// function App() {
//     return (
//         <Router>
//             <Main />
//         </Router>
//     );
// }

// function Main() {
//     const location = useLocation();
//     const showMenus = location.pathname !== "/login"; // Hide menu on login page

//     return (
//         <Container>
//             {showMenus && <Menus />}
//             <Routes>
//                 <Route path="/" element={<Navigate to="/login" />} />
//                 <Route path="/login" element={<Login />} />
//                 <Route path="/home" element={<Home />} />
//                 <Route path="/add-employee" element={<AddEmployee />} />
//                 <Route path="/view-employee" element={<Allemployees />} />
//                 <Route path="/update-employee/:employeeId" element={<UpdateEmployee />} />
//             </Routes>
//         </Container>
//     );
// }

// export default App;
