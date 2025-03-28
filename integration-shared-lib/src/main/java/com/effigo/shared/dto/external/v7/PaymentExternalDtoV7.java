package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentExternalDtoV7 {

	@JsonProperty("BUKRS")
	private String companyCode;

	@JsonProperty("LIFNR")
	private String vendorNo;

	@JsonProperty("CLEAR_DOC")
	private String clearingDoc;

	@JsonProperty("CLEAR_DATE")
	private String clearingDate;

	@JsonProperty("CLEAR_YEAR")
	private String clearingYear;

	@JsonProperty("FI_DOC")
	private String fiDocNo;

	@JsonProperty("FI_POST_DATE")
	private String fiDocPostingDate;

	@JsonProperty("FI_DOC_DATE")
	private String fiDocDocDate;

	@JsonProperty("FI_DOC_YEAR")
	private String fiDocYear;

	@JsonProperty("XBLNR")
	private String invoiceNo;

	@JsonProperty("AMT")
	private String amt;

	@JsonProperty("TDS")
	private String tds;

	@JsonProperty("GROSS_AMT")
	private String grossAmount;

	@JsonProperty("ZUMSK")
	private String advanceInd;

	@JsonProperty("SHKZG")
	private String debitOrCreditInd;

	@JsonProperty("EBELN")
	private String poNumber;

	@JsonProperty("EBELP")
	private String poItem;

	@JsonProperty("WAERS")
	private String currency;

	@JsonProperty("STBLG")
	private String revDocNo;

	@JsonProperty("STJAH")
	private String revYear;

	@JsonProperty("DOC_CATEG")
	private String docCategory;

	@JsonProperty("BSCHL")
	private String postingKey;

	@JsonProperty("BLART")
	private String docType;

	@JsonProperty("char_Field1")
	private String charField1;

	@JsonProperty("char_Field2")
	private String charField2;

	@JsonProperty("char_Field3")
	private String charField3;

	@JsonProperty("curreny_Field1")
	private String currenyField1;

	@JsonProperty("curreny_Field2")
	private String currenyField2;

	@JsonProperty("curreny_Field3")
	private String currenyField3;

	@JsonProperty("date_Field1")
	private String dateField1;

	@JsonProperty("date_Field2")
	private String dateField2;

	@JsonProperty("field1")
	private String field1;

	@JsonProperty("field2")
	private String field2;

	@JsonProperty("field3")
	private String field3;

	@JsonProperty("field4")
	private String field4;

	@JsonProperty("field5")
	private String field5;

	@JsonProperty("field6")
	private String field6;

	@JsonProperty("field7")
	private String field7;

	@JsonProperty("field8")
	private String field8;

	@JsonProperty("field9")
	private String field9;

	@JsonProperty("field10")
	private String field10;

}
