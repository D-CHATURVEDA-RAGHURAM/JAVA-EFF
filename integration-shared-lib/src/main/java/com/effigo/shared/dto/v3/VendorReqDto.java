package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendorReqDto {
        @JsonProperty("vendors")
        private VendorCreateDtoV3 vendors;
        @JsonProperty("businessId")
        private String businessId;
    }