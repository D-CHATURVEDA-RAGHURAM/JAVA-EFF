package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrnDetailsViewDto {

	private String effigorefno;

	@JsonProperty("REF_DOC_NO")
	private String asnreferenceno;
	@JsonProperty("PSTNG_DATE")
	private String postingdate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("DOC_DATE")
	private String docdate;
//	@JsonProperty("LOWER_TXT")
//	public String Lowertext;
	@JsonProperty("HEADER_TXT")
	private String headertext;

	private String businessunit;
	@JsonProperty("INV_VALUE")
	private Double supplierinvoicevalue;

	private String poid;

	private String createdby;

}
