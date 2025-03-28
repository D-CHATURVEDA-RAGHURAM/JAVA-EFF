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
import _, { drop } from "lodash";
import LoadingPanel from "../../shared/LoadingPanel";
import { formatDateYMD } from "../../utils/formatDateYMD";
import "../../shared/index.css";
import { DatePicker,Calendar } from "@progress/kendo-react-dateinputs";
import { apiIPC, apiKBL } from "../../api";
import {
  Notification,
  NotificationGroup,
} from "@progress/kendo-react-notification";
import "../../shared/reports.css";
import { DropDownList } from "@progress/kendo-react-dropdowns";
import {
  EFFIGO_USER_TATA,
  EFFIGO_PASS_TATA,
  EFFIGO_USER_VARROC,
  EFFIGO_PASS_VARROC,
  EFFIGO_USER_KBL,
  EFFIGO_PASS_KBL,
} from "../../environment";
import secureLocalStorage from "react-secure-storage";
import { Badge, BadgeContainer } from "@progress/kendo-react-indicators";
import { SvgIcon } from "@progress/kendo-react-common";
import { checkIcon } from "@progress/kendo-svg-icons";
import { Dialog } from '@progress/kendo-react-dialogs';
import { EFFIGO_PDF_LINK } from '../../environment';
import { formatDateDMY } from "../../utils/formatDateDMY";


const initialDataState: any = {
  take: 50,
  skip: 0,
};

