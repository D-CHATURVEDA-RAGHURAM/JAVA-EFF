package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemDtoHeaderV8 {

	@JsonProperty("PO_NUMBER")
	private String poId;

	@JsonProperty("PO_ITEM")
	private String poItemIndex;

	@JsonProperty("DOC_DATE")
	private String invoiceDate;

	@JsonProperty("POST_DATE")
	private String postingDate;

	@JsonProperty("REF_DOC_NO")
	private String dispatchNotificationId;

	@JsonProperty("USER_FIELD")
	private String comments;

	@JsonProperty("ACCEPTANCE")
	private String acceptance;

	@JsonProperty("EINVOICE")
	private String einvoice;

	@JsonProperty("PERSON_INT")
	private String goodsReceivedBy;

	@JsonProperty("PCKG_NO")
	private String packageNumber;

	@JsonProperty("SHORT_TEXT")
	private String shortText;

	@JsonProperty("ZSINV_INV_TYPE")
	private String invType;

	@JsonProperty("EFFIGO_CRT_DT")
	private String effigoCrtDt;

	@JsonProperty("APPROVED_BY_MAIL")
	private String approvedByMail;

}
