package com.effigo.shared.dto.v1;

import java.util.List;
import java.util.UUID;

import com.effigo.shared.dto.external.v5.GrnStatusDtoV1;
import com.effigo.shared.dto.external.v6.VendorCreationIntegrationDtoV5;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceIntegrationsResponseV1;
import com.effigo.shared.dto.v2.ItemsV2;
import com.effigo.shared.dto.v2.PaymentResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponseV1 {

	private HttpStatus statusCode;
	private String message;
	private String errorCode;
	private List<Errors> errors;
	private List<PRItemsV1> items;
	private List<ItemsV2> itemsV2List;
	private OutputDtoV1 response;
	private UUID transId;
	private String failedRequisitions;
	private List<GrnInboundItemsDtoV1> grnItems;
	private List<GrnStatusDtoV1> grnReq;
	private String failedItems;
	private List<ItemsV2> itemDetails;
	private List<PaymentResponse> paymentResponse;
	@JsonProperty(value = "Status")
	private boolean status;
	private Integer registrationIntegrationStatus;
	private List<VendorCreationIntegrationDtoV5> vendorCreationIntegrationDtoV5s;
	private List<InvoiceIntegrationsResponseV1> invoiceIntegrationsResponseV1s;


	public ApiResponseV1(HttpStatus statusCode, String message, String errorCode, OutputDtoV1 response,
			boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.response = response;
		this.status = status;
	}

	public ApiResponseV1(HttpStatus statusCode, String message, String errorCode, List<Errors> errors,
			List<PRItemsV1> items, OutputDtoV1 response, boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.errors = errors;
		this.items = items;
		this.response = response;
		this.status = status;
	}
	public ApiResponseV1(HttpStatus statusCode, String message, String errorCode, List<Errors> errors,
			 OutputDtoV1 response, boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.errors = errors;
		this.response = response;
		this.status = status;
	}
}