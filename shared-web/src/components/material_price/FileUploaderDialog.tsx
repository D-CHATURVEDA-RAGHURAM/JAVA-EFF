import React, { useState } from "react";
import { Dialog, DialogActionsBar } from "@progress/kendo-react-dialogs";
import FileUploader from "./FileUploader";

const FileUploaderDialog = ({
  toggleDialog,
  token,
  fetchData,
  updateDropDown,
}: any) => {
  const [file, setFile] = useState<any>(null);
  const [showSuccess, setShowSuccess] = useState<string>("");
  const [showError, setShowError] = useState<string>("");
  const success = (message: string) => {
    setShowSuccess(message);
    fetchData();
    updateDropDown();
  };

  return (
    <div>
      <Dialog
        minWidth={"50vw"}
        height={"max-content"}
        width={"50vw"}
        title={"Import From Excel"}
        onClose={toggleDialog}
        className={"uploaderDialog"}
      >
        <div className="notes-container">
          <p>
            Download the{" "}
            <a
              href={
                process.env.PUBLIC_URL +
                "/templates/Material Price Indices Template.xlsx"
              }
              download
            >
              Material Price Indices Template{" "}
              <span className="k-icon k-icon-xs k-font-icon k-i-download"></span>
            </a>
            {"  "}
            file here, and ensure the following:
          </p>
          <ul>
            <li>
              Download the Excel file in application as (.xls) or (.xlsx), NOT
              (.XLS) or (.XLSX).
            </li>
            <li>
              Should not upload different format as [for (.xls) he should not
              upload (.xlsx) or vice versa].
            </li>
            <li>Do not change first row heading content and order.</li>
            <li>
              If you intend to eliminate rows from the Excel sheet, ensure that
              you delete the rows rather than erasing them by using the
              backspace key.
            </li>
          </ul>
        </div>
        <div className={"uploaderContainer"}>
          <FileUploader
            token={token}
            fileType={[
              "application/vnd.ms-excel",
              "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
            ]}
            getFile={setFile}
            success={success}
            showError={setShowError}
            showSuccess={setShowSuccess}
          />
        </div>
        {showSuccess ? (
          <p className="file-success">{showSuccess}</p>
        ) : showError ? (
          <div className="file-error">
            {showError
              ?.replace(/\[|\]/g, "")
              ?.split(",")
              ?.map((item: string, index: number) => (
                <div key={index}>{item.trim()}</div>
              ))}
          </div>
        ) : null}
        <DialogActionsBar>
          <button
            className="k-button k-button-md k-rounded-md k-button-solid k-button-solid-base"
            onClick={toggleDialog}
          >
            Close
          </button>
        </DialogActionsBar>
      </Dialog>
    </div>
  );
};

export default FileUploaderDialog;
