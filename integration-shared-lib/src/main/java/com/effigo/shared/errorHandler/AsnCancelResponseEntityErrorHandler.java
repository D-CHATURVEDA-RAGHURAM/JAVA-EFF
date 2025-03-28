package com.effigo.shared.errorHandler;

import com.effigo.shared.dto.v1.AsnCancelOutboundResponseDto;
import com.effigo.shared.dto.v1.AsnOutboundResponseDto;
import com.effigo.shared.entity.ApiErrorResponseV1;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.util.List;

@Component
public class AsnCancelResponseEntityErrorHandler implements ResponseErrorHandler{
	
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
	        HttpMessageConverterExtractor<AsnCancelOutboundResponseDto> errorMessageExtractor =
	                new HttpMessageConverterExtractor(AsnCancelOutboundResponseDto.class, messageConverters);
			AsnCancelOutboundResponseDto errorObject = errorMessageExtractor.extractData(response);
	        ApiErrorResponseV1 apiErrorResponse = new ApiErrorResponseV1();
	        if(!ObjectUtils.isEmpty( errorObject) && !ObjectUtils.isEmpty(errorObject.getAsnCancelItems().getAsnItems())) {
	        	errorObject.getAsnCancelItems().getAsnItems().stream() .filter("E"::equals).forEach(s -> {
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


