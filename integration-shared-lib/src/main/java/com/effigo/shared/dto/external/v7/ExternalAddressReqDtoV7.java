package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
//@XmlRootElement(name = "Address")
public class ExternalAddressReqDtoV7 {

	@JsonProperty("AddressLine")
	private List<String> addressLine;


	@JsonProperty("CityName")
	private String cityName;

	@JsonProperty("CountrySubDivisionCode")
	private String countrySubDivisionCode;

	@JsonProperty("CountryCode")
	private String countryCode;

	@JsonProperty("PostalCode")
	private String postalCode;


	@JsonProperty("AttentionOfName")
	private String attentionOfName;

}
