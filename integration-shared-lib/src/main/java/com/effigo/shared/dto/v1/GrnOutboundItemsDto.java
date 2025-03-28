package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GrnOutboundItemsDto implements  Cloneable{
	@JsonProperty("MATERIAL")
	private String itemcode;

	@JsonProperty("PLANT")
	private String businessunit;

	@JsonProperty("MOVE_TYPE")
	private String moveType;

	@JsonProperty("ENTRY_QNT")
	private String receivedqty;

/*	@JsonProperty("LSMNG")
	private String quantity;*/

	@JsonProperty("ENTRY_UOM")
	private String uom;

	@JsonProperty("ENTRY_UOM_ISO")
	private String uomIso;

	@JsonProperty("PO_NUMBER")
	private String poId;

	@JsonProperty("PO_ITEM")
	private String poItemId;

	@JsonProperty("MVT_IND")
	private String quantity;

	@JsonProperty("STGE_LOC")
	private String location;

	@JsonProperty("VENDRBATCH")
	private String batch;

	@JsonProperty("PROD_DATE")
	private String prodDate;


	@JsonProperty("GR_RCPT")
	private String createdBy;

	@JsonProperty("REF_DOC_YR")
	private String refDocYear;

	@JsonProperty("REF_DOC")
	private String asnReferenceNo;

	@JsonProperty("REF_DOC_IT")
	private String refDocIt;

	@Override
	public GrnOutboundItemsDto clone() {
		try {
			GrnOutboundItemsDto clone = (GrnOutboundItemsDto) super.clone();
			// TODO: copy mutable state here, so the clone can't change the internals of the original
			return clone;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}