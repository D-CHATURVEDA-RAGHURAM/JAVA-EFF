package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnItemsDtoV5 {
    @JsonProperty("ZLFPOS")
    private String grnItemId;
    @JsonProperty("ZNETPR")
    private String itemPrice;
    @JsonProperty("ZEBELP")
    private String poItemId;
    @JsonProperty("ZERFMG")
    private String quantity;

    @JsonProperty("ZPTEXT")
    private String itemCategoryDescription;

    @JsonProperty("ZSGTXT")
    private String itemText;

    @JsonProperty("itemcode")
    private String itemCode;

    @JsonProperty("businessunit")
    private String businessUnit;

    @JsonProperty("movetype")
    private String moveType;

    @JsonProperty("receivedqty")
    private String receivedQty;

    @JsonProperty("rejectedqty")
    private String rejectedQty;

    @JsonProperty("uom")
    private String uom;

    @JsonProperty("uomiso")
    private String uomIso;

    @JsonProperty("poid")
    private String poId;

    @JsonProperty("createdby")
    private String createdBy;

    @JsonProperty("asnreferenceno")
    private String asnReferenceNo;

    @JsonProperty("location")
    private String location;

    @JsonProperty("batch")
    private String batch;

    @JsonProperty("proddate")
    private String prodDate;

    @JsonProperty("refdocyear")
    private String refDocYear;

    @JsonProperty("refdocit")
    private String refDocIt;

    @JsonProperty("shelflife")
    private String shelfLife;

    @JsonProperty("batchno")
    private String batchNo;
}
