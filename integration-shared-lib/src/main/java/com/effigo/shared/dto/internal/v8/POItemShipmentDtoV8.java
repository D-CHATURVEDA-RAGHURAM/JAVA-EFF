package com.effigo.shared.dto.internal.v8;

import com.effigo.shared.dto.external.v8.ExternalPOItemDistributionV8;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class POItemShipmentDtoV8 {

    @JsonProperty("shipmentType")
    private String shipmentType;

    @JsonProperty("shipmentNum")
    private String shipmentNum;

    @JsonProperty("shipToOrganizationCode")
    private String shipToOrganizationCode;

    @JsonProperty("shipToLocation")
    private String shipToLocation;

    @JsonProperty("needByDate")
    private String needByDate;

    @JsonProperty("promisedDate")
    private String promisedDate;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("matchApprovalLevel")
    private String matchApprovalLevel;

    @JsonProperty("matchOption")
    private String matchOption;

    @JsonProperty("receivingRouting")
    private String receivingRouting;

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

    @JsonProperty("partition_group")
    private String partitionGroup;

    @JsonProperty("ITEM_DISTRIBUTION")
    public List<POItemDistributionDtoV8> externalPOItemDistributionV8s;

}
