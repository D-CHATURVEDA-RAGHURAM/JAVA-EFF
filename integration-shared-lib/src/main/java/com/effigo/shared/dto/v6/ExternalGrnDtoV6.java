package com.effigo.shared.dto.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class ExternalGrnDtoV6 {
    @JsonProperty("ZEBELN")
    private String poId;
    @JsonProperty("ZBLDAT")
    private String invoiceDate;
    @JsonProperty("ZBUDAT")
    private String postingDate;
    @JsonProperty("ZMBLNR")
    private String grnId;
    @JsonProperty("ZDMBTR")
    private String grnAmount;
    @JsonProperty("ZXBLNR")
    private String einvoice;
    @JsonProperty("ZEBELP")
    private String poItemId;
    @JsonProperty("ZMJAHR")
    public String matYear;
    @JsonProperty("ZBTEXT")
    private String movementTypeText;
    @JsonProperty("ZBWART")
    private String movementType;
    @JsonProperty("ZWAERS")
    private String currency;
    @JsonProperty("ZNAME1")
    private String plantName;
    @JsonProperty("ZWERKS")
    private String plant;
    @JsonProperty("ZMAKTX")
    private String materialDescription;
    @JsonProperty("ZBSART")
    private String purchasingDocumentType;
    @JsonProperty("ZLIFNR")
    private String vendor;
    @JsonProperty("ZKTOKK")
    private String vendorCategoryDescription;
    @JsonProperty("ZNAME1_VENDOR")
    private String vendorName;
    @JsonProperty("ZKALSB")
    private String schemaGroupDesc;
    @JsonProperty("ZMATKL")
    private String materialGroup;
    @JsonProperty("ZWGBEZ")
    private String materialGroupDesc;
    @JsonProperty("ZKDAUF")
    private String salesOrder;
    @JsonProperty("ZKDPOS")
    private String salesOrderItem;
    @JsonProperty("goodsReceivedBy")
    private String goodsReceivedBy;
    @JsonProperty("packageNumber")
    private String packageNumber;
    @JsonProperty("shortText")
    private String shortText;
    @JsonProperty("dispatchNotificationId")
    private String dispatchNotificationId;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("acceptance")
    private String acceptance;
    @JsonProperty("text1")
    private String  text1;
    @JsonProperty("text2")
    private String  text2;
    @JsonProperty("text3")
    private String  text3;
    @JsonProperty("text4")
    private String  text4;
    @JsonProperty("text5")
    private String  text5;
    //items
    @JsonProperty("ZEILE")
    private String grnItemId;
    @JsonProperty("ZNETPR")
    private String itemPrice;
    @JsonProperty("ZERFMG")
    private String quantity;
    @JsonProperty("ZPTEXT")
    private String itemCategoryDescription;

    @JsonProperty("ZSGTXT")
    private String itemText;

    @JsonProperty("ZMATNR")
    private String itemCode;

    @JsonProperty("businessunit")
    private String businessUnit;

    @JsonProperty("movetype")
    private String moveType;

    @JsonProperty("receivedqty")
    private String receivedQty;

    @JsonProperty("rejectedqty")
    private String rejectedQty;

    @JsonProperty("UOM")
    private String uom;

    @JsonProperty("uomiso")
    private String uomIso;

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

    @JsonProperty("ZLFBNR")
    private String rejectionGrnId;

    @JsonProperty("ZASNNO")
    private String asnRefNo;

    @JsonProperty("Status")
    private String status;
}
