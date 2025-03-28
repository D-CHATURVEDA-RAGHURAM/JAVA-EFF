package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendorDtoV4 {
	private String vendorId;
	private String companyCode;
	private String purOrg;
	private String refVendorCode;
	private String refCompanyCode;
	private String refPurOrg;
	private String type;
	private String buId;
	private boolean isAllCompanyCodes;
	private boolean isBankDetailsUpdated;
	String attachment1 ;
	String attachment2;
	String attachment3;
	String attachment4;
	String attachment5;
}
