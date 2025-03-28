package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendorReqDtoV3 {

	@JsonProperty("vendors")
	List<VendorCreateDtoV3> vendors;

	@JsonProperty("businessId")
	private String businessId;
}
