package com.effigo.shared.dto.external.v8;

import com.effigo.shared.dto.external.v8.InvoiceIntegrationDtoGenV8;
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
public class InvoiceIntegrationsRequestGenV8 {

	@JsonProperty("INVOICE")
	private List<InvoiceIntegrationDtoGenV8> request;
}
