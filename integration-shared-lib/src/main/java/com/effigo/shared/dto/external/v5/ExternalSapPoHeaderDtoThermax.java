package com.effigo.shared.dto.external.v5;

import com.effigo.shared.dto.external.v3.ExternalPriceInfoSheetItemDtoV3;
import com.effigo.shared.dto.external.v3.ExternalPriceInfoSheetServiceItemDtoV3;
import com.effigo.shared.dto.external.v3.ItemChargeDto;
import com.effigo.shared.dto.external.v3.SapItemChargeDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalSapPoHeaderDtoThermax {

    @JsonProperty("NFA_Number")
    private String priceUnit1;

    @JsonProperty("URL")
    private String orderPriceUnit1;

    @JsonProperty("BUKRS")
    private String plant;

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

    @JsonProperty("SOURCINGID")
    private String cusField11;

    @JsonProperty("sourcing_manager_email")
    private String cusField39;

    @JsonProperty("DELTERMS")
    private String cusField46;

    @JsonProperty("INCO2")
    private String cusField44;

    @JsonProperty("HEADER_CHARGES")
    private List<SapItemChargeDto> itemCharges = new ArrayList<>();
}

