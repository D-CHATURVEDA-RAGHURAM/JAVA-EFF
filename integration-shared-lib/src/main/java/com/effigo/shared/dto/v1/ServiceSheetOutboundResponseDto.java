package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceSheetOutboundResponseDto {

	 	@JsonProperty("GUIID")
	    private String transactionId;
	 	
	 	@JsonProperty("PO_NUMBER")
		private String poId;

	    @JsonProperty("PO_ITEM")
	    private String poItemId;

	    @JsonProperty("REF_DOC_NO")
	    private String erpRefNo;


	    @JsonProperty("ENTRYSHEET")
	    private String erpItmId;


	    @JsonProperty("ERROR_LOG")
	    private ErrorLogV1  errorLog;

	   

}
