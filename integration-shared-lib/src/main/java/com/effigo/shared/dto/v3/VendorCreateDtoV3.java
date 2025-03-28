package com.effigo.shared.dto.v3;

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
public class VendorCreateDtoV3 {

	private String vendorId;
	private String buId;
	private String refVendorCode;
	private boolean isBankDetailsUpdated;
	private String refCompanyCode;
	private String refPurOrg;
	private String type;
	private String file1;
	private String file2;
	private String file3;
	private String file4;
	private String file5;
	private String modificationId;
}
