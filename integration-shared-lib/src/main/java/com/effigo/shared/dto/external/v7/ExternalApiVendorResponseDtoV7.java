package com.effigo.shared.dto.external.v7;

import org.springframework.http.HttpStatus;

import com.effigo.shared.dto.v1.OutputDtoV1;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalApiVendorResponseDtoV7 {
	
	private HttpStatus statusCode;
    private String errorCode;
    private String message;

}
