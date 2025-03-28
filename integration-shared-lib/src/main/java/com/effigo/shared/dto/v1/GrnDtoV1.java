package com.effigo.shared.dto.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnDtoV1 {

	private String effigorefno;

	@JsonProperty("PSTNG_DATE")
	public String postingdate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("DOC_DATE")
	public String docdate;

	@JsonProperty("HEADER_TXT")
	public String headertext;

	@JsonProperty("REF_DOC_NO")
	public String asnreferenceno;

	@JsonProperty("INV_VALUE")
	public String supplierinvoicevalue;

	@JsonProperty("MAT_YEAR")
	public String matYear;

	@JsonProperty("STATUS")
	public String status;

	@JsonProperty("items")
	List<GrnItemsDto> items;

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

	@JsonProperty("storageLocation")
	private List<GrnStorageLocationDtoV1> grnStorageLocationDtoV1s;



}
