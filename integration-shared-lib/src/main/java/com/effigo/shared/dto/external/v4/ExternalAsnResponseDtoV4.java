package com.effigo.shared.dto.external.v4;

import com.effigo.shared.dto.external.v1.ExternalAsnItemResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalAsnResponseDtoV4 {

    @JsonProperty("transactionid")
    private String transactionId;

    @JsonProperty("erpid")
    private String erpId;

    @JsonProperty("event")
    private String event;

    @JsonProperty("asnid")
    private String asnId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("message")
    private String message;

    @JsonProperty("errorcode")
    private String errorCode;

    @JsonProperty("year")
    private String year;


}
