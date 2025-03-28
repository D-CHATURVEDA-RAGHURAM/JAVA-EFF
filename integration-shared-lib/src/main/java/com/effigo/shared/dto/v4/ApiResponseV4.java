package com.effigo.shared.dto.v4;

import com.effigo.shared.dto.v1.Errors;
import com.effigo.shared.dto.v1.GrnInboundDtoV1;
import com.effigo.shared.dto.v1.GrnInboundItemsDtoV1;
import com.effigo.shared.dto.v1.OutputDtoV1;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseV4 {
    private HttpStatus statusCode;
    private String message;
    private String errorCode;
    List<GrnInboundItemsDtoV1> items;
    private List<Errors> errors;
    private OutputDtoV1 response;
    @JsonProperty(value = "Status")
    private boolean status;
    private String transId;

    public ApiResponseV4(HttpStatus statusCode, String message, String errorCode, OutputDtoV1 response,
                         boolean status) {
        this.statusCode = statusCode;
        this.message = message;
        this.errorCode = errorCode;
        this.response = response;
        this.status = status;
    }
}
