package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnQualityRejectionV1 {
	private String insId;

	private String insItemId;

	private String itemBatchNo;

	private String insQty;

	private String acceptedQty;

	private String rejectedQty;

	private String createdDate;

	private String decisionCode;

	private String insYear;

	private String insLotNo;

	private String poId;

	private String index;

	private String approvedDate;

	private String poItemId;

	private String text1;

	private String text2;

	private String text3;

	private String text4;

	private String text5;

	private String text6;

	private String text7;

	private String text8;

	private String text9;

	private String text10;

	private String text11;

	private String text12;

	private String text13;

	private String text14;

	private String text15;

	private String text16;

	private String text17;

	private String text18;

	private String text19;

	private String text20;

	private String text21;

	private String text22;

}
