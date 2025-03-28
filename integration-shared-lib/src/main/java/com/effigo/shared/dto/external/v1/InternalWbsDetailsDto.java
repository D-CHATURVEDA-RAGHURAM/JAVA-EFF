package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternalWbsDetailsDto {

	private String wbsUniqueId;

	private String projectId;

	private String wbsId;

	private String wbsCode;

	private String wbsName;

	private String status;

	private String empCode;

	private String startDate;

	private String endDate;

	private String createdBy;

	private Timestamp createdOn;

	private String updatedBy;

	private Timestamp updatedOn;

	public String erpId;

	private String budget;
	private String authStatus;
	private String recordId;

}
