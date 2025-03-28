package com.effigo.shared.dto.v1;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentAdvanceResponseDtoV1 {
	
		private String companyCode;
	    private String fiDocNo;
	    private String fiDocYear;
	    private String createdOn;
	    private String createdAt;
	    private String message;
	    private HttpStatus httpStatus;
	    private String errorCode;

}
