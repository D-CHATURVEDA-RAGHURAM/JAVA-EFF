// src/components/Header.js
import React from "react";
import { Card, CardContent, Typography } from "@mui/material";

function Header({ title }) {
  return (
    <Card sx={{ my: 2, bgcolor: "warning.main" }}>
      <CardContent>
        <Typography variant="h4" align="center">
          {title || "Welcome to Employee Manager"}
        </Typography>
      </CardContent>
    </Card>
  );
}

export default Header;


// import React from "react"
// import { Card, CardBody } from "reactstrap";

// function Header({ name, title }) {
//     return (
//         <Card className="my-2 bg-warning">
//             <CardBody>
//                 <h1 className="text-center my-2">{title || "Welcome to Employee Manager"}</h1>
//             </CardBody>
//         </Card>
//     );
// }

// export default Header;