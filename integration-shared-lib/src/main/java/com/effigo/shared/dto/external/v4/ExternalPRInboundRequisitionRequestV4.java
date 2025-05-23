package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPRInboundRequisitionRequestV4 {

	@JsonProperty("REQDTLS")
	public List<ExternalPRInboundRequisitionDtoV4> requisitionDtoV2s;
}
