package com.effigo.shared.dto.v1;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrnInboundItemsDtoV1 {
    private String grnId;
    private String grnItemId;
    private String quantity;
    private String itemCategoryDescription;
    private String itemText;
    private String itemCode;
    private String itemPrice;
    private String poItemId;
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

    @JsonProperty("rejectionGrnId")
    private String rejectionGrnId;

    private String recordId;
}
