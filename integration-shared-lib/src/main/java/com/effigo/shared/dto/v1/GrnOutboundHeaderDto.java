package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnOutboundHeaderDto {

	@JsonProperty("PSTNG_DATE")
	private String postingDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("DOC_DATE")
	private String docDate;

	@JsonProperty("HEADER_TXT")
	private String supplierInvoiceNo;

	@JsonProperty("REF_DOC_NO")
	private String refDocNoLong;
}
