package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PurchaseOrderLineDistributionDto {
    @JsonProperty("req_distribution_id")
    private String cusField40;

    @JsonProperty("distribution_num")
    private String distributionNum;

    @JsonProperty("org_id")
    private String plant;

    @JsonProperty("quantity_ordered")
    private String poQty;

    @JsonProperty("quantity_delivered")
    private String quantityDelivered;

    @JsonProperty("quantity_billed")
    private String quantityBilled;

    @JsonProperty("quantity_cancelled")
    private String quantityCancelled;

    @JsonProperty("deliver_to_location")
    private String condType;

    @JsonProperty("deliver_to_person_full_name")
    private String deliverToPersonFullName;

    @JsonProperty("destination_type")
    private String cusField36;

    @JsonProperty("set_of_books")
    private String cusField32;

    @JsonProperty("charge_account")
    private String cusField31;

    @JsonProperty("amount_billed")
    private String cusField37;

    @JsonProperty("project_number")
    private String cusField10;

    @JsonProperty("task_number")
    private String cusField29;

    @JsonProperty("attribute_category")
    private String attributeCategory;

    @JsonProperty("attribute1")
    private String attribute1;

    @JsonProperty("attribute2")
    private String attribute2;

    @JsonProperty("attribute3")
    private String attribute3;

    @JsonProperty("attribute4")
    private String attribute4;

    @JsonProperty("attribute5")
    private String attribute5;

    @JsonProperty("attribute6")
    private String attribute6;

    @JsonProperty("attribute7")
    private String attribute7;

    @JsonProperty("attribute8")
    private String attribute8;

    @JsonProperty("attribute9")
    private String attribute9;

    @JsonProperty("attribute10")
    private String attribute10;

    @JsonProperty("attribute11")
    private String attribute11;

    @JsonProperty("attribute12")
    private String attribute12;

    @JsonProperty("attribute13")
    private String attribute13;

    @JsonProperty("attribute14")
    private String attribute14;

    @JsonProperty("attribute15")
    private String attribute15;
}
