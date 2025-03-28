package com.effigo.shared.dto.audit;

import lombok.Data;
import org.json.simple.JSONObject;

import java.util.UUID;

@Data
public class ErrorLogResponseDtoV1 {
    private UUID errorId;
    private int httpStatusCode;
    private String errorMessage;
    private JSONObject payload;
    private JSONObject headers;
}
