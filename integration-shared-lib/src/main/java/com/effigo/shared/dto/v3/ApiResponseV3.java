package com.effigo.shared.dto.v3;


import com.effigo.shared.dto.v1.Errors;
import com.effigo.shared.dto.v1.OutputDtoV1;
import com.effigo.shared.dto.v1.SseInboundItems;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponseV3 {

        private HttpStatus statusCode;
        private String message;
        private String errorCode;
        List<SseInboundItems> serviceItemsDtos;
        private List<Errors> errors;
        private OutputDtoV1 response;
        @JsonProperty(value = "Status")
        private boolean status;
        private String failedSes;
        private String failedSesItems;
        private UUID transId;

        public ApiResponseV3(HttpStatus statusCode, String message, String errorCode, OutputDtoV1 response,
                             boolean status) {
            this.statusCode = statusCode;
            this.message = message;
            this.errorCode = errorCode;
            this.response = response;
            this.status = status;
        }


}
