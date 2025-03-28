package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnQualityRejectionItemDtoGenV5 implements Serializable {

	private static final long serialVersionUID = 3964213117880528211L;

	@JsonProperty("item")
	private List<ExternalGrnQualityRejectDtoGenV5> externalGrnQualityRejectDtoV5List;
}
