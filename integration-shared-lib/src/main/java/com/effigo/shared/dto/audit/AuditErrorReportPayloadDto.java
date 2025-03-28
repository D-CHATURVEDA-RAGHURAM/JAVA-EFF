package com.effigo.shared.dto.audit;

import java.sql.Timestamp;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditErrorReportPayloadDto {
    private String auditTransactionId;
    private String requestUrl;
    private String retryStatus;
    private String event;
    private Integer retryCount;
    private Timestamp createdOn;
    
    private ErrorLogRequestDtoV1 requestPayload;
    private ErrorLogResponseDtoV1 responsePayload;
}
