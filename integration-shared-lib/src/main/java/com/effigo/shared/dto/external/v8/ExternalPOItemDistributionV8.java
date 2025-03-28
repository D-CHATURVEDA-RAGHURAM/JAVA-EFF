package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPOItemDistributionV8 {

        @JsonProperty("reqDistributionId")
        private String reqDistributionId;
        @JsonProperty("distributionNum")
        private String distributionNum;
        @JsonProperty("orgId")
        private String orgId;
        @JsonProperty("quantityOrdered")
        private String quantityOrdered;
        @JsonProperty("quantityDelivered")
        private String quantityDelivered;
        @JsonProperty("quantityBilled")
        private String quantityBilled;
        @JsonProperty("quantityCancelled")
        private String quantityCancelled;
        @JsonProperty("deliverToLocation")
        private String deliverToLocation;
        @JsonProperty("deliverToPersonFullName")
        private String deliverToPersonFullName;
        @JsonProperty("destinationType")
        private String destinationType;
        @JsonProperty("setOfBooks")
        private String setOfBooks;
        @JsonProperty("chargeAccount")
        private String chargeAccount;
        @JsonProperty("amountBilled")
        private String amountBilled;
        @JsonProperty("projectNumber")
        private String projectNumber;
        @JsonProperty("taskNumber")
        private String taskNumber;
        @JsonProperty("attributeCategory")
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
        @JsonProperty("partition_group")
        private String partitionGroup;

}
