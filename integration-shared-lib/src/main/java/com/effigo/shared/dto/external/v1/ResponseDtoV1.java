package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDtoV1 implements Serializable {
	private static final long serialVersionUID = 2159509335300984413L;
	private String statusCode;
	private String message;
	private String name;
	private String code;
	@JsonProperty(value = "recordid")
	private String recordId;
}
