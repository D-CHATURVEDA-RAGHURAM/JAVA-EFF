package com.effigo.shared.dto.external.v8;

import com.effigo.shared.dto.v1.GrnInboundItemsDtoV1;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalGrnInboundDtoV8 {

    @JsonProperty("purchaseOrderId")
    private String poId;

    @JsonProperty("poItemId")
    private String poItemId;

    String invoiceDate;
    String postingDate;
    private Timestamp createdDate;
    public @NotEmpty(
            message = "50008"
    )
    String grnId;
    private String grnAmount;
    private String einvoice;

    @JsonProperty("materialDocument")
    private String materialDocument;

    private String matYear;
    private String amtLocCur;
    private String movementTypeText;
    private String movementType;
    private String currency;

    @JsonProperty("plantName")
    private String plantName;

    String plant;
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
    @JsonProperty("status")
    private String status;
    private String rejectionGrnId;
    List<GrnInboundItemsDtoV1> items;
}
