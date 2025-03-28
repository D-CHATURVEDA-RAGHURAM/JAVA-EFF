package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorItemV1 {
	@JsonProperty("MSGNO")
	private String  msgNO;

	@JsonProperty("MSGTYPE")
	private String  msgType;


	@JsonProperty("MSGID")
	private String  msgId;


	@JsonProperty("MSG")
	private String  msg;
}
