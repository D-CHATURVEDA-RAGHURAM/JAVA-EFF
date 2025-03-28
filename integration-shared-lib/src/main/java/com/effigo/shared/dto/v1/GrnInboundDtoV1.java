package com.effigo.shared.dto.v1;

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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GrnInboundDtoV1 {
      String poId;
  String poItemId;
  String invoiceDate;
    String postingDate;
    private Timestamp createdDate;
    public @NotEmpty(
            message = "50008"
    )
    String grnId;
    private String grnAmount;
    private String einvoice;
    private String materialDocument;
    private String matYear;
    private String amtLocCur;
    private String movementTypeText;
    private String movementType;
    private String currency;
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
    private String prodDate;
    private String rejectionGrnId;
    List<GrnInboundItemsDtoV1> items;
    @JsonProperty("recordId")
    private String recordId;
    private String custom_field1;
    private String custom_field2;
    private String custom_field3;
    private String custom_field4;
    private String custom_field5;
    private String custom_field6;
    private String custom_field7;
    private String custom_field8;
    private String custom_field9;
    private String custom_field10;
  @JsonProperty("amt_loc")
  private String amt_loc;
  private String businessUnit;


}
