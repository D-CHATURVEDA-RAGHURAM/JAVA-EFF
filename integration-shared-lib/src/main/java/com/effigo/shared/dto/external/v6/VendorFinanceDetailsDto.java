package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorFinanceDetailsDto {
	private String financePocFirstName;

	private String financePocMiddleName;

	private String financePocLastName;

	private String financePocDesignation;

	private String financePocPanCard;

	private String financePocAdharCard;

	private String financePocLandLine;

	private String financePocMobile;

	private String financePocEmail;

	private String contactType;

}
