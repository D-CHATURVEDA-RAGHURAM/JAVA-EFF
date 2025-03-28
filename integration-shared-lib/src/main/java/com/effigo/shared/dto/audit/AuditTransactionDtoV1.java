package com.effigo.shared.dto.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.UUID;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditTransactionDtoV1 {

    private UUID auditTransactionId;
    private String hostName;
    private String caller;
    private String status;
    private String type;
    private AuditOutboundDtoV1 auditOutbound;
    private AuditInboundDtoV1 auditInbound;
    private ErrorLogDtoV1 errorLog;
    private ErrorLogRequestDtoV1 errorLogRequest;
    private ErrorLogResponseDtoV1 errorLogResponse;
}
