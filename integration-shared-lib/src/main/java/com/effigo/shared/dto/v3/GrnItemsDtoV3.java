package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GrnItemsDtoV3 {
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

//	@JsonProperty("REF_DOC_IT")
//	private String refDocIt;
}