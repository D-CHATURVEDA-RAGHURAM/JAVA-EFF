package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnOutboundResponseOracleDtoV4 {

    @JsonProperty("ERROR_LEVEL")
    private String errorLevel;

    @JsonProperty("GRN_QUEUE_ID")
    private Integer grnQueueId;

    @JsonProperty("RECEIPT_NUMBER")
    private String erpRefNo;

    @JsonProperty("RECORD_MESSAGE")
    private String message;

    @JsonProperty("RECORD_STATUS")
    private String msgType;

    @JsonProperty("RESPONSE_SEQ")
    private String responseSeq;

}
