// src/components/Menus.js
import React from "react";
import { useNavigate, useLocation } from "react-router-dom";
// MUI
import { AppBar, Toolbar, Button, Box } from "@mui/material";

const Menus = () => {
  const navigate = useNavigate();
  const location = useLocation();

  const handleLogout = () => {
    localStorage.removeItem("token");
    navigate("/login");
  };

  // Hide menu if on /login
  if (location.pathname === "/login") return null;

  return (
    <AppBar position="static">
      <Toolbar>
        <Box sx={{ flexGrow: 1 }}>
          <Button color="inherit" onClick={() => navigate("/home")}>
            Home
          </Button>
        </Box>
        <Button color="inherit" onClick={handleLogout}>
          Logout
        </Button>
      </Toolbar>
    </AppBar>
  );
};

export default Menus;


// import React from "react";
// import { Button } from "reactstrap";
// import {useNavigate, useLocation } from "react-router-dom";

// const Menus = () => {
//     const navigate = useNavigate();
//     const location = useLocation();

//     const handleLogout = () => {
//         localStorage.removeItem("token");
//         navigate("/login");
//     };

//     if (location.pathname === "/login") return null;

//     return (
//         <div className="menu-bar">
//             <Button className="menu-link" to="/home">Home</Button>
//             <Button color="danger" onClick={handleLogout}>Logout</Button>
//         </div>
//     );
// };

// export default Menus;
