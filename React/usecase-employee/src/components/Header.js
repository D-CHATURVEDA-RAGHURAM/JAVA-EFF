import React from "react"
import { Card, CardBody } from "reactstrap";

<<<<<<< HEAD
function Header({ name, title }) {
    return (
        <Card className="my-2 bg-warning">
            <CardBody>
                <h1 className="text-center my-2">{title || "Welcome to Employee Manager"}</h1>
            </CardBody>
        </Card>
    );
}

=======
function Header({name,title})
{
    return (
        <div>
            <Card className="my-2 bg-warning">
                <CardBody>
                <h1 className="text-center my-2">Welcome to Usecase Application</h1>
                </CardBody>
            </Card>
        </div>
    )
}
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
export default Header;