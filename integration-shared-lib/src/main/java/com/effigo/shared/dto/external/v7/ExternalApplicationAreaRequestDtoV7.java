package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "ApplicationArea")
public class ExternalApplicationAreaRequestDtoV7 {

	@JsonProperty("Sender")
	private ExternalSenderRequestDtoV7 externalSenderRequestDtoV7;

	@JsonProperty("CreationDateTime")
	private String creationDateTime;

	@JsonProperty("BODID")
	private String bodId;
}
