package com.effigo.shared.entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExternalApiErrorResponseV1 {
    private HttpStatus statusCode;
    private OutputDtoV1 response;

    public static final class ExternalApiErrorResponseBuilder {
        private HttpStatus statusCode;
        private OutputDtoV1 response;

        public ExternalApiErrorResponseBuilder(){}

        public static ExternalApiErrorResponseBuilder anExternalApiErrorResponse() {
            return new ExternalApiErrorResponseBuilder();
        }

        public ExternalApiErrorResponseBuilder withStatus(HttpStatus statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public ExternalApiErrorResponseBuilder withOutputDto(OutputDtoV1 response) {
            this.response = response;
            return this;
        }


        public ExternalApiErrorResponseV1 build() {
            ExternalApiErrorResponseV1 externalApiErrorResponse = new ExternalApiErrorResponseV1();
            externalApiErrorResponse.statusCode = this.statusCode;
            externalApiErrorResponse.response = this.response;

            return externalApiErrorResponse;
        }
    }
}
