package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceBatchResponse {
	List<InvoiceIntegrationsResponseV1> successItems;
	List<InvoiceIntegrationInternalDtoV1> failedItems;
}
