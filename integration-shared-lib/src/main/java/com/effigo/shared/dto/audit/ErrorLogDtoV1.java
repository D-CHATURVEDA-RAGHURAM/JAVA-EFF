package com.effigo.shared.dto.audit;

import lombok.Data;

import java.util.UUID;

@Data
public class ErrorLogDtoV1 {

    private UUID errorID;
    private UUID auditTransactionId;
    private String requestUrl;
    private String retryStatus;
    private String event;
    private int retryCount;

}
