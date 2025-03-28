package com.effigo.shared.dto.external.v2;

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
public class ExternalPRRequestItemsDtoV2 {
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

    @JsonProperty("PEINH")
    public String pricePerUnit;

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

    private String requiredDate;

    private String costingAccount;

    @JsonProperty("EKGRP")
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
    @JsonProperty("OMENG")
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
    @JsonProperty("customField13")
    private String customField13;
    @JsonProperty("customField14")
    private String customField14;
    @JsonProperty("customField15")
    private String customField15;
    @JsonProperty("EBELN")
    private String customField16;
    @JsonProperty("EBELP")
    private String customField17;
    @JsonProperty("BEDAT")
    private String customField18;
    @JsonProperty("customField19")
    private String customField19;
    @JsonProperty("customField20")
    private String customField20;
    @JsonProperty("customField21")
    private String customField21;
    @JsonProperty("LGORT")
    private String customField22;
    @JsonProperty("customField23")
    private String customField23;
    @JsonProperty("customField24")
    private String customField24;
    @JsonProperty("customField25")
    private String customField25;
    @JsonProperty("customField26")
    private String customField26;
    @JsonProperty("customField27")
    private String customField27;
    private String suggestedSupplierCompany;
    @JsonProperty("customField28")
    private String customField28;
    @JsonProperty("customField29")
    private String customField29;
    @JsonProperty("customField30")
    private String customField30;
    @JsonProperty("customField31")
    private String customField31;
    @JsonProperty("customField32")
    private String customField32;
    @JsonProperty("customField33")
    private String customField33;
    @JsonProperty("customField34")
    private String customField34;
    @JsonProperty("customField35")
    private String customField35;
    @JsonProperty("customField36")
    private String customField36;
    @JsonProperty("customField37")
    private String customField37;
    @JsonProperty("customField38")
    private String customField38;
    @JsonProperty("SERITEMS")
    public List<ExternalPRServiceItemsDtoV2> serviceItems;
}
