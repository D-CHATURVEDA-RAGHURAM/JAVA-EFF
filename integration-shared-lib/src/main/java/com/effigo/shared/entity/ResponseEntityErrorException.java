package com.effigo.shared.entity;

import org.springframework.http.ResponseEntity;

public class ResponseEntityErrorException extends RuntimeException {
    private ResponseEntity<ApiErrorResponseV1> errorResponse;
  public ResponseEntityErrorException(ResponseEntity<ApiErrorResponseV1> errorResponse) {
        this.errorResponse = errorResponse;
    }
    public ResponseEntity<ApiErrorResponseV1> getErrorResponse() {
        return errorResponse;
    }
}
