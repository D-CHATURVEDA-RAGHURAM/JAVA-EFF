package com.effigo.shared.dto.external.v1;

import com.effigo.shared.dto.v1.Errors;
import com.effigo.shared.dto.v1.OutputDtoV1;
import com.effigo.shared.dto.v2.ItemsV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.*;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(content = Include.NON_NULL)
public class ExternalApiResponseV1 {
    private HttpStatus statusCode;
    private String errorCode;
    private String message;
    private OutputDtoV1 response;
    private List<Errors> errors;
	private UUID transId;
    private List<ExternalPRItems> items;
    @JsonProperty(value = "Status")
    private boolean status;
    private String errorMessage;
	private List<ItemsV2> itemDetails;
    public ExternalApiResponseV1(HttpStatus statusCode, OutputDtoV1 response) {
		this.statusCode = statusCode;
		this.response = response;
	}

	public ExternalApiResponseV1(HttpStatus statusCode, String errorCode, String message, OutputDtoV1 response,
			List<Errors> errors, List<ExternalPRItems> items, boolean status, String errorMessage) {
		this.statusCode = statusCode;
		this.errorCode = errorCode;
		this.message = message;
		this.response = response;
		this.errors = errors;
		this.items = items;
		this.status = status;
		this.errorMessage = errorMessage;
	}
}
