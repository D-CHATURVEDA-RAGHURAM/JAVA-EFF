import { Grid, GridColumn, GridToolbar } from "@progress/kendo-react-grid";
import React, { useEffect, useRef, useState } from "react";
import { process } from "@progress/kendo-data-query";
import {
  ExcelExport,
  ExcelExportColumn,
} from "@progress/kendo-react-excel-export";
import { Button } from "@progress/kendo-react-buttons";
import LoadingPanel from "../../shared/LoadingPanel";
import { EFFIGO_MATERIAL_PRICE } from "../../environment";
import axios from "axios";

const initialDataState = {
  take: 50,
  skip: 0,
};

const VendorDetailsGrid = ({ columns, token, vendorCode, close }: any) => {
  const _export = React.useRef<ExcelExport | null>(null);
  const [dataState, setDataState] = useState<any>(initialDataState);
  const [loading, setLoading] = useState<boolean>(false);
  const [rows, setRows] = useState<any>([]);

  const excelExportHandler = (e: any) => {
    if (_export.current !== null) {
      _export.current.save();
    }
  };

  const fetchRows = async () => {
    setLoading(true);
    try {
      const response: any = await axios.get(
        `${EFFIGO_MATERIAL_PRICE}effigo/api/grn/v1/varroc/getVendorRatingHistoryDetails`,
        {
          params: {
            vendorCode: vendorCode,
          },
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );
      setRows(response?.data?.data);
      setLoading(false);
    } catch (error: any) {
      console.error("Error fetching data:", error);
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchRows();
  }, []);

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
                <div className="itemsButtonContainer">
                  <div className="breadcrumbs">
                    <div onClick={close}>Vendor Rating</div>
                    <div>{">"}</div>
                    <div>Vendor Rating History</div>
                  </div>
                  <Button
                    onClick={excelExportHandler}
                    size="small"
                    title={"Export to Excel"}
                    className="materialButton"
                    icon="export"
                  >
                    Export Excel
                  </Button>
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
                    ? 120
                    : ""
                }
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
    </>
  );
};
export default VendorDetailsGrid;
