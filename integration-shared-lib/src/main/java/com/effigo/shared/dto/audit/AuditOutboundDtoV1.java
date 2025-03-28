package com.effigo.shared.dto.audit;

import lombok.Data;
import org.json.simple.JSONObject;

import java.util.UUID;

@Data
public class AuditOutboundDtoV1 {

    private UUID auditTransactionId;
    private JSONObject request;
    private JSONObject response;
}
