package com.effigo.shared.entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ErrorHandler;

@Slf4j
public class IntegrationErrorHandler implements ErrorHandler {
    @Override
    public void handleError(Throwable t) {
        log.error("IntegrationErrorHandler method invoked with "+t.getMessage());
    }
}
