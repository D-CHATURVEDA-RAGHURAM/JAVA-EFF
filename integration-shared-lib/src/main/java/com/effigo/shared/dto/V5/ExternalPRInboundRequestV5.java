package com.effigo.shared.dto.V5;

import com.effigo.shared.dto.external.v5.ExternalPOMainDtoV5;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRInboundRequestV5 {

        @JsonProperty("ReqPr")
        private List<ExternalPRInboundRequisitionDtoV5> externalPRInboundRequisitionDtoV5;
}
