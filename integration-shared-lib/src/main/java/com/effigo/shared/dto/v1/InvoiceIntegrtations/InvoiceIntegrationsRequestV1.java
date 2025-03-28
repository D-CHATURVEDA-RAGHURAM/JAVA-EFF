package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceIntegrationsRequestV1 {
    @JsonProperty("IM_REQ")
    private List<InvoiceIntegrationDtoV1> request;
}
