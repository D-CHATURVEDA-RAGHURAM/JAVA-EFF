package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class CreditDebitExtrnalResponseDtoV1 {
    @JsonProperty("BELNR")
    private String accountingDocNo;
    @JsonProperty("GJAHR")
    private String fiscalYear;
    @JsonProperty("MESSAGE")
    private String message;
    @JsonProperty("STATUS")
    private HttpStatus status;
    @JsonProperty("ERROR_CODE")
    private String errorCode;
    @JsonProperty("CREATED_ON")
    private String createdOn;
    @JsonProperty("CREATED_AT")
    private String createdTime;
}
