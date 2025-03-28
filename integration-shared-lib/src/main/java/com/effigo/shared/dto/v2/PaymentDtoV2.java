package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author -srinivas kota
 * This is used for Client : Varroc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDtoV2 {
	@JsonProperty("BUKRS")
	private String companyCode;

	@JsonProperty("LIFNR")
	private String VendorNumber;

	@JsonProperty("CLEAR_DOC")
	private String clearingDocument;


	@JsonProperty("CLEAR_DATE")
	private String clearingDate;


	@JsonProperty("CLEAR_YEAR")
	private String clearingYear;


	@JsonProperty("FI_DOC")
	private String fiDocNumber;


	@JsonProperty("FI_POST_DATE")
	private String fiDocPostingDate;


	@JsonProperty("FI_DOC_DATE")
	private String fiDocDate;


	@JsonProperty("FI_DOC_YEAR")
	private String fiDocYear;


	@JsonProperty("XBLNR")
	private String invoiceNumber;


	@JsonProperty("AMT")
	private String amount;


	@JsonProperty("TDS")
	private String withHoldingTDS;


	@JsonProperty("GROSS_AMT")
	private String grossAmount;


	@JsonProperty("ZUMSK")
	private String advanceIndicator;


	@JsonProperty("SHKZG")
	private String debitCreditIndicator;


	@JsonProperty("EBELN")
	private String poNumber;


	@JsonProperty("EBELP")
	private String poItemId;


	@JsonProperty("WAERS")
	private String currency;


	@JsonProperty("STBLG")
	private String revDoc;


	@JsonProperty("STJAH")
	private String revYear;


	@JsonProperty("DOC_CATEG")
	private String docCategory;


	@JsonProperty("BSCHL")
	private String postingKey;


	@JsonProperty("BLART")
	private String docType;


	@JsonProperty("char_Field1")
	private String field1;


	@JsonProperty("char_Field2")
	private String field2;


	@JsonProperty("char_Field3")
	private String field3;


	@JsonProperty("curreny_Field1")
	private String currencyField1;


	@JsonProperty("curreny_Field2")
	private String currencyField2;


	@JsonProperty("curreny_Field3")
	private String currencyField3;


	@JsonProperty("date_Field1")
	private String dateField1;


	@JsonProperty("date_Field2")
	private String dateField2;


}
