package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PurchaseOrderLineLocationDto {
    @JsonProperty("shipment_type")
    private String shipmentType;

    @JsonProperty("shipment_num")
    private String cusField7;

    @JsonProperty("ship_to_organization_code")
    private String cusField1;

    @JsonProperty("ship_to_location")
    private String cusField4;

    @JsonProperty("need_by_date")
    private String plannedDeliveryDays;

    @JsonProperty("promised_date")
    private String promisedDate;

    @JsonProperty("quantity")
    private String poQty;

    @JsonProperty("match_approval_level")
    private String matchApprovalLevel;

    @JsonProperty("match_option")
    private String cusField28;

    @JsonProperty("receiving_routing")
    private String receivingRouting;

    @JsonProperty("attribute1")
    private String attribute1;

    @JsonProperty("distributions")
    private PurchaseOrderLineDistributionDto distributions;
}
