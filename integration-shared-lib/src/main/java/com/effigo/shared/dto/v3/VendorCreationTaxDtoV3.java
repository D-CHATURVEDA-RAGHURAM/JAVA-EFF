package com.effigo.shared.dto.v3;

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
public class VendorCreationTaxDtoV3 {
	private String taxType;
	private String taxCode;
	private String subject;
	private String taxId;
	private String exemptionNumber;
	private String exemptionPercentage;
	private String exemptionReason;
	private String exemptFrom;
	private String exemptTo;
	private String customField1;

	private String customField2;

	private String customField3;

	private String customField4;

	private String customField5;

	private String customField6;

	private String customField7;

	private String customField8;

	private String customField9;

	private String customField10;

}
