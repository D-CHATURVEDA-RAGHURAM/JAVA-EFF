package com.effigo.shared.dto.audit;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuditErrorReportDto {
	private UUID auditTransactionId;
	
}
