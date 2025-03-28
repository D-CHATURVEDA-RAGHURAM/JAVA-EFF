package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class InvoiceIntegrationInternalHeaderDtoV1 {

	private List<InvoiceIntegrationInternalDtoV1> invoiceIntegrationInternalDtoV1s;

}