const intitalPageState: any = [50, 100, 200];
function InvoiceReports() {
  const token = secureLocalStorage.getItem("jwt_token");
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
  } else if(tenantId ==="kbl") {
    username = EFFIGO_USER_KBL;
    password = EFFIGO_PASS_KBL;
  }

  const [loading, setLoading] = useState<boolean>(false);
  const [data, setData] = useState<any>([]);
  const [totalData, setTotalData] = useState<any>();
  const [dataState, setDataState] = React.useState<any>(initialDataState);
  const [totalItems, setTotalItems] = useState<number>(0);
  const documentTenantId = secureLocalStorage.getItem('documentTenantId');
  
  const [error, setError] = useState<boolean>(false);
  const userId = secureLocalStorage.getItem("userId");

  const [columns, setColumns] = useState<any[]>([]);
  const [gridData, setGridData] = useState<any[]>([]);
  const [pageSizes, setPageSizes] = useState<any[]>(intitalPageState);

  const [sUrl, setSUrl] = useState<any>();
  const [allRecords, setAllRecords] = useState<boolean>(false);

  //Notifications states
  const [apiError, setApiErr] = useState<boolean>(false);
  const [errormsg, setErrorMsg] = useState<any>("");
  const [apiSuccess, setApiSuccess] = useState<boolean>(false);
  const [successMsg, setSuccessMsg] = useState<any>("");

  //vendor
  const [vendor, setVendor] = useState<any>({
    dropdownValue: [],
    filterValue: [],
  });
  const [vendorObj, setVendorObj] = useState<any>();
  const [vendorFilter, setVendorFilter] = useState<any>();

  const [search, setSearch] = useState<boolean>(false);
  const appType = secureLocalStorage.getItem("appType");

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

  const fetchDropdown = () => {
    const tenantId = secureLocalStorage
      .getItem("tenantId")!
      .toString()
      .toLocaleLowerCase();

    const jwtToken = secureLocalStorage.getItem("jwt_token");
    const user = username;
    const pass = password;

    const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
    let apiInstance;

    if (tenantId === 'kbl') {
      apiInstance = apiKBL;
    } else {
      apiInstance = apiIPC;
    }
    // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoiceDropDownDetails`;
    let url = `effigo/payment/integration/v1/${tenantId}/getInvoiceDropDownDetails`;
    apiInstance
      .get(url, { headers: { Authorization: authHeader } })
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
        console.error("An error occurred while fetching dropdown data:", error);
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
    // searchUrl = `${url}&appType=${appType}&pageNo=${pageNo}&pageSize=${dataState.take}`;
    searchUrl = `${url}`;

    try {
      const jwtToken = secureLocalStorage.getItem("jwt_token");
      const user = username;
      const pass = password;
      const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
      setLoading(true);
      let apiInstance;

      if (tenantId === 'kbl' || tenantId === "kbl-u") {
        apiInstance = apiKBL;
      } else {
        apiInstance = apiIPC;
      }

      const response: any = await apiInstance.get(searchUrl, {
        headers: { Authorization: authHeader },
      });
      const modifiedData = replaceEmptyWithNA(response.data?.data);
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
      let apiInstance;

      if (tenantId === 'kbl') {
        apiInstance = apiKBL;
      } else {
        apiInstance = apiIPC;
      }
      const response: any = await apiInstance.get(searchUrl, {
        headers: { Authorization: authHeader },
      });
      const modifiedData = replaceEmptyWithNA(response.data?.data);
      setGridData(modifiedData);
      if(modifiedData.length !== 0){
        setAllRecords(true)
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

      let user = username;

      if (appType === "true") {
        fetchDropdown();
      }
      const fetchColumnKeys = (url: any) => {
        const user = username;
        const pass = password;
        const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
        let apiInstance;

        if (tenantId === 'kbl') {
          apiInstance = apiKBL;
        } else {
          apiInstance = apiIPC;
        }
        apiInstance
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
      if (appType === "true") {
        // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoiceTitles`;
        let url = `effigo/payment/integration/v1/${tenantId}/getInvoiceTitles`;
        fetchColumnKeys(url);
      } else if (appType === "false") {
        // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoiceSupplierTitles`;
        let url = `effigo/payment/integration/v1/${tenantId}/getInvoiceSupplierTitles`;
        fetchColumnKeys(url);
      } else {
        // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoiceTitles`;
        let url = `effigo/payment/integration/v1/${tenantId}/getInvoiceTitles`;
        fetchColumnKeys(url);
      }

      if (search && dataState) {
        onSearchHandler();
      } else if (startDate !== null && endDate !== null && formatDateYMD(startDate)<= formatDateYMD(endDate)) {
        if (companyId && companyId !== "undefined") {
          // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoices?companyId=${companyId}&fromDate=${formatDateYMD(
          //   initialDate
          // )}&toDate=${formatDateYMD(finalDate)}`;
          let url = `effigo/payment/integration/v1/${tenantId}/paginated`
          fetchData(url);
        } else {
          // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoices?fromDate=${formatDateYMD(
          //   initialDate
          // )}&toDate=${formatDateYMD(finalDate)}&userId=${userId}`;
    let url = `effigo/payment/integration/v1/${tenantId}/paginated`
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

  let gridPDFExport: any;
  const _grid = useRef<any>();
  const _export = useRef<any>(null);

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

  const exportHandler = (e: any) => {
    if (e.item.text === "Export PDF") {
      pdfExport();
    } else if (e.item.text === "Export Excel") {
      console.log("excel exprt")
      excelExport();
    } else if (e.item.text === "Export Excel All") {
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
    if(gridData.length !== 0){
      _export.current.save(gridData);
 }
  };
  //Filtered Excel Export
  const excelExport = () => {
      if (_export.current !== null) {
        _export.current.save(gridData);
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
    setGridData([]);
    setDataState(initialDataState);
    setStartDateValidation(false);
    setEndDateValidation(false);
    setError(false);
    setTotalItems(0);
    setVendorId("");
    setVendorFilter("");
    setVendorName("Select");
    setPageSizes(intitalPageState);
    setVendor((prev: any) => ({
      ...prev,
      dropdownvalue: vendor.filterValue,
    }));

    setSearch(false);
  };

  const onSearchHandler = () => {
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

    if (jwtToken && tenantId) {
      if (companyId && companyId !== "undefined") {
        // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoices?companyId=${companyId}`;
        let url = `effigo/payment/integration/v1/${tenantId}/getInvoices?companyId=${companyId}&userId=${userId}`;
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
        // let url = `effigo/api/integration/v1/${tenantId}/invoices/getInvoices?userId=${userId}`;
        let url = `effigo/payment/integration/v1/${tenantId}/getInvoices?userId=${userId}`;
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

  // const onAllRecordsClick = () => {
  //   setAllRecords(!allRecords);
  // };

  const PDFCustomCell = (props: any) => {
    const { dataItem } = props;
    const id = `${dataItem.referenceDocumentNumber}`;
    const fileName = `${dataItem.dispatchDoc}`;
    let baseUrl = EFFIGO_PDF_LINK;
    const supplierId = `${dataItem.supplierId}`
    let url: any;
    url = `${baseUrl}invoice-document/${supplierId}/${id}/${fileName}`;
    const isImageFile = /\.(jpg|jpeg|png)$/i.test(fileName);
    const [isDialogOpen, setIsDialogOpen] = useState<any>(false);
    const [zoomLevel, setZoomLevel] = useState(1);

  
    const openPdfDialog = () => {
      setIsDialogOpen(true);
    };
  
    const closePdfDialog = () => {
      setIsDialogOpen(false);
    };

    
    const [isMouseDown, setIsMouseDown] = useState(false);
    const [startX, setStartX] = useState(0);
    const [startY, setStartY] = useState(0);
    const [scrollLeft, setScrollLeft] = useState(0);
    const [scrollTop, setScrollTop] = useState(0);
  
    const handleMouseDown = (e: React.MouseEvent<HTMLDivElement>) => {
      e.preventDefault();
      setIsMouseDown(true);
      setStartX(e.pageX - e.currentTarget.offsetLeft);
      setStartY(e.pageY - e.currentTarget.offsetTop);
      setScrollLeft(e.currentTarget.scrollLeft);
      setScrollTop(e.currentTarget.scrollTop);
    };
  
    const handleMouseMove = (e: React.MouseEvent<HTMLDivElement>) => {
      e.preventDefault();
      if (!isMouseDown) return;
      const x = e.pageX - e.currentTarget.offsetLeft;
      const y = e.pageY - e.currentTarget.offsetTop;
      const moveX = x - startX;
      const moveY = y - startY;
      e.currentTarget.scrollLeft = scrollLeft - moveX;
      e.currentTarget.scrollTop = scrollTop - moveY;
    };
  
    const handleMouseUp = () => {
      setIsMouseDown(false);
    };
  
    const ImageToolbar = ({ onZoomIn, onZoomOut, onResetZoom }: any) => (
      <div className="imagetoolbardiv">
        <Button onClick={onZoomIn} className="toolbar-button small">
          +
        </Button>
  
        <Button onClick={onZoomOut} className="toolbar-button small" disabled={zoomLevel === 1}>
          -
        </Button>
  
        <Button onClick={onResetZoom} className="toolbar-button small">
          Reset
        </Button>
      </div>
    );
  
    const handleZoomIn = () => {
      setZoomLevel((prevZoomLevel) => Math.min(prevZoomLevel + 0.1, 3));
    };
  
    const handleZoomOut = () => {
      setZoomLevel((prevZoomLevel) => Math.max(prevZoomLevel - 0.1, 1));
    };
  
    const handleResetZoom = () => {
      setZoomLevel(1);
    };
  
    if (
      id &&
      fileName !== 'null' &&
      fileName !== null &&
      fileName !== 'NA' &&
      fileName !== ''
    ) {
    return (
      <td>
        <div>
          <button onClick={openPdfDialog} style={{ border: 'none' }}>
            {fileName}
          </button>
        </div>
        {isDialogOpen && (
          <div>
            <Dialog
              title="Document Viewer"
              onClose={closePdfDialog}
              className="custom-dialog"
              style={{
                position: 'fixed',
                boxSizing: 'border-box',
                minWidth: '600px',
                minHeight: '600px',
                width: '100%',
                height: '100%',
                padding: 0,
              }}
            >
              <>
                {isImageFile ? (
                  <>
                    <ImageToolbar onZoomIn={handleZoomIn} onZoomOut={handleZoomOut} onResetZoom={handleResetZoom} />
  
                    <div className="imgdiv1">
                      <div className="imgdiv2" 
                        onMouseDown={handleMouseDown}
                        onMouseMove={handleMouseMove}
                        onMouseUp={handleMouseUp} >
                        <img

                          src={url}
                          alt={fileName}
                          className="imgmain"
                          style={{
                            transform: `scale(${zoomLevel})`,
                            zIndex: 1000,
                            cursor:'pointer',
                            transformOrigin: zoomLevel > 1.9 ? 'top left' : 'top',
                            width: zoomLevel > 1.9 ? "100%":"60%"
                          }}
                        />
                      </div>
                    </div>


                  </>
                ) : (
                  <div style={{ overflow: 'hidden' }}>
                    <embed src={url} width="100%" height="530" type="application/pdf"></embed>
                  </div>
                )}
              </>
            </Dialog>
          </div>
        )}
      </td>
    );
                }else{
                  return <td>NA</td>;
                }
  };

  const handleStartDateFocus = () => {
      setStartDate(null);
    setStartDateValidation(false); 
  };

  const getGrid = () => {
    let temp = dataState;
    return (
      <Grid
        size="small"
        className="detail-repo-grid"
        // rowHeight={40}
        data={
          allRecords
            ? process(gridData, dataState)
            : process(data, { ...temp, skip: 0 })
        }
        {...dataState}
        onDataStateChange={(e) => {
          if (
           !allRecords
          ) {
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
          <div className="dropdown-container">
            <div className="filter-row" onKeyDown={handleKeyPress}>
              <div onKeyDown={handleStartDateKeyDown} >
                <label className="dropdown-label">Posting Date From&nbsp;</label>
                <DatePicker
                  width={"120px"}
                  format="dd-MM-yyyy"
                  onChange={startDateChangeHandler}
                  className="datapicker-style"
                  placeholder="day-month-year"
                  value={startDate}
                  calendar={Calendar}
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
                <label className="dropdown-label">To&nbsp;</label>
                <DatePicker
                  width={"120px"}
                  format="dd-MM-yyyy"
                  onChange={endDateChangeHandler}
                  className="datapicker-style"
                  placeholder="day-month-year"
                  value={endDate}
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
              </div>
            </div>
            <div style={{ padding: "5px" }}>
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
              </DropDownButton>
            </div>
          </div>
          {/* )} */}
        </GridToolbar>

        {columns.map((column: any, index: any) => {
          if (
            column.field === "businessUnit" ||
            column.field === "plant" ||
            column.field === "postingDate" ||
            column.field === "companyCode" ||
            column.field === "invoiceDocumentNumber" ||
            column.field === "invoiceDocumentItem" ||
            column.field === "accountingDocumentNumber" ||
            column.field === "fiscalYear" ||
            column.field === "referenceDocumentNumber" ||
            column.field === "purchaseDocumentNumber" ||
            column.field === "purchaseDocumentItem" ||
            column.field === "materialNumber" ||
            column.field === "quantity" ||
            column.field === "purchaseOrderUom" ||
            column.field === "referenceDocument" ||
            column.field === "fiscalYearCurrentPeriod" ||
            column.field === "materialDocumentItem" ||
            column.field === "grnDate" ||
            column.field === "deliveryNoteQuantity" ||
            column.field === "unitEntryQuantity" ||
            column.field === "serviceCode" ||
            column.field === "serviceLine" ||
            column.field === "referenceDocumentItem"
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
            column.field === "documentCurrencyAmount" ||
            column.field === "sgst" ||
            column.field === "cgst" ||
            column.field === "igst" ||
            column.field === "tcs" ||
            column.field === "tds" ||
            column.field === "grossDocumentValue" ||
            column.field === "materialDescription" ||
            column.field === "materialDocumentNumber"
          ) {
            return (
              <Column
                key={index}
                field={column.field}
                title={column.title}
                width={120}
              />
            );
          } else if(column.field === 'dispatchDoc') {
            return (
              <Column
                key={index}
                field={column.field}
                title={column.title}
                width={column.width || "150px"}
                cell={PDFCustomCell}
              />
            );
          }else{
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
    <div>
      {loading ? (
        <LoadingPanel />
      ) : (
        <>
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
          </NotificationGroup>
          {getGrid()}
          <ExcelExport
            ref={_export}
            data={allRecords ? gridData :data}
            filterable={true}
            fileName="Invoice Details"
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
        </>
      )}
    </div>
  );
}

export default InvoiceReports;
