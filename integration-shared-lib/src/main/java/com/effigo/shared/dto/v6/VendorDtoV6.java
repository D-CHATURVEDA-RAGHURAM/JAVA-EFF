package com.effigo.shared.dto.v6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendorDtoV6 {
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
}
