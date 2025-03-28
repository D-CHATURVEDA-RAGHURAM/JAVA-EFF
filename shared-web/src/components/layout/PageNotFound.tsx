import Cookies from 'js-cookie';
import React from 'react';
import { useNavigate } from 'react-router-dom';
const PageNotFound = () => {
    const navigate = useNavigate();
    return (
        <div className="not-found-container">
            <h1>Oops!</h1>
            <h4>404 - PAGE NOT FOUND</h4>
            <p>Sorry, the page you're looking for doesn't exist</p>
            {/* <button
                type="button"
                className="btn btn-primary"
                onClick={() => navigate(`/grnrejection?token=${Cookies.get('jwt_token')}`)}
            >
                GO TO HOMEPAGE
            </button> */}
        </div>
    );
};
export default PageNotFound;
