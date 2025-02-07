import React, { useEffect } from "react";
import {Container} from "reactstrap";
import { Button } from 'reactstrap';


const Home=()=>{

    return (
        <div>
    <Container className="text-center">
        <h1>This is my HomePage</h1>
        <p>In this page, you can select whether you are a student or employee.</p>
        <Button color="primary">Start Using</Button>
    </Container>
        </div>
    )
}

export default Home;