package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalWbsDtoV1 implements Serializable {

	private static final long serialVersionUID = -6066880558757881139L;

	@NotBlank(message = "{projid.not-null}")
	@NotNull
	@JsonProperty("projid")
	public String projectId;

	@NotBlank(message = "{wbsid.not-null}")
	@NotNull
	@JsonProperty("wbsid")
	public String wbsId;

	@NotBlank(message = "{wbscode.not-null}")
	@NotNull
	@JsonProperty("wbscode")
	public String wbsCode;

	@JsonProperty("wbsname")
	public String wbsName;

	@JsonProperty("status")
	public String status;

	@JsonProperty("empcode")
	public String empCode;

	@NotBlank(message = "{startdate.not-null}")
	@NotNull
	@JsonProperty("startdate")
	public String startDate;

	@JsonProperty("enddate")
	public String endDate;

	@JsonProperty("createdBy")
	public String createdBy;

	@JsonProperty("updatedBy")
	public String updatedBy;

	@JsonProperty("erpid")
	public String erpId;

	@JsonProperty("budget")
	private String budget;

	@JsonProperty("authstatus")
	private String authStatus;

	@JsonProperty("recordid")
	private String recordId;
}
