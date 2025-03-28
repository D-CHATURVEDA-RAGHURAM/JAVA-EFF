package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GrnItemRejectCancelDtoV3 {
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

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("uom")
    private String uom;

    @JsonProperty("uomiso")
    private String uomIso;

    @JsonProperty("poid")
    private String poId;

    @JsonProperty("poitemid")
    private String poItemId;

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


    private String stockType;


    private String movementIndicator;


    private String moveReas;


    private String rejectedQuantity;


    private String cusField1;

    private String cusField2;

    private String cusField3;

    private String cusField4;

    private String cusField5;

    private String cusField6;

    private String cusField7;

    private String cusField8;

    private String cusField9;

    private String cusField10;

    private String itemDescription;


}