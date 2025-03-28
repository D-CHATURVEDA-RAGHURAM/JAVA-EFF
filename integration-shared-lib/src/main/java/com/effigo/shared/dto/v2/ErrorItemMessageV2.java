package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorItemMessageV2 {

	@JsonProperty("MSGNO")
	private String msgNO;

	@JsonProperty("MSGTY")
	private String msgType;

	@JsonProperty("MSGID")
	private String msgId;

	@JsonProperty("MESSAGE")
	private String msg;

}
