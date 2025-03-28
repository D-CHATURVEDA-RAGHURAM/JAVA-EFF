package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPRInboundRequisitionRequestV7 {

    @JsonProperty("REQDTLS")
    public List<ExternalPRInboundRequisitionDtoV7> requisitionDtoV7s;



}