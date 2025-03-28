package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPriceInfoInboundRequestV4 {

	@JsonProperty("REQDTLS")
	public List<ExternalPriceInfoDetailsRequestV4> requisitionDtoV2s;
}
