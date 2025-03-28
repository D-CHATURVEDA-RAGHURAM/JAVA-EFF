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
public class ErrorLogResponseDtoV1 {
    private String httpStatusCode;
    private String errorMessage;
    private String headers;
    private Timestamp createdOn;

}
