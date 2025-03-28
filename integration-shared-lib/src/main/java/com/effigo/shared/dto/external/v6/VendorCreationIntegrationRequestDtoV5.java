package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationRequestDtoV5 {

	private List<VendorCreationIntegrationDtoV5> vendorCreationIntegrationDtoV5s;
	@JsonProperty("eventId")
	private String eventId;
	private String businessId;
}
