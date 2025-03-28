package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import com.effigo.shared.dto.v1.PaymentMainViewDtoV1;
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
public class PaymentInternalDto implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 46790669550033759L;

	@JsonProperty("data")
	 private List<PaymentMainViewDtoV1> data=new ArrayList<>();
	@JsonProperty("success")
	private Boolean success=Boolean.FALSE;
	@JsonProperty("message")
	private String message="";
	@JsonProperty("errors")
	private Object errors=new ArrayList<>();
	@JsonProperty("totalElements")
	private long totalElements;
	@JsonProperty("totalPages")
	private int totalPages;
	@JsonProperty("currentPage")
	private int currentPage;
	@JsonProperty("pageSize")
	private int pageSize;
	@JsonIgnore
	@JsonProperty("status")
	private HttpStatus status=HttpStatus.INTERNAL_SERVER_ERROR;
}
