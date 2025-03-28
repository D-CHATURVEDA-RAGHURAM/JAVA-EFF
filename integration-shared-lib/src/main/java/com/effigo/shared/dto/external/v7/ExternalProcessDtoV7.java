package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
//@XmlRootElement(name = "Process")
public class ExternalProcessDtoV7 {
	@JsonProperty("TenantID")
	private String tenantId;

	@JsonProperty("AccountingEntityID")
	private String accountingEntityId;

	@JsonProperty("LocationID")
	private String locationId;

	@JsonProperty( "ActionCriteria")
	private ExternalActionExpressionReqDtoV7 externalActionExpressionReqDtoV7;

	/*@JsonProperty("ActionCriteria")
	private String actionCriteria;

	@XmlAttribute(name ="ActionCriteria")
	private String actionCode;*/
}
