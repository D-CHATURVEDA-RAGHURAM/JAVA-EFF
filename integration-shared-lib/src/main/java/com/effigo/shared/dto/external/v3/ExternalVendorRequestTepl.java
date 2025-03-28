package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalVendorRequestTepl {
    @JsonProperty("root")
    private ExternalRequestVendorDtoV6 externalRequestVendorDtoV6;
}
