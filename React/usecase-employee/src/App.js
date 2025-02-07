import React, { useEffect } from "react";
import { BrowserRouter as Router, Routes, Route, useLocation } from "react-router-dom";
import { Container, Row, Col } from "reactstrap";
import { ToastContainer } from "react-toastify";
import Home from "./components/Home";
import Allemployees from "./components/Allemployees";
import AddEmployee from "./components/AddEmployee";
import Header from "./components/Header";
import Menus from "./components/Menus";
import UpdateEmployee from "./components/UpdateEmployee";

function App() {
  return (
    <Router>
      <ToastContainer />
      <Container>
        <Header />
        <Row>
          <Col md={4}>
            <Menus />
          </Col>
          <Col md={8}>
            <PageTitle /> {/* Dynamically updates document.title */}
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/add-employee" element={<AddEmployee />} />
              <Route path="/view-employee" element={<Allemployees />} />
              <Route path="/update-employee/:employeeId" element={<UpdateEmployee />} /> 
            </Routes>
          </Col>
        </Row>
      </Container>
    </Router>
  );
}

const PageTitle = () => {
  const location = useLocation();

  useEffect(() => {
    if (location.pathname === "/") {
      document.title = "Home || Employee Home";
    } else if (location.pathname === "/add-employee") {
      document.title = "Add Employee";
    } else if (location.pathname === "/view-employee") {
      document.title = "All Employees";
    }
  }, [location]);

  return null; // No UI rendering needed
};

export default App;


















//by using toast
// const btnHandle=() => {
//   toast.success("done", {
//     position: "top-center",
//   });
// }

// return  <div>
//     <ToastContainer />
//     <h1> This is Bootstrap components</h1>
//     <Button color="primary" outline onClick={btnHandle}>First React Button</Button>
// </div>


//normal react app
{/* <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
</div> */}