import React, { useState, useEffect, useRef, useDeferredValue } from "react";
import {
  Grid,
  GridColumn as Column,
  GridToolbar,
  GridNoRecords,
} from "@progress/kendo-react-grid";
import {
  ExcelExport,
  ExcelExportColumn,
} from "@progress/kendo-react-excel-export";
import { filterBy, process } from "@progress/kendo-data-query";
import { Button } from "@progress/kendo-react-buttons";
import {
  DropDownButton,
  DropDownButtonItem,
} from "@progress/kendo-react-buttons";
import Cookies from "js-cookie";
import _ from "lodash";
import LoadingPanel from "../../shared/LoadingPanel";
import { formatDateYMD } from "../../utils/formatDateYMD";
import "../../shared/index.css";
import { DatePicker } from "@progress/kendo-react-dateinputs";
import { apiIPC } from "../../api";
import { EFFIGO_LINK_DOC, REACT_APP_PDF_ICON_URL } from "../../environment";
import {
  Notification,
  NotificationGroup,
} from "@progress/kendo-react-notification";
import "../../shared/reports.css";
import { DropDownList } from "@progress/kendo-react-dropdowns";
import { GridPDFExport } from "@progress/kendo-react-pdf";
import { AiOutlineFilePdf } from "react-icons/ai";
// import {EFFIGO_USER,EFFIGO_PASS} from '../../environment'
import {
  EFFIGO_USER_TATA,
  EFFIGO_PASS_TATA,
  EFFIGO_USER_VARROC,
  EFFIGO_PASS_VARROC,
} from "../../environment";
import secureLocalStorage from "react-secure-storage";
import { Badge, BadgeContainer } from "@progress/kendo-react-indicators";
import { SvgIcon } from "@progress/kendo-react-common";
import { checkIcon, clockIcon } from "@progress/kendo-svg-icons";
import axios from "axios";

const initialDataState = {
  take: 50,
  skip: 0,
};

const intitalPageState: any = [50, 100, 200];

