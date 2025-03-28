package com.effigo.shared.entity;

public class ExternalProcessingErrorException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final String code;

    public ExternalProcessingErrorException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
