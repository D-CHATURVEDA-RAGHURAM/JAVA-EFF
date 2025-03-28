package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnOutboundHeaderDto {

	@JsonProperty("PSTNG_DATE")
	private String postingDate;

	@JsonProperty("DOC_DATE")
	private String docDate;

	@JsonProperty("HEADER_TXT")
	private String supplierInvoiceNo;

	@JsonProperty("REF_DOC_NO_LONG")
	private String refDocNoLong;
}
