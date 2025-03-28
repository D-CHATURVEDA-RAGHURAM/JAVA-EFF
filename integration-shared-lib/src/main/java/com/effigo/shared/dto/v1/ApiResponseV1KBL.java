package com.effigo.shared.dto.v1;

import com.effigo.shared.dto.v2.ItemsV2;
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
public class ApiResponseV1KBL {
	private HttpStatus statusCode;
	private String message;
	private String errorCode;
	private List<Errors> errors;
	private List<PRItemsV1> items;
	private OutputDtoV1 response;

	private List<ItemsV2> itemDetails;
	@JsonProperty(value = "Status")
	private boolean status;
	private Integer registrationIntegrationStatus;
	private String tranId;


	public ApiResponseV1KBL(HttpStatus statusCode, String message, String errorCode, OutputDtoV1 response,
                            boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.response = response;
		this.status = status;
	}

	public ApiResponseV1KBL(HttpStatus statusCode, String message, String errorCode, List<Errors> errors,
                            List<PRItemsV1> items, OutputDtoV1 response, boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.errors = errors;
		this.items = items;
		this.response = response;
		this.status = status;
	}
	public ApiResponseV1KBL(HttpStatus statusCode, String message, String errorCode, List<Errors> errors,
                            OutputDtoV1 response, boolean status) {
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.errors = errors;
		this.response = response;
		this.status = status;
	}
}