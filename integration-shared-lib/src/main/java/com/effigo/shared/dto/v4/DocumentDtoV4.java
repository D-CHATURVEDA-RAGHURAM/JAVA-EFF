package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDtoV4 {

	@JsonProperty("token_no")
	private String companyId;

	@JsonProperty("attachment1")
	byte[] attachment1 = {};

	@JsonProperty("attachment2")
	byte[] attachment2 = {};

	@JsonProperty("attachment3")
	byte[] attachment3 = {};

	@JsonProperty("attachment4")
	byte[] attachment4 = {};

	@JsonProperty("attachment5")
	byte[] attachment5 = {};

	@JsonProperty("Doc_Name_1")
	String gst ;

	@JsonProperty("Doc_Name_2")
	String pf;

	@JsonProperty("Doc_Name_3")
	String pan ;

	@JsonProperty("Doc_Name_4")
	String msme ;

	@JsonProperty("Doc_Name_5")
	String cin ;

	@JsonProperty("Doc_Mime_1")
	String gstMimeType ;

	@JsonProperty("Doc_Mime_2")
	String pfMimeType;

	@JsonProperty("Doc_Mime_3")
	String panMimeType ;

	@JsonProperty("Doc_Mime_4")
	String msmeMimeType ;

	@JsonProperty("Doc_Mime_5")
	String cinMimeType ;
}
