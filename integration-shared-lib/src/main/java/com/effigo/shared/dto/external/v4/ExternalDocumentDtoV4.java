package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalDocumentDtoV4 {

	@JsonProperty("Doc1")
	byte[] attachment1 = {};

	@JsonProperty("Doc2")
	byte[] attachment2 = {};

	@JsonProperty("Doc3")
	byte[] attachment3 = {};

	@JsonProperty("Doc4")
	byte[] attachment4 = {};

	@JsonProperty("Doc5")
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

	@JsonProperty("Tokenno")
	private String tokenNo;

}
