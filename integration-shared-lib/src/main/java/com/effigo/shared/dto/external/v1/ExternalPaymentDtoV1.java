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
public class ExternalPaymentDtoV1 implements Serializable {

	private static final long serialVersionUID = 1376073361302573116L;

	@NotBlank(message = "{payid.not-null}")
	@NotNull
	@JsonProperty("payid")
	public String paymentTermId;

	@NotBlank(message = "{payname.not-null}")
	@NotNull
	@JsonProperty("payname")
	public String paymentTermName;

	@JsonProperty("status")
	public String status;

	@JsonProperty("paydesc")
	public String paymentDesc;

	@JsonProperty("paydays")
	public String paymentDays;

	@JsonProperty("payadv")
	public String paymentAdvance;

	@JsonProperty("createdBy")
	public String createdBy;

	@JsonProperty("updatedBy")
	public String updatedBy;

	@JsonProperty("erpid")
	public String erpId;

}
