package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditDebitResponseDtoV1 {
    private String accountingDocNo;
    private String fiscalYear;
    private String message;
    private HttpStatus httpStatus;
    private String errorCode;
    private String createdOn;
    private String createdTime;
}
