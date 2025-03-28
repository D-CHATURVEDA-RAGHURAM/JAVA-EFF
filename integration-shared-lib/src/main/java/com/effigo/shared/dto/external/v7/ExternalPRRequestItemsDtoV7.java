package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRRequestItemsDtoV7 {
    @JsonProperty("BNFPO")
    public String requisitionItemId;

    @JsonProperty("MATNR")
    public String itemId;

    @JsonProperty("TXZ01")
    public String itemDescription;

    @JsonProperty("MENGE")
    public String itemQuantity;

    @JsonProperty("MEINS")
    public String itemUom;

    @JsonProperty("PREIS")
    public String itemPrice;

    @JsonProperty("AUFNR")
    public String internalOrderNumber;

    @JsonProperty("ITEM_TEXT")
    public String itemText;

//    @JsonProperty("PEINH")
//    public String pricePerUnit;

    @JsonProperty("FRGDT")
    public String approvedDate;

    @JsonProperty("RLWRT")
    public String itemTotalPrice;

    @JsonProperty("WAERS")
    public String currency;

    @JsonProperty("ANLN1")
    public String assetNumber;

    @JsonProperty("EBAKZ")
    public String closed;

    @JsonProperty("LOEKZ")
    public String itemStatus;

    @JsonProperty("ERNAM")
    public String createdBy;

    @JsonProperty("ERDAT")
    public String createdDate;

    @JsonProperty("MFRP")
    public String manufacturePartNumber;

    @JsonProperty("MFRNR")
    public String manufactureNumber;

    @JsonProperty("BMEIN")
    public String orderUnit;

    public String requiredDate;

    @JsonProperty("customField1")
    private String customField1;

    @JsonProperty("AFNAM")
    private String customField2;
    @JsonProperty("MATKL")
    private String customField3;
    @JsonProperty("EMATN")
    private String customField4;
    @JsonProperty("LFDAT")
    private String customField5;
    @JsonProperty("BSMNG")
    private String customField6;

    @JsonProperty("PEINH")
    private String customField7;
    @JsonProperty("LBLNI")
    private String customField8;
    @JsonProperty("FRGKZ")
    private String customField9;
    @JsonProperty("BADAT")
    private String customField10;
    @JsonProperty("LPEIN")
    private String customField11;
    @JsonProperty("EKORG")
    private String customField12;
    @JsonProperty("EKGRP")
    private String customField13;
    @JsonProperty("customField14") //in use
    private String customField14;
    @JsonProperty("customField15")
    private String customField15;
    @JsonProperty("EBELN")
    private String customField16;
    @JsonProperty("EBELP")
    private String customField17;
    @JsonProperty("BEDAT")
    private String customField18;
    @JsonProperty("MPROF")
    private String customField19;
    @JsonProperty("OMENG")
    private String customField20;
    @JsonProperty("LGORT")
    private String customField22;

    @JsonProperty("STARTDATE")
    private String customField23;
    @JsonProperty("ENDDATE")
    private String customField24;
    @JsonProperty("PRODUCTTYPE")
    private String customField25;
    @JsonProperty("DELIVERYDATE")
    private String customField26;

    @JsonProperty("SERITEMS")
    public List<ExternalPRServiceItemsDtoV7> serviceItems;
}