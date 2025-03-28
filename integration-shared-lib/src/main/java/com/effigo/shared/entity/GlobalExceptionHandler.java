package com.effigo.shared.entity;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {

        Map<String, List<String>> body = new HashMap<>();

        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());

        body.put("errors", errors);

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<?> noDataExceptionHandler(NoDataFoundException ex, WebRequest request) {

        log.info("Exception Occurred due to " + ex.getMessage() + "  " + ex.toString());
        ApiErrorResponseV1 apiResponse = new ApiErrorResponseV1
                .ApiErrorResponseBuilder()
                .withMessage(ex.getMessage())
                .withErrorCode(ex.getCode())
                .withStatus(HttpStatus.BAD_REQUEST)
                .build();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<ApiErrorResponseV1>(apiResponse, headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidDataException.class)
    public ResponseEntity<?> invalidDataExceptionHandler(InvalidDataException ex, WebRequest request) {

        log.info("Exception Occurred due to " + ex.getMessage() + "  " + ex.toString());
        ApiErrorResponseV1 apiResponse = new ApiErrorResponseV1
                .ApiErrorResponseBuilder()
                .withMessage(ex.getMessage())
                .withErrorCode(ex.getCode())
                .withStatus(HttpStatus.BAD_REQUEST)
                .build();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<ApiErrorResponseV1>(apiResponse, headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProcessingErrorException.class)
    public ResponseEntity<?> processingErrorExceptionHandler(ProcessingErrorException ex, WebRequest request) {

        log.info("Exception Occurred due to " + ex.getMessage() + "  " + ex.toString());
        ApiErrorResponseV1 apiResponse = new ApiErrorResponseV1
                .ApiErrorResponseBuilder()
                .withMessage(ex.getMessage())
                .withErrorCode(ex.getCode())
                .withStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                .build();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<ApiErrorResponseV1>(apiResponse, headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ExternalProcessingErrorException.class)
    public ResponseEntity<?> externalProcessingErrorExceptionHandler(ExternalProcessingErrorException ex, WebRequest request) {

        log.info("Exception Occurred due to " + ex.getMessage() + "  " + ex.toString());

        OutputDtoV1 outputDto=new OutputDtoV1();
        outputDto.addData("status","error");
        outputDto.addData("message",ex.getMessage());


        ExternalApiErrorResponseV1 apiResponse = new ExternalApiErrorResponseV1
                .ExternalApiErrorResponseBuilder()
                .withStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                .withOutputDto(outputDto)
                .build();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<ExternalApiErrorResponseV1>(apiResponse, headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
