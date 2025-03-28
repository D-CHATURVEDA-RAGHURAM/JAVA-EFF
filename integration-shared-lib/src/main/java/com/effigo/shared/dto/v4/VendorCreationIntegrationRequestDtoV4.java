package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationRequestDtoV4 {

	private List<VendorCreationIntegrationDtoV4> creationIntegrationDtoV4s;

	private String businessId;

	private List<DocumentDtoV4> documentDtoV4s;

	private String eventId;

}
