package com.effigo.shared.dto.external.v1;

import com.effigo.shared.dto.v1.OutputDtoV1;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExternalVendorResponseDtoV1 {

    private HttpStatus statusCode;
    private String errorCode;
    private String errorMessage;
    private OutputDtoV1 response;
    @JsonProperty(value = "Status")
    private boolean status;
}
