package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SseInboundDtoV1 {
    private String poId;
    private String invoiceDate;
    private String postingDate;
    private String grnId;
    private String grnAmount;
    private String poItemId;
    private String einvoice;
    private String materialDocument;
    private String matYear;
    private String amtLocCur;
    private String movementTypeText;
    private String movementType;
    private String currency;
    private String plantName;
    private String plant;
    private String materialDescription;
    private String purchasingDocumentType;
    private String vendor;
    private String vendorCategoryDescription;
    private String vendorName;
    private String schemaGroupDesc;
    private String materialGroup;
    private String materialGroupDesc;
    private String salesOrder;
    private String salesOrderItem;
    private String reference;
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
    
    @JsonProperty("text6")
    private String  text6;
    
    @JsonProperty("serviceItems")
    List<SseInboundItems> serviceItemsDtos;

    private List<Errors> errorsList;
    private String rejectionServiceNo;

    private String custom_field1;
    private String custom_field2;
}
