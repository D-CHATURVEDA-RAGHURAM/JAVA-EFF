package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import lombok.Data;

import java.util.List;

@Data
public class InvoiceInboundProcessedDto {

	private List<InvoiceIntegrationsResponseV1> successResponse;

	private List<InvoiceIntegrationInternalDtoV1> failedResponse;

}