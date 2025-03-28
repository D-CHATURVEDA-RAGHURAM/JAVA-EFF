package com.effigo.shared.dto.external.v3;

import com.effigo.shared.dto.external.v2.ExternalVendorDataDtoV2;
import com.effigo.shared.dto.v1.OutputDtoV1;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalVendorResponseDtoV3 {
	@JsonProperty("BOB_APPLICATION_NO")
	private String  bobApplicationNumber ;
	@JsonProperty("VENDOR_NUMBER")
	private String vendorNumber;
	@JsonProperty("STATUS")
	private String status;
	@JsonProperty("MESSAGE")
	private String message;

}
