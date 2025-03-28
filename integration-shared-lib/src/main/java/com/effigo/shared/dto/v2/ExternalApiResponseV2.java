package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.Errors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@Builder
public class ExternalApiResponseV2 {
    private HttpStatus statusCode;
    private String errorCode;
    private String message;
    private List<Errors> errors;
    private String projectCode;
    private String errorMessage;
    @JsonProperty(value = "Status")
    private boolean status;
    @JsonProperty(value = "recordid")
    private String recordId;
}
