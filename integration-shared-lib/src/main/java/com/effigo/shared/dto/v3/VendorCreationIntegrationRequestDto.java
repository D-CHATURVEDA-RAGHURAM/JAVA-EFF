package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationRequestDto {

        private VendorCreationIntegrationDtoV3 creationIntegrationDtoV3;
        private String businessId;
        private List<DocumentDtoV3> document;
        private String eventId;
}
