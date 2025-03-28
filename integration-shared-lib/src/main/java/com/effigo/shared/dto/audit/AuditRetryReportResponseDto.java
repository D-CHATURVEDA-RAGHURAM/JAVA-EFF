package com.effigo.shared.dto.audit;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditRetryReportResponseDto {
    private String message;
    private List<ErrorRetryDTO> successList;
    private List<ErrorRetryDTO> failureList;
}
