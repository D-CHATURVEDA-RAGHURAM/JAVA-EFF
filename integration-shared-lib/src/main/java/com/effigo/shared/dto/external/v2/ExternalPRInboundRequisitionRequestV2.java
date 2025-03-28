package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPRInboundRequisitionRequestV2 {

    @JsonProperty("REQDTLS")
    public List<ExternalPRInboundRequisitionDtoV2> requisitionDtoV2s;



}
