package com.effigo.shared.util;

import com.effigo.shared.dto.v1.CreditDebitDtoV1;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceInternalDtoV1;
import com.effigo.shared.dto.v1.PaymentMainViewDtoV1;
import com.effigo.shared.dto.v1.PaymentMainViewInternalDto;
import com.effigo.shared.dto.v2.PurchaseOrderItemPriceHistoryAuditViewDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
		"success",
		"message",
		"data",
		"status",
		"totalElements",
		"totalPages",
		"currentPage",
		"pageSize"

})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponsePagination implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 4370585355980982875L;

	@JsonProperty("success")
	private Boolean success = Boolean.FALSE;
	@JsonProperty("message")
	private String message = "";
	@JsonProperty("errors")
	private Object errors = new ArrayList<>();
	@JsonProperty("data")
	private Object data = new ArrayList<>();
	@JsonIgnore
	@JsonProperty("status")
	private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
	@JsonProperty("totalElements")
	private long totalElements;
	@JsonProperty("totalPages")
	private int totalPages;
	@JsonProperty("currentPage")
	private int currentPage;
	@JsonProperty("pageSize")
	private int pageSize;
	List<PaymentMainViewInternalDto> paymentMainDtoV1List;
	List<InvoiceInternalDtoV1> invoiceInternalDtoV1List;
	List<CreditDebitDtoV1> creditDebitDtoV1List;
	List<PurchaseOrderItemPriceHistoryAuditViewDto> purchaseOrderItemPriceHistoryAuditViewDtos;
}