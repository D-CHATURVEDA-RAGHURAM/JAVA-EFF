import { Grid, GridColumn, GridToolbar } from "@progress/kendo-react-grid";
import React, { useEffect, useRef, useState } from "react";
import { process } from "@progress/kendo-data-query";
import {
  ExcelExport,
  ExcelExportColumn,
} from "@progress/kendo-react-excel-export";
import {
  Button,
  DropDownButton,
  DropDownButtonItem,
} from "@progress/kendo-react-buttons";
import LoadingPanel from "../../shared/LoadingPanel";
import { EFFIGO_MATERIAL_PRICE } from "../../environment";
import axios from "axios";
import { useSearchParams } from "react-router-dom";
import { DropDownList, MultiSelect } from "@progress/kendo-react-dropdowns";
import { Calendar, DatePicker } from "@progress/kendo-react-dateinputs";
import { formatDateYMD } from "../../utils/formatDateYMD";
import { Dialog } from "@progress/kendo-react-dialogs";
import VendorDetailsGrid from "./VendorDetailGrid";
import { showNotification } from "../material_price/Notifications";
import VendorRatingUploadDialog from "./VendorRatingUploadDialog";

const initialDataState = {
  take: 50,
  skip: 0,
};

const VendorRatingGrid = () => {
  const initialDate = new Date(new Date().setDate(new Date().getDate() - 30));
  const finalDate = new Date();
  const [searchParams] = useSearchParams();
  const authToken = searchParams.get("token");
  const _export = React.useRef<ExcelExport | null>(null);
  const [importDialog, setImportDialog] = useState<boolean>(false);
  const [dataState, setDataState] = useState<any>(initialDataState);
  const [loading, setLoading] = useState<boolean>(false);
  const [columns, setColumns] = useState<any>([]);
  const [rows, setRows] = useState<any>([]);
  const [startDateValidation, setStartDateValidation] =
    useState<boolean>(false);
  const [endDateValidation, setEndDateValidation] = useState<boolean>(false);
  const [startDate, setStartDate] = useState<any>(initialDate);
  const [endDate, setEndDate] = useState<any>(finalDate);
  const url = "effigo/api/grn/v1/varroc/getVendorRatingDetails";
  const [vendorValue, setVendorValue] = useState<any>(null);
  const [vendorDropDown, setVendorDropDown] = useState<any>([]);
  const [vendorFilter, setVendorFilter] = useState<any>("");
  const [vendorFilterDropDown, setVendorFilterDropDown] = useState<any>([]);
  const [selectedVendorCodes, setSelectedVendorCodes] = useState<any>([]);
  const [showItemGrid, setShowItemGrid] = useState<boolean>(false);
  const [vendorCode, setvendorCode] = useState<string>("");

  const fetchColumns = async () => {
    try {
      const response: any = await axios.get(
        `${EFFIGO_MATERIAL_PRICE}effigo/api/grn/v1/varroc/getVendorRatingTitles`,
        {
          headers: {
            Authorization: `Bearer ${authToken}`,
          },
        }
      );
      setColumns(response?.data?.data);
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  };

  const fetchRows = async (
    url: string,
    fd = formatDateYMD(startDate),
    ed = formatDateYMD(endDate),
    vCodes = selectedVendorCodes
  ) => {
    setLoading(true);
    try {
      const response: any = await axios.post(
        `${EFFIGO_MATERIAL_PRICE}${url}`,
        {
          vendorCodes: vCodes || selectedVendorCodes,
        },
        {
          params: {
            fromDate: fd || formatDateYMD(startDate),
            toDate: endDate
              ? ed || formatDateYMD(endDate)
              : formatDateYMD(finalDate),
          },
          headers: {
            Authorization: `Bearer ${authToken}`,
          },
        }
      );
      setRows(response?.data?.data);
      response?.data?.success
        ? showNotification({ message: response.data?.message, type: "success" })
        : showNotification({ message: response.data?.message, type: "error" });
      setLoading(false);
    } catch (error: any) {
      setLoading(false);
      showNotification({ message: error.message, type: "error" });
      console.error("Error fetching data:", error);
    }
  };

  const fetchDropDown = async () => {
    try {
      const response: any = await axios.get(
        `${EFFIGO_MATERIAL_PRICE}effigo/api/grn/v1/varroc/getVendorRatingDropdown`,
        {
          headers: {
            Authorization: `Bearer ${authToken}`,
          },
        }
      );
      setVendorDropDown(response?.data?.data);
      setVendorFilterDropDown(response?.data?.data);
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  };

  useEffect(() => {
    fetchColumns();
    fetchRows(url);
    fetchDropDown();
  }, []);

  const toggleImportDialog = () => {
    setImportDialog(!importDialog);
  };

  const excelExportHandler = (e: any) => {
    if (e.item.text === "Current Data") {
      if (_export.current !== null) {
        _export.current.save();
      }
    } else {
      const fetchAllData = async function () {
        try {
          const response: any = await axios.post(
            `${EFFIGO_MATERIAL_PRICE}${url}`,
            {
              vendorCodes: [],
            },
            {
              params: {
                fromDate: "2000-01-01",
                toDate: formatDateYMD(finalDate),
              },
              headers: {
                Authorization: `Bearer ${authToken}`,
              },
            }
          );
          const allData = response?.data?.data;
          if (_export.current !== null) {
            _export.current.save(allData);
          }
        } catch (error) {
          console.log(error);
        }
      };
      fetchAllData();
    }
  };

  //Grid functions
  const startDateChangeHandler = (e: any) => {
    setStartDate(e.target.value);
    // setRangeValue("Custom Dates");
  };

  const endDateChangeHandler = (e: any) => {
    setEndDate(e.target.value);
    // setRangeValue("Custom Dates");
  };

  const onDropFilterChangeHandler = (e: any) => {
    const filterValue = e.filter.value;
    setVendorFilter(filterValue);
    const filterDropDownValues = vendorDropDown.filter((dropDownData: any) =>
      dropDownData?.vendorCode
        ?.toLowerCase()
        .includes(filterValue.toLowerCase())
    );
    setVendorFilterDropDown(filterDropDownValues);
  };

  const onSearchHandler = () => {
    let compareDates: any = formatDateYMD(startDate) <= formatDateYMD(endDate);
    if (startDate !== null && endDate !== null && !compareDates) {
      showNotification({
        message: "End Date must be greater than or equal to Start Date.",
        type: "error",
      });
      return;
    }
    fetchRows(url);
  };

  const onClearHandler = () => {
    setStartDate(initialDate);
    setEndDate(finalDate);
    setStartDateValidation(false);
    setEndDateValidation(false);
    setVendorFilter("");
    setVendorValue(null);
    setSelectedVendorCodes([]);
    const clearButton = document.getElementsByClassName(
      "k-clear-value"
    )[0] as HTMLButtonElement;
    if (clearButton) {
      clearButton.click();
    }
    setVendorFilterDropDown(vendorDropDown);
    fetchRows(url, formatDateYMD(initialDate), formatDateYMD(finalDate), []);
  };

  const handleStartDateKeyDown = (e: React.KeyboardEvent<HTMLInputElement>) => {
    if (e.key === "Backspace") {
      setStartDate(null);
    }
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

  const handleDropDownChange = (event: any) => {
    const values = event.target.value;
    setSelectedVendorCodes(() => {
      const selectedValues = values.map((value: any) => value?.vendorCode);
      return selectedValues;
    });
  };

  const linkColumn = (props: any) => {
    const { field } = props;
    const { dataItem } = props;
    const item = dataItem[field];
    return (
      <td>
        <button
          className="doc-link"
          onClick={(e) => {
            setvendorCode(item);
            setShowItemGrid(true);
          }}
        >
          {item}
        </button>
      </td>
    );
  };

  const getGrid = () => {
    return (
      <>
        {loading && <LoadingPanel />}
        {columns.length > 0 && (
          <Grid
            data={process(rows, dataState)}
            {...dataState}
            className="materialGrid"
            filterable={true}
            sortable={true}
            onDataStateChange={(e) => {
              setDataState(e.dataState);
            }}
            size="small"
            pageable={{
              buttonCount: 4,
              pageSizes: [50, 100, 200],
            }}
          >
            <GridToolbar>
              <div className="gridToolbar">
                <div className="buttonsContainer">
                  <DropDownButton
                    text="Export Excel"
                    className="buttons-container-button"
                    themeColor={"base"}
                    icon="export"
                    onItemClick={excelExportHandler}
                    size="small"
                  >
                    <DropDownButtonItem text="Current Data" icon="xlsa" />
                    <DropDownButtonItem text="All Data" icon="xlsa" />
                  </DropDownButton>
                  <Button
                    onClick={toggleImportDialog}
                    size="small"
                    title={"Import from Excel"}
                    className="materialButton"
                    icon="import"
                  >
                    Import From Excel
                  </Button>
                </div>
                <div className="filter-container" onKeyDown={handleKeyPress}>
                  <div className="filter" onKeyDown={handleStartDateKeyDown}>
                    <label className="dropdown-label">Start Date</label>
                    <DatePicker
                      width={"130px"}
                      format="dd-MM-yyyy"
                      onChange={startDateChangeHandler}
                      className="datapicker-style"
                      placeholder="day-month-year"
                      value={startDate}
                      calendar={Calendar}
                      // onBlur={(e: any) => {
                      //   const regex = /[dmy]/;
                      //   if (e.target.value) {
                      //     setStartDateValidation(
                      //       regex.test(e.target.value) ? true : false
                      //     );
                      //   } else {
                      //     setStartDateValidation(false);
                      //   }
                      // }}
                    />
                    {/* {startDateValidation && (
                      <p className="validation-message text-right">
                        Please Enter Valid Start Date
                      </p>
                    )} */}
                  </div>
                  <div className="filter" onKeyDown={handleEndDateKeyDown}>
                    <label className="dropdown-label">End Date</label>
                    <DatePicker
                      width={"130px"}
                      format="dd-MM-yyyy"
                      onChange={endDateChangeHandler}
                      className="datapicker-style"
                      placeholder="day-month-year"
                      value={endDate}
                      // onBlur={(e: any) => {
                      //   const regex = /[dmy]/;
                      //   if (e.target.value) {
                      //     setEndDateValidation(
                      //       regex.test(e.target.value) ? true : false
                      //     );
                      //   } else {
                      //     setEndDateValidation(false);
                      //   }
                      // }}
                    />
                    {/* {endDateValidation && (
                      <p className="validation-message text-right">
                        Please Enter Valid End Date
                      </p>
                    )} */}
                  </div>
                  <div className="filter dropdown-filter">
                    <label className="dropdown-label">Vendor Code</label>
                    <MultiSelect
                      data={vendorFilterDropDown}
                      filterable={true}
                      placeholder="Select"
                      textField="vendorCode"
                      dataItemKey="vendorCode"
                      onChange={handleDropDownChange}
                      onFilterChange={onDropFilterChangeHandler}
                      size={"small"}
                    />
                  </div>
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
              </div>
            </GridToolbar>
            {columns.map((column: any) => (
              <GridColumn
                key={column.field}
                field={column.field}
                title={column.title}
                width={
                  column.title.toLowerCase().includes("price") ||
                  column.title.toLowerCase().includes("updated date") ||
                  column.title.toLowerCase().includes("created date") ||
                  column.title.toLowerCase().includes("uom") ||
                  column.title.toLowerCase().includes("code") ||
                  column.title.toLowerCase().includes("currency")
                    ? 130
                    : ""
                }
                cell={column?.field === "vendorCode" ? linkColumn : undefined}
              />
            ))}
          </Grid>
        )}
      </>
    );
  };

  return (
    <>
      <ExcelExport
        ref={_export}
        data={rows}
        filterable={true}
        fileName="Vendor Rating"
      >
        {columns.map((column: any) => {
          return (
            <ExcelExportColumn
              key={column.field}
              field={column.field}
              title={column.title}
              width={200}
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
      {getGrid()}
      {importDialog && (
        <VendorRatingUploadDialog
          toggleDialog={toggleImportDialog}
          token={authToken}
          fetchData={onClearHandler}
          updateDropDown={fetchDropDown}
        />
      )}
      {showItemGrid && (
        <Dialog
          height={"100vh"}
          width={"100vw"}
          className="item-dialog"
          onClose={() => {
            setShowItemGrid(false);
          }}
        >
          <VendorDetailsGrid
            vendorCode={vendorCode}
            close={() => setShowItemGrid(false)}
            token={authToken}
            columns={columns.filter(
              (column: any) =>
                column.field !== "updatedOn" && column.field !== "updatedBy"
            )}
          />
        </Dialog>
      )}
    </>
  );
};
export default VendorRatingGrid;
