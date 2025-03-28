package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalAsnCancelDto implements Serializable {

	@JsonProperty("DATE")
	private String date;

	@JsonProperty("IM_REQUEST")
	private ExternalImRequestDto imRequest;


}
