package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnDtoV7 {
    @JsonProperty("poId")
    private String poId;
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    @JsonProperty("postingDate")
    private String postingDate;
    @JsonProperty("grnId")
    private String grnId;
    @JsonProperty("grnAmount")
    private String grnAmount;
    @JsonProperty("einvoice")
    private String einvoice;
    @JsonProperty("poItemId")
    private String poItemId;
    @JsonProperty("matYear")
    private String matYear;
    @JsonProperty("movementTypeText")
    private String movementTypeText;
    @JsonProperty("movementType")
    private String movementType;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("plantName")
    private String plantName;
    @JsonProperty("plant")
    private String plant;
    @JsonProperty("materialDescription")
    private String materialDescription;
    @JsonProperty("purchasingDocumentType")
    private String purchasingDocumentType;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("vendorCategoryDescription")
    private String vendorCategoryDescription;
    @JsonProperty("vendorName")
    private String vendorName;
    @JsonProperty("schemaGroupDesc")
    private String schemaGroupDesc;
    @JsonProperty("materialGroup")
    private String materialGroup;
    @JsonProperty("materialGroupDesc")
    private String materialGroupDesc;
    @JsonProperty("salesOrder")
    private String salesOrder;
    @JsonProperty("salesOrderItem")
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
    private String text1;
    @JsonProperty("text2")
    private String text2;
    @JsonProperty("text3")
    private String text3;
    @JsonProperty("text4")
    private String text4;
    @JsonProperty("text5")
    private String text5;
    @JsonProperty("grnItemId")
    private String grnItemId;
    @JsonProperty("itemPrice")
    private String itemPrice;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("itemCategoryDescription")
    private String itemCategoryDescription;
    @JsonProperty("itemText")
    private String itemText;
    @JsonProperty("itemCode")
    private String itemCode;
    @JsonProperty("businessUnit")
    private String businessUnit;
    @JsonProperty("moveType")
    private String moveType;
    @JsonProperty("receivedQty")
    private String receivedQty;
    @JsonProperty("rejectedQty")
    private String rejectedQty;
    @JsonProperty("uom")
    private String uom;
    @JsonProperty("uomIso")
    private String uomIso;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("asnReferenceNo")
    private String asnReferenceNo;
    @JsonProperty("location")
    private String location;
    @JsonProperty("batch")
    private String batch;
    @JsonProperty("prodDate")
    private String prodDate;
    @JsonProperty("refDocYear")
    private String refDocYear;
    @JsonProperty("refDocIt")
    private String refDocIt;
    @JsonProperty("shelfLife")
    private String shelfLife;
    @JsonProperty("batchNo")
    private String batchNo;
    @JsonProperty("rejectionGrnId")
    private String rejectionGrnId;
    @JsonProperty("asnRefNo")
    private String asnRefNo;
    @JsonProperty("status")
    private String status;
    @JsonProperty("recordId")
    private String recordId;
    @JsonProperty("amt_loc")
    private String amt_loc;


}
