package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class ExternalTdsDtoV3 {
	@JsonProperty("TDS_SECTIONAL_GROUP1")
	private String tdsSectionalGroup1;

	@JsonProperty("TDS_EXEMPATION_NUMBER1")
	private String tdsExempationNumber1;

	@JsonProperty("TDS_EXEMPTION_RATE1")
	private String tdsExemptionRate1;

	@JsonProperty("TDS_EXEMPT_FROM1")
	private String tdsExemptFrom1;

	@JsonProperty("TDS_EXEMPT_TO1")
	private String tdsExemptTo1 ;

	@JsonProperty("TDS_EXEMPT_REASON1")
	private String tdsExemptReason1 ;

	@JsonProperty("TDS_W_TAX_TYPE1")
	private String tdsWTaxType1 ;

	@JsonProperty("TDS_W_TAX_CODE1")
	private String tdsWTaxCode1 ;

	@JsonProperty("TDS_EXEM_THRESHOLD1")
	private String tdsExemThreshold1 ;


}
