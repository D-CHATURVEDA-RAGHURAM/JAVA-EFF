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
//@XmlRootElement(name = "DataArea")
public class ExternalDataAreaRequestDtoV7 {

	@JsonProperty("Process")
	private ExternalProcessDtoV7 externalProcessDtoV7;

	@JsonProperty("ThermaxSupplierPartyMaster")
	private ExternalThermaxSupPartyMasterReqDtoV7 thermaxSupplierPartyMaster;

}
