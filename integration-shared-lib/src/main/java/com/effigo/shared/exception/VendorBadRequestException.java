package com.effigo.shared.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendorBadRequestException extends RuntimeException {

	private Map<String, String> errorCodes = new HashMap<>();

}
