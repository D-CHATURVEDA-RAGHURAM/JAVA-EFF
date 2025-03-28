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
//@XmlRootElement(name = "ProcessThermaxSupplierPartyMaster")
public class ExternalVendorSupMasterRequestDtoV7 {

	@JsonProperty("ApplicationArea")
	private ExternalApplicationAreaRequestDtoV7 externalApplicationAreaRequestDtoV7;

	@JsonProperty("DataArea")
	private ExternalDataAreaRequestDtoV7 externalDataAreaRequestDtoV7;
}
