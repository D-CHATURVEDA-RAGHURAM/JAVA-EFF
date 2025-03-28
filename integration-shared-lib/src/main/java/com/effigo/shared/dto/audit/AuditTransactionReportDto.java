package com.effigo.shared.dto.audit;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditTransactionReportDto {
    private String auditTransactionId;
    private String hostName;
    private String status;
    private String type;
    private String event;
    private String module;
    private String errorLogId;
}
