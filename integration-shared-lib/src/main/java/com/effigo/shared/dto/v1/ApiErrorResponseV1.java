package com.effigo.shared.dto.v1;

import lombok.*;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ApiErrorResponseV1 {

	private HttpStatus statusCode;
	private String errorCode;
	private String message;
	@JsonProperty(value = "Status")
	@Builder.Default
	private String status = "true";

	public static final class ApiErrorResponseBuilder {
		private HttpStatus statusCode;
		private String errorCode;
		private String message;
		private String status;

		public ApiErrorResponseBuilder() {
		}

		public static ApiErrorResponseBuilder anApiErrorResponse() {
			return new ApiErrorResponseBuilder();
		}

		public ApiErrorResponseBuilder withStatusCode(HttpStatus status) {
			this.statusCode = status;
			return this;
		}

		public ApiErrorResponseBuilder withErrorCode(String errorCode) {
			this.errorCode = errorCode;
			return this;
		}

		public ApiErrorResponseBuilder withMessage(String message) {
			this.message = message;
			return this;
		}
		
		public ApiErrorResponseBuilder withStatus(String status) {
			this.status = status;
			return this;
		}

		public ApiErrorResponseV1 build() {
			ApiErrorResponseV1 apiErrorResponse = new ApiErrorResponseV1();
			apiErrorResponse.statusCode = this.statusCode;
			apiErrorResponse.errorCode = this.errorCode;
			apiErrorResponse.message = this.message;
			apiErrorResponse.status = this.status;
			return apiErrorResponse;
		}
	}
}
