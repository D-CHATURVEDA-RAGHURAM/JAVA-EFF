package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorLogDtoV1 {
    private UUID auditTransactionId;
    private String requestUrl;
    private String retryStatus;
    private String event;
    private Integer retryCount;
    private Timestamp createdOn;
}
