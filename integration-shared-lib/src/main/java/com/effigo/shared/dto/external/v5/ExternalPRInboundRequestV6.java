package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPRInboundRequestV6 {
    @JsonProperty("requisition")
    public List<ExternalPRInboundRequisitionDtoV6> requisitionDtoV6s;
}
