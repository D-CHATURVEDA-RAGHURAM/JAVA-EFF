package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.Errors;
import com.effigo.shared.dto.v1.OutputDtoV1;
import com.effigo.shared.dto.v1.PRItemsV1;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponseV2 {
	private HttpStatus statusCode;
	private String message;
	private String errorCode;
	private List<Errors> errors;
	private UUID transId;
	private List<PRItemsV1> items;
	private List<ItemsV2> itemDetails;
	private OutputDtoV1 response;
	@JsonProperty(value = "Status")
	private boolean status;

	public ApiResponseV2(HttpStatus statusCode, String message, String errorCode, OutputDtoV1 response,
			boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.response = response;
		this.status = status;
	}

	public ApiResponseV2(HttpStatus statusCode, String message, String errorCode, List<Errors> errors,
			List<PRItemsV1> items, OutputDtoV1 response, boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.errors = errors;
		this.items = items;
		this.response = response;
		this.status = status;
	}
}