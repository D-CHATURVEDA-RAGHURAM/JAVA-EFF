package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.*;
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
//@XmlRootElement(name = "Location")
public class ExternalLocationReqDtoV7 {


	@JsonProperty("Address")
	private ExternalAddressReqDtoV7 addressReqDtoV7;

}
