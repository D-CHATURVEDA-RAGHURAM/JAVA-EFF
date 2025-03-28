package com.effigo.shared.dto.audit;

import org.json.simple.JSONObject;

import lombok.Data;

@Data
public class ErrorLogRequestDtoV1 {
    private String errorId;
    private String httpMethod;
    private JSONObject payload;
    private JSONObject headers;
    private String mediaType;
}
