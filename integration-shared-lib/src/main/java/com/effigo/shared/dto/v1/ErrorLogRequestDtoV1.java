package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorLogRequestDtoV1 {
    private String httpMethod;
    private String payload;
    private String headers;
    private String mediaType;
    private Timestamp createdOn;

}
