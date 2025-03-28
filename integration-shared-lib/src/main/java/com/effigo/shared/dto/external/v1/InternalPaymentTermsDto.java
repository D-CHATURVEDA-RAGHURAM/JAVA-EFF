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
public class InternalPaymentTermsDto {

	private String paymentUniqueId;

	private String paymentTermId;

	private String paymentTermName;

	private String status;

	private String paymentDesc;

	private String paymentDays;

	private String paymentAdvance;

	private String createdBy;

	private Timestamp createdOn;

	private String updatedBy;

	private Timestamp updatedOn;

	public String erpId;

}
