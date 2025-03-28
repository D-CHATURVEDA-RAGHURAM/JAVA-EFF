package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentAdvanceExternalResponseDtoV1 {
	

	    @JsonProperty("BUKRS")
	    private String companyCode;
	    
	    @JsonProperty("FI_DOC")
	    private String fiDocNo;
	    
	    @JsonProperty("FI_DOC_YEAR")
	    private String fiDocYear;
	    
	    @JsonProperty("CREATED_ON")
	    @JsonFormat(pattern = "MM-dd-yyyy")
	    private String createdOn;
	    
	    @JsonProperty("CREATED_AT")
	    @JsonFormat(pattern = "HH:mm:ss")
	    private String createdAt;
	    
	    @JsonProperty("MESSAGE")
	    private String message;
	    
	    @JsonProperty("STATUS")
	    private HttpStatus status;
	    
	    @JsonProperty("ERROR_CODE")
	    private String errorCode;


}
