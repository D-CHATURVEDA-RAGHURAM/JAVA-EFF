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
} from "../../environment";
import secureLocalStorage from "react-secure-storage";
import { Badge, BadgeContainer } from "@progress/kendo-react-indicators";
import { SvgIcon } from "@progress/kendo-react-common";
import { checkIcon, clockIcon } from "@progress/kendo-svg-icons";

const initialDataState = {
  take: 50,
  skip: 0,
};

const intitalPageState: any = [50, 100, 200];

function CreditDebitNote() {
  const [loading, setLoading] = useState<boolean>(false);
  const [totalItems, setTotalItems] = useState<number>(0);
  const token = secureLocalStorage.getItem("jwt_token");
  const _grid = useRef<any>();
  const _export = useRef<any>(null);
  const [data, setData] = useState<any>([]);
  const [dataState, setDataState] = React.useState<any>(initialDataState);
  const [totalData, setTotalData] = useState<any>();
  const [error, setError] = useState<boolean>(false);

  //Notifications states
  const [apiError, setApiErr] = useState<boolean>(false);
  const [errormsg, setErrorMsg] = useState<any>("");
  const [apiSuccess, setApiSuccess] = useState<boolean>(false);
  const [successMsg, setSuccessMsg] = useState<any>("");

  const [columns, setColumns] = useState<any[]>([]);
  const [gridData, setGridData] = useState<any[]>([]);
  const [search, setSearch] = useState<boolean>(false);

  const [vendor, setVendor] = useState<any>({
    dropdownValue: [],
    filterValue: [],
  });
  const [vendorObj, setVendorObj] = useState<any>();
  const [vendorFilter, setVendorFilter] = useState<any>();
  const appType = secureLocalStorage.getItem("appType");
  const tenantId = secureLocalStorage
    .getItem("tenantId")!
    .toString()
    .toLocaleLowerCase();

  const [pageSizes, setPageSizes] = useState<any[]>(intitalPageState);
  const [sUrl, setSUrl] = useState<any>();
  const [allRecords, setAllRecords] = useState<boolean>(false);

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

  const fetchDropdown = () => {
    const tenantId = secureLocalStorage
      .getItem("tenantId")!
      .toString()
      .toLocaleLowerCase();
    const jwtToken = secureLocalStorage.getItem("jwt_token");
    const user = username;
    const pass = password;
    const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
    // let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebitDropDownDetails`;
    let url = `effigo/payment/integration/v1/${tenantId}/getCreditDebitDropDownDetails`;
    apiIPC
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
      .catch((error) => console.log(error));
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
      const modifiedData = replaceEmptyWithNA(response.data?.creditDebitDtoV1List);
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
      const modifiedData = replaceEmptyWithNA(response.data?.creditDebitDtoV1List);
      setGridData(modifiedData);
      if(modifiedData.length !== 0){
        setAllRecords(true)
      }
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
      const userId = secureLocalStorage.getItem("userId");
      if (appType === "true") {
        fetchDropdown();
      }
      const fetchColumnKeys = (url: any) => {
        const user = username;
        const pass = password;
        const authHeader = `Basic ${btoa(`${user}:${pass}`)}`;
        apiIPC
          .get(url, { headers: { Authorization: authHeader } })
          .then((response: any) => {
            if (response.data?.data?.length > 0) {
              const columnKeys = response.data.data;
              const dynamicColumns = columnKeys.map((key: any) => ({
                field: key.field,
                title: key.title,
                width: 150,
              }));
              setColumns(dynamicColumns);
            }
          })
          .catch((error) => {
            console.error("Error fetching column keys:", error);
          });
      };

      if (tenantId && jwtToken) {
        if (appType === "true") {
          // let url = `/effigo/api/integration/v1/${tenantId}/payments/getCreditDebitTitles`;
          let url = `/effigo/payment/integration/v1/${tenantId}/getCreditDebitTitles`;
          fetchColumnKeys(url);
        } else if (appType === "false") {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebitSupplierTitles`;
          let url = `effigo/payment/integration/v1/${tenantId}/getCreditDebitSupplierTitles`;
          fetchColumnKeys(url);
        } else {
          // let url = `/effigo/api/integration/v1/${tenantId}/payments/getCreditDebitTitles`;
          let url = `/effigo/payment/integration/v1/${tenantId}/getCreditDebitTitles`;
          fetchColumnKeys(url);
        }
      }
      if (search && dataState) {
        onSearchHandler();
      } else if (startDate !== null && endDate !== null) {
        if (companyId && companyId !== "undefined") {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebit?companyId=${companyId}&fromDate=${formatDateYMD(
          //   initialDate
          // )}&toDate=${formatDateYMD(finalDate)}&fromDate=${formatDateYMD(
          //   initialDate
          // )}&toDate=${formatDateYMD(finalDate)}`;
          let url = `effigo/payment/integration/v1/${tenantId}/getCreditDebit?companyId=${companyId}&fromDate=${formatDateYMD(
            initialDate
          )}&toDate=${formatDateYMD(finalDate)}&userId=${userId}`;
          fetchData(url);
        } else {
          // let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebit?userId=${userId}&fromDate=${formatDateYMD(
          //   initialDate
          // )}&toDate=${formatDateYMD(finalDate)}`;
          let url = `effigo/payment/integration/v1/${tenantId}/getCreditDebit?userId=${userId}&fromDate=${formatDateYMD(
            initialDate
          )}&toDate=${formatDateYMD(finalDate)}`;
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

  let gridPDFExport: any;

  const filterOperators = {
    text: [
      {
        text: "grid.filterContainsOperator",
        operator: "contains",
      },
    ],
  };
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
    setAllRecords(false);
    setGridData([]);

    const tenantId = secureLocalStorage
      .getItem("tenantId")!
      .toString()
      .toLocaleLowerCase();
    const companyId = secureLocalStorage.getItem("companyId");
    const userId = secureLocalStorage.getItem("userId");
    setStartDate(initialDate);
    setEndDate(finalDate);
    setStartDateValidation(false);
    setEndDateValidation(false);
    setError(false);
    setDataState(initialDataState);
    setTotalItems(0);
    setVendorId("");
    setPageSizes(intitalPageState);
    setVendorFilter("");
    setVendorName("Select");
    setVendor((prev: any) => ({
      ...prev,
      dropdownvalue: vendor.filterValue,
    }));
    // if (companyId && companyId !== "undefined") {
    //   let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebit?companyId=${companyId}&fromDate=${formatDateYMD(
    //     initialDate
    //   )}&toDate=${formatDateYMD(finalDate)}&pageNo=${
    //     dataState.skip / dataState.take
    //   }&pageSize=${dataState.take}&fromDate=${formatDateYMD(
    //     initialDate
    //   )}&toDate=${formatDateYMD(finalDate)}`;
    //   fetchData(url);
    // } else {
    //   let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebit?userId=${userId}&fromDate=${formatDateYMD(
    //     initialDate
    //   )}&toDate=${formatDateYMD(finalDate)}&pageNo=${
    //     dataState.skip / dataState.take
    //   }&pageSize=${dataState.take}`;
    //   fetchData(url);
    // }
    setSearch(false);
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
    const userId = secureLocalStorage.getItem("userId");
    if (companyId && companyId !== "undefined") {
      // let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebit?companyId=${companyId}`;
      let url = `effigo/payment/integration/v1/${tenantId}/getCreditDebit?companyId=${companyId}&userId=${userId}`;
      if (startDate !== null) {
        let sDate = "&fromDate=" + formatDateYMD(startDate);
        url += sDate;
      }

      if (endDate !== null) {
        let compareDates: any =
          formatDateYMD(startDate) <= formatDateYMD(endDate);
        if (startDate !== null && !compareDates) {
          setError(true);
          setTimeout(() => {
            setError(false);
          }, 5000);
          return;
        } else {
          let eDate = "&toDate=" + formatDateYMD(endDate);
          url += eDate;
        }
      }
      setSUrl(url);
      fetchData(url);
    } else {
      // let url = `effigo/api/integration/v1/${tenantId}/payments/getCreditDebit?userId=${userId}`;
      let url = `effigo/payment/integration/v1/${tenantId}/getCreditDebit?userId=${userId}`;
      if (startDate !== null) {
        let sDate = "&fromDate=" + formatDateYMD(startDate);
        url += sDate;
      }

      if (endDate !== null) {
        let compareDates: any =
          formatDateYMD(startDate) <= formatDateYMD(endDate);
        if (startDate !== null && !compareDates) {
          setError(true);
          setTimeout(() => {
            setError(false);
          }, 5000);
          return;
        } else {
          let eDate = "&toDate=" + formatDateYMD(endDate);
          url += eDate;
          setError(false);
        }
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

  // const onAllRecordsClick = () => {
  //   setAllRecords(!allRecords);
  // };

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
          {/* {filterToggle && ( */}
          <div className="dropdown-container">
            <div className="filter-row" onKeyDown={handleKeyPress}>
              <div onKeyDown={handleStartDateKeyDown}>
                <label className="dropdown-label">Start Date &nbsp;</label>
                <DatePicker
                  width={"120px"}
                  format="dd-MM-yyyy"
                  onChange={startDateChangeHandler}
                  className="datapicker-style"
                  placeholder="day-month-year"
                  // onFocus={handleStartDateFocus}
                  value={startDate}
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
                <DropDownButtonItem
                  text="Export Excel All"
                  icon="xlsa"
                  data-id="expExc"
                />
              </DropDownButton>
            </div>
          </div>
          {/* )} */}
        </GridToolbar>

        {columns.map((column: any, index: any) => {
          if (
            column.field === "businessUnit" ||
            column.field === "WERKS" ||
            column.field === "BLDAT" ||
            column.field === "BUDAT" ||
            column.field === "BUKRS" ||
            column.field === "BLART" ||
            column.field === "CATEGORY" ||
            column.field === "MIRO_DOC_NO" ||
            column.field === "MIRO_DOC_YR" ||
            column.field === "BELNR" ||
            column.field === "GJAHR" ||
            column.field === "XBLNR" ||
            column.field === "ZUONR" ||
            column.field === "BKTXT" ||
            column.field === "MATNR" ||
            column.field === "LOTKZ" ||
            column.field === "MENGE" ||
            column.field === "MEINS"
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
            column.field === "WRBTR" ||
            column.field === "SGST" ||
            column.field === "CGST" ||
            column.field === "IGST" ||
            column.field === "RATE" ||
            column.field === "GROSS" ||
            column.field === "purchaseDocNo"
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
                onClose={() => setError(false)}
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

          <ExcelExport
            ref={_export}
            data={allRecords ? gridData :data}
            filterable={true}
            fileName="Credit/Debit Details"
          >
            {getGrid()}
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
        </div>
      )}
    </>
  );
}

export default CreditDebitNote;
