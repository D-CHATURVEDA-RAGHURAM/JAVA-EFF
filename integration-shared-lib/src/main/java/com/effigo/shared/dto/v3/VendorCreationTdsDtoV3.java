package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class VendorCreationTdsDtoV3 {
	private String tdsSectionalGroup1;
	private String tdsExempationNumber1;
	private String tdsExemptionRate1;
	private String tdsExemptFrom1;
	private String tdsExemptTo1;
	private String tdsExemptReason1;
	private String tdsWTaxType1;
	private String tdsWTaxCode1;
	private String tdsExemThreshold1;

}
