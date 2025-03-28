package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.AddressDtoV1;
import com.effigo.shared.dto.v1.PersonDtoV1;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorDtoV2 {
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
	private boolean isUpdate;
}
