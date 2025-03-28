package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class GrnRejectCancelDtoV3 {

	private String effigoRefNo;

	@JsonProperty("PSTNG_DATE")
	public String postingDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("DOC_DATE")
	public String docDate;

	@JsonProperty("HEADER_TXT")
	public String headerText;

	@JsonProperty("REF_DOC_NO")
	public String asnreferenceNo;

	@JsonProperty("INV_VALUE")
	public String supplierInvoiceValue;

	@JsonProperty("MAT_YEAR")
	public String matYear;

	@JsonProperty("STATUS")
	public String status;

	@JsonProperty("items")
	List<GrnItemRejectCancelDtoV3> items;

	@JsonProperty("cusField1")
	private String cusField1;

	@JsonProperty("cusField2")
	private String cusField2;

	@JsonProperty("cusField3")
	private String cusField3;

	@JsonProperty("cusField4")
	private String cusField4;

	@JsonProperty("cusField5")
	private String cusField5;

	@JsonProperty("cusField6")
	private String cusField6;

	@JsonProperty("cusField7")
	private String cusField7;

	@JsonProperty("cusField8")
	private String cusField8;

	@JsonProperty("cusField9")
	private String cusField9;

	@JsonProperty("cusField10")
	private String cusField10;

}
