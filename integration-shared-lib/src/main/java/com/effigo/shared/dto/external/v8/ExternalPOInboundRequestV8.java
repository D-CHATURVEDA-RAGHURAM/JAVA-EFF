package com.effigo.shared.dto.external.v8;

import com.effigo.shared.dto.external.v5.ExternalPRInboundRequisitionDtoV6;
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
public class ExternalPOInboundRequestV8 {

    @JsonProperty("PURCHASE_ORDER")
    public List<ExternalPOMainDtoV8> poMainDTOsV8;

}
