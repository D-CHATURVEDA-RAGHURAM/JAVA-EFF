package com.effigo.shared.dto.v3;

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
public class VendorCreationIntegrationRequestDtoV3 {

	private List<VendorCreationIntegrationDtoV3> creationIntegrationDtoV3s;

	private String businessId;

	private List<DocumentDtoV3> document;

	private String eventId;
}
