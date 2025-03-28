package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceSheetOutboundResponseDtoV2 {

	@JsonProperty("GUIID")
	private String transactionId;

	@JsonProperty("XBELNR")
	private String module;

	@JsonProperty("PO_NUMBER")
	private String poId;

	@JsonProperty("PO_ITEM")
	private String poItemId;

	@JsonProperty("REF_DOC_NO")
	private String erpRefNo;

	@JsonProperty("ENTRYSHEET")
	private String erpItmId;

	@JsonProperty("MAT_DOC")
	private String matDoc;

	@JsonProperty("DOC_YEAR")
	private String docYear;

	@JsonProperty("ET_MESSAGES")
	private ETMessagesV2 errorLog;

	   

}
