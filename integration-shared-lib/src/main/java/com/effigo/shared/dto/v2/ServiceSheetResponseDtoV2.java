package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.external.v1.ServiceItemDto;
import com.effigo.shared.dto.external.v2.ServiceItemDtoV2;
import com.effigo.shared.dto.v1.AttachmentDtoV1;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceSheetResponseDtoV2 {
	
	@JsonProperty("H_PERSON_INT")
	private String goodsReceivedBy;  
	
	@JsonProperty("H_PCKG_NO")
	private String packageNumber;
	
	@JsonProperty("H_SHORT_TEXT")
	private String shortText;
	
	@JsonProperty("H_PO_NUMBER")
	private String poId;
	
	@JsonProperty("H_PO_ITEM")
	private String poItemIndex;
	
	@JsonProperty("H_DOC_DATE")
	private String invoiceDate;
	
	@JsonProperty("H_POST_DATE")
	private String postingDate;
	
	@JsonProperty("H_REF_DOC_NO")
	private String dispatchNotificationId;
	
	@JsonProperty("H_USER_FIELD")
	private String comments;
	
	@JsonProperty("H_ACCEPTANCE")
	private String acceptance;
	
	@JsonProperty("H_EINVOICE")
	private String einvoice;

	@JsonProperty("H_ZSINV_INV_TYPE")
	private String invoiceType;
	@JsonProperty("H_ZCB_LABOUR_LAW_COMPLINCE")
	private String labourLawComplince;
	@JsonProperty("H_ZCB_NO_LABOUR_DEPLOYMENT")
	private String labourDeployment;
	@JsonProperty("H_ZCB_NOT_APPLICABLE")
	private String zcbNotApplicable;

	@JsonProperty("H_DOC_ATTACHMENT")
	private AttachmentDtoV1 docAttachment;

	@JsonProperty("SERVICE_ITEM")
	List<ServiceItemDtoV2> serviceItemsDtos;

	@JsonProperty("text5")
	private String text5;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("text6")
	private String text6;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("text7")
	private String text7;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("text8")
	private String text8;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("text9")
	private String text9;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("text10")
	private String text10;
	
}
