package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditDebitExternalDtoV1 {
    @JsonProperty("BUKRS")
    private String companyCode;
    @JsonProperty("GJAHR")
    private String fiscalYear;
    @JsonProperty("BELNR")
    private String accountingDocNo;
    @JsonProperty("BLART")
    private String documentType;
    @JsonProperty("BLDAT")
    private String documentDate;
    @JsonProperty("BUDAT")
    private String postingDate;
    @JsonProperty("WRBTR")
    private String docCurrencyAmount;
    @JsonProperty("CGST")
    private String cgst;
    @JsonProperty("SGST")
    private String sgst;
    @JsonProperty("IGST")
    private String igst;
    @JsonProperty("MATNR")
    private String materialNo;
    @JsonProperty("MAKTX")
    private String materialDesc;
    @JsonProperty("GROSS")
    private String gross;
    @JsonProperty("LIFNR")
    private String vendorAccNo;
    @JsonProperty("LOTKZ")
    private String docLotNo;
    @JsonProperty("ZUONR")
    private String assignmentNo;
    @JsonProperty("BKTXT")
    private String docHeaderText;
    @JsonProperty("XBLNR")
    private String refDocNo;
    @JsonProperty("SGTXT")
    private String itemText;
    @JsonProperty("CATEGORY")
    private String category;
    @JsonProperty("READ_TEXT")
    private String readText;
    @JsonProperty("MIRO_DOC_NO")
    private String invoiceDocNo;
    @JsonProperty("MIRO_DOC_YR")
    private String invoiceDocYear;
    @JsonProperty("REV_BELNR")
    private String revDocNo;
    @JsonProperty("REV_GJAHR")
    private String revDocFiscalYear;
    @JsonProperty("WAERS")
    private String currencyKey;
    @JsonProperty("DMBTR")
    private String localCurrencyAmount;
    @JsonProperty("field1")
    private String field1;
    @JsonProperty("field2")
    private String field2;
    @JsonProperty("field3")
    private String field3;
    @JsonProperty("field4")
    private String field4;
    @JsonProperty("field5")
    private String field5;
    @JsonProperty("field6")
    private String field6;
    @JsonProperty("field7")
    private String field7;
    @JsonProperty("field8")
    private String field8;
    @JsonProperty("field9")
    private String field9;
    @JsonProperty("field10")
    private String field10;
    @JsonProperty("MENGE")
    private String quantity;
    @JsonProperty("MEINS")
    private String uom;
    @JsonProperty("STEUC")
    private String hsnCode;
    @JsonProperty("RATE")
    private String rate;
    @JsonProperty("WERKS")
    private String plant;
    @JsonProperty("purchaseDocNo")
    private String purchaseDocNo;
    @JsonProperty("businessUnit")
    private String businessUnit;
    @JsonProperty("companyName")
    private  String companyName;


}
