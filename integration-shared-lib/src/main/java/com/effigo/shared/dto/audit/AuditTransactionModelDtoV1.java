package com.effigo.shared.dto.audit;

import java.util.UUID;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class AuditTransactionModelDtoV1 {

    // incoming request hostname
    private String hostName;
    // caller service name
    private String caller;
    // http status of the request 200 , 400 ,500 etc..
    private int httpStatus;
    // status of the request Success / Fail
    private String requestStatus;
    // Inbound or outBound we can decide this on the hostname
    private String type;
    // json
    private String request;
    // json
    private String response;
    private int responseSize;
    private String failedRequisitions;
    private String message;
    private HttpStatus statusCode;

    private String requestObject;
    // type of request example POD etc..
    private String event;
    // post / get etc..
    private String httpMethod;
    // json
    private String headers;
    // type of request application/json / xml etc..
    private String mediateType;
    // how many times the given request is retried
    private String retryStatus;
    // status after the retry Success / Fail
    private String retryHttpMethod;
    private String retryUrl;
    private int retryCount;

    // Module name ex. PR PO INVOICE VENDOR etc...
    private String module;

    // uuid of the transaction the same will send back to the caller modules to save
    // for the future tracking of audit logs
    private UUID auditTransactionId;

    // response attribute to decide given request is success or not
    private boolean status;

    // tenantId to decide on which data source to load n save audit log
    private String tenantId;
    private String businessId;
    private String errorCode;

}
