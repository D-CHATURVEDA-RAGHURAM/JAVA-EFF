package com.effigo.shared.dto.external.v7;

import com.effigo.shared.dto.external.v8.ExternalPOMainDtoV8;
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
public class ExternalPOInboundRequestGenV7 {

    @JsonProperty("PURCHASE_ORDER")
    public List<ExternalPOMainDtoGenV7> poMainDTOsV7;

}
