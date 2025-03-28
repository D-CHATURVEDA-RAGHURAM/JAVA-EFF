package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalItemApprovedSupplierDto implements Serializable {

	private static final long serialVersionUID = -8042267481632761623L;

	private String id;
	@JsonProperty("itemid")
	private String itemId;
	@JsonProperty("vendorid")
	private String supplierId;
	private String status;
	@JsonProperty("orgid")
	private String plant;
	@JsonProperty("createdby")
	private String createdBy;
	private Timestamp createdDate;
	private String updatedBy;
	private Timestamp updatedOn;
	private String site;

	@JsonProperty("recordid")
	private String recordId;
}
