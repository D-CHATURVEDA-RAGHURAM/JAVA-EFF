package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorLogisticsDetailsDto {
	private String logisticsPocFirstName;

	private String logisticsPocMiddleName;

	private String logisticsPocLastName;

	private String logisticsPocDesignation;

	private String logisticsPocPanCard;

	private String logisticsPocAdharCard;

	private String logisticsPocLandLine;

	private String logisticsPocMobile;

	private String logisticsPocEmail;

	private String contactType;

}
