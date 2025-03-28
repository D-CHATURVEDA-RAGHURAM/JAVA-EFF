package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalBidderResponseDto {

    @JsonProperty("reqid")
    private String reqId;
    @JsonProperty("effigorefnumber")
    private String effigoReferenceNumber;
    @JsonProperty("lineno")
    private String itemNo;
    @JsonProperty("vendorcode")
    private String vendorCode;
    @JsonProperty("status")
    private String status;
    @JsonProperty("messagetype")
    private String messageType;
    @JsonProperty("msg")
    private String msg;
}
