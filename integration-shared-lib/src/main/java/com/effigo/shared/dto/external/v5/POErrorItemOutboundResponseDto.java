package com.effigo.shared.dto.external.v5;

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
public class POErrorItemOutboundResponseDto {
	
	  @JsonProperty("MSGNO")
	    private String msgNumber;

	    @JsonProperty("MSGTYPE")
	    private String msgType;

	    @JsonProperty("MSGID")
	    private String msgId;

	    @JsonProperty("MSG")
	    private String message;

}
