package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPROdataResultDtoV5 {

	@JsonProperty("__metadata")
	private ExternalPROdataMetadataDtoV5 metadata;

	private ExternalPRInboundRequisitionDtoV5 externalPRInboundRequisitionDtoV5;
}
