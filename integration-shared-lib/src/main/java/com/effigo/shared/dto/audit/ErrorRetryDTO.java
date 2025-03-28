package com.effigo.shared.dto.audit;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorRetryDTO {
	private UUID auditTransactionId;
	private UUID errorId;
	private String errorCode;
	private String businessId;
}
