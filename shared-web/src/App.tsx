import React from "react";
import logo from "./logo.svg";
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Navigate,
} from "react-router-dom";
import "./App.css";
import Layout from "./components/layout/Layout";
import PaymentReport from "./components/vendor-related/PaymentReport";
import PageNotFound from "./components/layout/PageNotFound";
import InvoiceReports from "./components/vendor-related/InvoiceReport";
import CreditDebitNote from "./components/vendor-related/CreditDebitNote";
import POAmendment from "./components/vendor-related/POAmendment";
import MaterialPrice from "./pages/MaterialPrice";
import VendorRating from "./pages/VendorRating";

function App() {
  return (
    <Router basename="internal/sharedweb">
      <div className="App">
        <Routes>
          <Route path="/" element={<Navigate replace to="/report" />} />
          <Route path="/report" element={<Layout />} />
          <Route path="/payment" element={<PaymentReport />} />
          <Route path="/invoice" element={<InvoiceReports />} />
          <Route path="/creditdebit" element={<CreditDebitNote />} />
          <Route path="/poamendment" element={<POAmendment />} />
          <Route path="/material-price" element={<MaterialPrice />} />
          <Route path="/vendor-rating" element={<VendorRating />} />
          <Route path="*" element={<PageNotFound />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
