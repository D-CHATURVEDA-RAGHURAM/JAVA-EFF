package com.effigo.shared.dto.v1.InvoiceIntegrtations;

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
public class InvoiceIntegrationsResponseGenV1 {
    @JsonProperty("invoiceDocumentNumber")
    private String invoiceDocumentNumber;
    @JsonProperty("invoiceDocumentItem")
    private String invoiceDocumentItem;
    @JsonProperty("fiscalYear")
    private String fiscalYear;
    @JsonProperty("createdOn")
    private String createdOn;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private HttpStatus status=HttpStatus.OK;
    @JsonProperty("errorCode")
    private String errorCode;

}
