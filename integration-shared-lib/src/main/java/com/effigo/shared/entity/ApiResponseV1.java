package com.effigo.shared.entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseV1 {
	private HttpStatus statusCode;
	private String message;
	private OutputDtoV1 response;
}
