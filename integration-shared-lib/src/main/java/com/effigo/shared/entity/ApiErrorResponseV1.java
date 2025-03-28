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
public class ApiErrorResponseV1 {

	private HttpStatus Status;
	private String errorCode;
	private String message;

	public static final class ApiErrorResponseBuilder {
		private HttpStatus Status;
		private String errorCode;
		private String message;

		public ApiErrorResponseBuilder() {
		}

		public static ApiErrorResponseBuilder anApiErrorResponse() {
			return new ApiErrorResponseBuilder();
		}

		public ApiErrorResponseBuilder withStatus(HttpStatus status) {
			this.Status = status;
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

		public ApiErrorResponseV1 build() {
			ApiErrorResponseV1 apiErrorResponse = new ApiErrorResponseV1();
			apiErrorResponse.Status = this.Status;
			apiErrorResponse.errorCode = this.errorCode;
			apiErrorResponse.message = this.message;
			return apiErrorResponse;
		}
	}
}
