package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GrnQtyRejectionResponseDtoV1 {
	private List<GrnQualityRejectionResponseDtoV1> grnQualityRejectionResponseDtoV1s;
}
