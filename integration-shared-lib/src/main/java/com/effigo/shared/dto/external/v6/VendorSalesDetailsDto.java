package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorSalesDetailsDto {
	private String salesPocFirstName;

	private String salesPocMiddleName;

	private String salesPocLastName;

	private String salesPocDesignation;

	private String salesPocPanCard;

	private String salesPocAdharCard;

	private String salesPocLandLine;

	private String salesPocMobile;

	private String salesPocEmail;

	private String contactType;

}
