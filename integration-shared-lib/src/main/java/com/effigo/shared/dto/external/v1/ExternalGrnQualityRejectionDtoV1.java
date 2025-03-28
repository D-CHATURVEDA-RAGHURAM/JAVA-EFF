package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnQualityRejectionDtoV1 {
	@JsonProperty("MBLNR")
	private String insId;

	@JsonProperty("ZEILE")
	private String insItemId;

	@JsonProperty("CHARG")
	private String itemBatchNo;

	@JsonProperty("LOSMENGE")
	private String insQty;

	@JsonProperty("LMENGE01")
	private String acceptedQty;

	@JsonProperty("LMENGE04")
	private String rejectedQty;

	@JsonProperty("ERSTELDAT")
	private String createdDate;

	@JsonProperty("VCODE")
	private String decisionCode;

	@JsonProperty("MJAHR")
	private String insYear;

	@JsonProperty("PRUEFLOS")
	private String insLotNo;

	@JsonProperty("EBELN")
	private String poId;

	@JsonProperty("EBELP")
	private String index;

	@JsonProperty("VDATUM")
	private String approvedDate;

	@JsonProperty("FIELD1")
	private String text1;

	@JsonProperty("FIELD2")
	private String text2;

	@JsonProperty("FIELD3")
	private String text3;

	@JsonProperty("FIELD4")
	private String text4;

}
