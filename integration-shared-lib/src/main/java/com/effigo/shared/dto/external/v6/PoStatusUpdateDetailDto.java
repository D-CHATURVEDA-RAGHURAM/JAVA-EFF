package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public  class PoStatusUpdateDetailDto {

    @JsonProperty("BATCH_ID")
    private String batchId;

    @JsonProperty("ERROR_LEVEL")
    private String errorLevel;

    @JsonProperty("MESSAGE")
    private String message;

    @JsonProperty("STATUS")
    private String status;

    @JsonProperty("PO_NUMBER")
    private String poNumber;

    @JsonProperty("RESPONSE_SEQ")
    private String responseSeq;

}
