package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorDtoV5 {
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
	private String addressId;

}
