import React from "react";
import { FilePond, registerPlugin } from "react-filepond";
import "filepond/dist/filepond.min.css";
import FilePondPluginFileValidateType from "filepond-plugin-file-validate-type";
import FilePondPluginImagePreview from "filepond-plugin-image-preview";
import FilePondPluginImageExifOrientation from "filepond-plugin-image-exif-orientation";
import "filepond-plugin-image-preview/dist/filepond-plugin-image-preview.css";
import { EFFIGO_MATERIAL_PRICE } from "../../environment";
import jwt_decode from "jwt-decode";

registerPlugin(
  FilePondPluginFileValidateType,
  FilePondPluginImagePreview,
  FilePondPluginImageExifOrientation
);

const FileUploader = ({
  getFile,
  fileType,
  token,
  success,
  showError,
  showSuccess,
}: any) => {
  const parsedToken: any = jwt_decode(token);

  const removeAttr = () => {
    setTimeout(() => {
      const removeButton: any = document?.querySelector(
        ".filepond--file .filepond--action-remove-item"
      );
      if (removeButton) {
        removeButton.removeAttribute("disabled");
        removeButton.classList.add("buttonVisible");
        const fileWrapper: any = document.querySelector(".filepond--file");
        fileWrapper.style.paddingLeft = "40px";
      }
    }, 1500);
  };

  const handleError = () => {
    const fileStatusSub: any = document.querySelector(
      ".filepond--file-status-sub"
    );
    const fileStatus: any = document.querySelector(
      ".filepond--file-status-main"
    );
    if (
      fileStatusSub.textContent ===
      "Expects application/vnd.ms-excel or application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    ) {
      fileStatusSub.textContent = "Please select .xlsx or .xls file";
    }
    if (fileStatus.textContent === "File is of invalid type") {
      fileStatus.textContent = "Invalid file format";
    }
  };

  return (
    <FilePond
      acceptedFileTypes={fileType}
      fileValidateTypeDetectType={(source, type) =>
        new Promise((resolve, reject) => {
          resolve(type);
        })
      }
      server={{
        process: {
          url: `${EFFIGO_MATERIAL_PRICE}effigo/api/grn/v1/kbl/addMaterialPrice?createdBy=${parsedToken.userId}`,
          method: "POST",
          headers: {
            Authorization: `Bearer ${token}`,
          },
          timeout: 15000,
          onload: (response) => {
            removeAttr();
            setTimeout(() => success(response), 1500);
            return "";
          },
          onerror: (response) => {
            showError(response);
          },
        },
      }}
      instantUpload={false}
      onupdatefiles={() => {
        getFile();
      }}
      onerror={handleError}
      dropOnPage={true}
      allowRevert={false}
      onremovefile={() => {
        getFile(null);
        showError("");
        showSuccess("");
      }}
      name="file"
      labelIdle='Drag & Drop your files or <span class="filepond--label-action">Browse</span>'
    />
  );
};

export default FileUploader;
