package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class InternalItemApprovedSupplierDto implements Serializable {

	private static final long serialVersionUID = -7686889910590670786L;

	private String id;
	private String itemId;
	private String supplierId;
	private String status;
	private String plant;
	private String createdBy;
	private Timestamp createdDate;
	private String updatedBy;
	private Timestamp updatedOn;
	private String customField1;
	private String recordId;

}
