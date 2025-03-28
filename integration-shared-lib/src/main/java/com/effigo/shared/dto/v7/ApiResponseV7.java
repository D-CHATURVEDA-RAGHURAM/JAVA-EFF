package com.effigo.shared.dto.v7;

import com.effigo.shared.dto.internal.v7.InternalGrnItemsDtoV7Readable;
import com.effigo.shared.dto.v1.Errors;
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
public class ApiResponseV7 {
    private HttpStatus statusCode;
    private String message;
    private String errorCode;
    List<InternalGrnItemsDtoV7Readable> items;
    private List<Errors> errors;
    private OutputDtoV1 response;
    @JsonProperty(value = "Status")
    private boolean status;

    public ApiResponseV7(HttpStatus statusCode, String message, String errorCode, OutputDtoV1 response,
                         boolean status) {
        this.statusCode = statusCode;
        this.message = message;
        this.errorCode = errorCode;
        this.response = response;
        this.status = status;
    }
}