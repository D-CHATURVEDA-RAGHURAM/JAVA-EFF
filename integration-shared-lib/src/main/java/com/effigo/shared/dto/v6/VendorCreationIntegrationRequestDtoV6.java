package com.effigo.shared.dto.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationRequestDtoV6 {

	private List<VendorCreationIntegrationDtoV6> creationIntegrationDtoV6s;

	private String businessId;
}
