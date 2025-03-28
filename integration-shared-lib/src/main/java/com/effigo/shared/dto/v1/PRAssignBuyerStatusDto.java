package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PRAssignBuyerStatusDto {

    @JsonProperty("BUYER_ID")
    private String buyerId;

    @JsonProperty("LINE_NUMBER")
    private String lineNo;

    @JsonProperty("MESSAGE")
    private String message;

    @JsonProperty("REQUISITION_NUMBER")
    private String reqId;

    @JsonProperty("STATUS")
    private String status;
}
