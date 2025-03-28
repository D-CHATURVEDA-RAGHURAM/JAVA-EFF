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
public class ExternalTaxDtoV3 {

	@JsonProperty("W_TAX_TYPE")
	private String taxType;

	@JsonProperty("W_TAX_CODE")
	private String taxCode;

	@JsonProperty("SUBJECT")
	private String subject;

	@JsonProperty("W_TAX_ID")
	private String taxId;

	@JsonProperty("EXEMPATION_NUMBER")
	private String exempationNumber;

	@JsonProperty("EXEMPATION_PERCENTAGE")
	private String exempationPercentage;

	@JsonProperty("EXEMPATION_REASON")
	private String exempationReason;

	@JsonProperty("EXEMPT_FROM")
	private String exemptFrom;

	@JsonProperty("EXEMPT_TO")
	private String exemptTo;

}
