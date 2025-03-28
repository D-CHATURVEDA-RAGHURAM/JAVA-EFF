package com.effigo.shared.entity;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.ResponseErrorHandler;

import com.effigo.shared.dto.external.v1.ExternalGrnDtoV1;
import com.effigo.shared.dto.v1.AsnOutboundResponseDto;


@Component
public class ResponseEntityErrorHandlerAsn implements ResponseErrorHandler{
	
	 private List<HttpMessageConverter<?>> messageConverters;

	    @Override
	    public boolean hasError(ClientHttpResponse response) throws IOException {
	        return hasError(response.getStatusCode());
	    }

	    protected boolean hasError(HttpStatus statusCode) {
	        return (statusCode.is4xxClientError() || statusCode.is5xxServerError());
	    }

	    @Override
	    public void handleError(ClientHttpResponse response) throws IOException {
	        HttpMessageConverterExtractor<AsnOutboundResponseDto> errorMessageExtractor =
	                new HttpMessageConverterExtractor(AsnOutboundResponseDto.class, messageConverters);
	        AsnOutboundResponseDto errorObject = errorMessageExtractor.extractData(response);
	        ApiErrorResponseV1 apiErrorResponse = new ApiErrorResponseV1();
	        if(!ObjectUtils.isEmpty( errorObject) && !ObjectUtils.isEmpty(errorObject.getAsnErrorOutboundResponseDto().getErrorItems())) {
	        	errorObject.getAsnErrorOutboundResponseDto().getErrorItems().stream() .filter("E"::equals).forEach(s -> {
	                apiErrorResponse.setErrorCode("500");
	                apiErrorResponse.setMessage(s.getMessage());
	                apiErrorResponse.setStatus(HttpStatus.BAD_GATEWAY);
	            });
	        }
	        //throw new ResponseEntityErrorException(ResponseEntity.status(response.getRawStatusCode()).headers(response.getHeaders()).body(errorObject));
	    }

	    public void setMessageConverters(List<HttpMessageConverter<?>> messageConverters) {
	        this.messageConverters = messageConverters;
	    }
	}


