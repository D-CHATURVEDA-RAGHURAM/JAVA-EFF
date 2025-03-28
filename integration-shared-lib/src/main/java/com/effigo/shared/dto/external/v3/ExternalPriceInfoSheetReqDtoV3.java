package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetReqDtoV3 {

    @JsonProperty("BUKRS")
    private String cusField1;

    @JsonProperty("BSTYP")
    private String cusField2;

    @JsonProperty("BSART")
    private String cusField3;

    @JsonProperty("LOEKZ")
    private String cusField4;

    @JsonProperty("LIFNR")
    private String vendorAccNumber;

    @JsonProperty("ZTERM")
    private String cusField5;

    @JsonProperty("EKORG")
    private String purchaseOrg;

    @JsonProperty("ERNAM")
    private String cusField39;

    @JsonProperty("SOURCINGID")
    private String cusField11;

    @JsonProperty("BKGRP")
    private String purchaseGrp;

    @JsonProperty("WAERS")
    private String currency;

    @JsonProperty("EBDAT")
    private String cusField6;

    @JsonProperty("KDATB")
    private String validityStartDate;

    @JsonProperty("KDATE")
    private String validityEndDate;

    @JsonProperty("INCO1")
    private String incoTerms1;

    @JsonProperty("POITEMS")
    private List<ExternalPriceInfoSheetItemDtoV3> purchaseOrderItems;

    @JsonProperty("SERVICE_ITEM")
    private List<ExternalPriceInfoSheetServiceItemDtoV3> serviceItems;


}
