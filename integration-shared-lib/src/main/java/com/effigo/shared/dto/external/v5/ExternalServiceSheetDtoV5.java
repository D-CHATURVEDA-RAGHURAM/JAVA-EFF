package com.effigo.shared.dto.external.v5;

import com.effigo.shared.dto.external.v3.ExternalServiceDtoV4;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ExternalServiceSheetDtoV5 {
    @JsonProperty("REQDTLS")
    private List<ExternalServiceDtoMainV5> externalServiceDtoV5s;

}
