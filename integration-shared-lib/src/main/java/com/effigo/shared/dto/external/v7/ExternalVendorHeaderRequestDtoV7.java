package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorHeaderRequestDtoV7 {


	private ExternalVendorSupMasterRequestDtoV7 externalVendorSupMasterRequestDtoV7;

}
