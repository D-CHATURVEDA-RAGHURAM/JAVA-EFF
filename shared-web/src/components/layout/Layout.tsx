import React from "react";
import {
  Link,
  Navigate,
  useLocation,
  useNavigate,
  useSearchParams,
} from "react-router-dom";
import "../../shared/index.css";
import Cookies from "js-cookie";
import jwt_decode from "jwt-decode";
import { Zoom } from "@progress/kendo-react-animation";
import secureLocalStorage from "react-secure-storage";

function Layout() {
  const [searchParams] = useSearchParams();
  const [isValid, setIsValid] = React.useState(false);
  const navigate: any = useNavigate();
  const location = useLocation();

  console.log("++++++++++++++++",searchParams.get("token"))
  secureLocalStorage.setItem("tenantId", 'thermax'); //THMX-01   thermax
  secureLocalStorage.setItem("userId", 'USR-32486a-24-01-2025-01'); //USR-32486a-24-01-2025-01 
  secureLocalStorage.setItem("appType", 'true');



  React.useEffect(() => {
    sessionStorage.setItem("lastLocation", location.pathname);
    try {
      const jwtToken: any = searchParams.get("token");
      console.log(jwtToken)
      const reportType: any = searchParams.get("report_type");
      secureLocalStorage.setItem("jwt_token", jwtToken);
      const decodedToken: any = jwt_decode(jwtToken);

      
      secureLocalStorage.setItem("hideHeader", decodedToken.hideHeader);
      secureLocalStorage.setItem("userId", decodedToken.userId); //USR-32486a-24-01-2025-01 
      secureLocalStorage.setItem("companyId", decodedToken.companyId);
      secureLocalStorage.setItem("appType", decodedToken.appType.toString());
      secureLocalStorage.setItem("documentTenantId", decodedToken.documentTenantId);
      const userId = decodedToken.userId;
      setIsValid(true);
      if (reportType === "invoice") {
        navigate("/invoice");
      }
      if (reportType === "payment") {
        navigate("/payment");
      }
      if (reportType === "creditdebit") {
        navigate("/creditdebit");
      }
      if (reportType === "poamendment") {
        navigate("/poamendment");
      }
    } catch (error) {
      setIsValid(false);
    }
    const handlePopstate = () => {
      const lastLocation = sessionStorage.getItem("lastLocation");
      if (lastLocation) {
        sessionStorage.removeItem("lastLocation");
        navigate(lastLocation);
      } else {
        navigate(-1);
      }
    };
    window.addEventListener("popstate", handlePopstate);
    return () => {
      window.removeEventListener("popstate", handlePopstate);
    };
  }, [location, navigate, searchParams]);
  return (
    <div className="main-conatiner-landpage">
      {/* {!isValid ? (
        <div className="not-authenticate" style={{ height: "80vh" }}>
          <Zoom>Not Authenticated</Zoom>
        </div> 
      ) : ( */}
        <div className="reports-main-container">
          <div>
            <h1 className="cards-headings">Vendor Reports</h1>
            <hr className="hr-stytle" />
            <div className="sub-container">
              <Link to="/invoice" className="link-style">
                <p className="hover-style">Invoice Details</p>
              </Link>
            </div>
            <div className="sub-container">
              <Link to="/payment" className="link-style">
                <p className="hover-style"> Payment Details</p>
              </Link>
            </div>
            <div className="sub-container">
              <Link to="/creditdebit" className="link-style">
                <p className="hover-style">Credit/Debit Details</p>
              </Link>
            </div>
            <div className="sub-container">
              <Link to="/poamendment" className="link-style">
                <p className="hover-style">PO Amendment</p>
              </Link>
            </div>
          </div>
        </div>
      {/* )} */}
    </div>
  );
}

export default Layout;

// +
//       '&pageNo=' +
//       dataState.skip / dataState.take +
//       '&pageSize=' +
//       dataState.take;
