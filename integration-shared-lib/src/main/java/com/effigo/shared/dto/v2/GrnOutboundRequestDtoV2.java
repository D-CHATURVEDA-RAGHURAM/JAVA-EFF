package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class GrnOutboundRequestDtoV2 {

	@JsonProperty("GOODSMVT_CODE")
	private GrnOutboundCodeDto grnOutboundCodeDto;


	@JsonProperty("GOODSMVT_HEADER")
	private GrnOutboundHeaderDto grnOutboundHeaderDto;

	@JsonProperty("INV_VALUE")
	public String supplierInvoiceValue;

	@JsonProperty("MAT_YEAR")
	public String matYear;

	@JsonProperty("ZSINV_INV_TYPE")
	public String invoiceType;

	@JsonProperty("H_DOC_ATTACHMENT")
	private AttachmentDtoV1 docAttachment;

	@JsonProperty("cusField2")
	private String cusField2;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cusField3")
	private String cusField3;

	@JsonProperty("GOODSMVT_ITEM")
	List<GrnOutboundItemsDto> items;

	@JsonProperty("LINE_DETAILS")
	List<GrnOutboundLineDetailDto> grnOutboundLineDetailDtos;
}