function PaymentReport() {
  const token = secureLocalStorage.getItem("jwt_token");
  const _grid = useRef<any>();
  const _export = useRef<any>(null);
  const [data, setData] = useState<any>([]);
  const [gridData, setGridData] = useState<any[]>([]);
  const [totalData, setTotalData] = useState<any>();
  const [dataState, setDataState] = React.useState<any>(initialDataState);
  const [totalItems, setTotalItems] = useState<number>(0);
  const [loading, setLoading] = useState<boolean>(false);
  const [error, setError] = useState<boolean>(false);
  const userId = secureLocalStorage.getItem("userId");

  //Notifications states
  const [apiError, setApiErr] = useState<boolean>(false);
  const [errormsg, setErrorMsg] = useState<any>("");
  const [apiSuccess, setApiSuccess] = useState<boolean>(false);
  const [successMsg, setSuccessMsg] = useState<any>("");
  const [pdfDocErr, setPdfDocErr] = useState<boolean>(false);

  const [search, setSearch] = useState<boolean>(false);
  //vendor
  const [vendor, setVendor] = useState<any>({
    dropdownValue: [],
    filterValue: [],
  });
  const [vendorObj, setVendorObj] = useState<any>();
  const [vendorFilter, setVendorFilter] = useState<any>();
  const appType = secureLocalStorage.getItem("appType");

  const [sUrl, setSUrl] = useState<any>();
  const [allRecords, setAllRecords] = useState<boolean>(false);

  // TenantId based UserName and Password
  const tenantId = secureLocalStorage
    .getItem("tenantId")!
    .toString()
    .toLocaleLowerCase();

  let username: any, password: any;
  if (tenantId === "tatareality") {
    username = EFFIGO_USER_TATA;
    password = EFFIGO_PASS_TATA;
  } else if (tenantId === "varroc") {
    username = EFFIGO_USER_VARROC;
    password = EFFIGO_PASS_VARROC;
  } else {
    username = EFFIGO_USER_VARROC;
    password = EFFIGO_PASS_VARROC;
  }

  const [pageSizes, setPageSizes] = useState<any[]>(intitalPageState);

  const fetchDropdown = () => {
    const tenantId = secureLocalStorage
      .getItem("tenantId")!
      .toString()
      .toLocaleLowerCase();

    const jwtToken = secureLocalStorage.getItem("jwt_token");
    // let url = `effigo/api/integration/v1/${tenantId}/payments/getPaymentDropDownDetails`;
    let url = `effigo/payment/integration/v1/${tenantId}/getPaymentDropDownDetails`;
    apiIPC
      .get(url, { headers: { Authorization: `Bearer ${jwtToken}` } })
      .then((response: any) => {
        let dropdownData = response.data?.data;
        dropdownData = dropdownData.filter(
          (item: any) => item.companyName !== null
        );
        setVendorObj(dropdownData);
        const vendorNames = dropdownData.map((item: any) => item.companyName);
        setVendor({
          dropdownValue: vendorNames,
          filterValue: vendorNames,
        });
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const replaceEmptyWithNA = (data: any) => {
    if (!data) {
      return [];
    }
    return data.map((item: any) => {
      const modifiedItem = { ...item };
      for (const key in modifiedItem) {
        if (modifiedItem[key] === null || modifiedItem[key] === undefined) {
          modifiedItem[key] = "NA";
        } else if (typeof modifiedItem[key] === "string") {
          modifiedItem[key] =
            modifiedItem[key].trim() === "" ? "NA" : modifiedItem[key].trim();
        }
      }
      return modifiedItem;
    });
  };

  const fetchData = async (url: any) => {
    const pageNo = Math.ceil(dataState.skip / dataState.take);
    let searchUrl: any;
    searchUrl = `${url}&appType=${appType}&pageNo=${pageNo}&pageSize=${dataState.take}`;

    try {
      const jwtToken = secureLocalStorage.getItem("jwt_token");
      const user = username;
      const pass = password;
      const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
      setLoading(true);

      const response: any = await apiIPC.get(searchUrl, {
        headers: { Authorization: authHeader },
      });
      const modifiedData = replaceEmptyWithNA(
        response.data?.paymentMainDtoV1List
      );
      console.log(modifiedData, "mDD");
      setData(modifiedData);
      setLoading(false);
      setTotalItems(response.data?.totalElements);
      if (response.data?.totalElements !== 0) {
        fetchDataBasedonFilter(url, response.data?.totalElements);
      }

      if (response) {
        let message = response.data?.message;
        let errorCheck = response.data?.errors;
        if (errorCheck && errorCheck.length !== 0) {
          setApiErr(true);
          setErrorMsg(errorCheck);
          setTimeout(() => {
            setApiErr(false);
          }, 5000);
        } else {
          setApiSuccess(true);
          setSuccessMsg(message);
          setTimeout(() => {
            setApiSuccess(false);
          }, 5000);
        }
      }
    } catch (error: any) {
      console.error("Error fetching data:", error);

      if (error?.response?.data?.errors) {
        setApiErr(true);
        setErrorMsg(error.response.data.errors);
        setTimeout(() => {
          setApiErr(false);
        }, 5000);
      }

      setLoading(false);
    }
  };
  const fetchDataBasedonFilter = async (url: any, totalElements: any) => {
    let searchUrl: any;
    searchUrl = `${url}&appType=${appType}&pageNo=0&pageSize=${totalElements}`;

    try {
      const jwtToken = secureLocalStorage.getItem("jwt_token");
      const user = username;
      const pass = password;
      const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;

      const response: any = await apiIPC.get(searchUrl, {
        headers: { Authorization: authHeader },
      });
      const modifiedData = replaceEmptyWithNA(
        response.data?.paymentMainDtoV1List
      );
      setGridData(modifiedData);
      if (modifiedData.length !== 0) {
        setAllRecords(true);
      }

      // setTotalItems(response.data?.totalElements);
    } catch (error: any) {
      console.error("Error fetching data:", error);
    }
  };

  useEffect(() => {
    if (!allRecords) {
      const tenantId = secureLocalStorage
        .getItem("tenantId")!
        .toString()
        .toLocaleLowerCase();

      const jwtToken = secureLocalStorage.getItem("jwt_token");
      const companyId = secureLocalStorage.getItem("companyId");
      const appType = secureLocalStorage.getItem("appType");
      const user = username;
      const pass = password;
      const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
      if (appType === "true") {
        fetchDropdown();
      }
      const fetchColumnKeys = (url: any) => {
        const urlTitles = `effigo/api/integration/v1/${tenantId}/payments/getPaymentsTitles`;
        apiIPC
          .get(url, { headers: { Authorization: authHeader } })
          .then((response: any) => {
            if (response.data?.data.length > 0) {
              const columnKeys = response.data?.data;
              const dynamicColumns = columnKeys.map((key: any) => ({
                field: key.field,
                title: key.title,
                width: 150,
              }));
              setColumns(dynamicColumns);
            }
          })
          .catch((error) => {});
      };
      if (tenantId && jwtToken) {
        if (appType === "true") {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getPaymentsTitles`;
          let url = `effigo/payment/integration/v1/${tenantId}/getPaymentTitles`;
          fetchColumnKeys(url);
        } else if (appType === "false") {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getPaymentSupplierTitles`;
          let url = `effigo/payment/integration/v1/${tenantId}/getPaymentSupplierTitles`;
          fetchColumnKeys(url);
        } else {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getPaymentsTitles`;
          let url = `effigo/payment/integration/v1/${tenantId}/getPaymentTitles`;
          fetchColumnKeys(url);
        }
      }

      if (search && dataState) {
        onSearchHandler();
      } else if (
        startDate !== null &&
        endDate !== null &&
        formatDateYMD(startDate) <= formatDateYMD(endDate)
      ) {
        if (companyId && companyId !== "undefined") {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getPayments?companyId=${companyId}&fromDate=${formatDateYMD(
          //   initialDate
          // )}&toDate=${formatDateYMD(finalDate)}`;
          let url = `effigo/payment/integration/v1/${tenantId}/getPayments?companyId=${companyId}&fromDate=${formatDateYMD(
            initialDate
          )}&toDate=${formatDateYMD(finalDate)}&userId=${userId}`;
          fetchData(url);
        } else {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getPayments?fromDate=${formatDateYMD(
          //   initialDate
          // )}&toDate=${formatDateYMD(finalDate)}&userId=${userId}`;
          let url = `effigo/payment/integration/v1/${tenantId}/getPayments?fromDate=${formatDateYMD(
            initialDate
          )}&toDate=${formatDateYMD(finalDate)}&userId=${userId}`;
          fetchData(url);
        }
      } else {
        if (startDate === null) {
          setStartDateValidation(true);
        } else {
          setEndDateValidation(true);
        }
      }
    }
  }, [dataState, search, allRecords]);

  const filterOperators = {
    text: [
      {
        text: "grid.filterContainsOperator",
        operator: "contains",
      },
    ],
  };

  const [columns, setColumns] = useState<any[]>([]);

  let gridPDFExport: any;
  let initialDate: any;
  if (appType === "true") {
    initialDate = new Date(new Date().setDate(new Date().getDate() - 1));
  } else {
    initialDate = new Date(new Date().setDate(new Date().getDate() - 30));
  }
  let finalDate = new Date();
  const [startDateValidation, setStartDateValidation] =
    useState<boolean>(false);
  const [endDateValidation, setEndDateValidation] = useState<boolean>(false);

  //Start Date Drop Down Change Handler
  const [startDate, setStartDate] = React.useState<any>(initialDate);
  const startDateChangeHandler = (e: any) => {
    setStartDate(e.target.value);
  };
  const handleStartDateKeyDown = (e: React.KeyboardEvent<HTMLInputElement>) => {
    if (e.key === "Backspace") {
      setStartDate(null);
    }
  };
  //End Date Drop Down Change Handler
  const [endDate, setEndDate] = React.useState<any>(finalDate);
  const endDateChangeHandler = (e: any) => {
    setEndDate(e.target.value);
  };

  const handleEndDateKeyDown = (e: React.KeyboardEvent<HTMLInputElement>) => {
    if (e.key === "Backspace") {
      setEndDate(null);
    }
  };

  const handleKeyPress = (e: any) => {
    if (e.key === "Enter") {
      onSearchHandler();
    }
  };

  const parseAmountStringToInt = (amount: any) => {
    if (typeof amount === "number") {
      return amount;
    } else if (typeof amount === "string") {
      const amountWithoutCommas = amount.replace(/,/g, "");
      return parseFloat(amountWithoutCommas);
    } else {
      return amount;
    }
  };

  const exportHandler = (e: any) => {
    if (e.item.text === "Export PDF") {
      pdfExport();
    } else if (e.item.text === "Export Excel") {
      excelExport();
    } else {
      excelExportAll();
    }
  };

  //PDF Export
  const pdfExport = () => {
    if (gridPDFExport) {
      gridPDFExport.save();
    }
  };

  const excelExportAll = () => {
    if (gridData.length !== 0) {
      _export.current.save(gridData);
    }
  };

  //Filtered Excel Export
  const excelExport = () => {
    if (_export.current !== null) {
      _export.current.save();
    }
  };

  const onClearHandler = () => {
    const tenantId = secureLocalStorage
      .getItem("tenantId")!
      .toString()
      .toLocaleLowerCase();
    const companyId = secureLocalStorage.getItem("companyId");
    setStartDate(initialDate);
    setEndDate(finalDate);
    setAllRecords(false);
    setStartDateValidation(false);
    setEndDateValidation(false);
    setError(false);
    setGridData([]);
    setDataState(initialDataState);
    setTotalItems(0);
    setVendorFilter("");
    setPageSizes(intitalPageState);
    setVendorId("");
    setSearch(false);
    setVendorName("Select");
    setVendor((prev: any) => ({
      ...prev,
      dropdownvalue: vendor.filterValue,
    }));
    // if (companyId && companyId !== "undefined") {
    //   let url = `effigo/api/integration/v1/${tenantId}/payments/getPayments?companyId=${companyId}&fromDate=${formatDateYMD(
    //     initialDate
    //   )}&toDate=${formatDateYMD(finalDate)}`;
    //   fetchData(url);
    // } else {
    //   let url = `effigo/api/integration/v1/${tenantId}/payments/getPayments?fromDate=${formatDateYMD(
    //     initialDate
    //   )}&toDate=${formatDateYMD(finalDate)}&userId=${userId}`;
    //   fetchData(url);
    // }
  };

  const onSearchHandler = async () => {
    setSearch(true);
    setAllRecords(false);
    setGridData([]);
    const tenantId = secureLocalStorage
      .getItem("tenantId")!
      .toString()
      .toLocaleLowerCase();

    const jwtToken = secureLocalStorage.getItem("jwt_token");
    const companyId = secureLocalStorage.getItem("companyId");
    const appType = secureLocalStorage.getItem("appType");

    if (companyId && companyId !== "undefined") {
      // let url = `effigo/api/integration/v1/${tenantId}/payments/getPayments?companyId=${companyId}`;
      let url = `effigo/payment/integration/v1/${tenantId}/getPayments?companyId=${companyId}&userId=${userId}`;
      if (startDate !== null) {
        let sDate = "&fromDate=" + formatDateYMD(startDate);
        url += sDate;
      } else {
        setStartDateValidation(true);
        return;
      }
      if (endDate !== null) {
        let compareDates: any =
          formatDateYMD(startDate) <= formatDateYMD(endDate);
        if (startDate !== null && !compareDates) {
          setError(true);
          return;
        } else {
          setError(false);
          let eDate = "&toDate=" + formatDateYMD(endDate);
          url += eDate;
        }
      } else {
        setEndDateValidation(true);
        return;
      }
      setSUrl(url);
      fetchData(url);
    } else {
      // let url = `effigo/api/integration/v1/${tenantId}/payments/getPayments?userId=${userId}`;
      let url = `effigo/payment/integration/v1/${tenantId}/getPayments?userId=${userId}`;
      if (startDate !== null) {
        let sDate = "&fromDate=" + formatDateYMD(startDate);
        url += sDate;
      } else {
        setStartDateValidation(true);
        return;
      }
      if (endDate !== null) {
        let compareDates: any =
          formatDateYMD(startDate) <= formatDateYMD(endDate);
        if (startDate !== null && !compareDates) {
          setError(true);
          return;
        } else {
          setError(false);
          let eDate = "&toDate=" + formatDateYMD(endDate);
          url += eDate;
        }
      } else {
        setEndDateValidation(true);
        return;
      }
      if (vendorId !== "") {
        let vendorName = "&companyId=" + vendorId;
        url += vendorName;
      }
      setSUrl(url);
      fetchData(url);
    }
  };
  const [vendorName, setVendorName] = useState<any>("Select");
  const [vendorId, setVendorId] = useState<any>("");

  const onVendorNameChange = (e: any) => {
    const value = e.target.value;
    const valueId = vendorObj.find((item: any) => item.companyName === value);
    if (valueId && value !== "Select") {
      setVendorName(value);
      setVendorId(valueId.companyId);
    } else {
      setVendorName("Select");
      setVendorId("");
    }
  };

  // const handleDataStateChange = (e:any) => {
  //   if (!useClientPagination) {
  //     let dState: any = e.dataState;
  //     if (isNaN(dState.take)) {
  //       dState.take = totalItems;
  //       let modifiedPageSizes = pageSizes.filter((item) => item !== "All");
  //       setPageSizes([totalItems, ...modifiedPageSizes]);
  //     } else if (
  //       typeof dState.take === "number" ||
  //       dState.take === undefined
  //     ) {
  //       setPageSizes(intitalPageState);
  //       if (typeof dState.take !== "number") {
  //         dState.take = 10;
  //       }
  //       if (
  //         (0 !== dState.skip && 10 !== dState.take) ||
  //         dataState.skip !== dState.skip ||
  //         dataState.take !== dState.take
  //       ) {
  //         if (
  //           dataState.filter === dState.filter &&
  //           dataState.sort === dState.sort
  //         ) {
  //         } else {
  //           dState = { ...dState, skip: dataState.skip };
  //         }
  //       } else {
  //         dState = { ...dState, skip: dataState.skip };
  //       }
  //     }

  //     setDataState({ ...dState, filter: e.dataState.filter });
  //   } else {
  //     setDataState(e.dataState);
  //   }
  // };

  // const onAllRecordsClick = () => {
  //   setAllRecords(!allRecords);
  // };

  const PDFCustomCell = (props: any) => {
    const { dataItem } = props;
    const id = `${dataItem.paymentDocumentNumber}${dataItem.invoiceDocument}`;
    const jwtToken = secureLocalStorage.getItem("jwt_token");
    const tenantId = secureLocalStorage.getItem("tenantId");
    const user = username;
    const pass = password;
    const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
    const apiCall = (id: any) => {
      let url = `${EFFIGO_LINK_DOC}v2/${tenantId}/downloadFile/payment//${id}`;
      axios
        .get(url, {
          headers: { Authorization: authHeader },
          responseType: "blob",
        })
        .then((response: any) => {
          const fileURL = window.URL.createObjectURL(response.data);
          let alink = document.createElement("a");
          alink.href = fileURL;
          alink.download = `${dataItem.paymentDocumentNumber}${dataItem.invoiceDocument}.pdf`;
          alink.click();
        })
        .catch((error: any) => {
          console.error("Error:", error);
          if (
            error.response &&
            (error.response.status === 400 || error.response.status === 500)
          ) {
            setPdfDocErr(true);
            setTimeout(() => {
              setPdfDocErr(false);
            }, 5000);
          }
        });
    };
    if (id) {
      return (
        <td>
          <img
            src={
              REACT_APP_PDF_ICON_URL||
              "https://tatajdk11-uat.effigo.in/upeg/images/pdf-file.png"
            }
            alt="PDF"
            className="pdf-image"
            onClick={() => apiCall(id)}
          />
        </td>
      );
    } else {
      return <td>NA</td>;
    }
  };
  // const handleStartDateFocus = () => {
  //   setStartDate(null);
  //   setStartDateValidation(false);
  // };

  // const handleEndDateFocus = ()=>{
  //   setEndDate(null);
  //   setEndDateValidation(false);
  // }

  const getGrid = () => {
    let temp = dataState;
    return (
      <Grid
        size="small"
        className="detail-repo-grid"
        data={
          allRecords
            ? process(gridData, dataState)
            : process(data, { ...temp, skip: 0 })
        }
        {...dataState}
        onDataStateChange={(e) => {
          if (!allRecords) {
            let dState = e.dataState;
            if (
              (0 !== e.dataState.skip && 10 !== e.dataState.take) ||
              dataState.skip !== e.dataState.skip ||
              dataState.take !== e.dataState.take
            ) {
              // if (
              //   dataState.filter === e.dataState.filter &&
              //   dataState.sort === e.dataState.sort
              // ) {
              // } else {
              dState = { ...dState, skip: dataState.skip };
              // }
            } else {
              dState = { ...dState, skip: dataState.skip };
            }
            setDataState(dState);
          } else {
            setDataState(e.dataState);
          }
        }}
        scrollable={"scrollable"}
        filterOperators={filterOperators}
        resizable
        pageable={{
          buttonCount: 4,
          pageSizes: pageSizes,
        }}
        total={totalItems}
        sortable={true}
        filterable={true}
        ref={_grid}
      >
        <GridToolbar>
          {/* {filterToggle && ( */}
          <div className="dropdown-container">
            <div className="filter-row" onKeyDown={handleKeyPress}>
              <div onKeyDown={handleStartDateKeyDown}>
                <label className="dropdown-label">Start Date&nbsp;</label>
                <DatePicker
                  width={"120px"}
                  format="dd-MM-yyyy"
                  onChange={startDateChangeHandler}
                  className="datapicker-style"
                  placeholder="day-month-year"
                  value={startDate}
                  // onFocus={handleStartDateFocus}
                  onBlur={(e: any) => {
                    const regex = /[dmy]/;
                    if (e.target.value) {
                      setStartDateValidation(
                        regex.test(e.target.value) ? true : false
                      );
                    } else {
                      setStartDateValidation(false);
                    }
                  }}
                />
                {startDateValidation && (
                  <p className="validation-message text-right">
                    Please Enter Valid Start Date
                  </p>
                )}
              </div>
              <div onKeyDown={handleEndDateKeyDown}>
                <label className="dropdown-label">End Date&nbsp;</label>
                <DatePicker
                  width={"120px"}
                  format="dd-MM-yyyy"
                  onChange={endDateChangeHandler}
                  className="datapicker-style"
                  placeholder="day-month-year"
                  value={endDate}
                  // onFocus={handleEndDateFocus}
                  onBlur={(e: any) => {
                    const regex = /[dmy]/;
                    if (e.target.value) {
                      setEndDateValidation(
                        regex.test(e.target.value) ? true : false
                      );
                      setError(false);
                    } else {
                      setEndDateValidation(false);
                    }
                  }}
                />

                {endDateValidation && (
                  <p className="validation-message text-right">
                    Please Enter Valid End Date
                  </p>
                )}
              </div>
              {appType === "true" && (
                <div>
                  <label className="dropdown-labels">Vendor Name </label>
                  <DropDownList
                    className="DropDownList"
                    data={vendor.dropdownValue}
                    value={vendorName}
                    style={{ width: "200px" }}
                    onChange={onVendorNameChange}
                    filter={vendorFilter}
                    filterable={true}
                    onFilterChange={(e) => {
                      setVendorFilter(e.filter.value);
                      let data = vendor.filterValue.slice();
                      data = filterBy(data, e.filter);
                      setVendor((prev: any) => ({
                        ...prev,
                        dropdownValue: data,
                      }));
                    }}
                    defaultItem="Select"
                  />
                </div>
              )}
              <div className="filter-actions-div">
                <Button
                  size="small"
                  icon="search"
                  onClick={onSearchHandler}
                  className="button-search"
                >
                  Search
                </Button>
                <Button
                  size="small"
                  icon="close"
                  onClick={onClearHandler}
                  className="buttons-clear"
                >
                  Clear
                </Button>

                {/* <BadgeContainer>
                  <Button
                    size="small"
                    icon="data"
                    onClick={onAllRecordsClick}
                    disabled={gridData.length !== 0 ? false : true}
                    className="button-records"
                  >
                    View All Entries
                  </Button>
                  {allRecords && (
                    <Badge
                      size="small"
                      align={{
                        vertical: "top",
                        horizontal: "end",
                      }}
                      themeColor="success"
                      cutoutBorder={true}
                    >
                      <SvgIcon icon={checkIcon} />
                    </Badge>
                  )}
                </BadgeContainer> */}
              </div>
            </div>
            <div style={{ padding: "5px" }}>
              {/* <Button onClick={handleGetAllRecords}>Get All Records</Button> */}
              <DropDownButton
                size="small"
                text="Export"
                className="buttons-container-button"
                themeColor={"base"}
                style={{ height: "20px" }}
                icon="export"
                onItemClick={exportHandler}
              >
                <DropDownButtonItem
                  text="Export Excel"
                  icon="xlsa"
                  data-id="expExc"
                  disabled={gridData.length !== 0 ? false : true}
                />
                {/* <DropDownButtonItem
                  text="Export Excel All"
                  icon="xlsa"
                  data-id="expExc"
                /> */}
              </DropDownButton>
            </div>
          </div>
          {/* )} */}
        </GridToolbar>

        {columns.map((column: any, index: any) => {
          if (column.field === "PDF_DOC") {
            return (
              <Column
                key={index}
                field={column.field}
                title={column.title}
                width={column.width || "150px"}
                cell={PDFCustomCell}
              />
            );
          } else if (
            column.field === "businessUnit" ||
            column.field === "cus_field_9" ||
            column.field === "VENDOR_CODE" ||
            column.field === "PAYMENT_DATE" ||
            column.field === "cus_field_8" ||
            column.field === "fiDocPostingDate" ||
            column.field === "fiDocDocDate" ||
            column.field === "IV_DOCUMENT" ||
            column.field === "cus_field_3" ||
            column.field === "cus_field_4" ||
            column.field === "cus_field_5" ||
            column.field === "credit_debit_ind" ||
            column.field === "advance_ind" ||
            column.field === "PO_NUMBER" ||
            column.field === "cus_field_6" ||
            column.field === "postingKey" ||
            column.field === "cus_field_10" ||
            column.field === "cus_field_7"
          ) {
            return (
              <Column
                key={index}
                field={column.field}
                title={column.title}
                width={100}
              />
            );
          } else if (
            column.field === "clearingDocNo" ||
            column.field === "PAYMENT_DOC_NUMBER"
          ) {
            return (
              <Column
                key={index}
                field={column.field}
                title={column.title}
                width={120}
              />
            );
          } else {
            return (
              <Column
                key={index}
                field={column.field}
                title={column.title}
                width={column.width || "150px"}
              />
            );
          }
        })}
      </Grid>
    );
  };
  return (
    <>
      {loading ? (
        <LoadingPanel />
      ) : (
        <div>
          <NotificationGroup className="validation-notification">
            {error && (
              <Notification
                type={{
                  style: "error",
                  icon: true,
                }}
                closable={true}
                onClose={() => setError(false)}
              >
                <span>
                  End Date must be greater than or equal to Start Date.
                </span>
              </Notification>
            )}
            {apiError && (
              <Notification
                type={{
                  style: "error",
                  icon: true,
                }}
                closable={true}
                onClose={() => setApiErr(false)}
              >
                {errormsg}
              </Notification>
            )}
            {apiSuccess && (
              <Notification
                type={{
                  style: "success",
                  icon: true,
                }}
                closable={true}
                onClose={() => setApiSuccess(false)}
              >
                {successMsg}
              </Notification>
            )}
            {pdfDocErr && (
              <Notification
                type={{
                  style: "error",
                }}
                closable={true}
                onClose={() => setPdfDocErr(false)}
              >
                <span>Document Not Available</span>
              </Notification>
            )}
          </NotificationGroup>
          {getGrid()}
          <ExcelExport
            ref={_export}
            data={allRecords ? gridData : data}
            filterable={true}
            fileName="Payment Details"
          >
            {columns.map((column: any, i: any) => {
              return (
                <ExcelExportColumn
                  key={i}
                  field={column.field}
                  title={column.title}
                  cellOptions={{
                    borderBottom: { color: "#000000", size: 1 },
                    borderLeft: { color: "#000000", size: 1 },
                    borderRight: { color: "#000000", size: 1 },
                    borderTop: { color: "#000000", size: 1 },
                  }}
                />
              );
            })}
          </ExcelExport>
          <GridPDFExport
            ref={(pdfExport) => (gridPDFExport = pdfExport)}
            fileName="Payment Details"
          >
            {getGrid()}
          </GridPDFExport>
        </div>
      )}
    </>
  );
}

export default PaymentReport;
