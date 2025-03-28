package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class ExternalPRInboundRequisitionDtoV5 {
    @NotNull
    @NotBlank(message = "{id.not-null}")
    @JsonProperty("Banfn")
    public String prId;

    @JsonProperty("Bnfpo")
    public String prItmId;

    @JsonProperty("Extrow")
    public String lineNo;

    @JsonProperty("YstatusCode")
    public String statusCode;

    @JsonProperty("Bukrs")
    public String companyCode;

    @JsonProperty("Bsart")
    public String prType;

    @JsonProperty("Frgkz")
    private String  releaseState;

    @JsonProperty("Ekgrp")
    private String purchaseGroup;

    @JsonProperty("Afnam")
    private String requestorName;

    @JsonProperty("Txz01")
    private String itemDescription;

    @JsonProperty("Matnr")
    public String itemCode;

    @NotNull
    @NotBlank(message = "{not-null}")
    @JsonProperty("Name1")
    public String businessUnit;

    @JsonProperty("Lgort")
    public String  storageLocation;

    @JsonProperty("Bednr")
    public String trackingNo;

    @JsonProperty("Matkl")
    public String materialGroup;

    @JsonProperty("Menge")
    public String quantity;

    @JsonProperty("Meins")
    public String uom;

    @JsonProperty("Badat")
    private String createdDate;

    @JsonProperty("Lfdat")
    private String requiredDate;

    @JsonProperty("Preis")
    private String price;

    @JsonProperty("Pstyp")
    private String itemCategory;

    @JsonProperty("Knttp")
    public String accountAssgnCategory;

    @JsonProperty("Charg")
    private String batchNo;

    @JsonProperty("Frgdt")
    private String approvedDate;

    @JsonProperty("ZvLastPoRate")
    private String lastPoRate;

    @JsonProperty("ZvLastPoDate")
    private String poItemChangeDate;

    @JsonProperty("ZvLastPoQty")
    private String poQty;

    @JsonProperty("ZvLastPoSupplier")
    private String vendorAccountNo;

    @JsonProperty("Lgtxt")
    private String fullDescription;

    @JsonProperty("PspPnr")
    public String wbsElement;

    @JsonProperty("Srvpos")
    public String activityNo;

    @JsonProperty("Ktext1")
    public String serviceDescription;

    @JsonProperty("Emenge")
    public String serviceQuantity;

    @JsonProperty("Emeins")
    public String serviceUom;

    @JsonProperty("Sakto")
    public String serviceGLAccountNo;

    @JsonProperty("NAME2")
    private String purchaseOrg;

    @JsonProperty("Peinh")
    private String reqItem;

    @JsonProperty("Sobkz")
    private String stockIndicator;

    @JsonProperty("Kostl")
    private String costCenter;

    @JsonProperty("Remarks1")
    private String remarks1;

    @JsonProperty("Remarks2")
    private String remarks2;

    @JsonProperty("Remarks3")
    private String remarks3;

    private String servItemPrice;

    private String servNetPrice;
    private String createdBy;
}
