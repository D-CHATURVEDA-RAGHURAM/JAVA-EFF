package com.effigo.shared.dto.v1;

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
public class SseCancelOutboundItemResponseDto {

    @JsonProperty("MSGNO")
    private String messageNo;

    @JsonProperty("MSGTYPE")
    private String messageType;

    @JsonProperty("MSGID")
    private String messageId;

    @JsonProperty("MSG")
    private String message;
}
