import React from "react"
import { Card, CardBody } from "reactstrap";

function Header({ name, title }) {
    return (
        <Card className="my-2 bg-warning">
            <CardBody>
                <h1 className="text-center my-2">{title || "Welcome to Employee Manager"}</h1>
            </CardBody>
        </Card>
    );
}

export default Header;