package com.effigo.shared.dto.external.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExternalMasterItemResponse {
	private String errorCode;
    private String message;
    private String itemSerialNumber;
}
