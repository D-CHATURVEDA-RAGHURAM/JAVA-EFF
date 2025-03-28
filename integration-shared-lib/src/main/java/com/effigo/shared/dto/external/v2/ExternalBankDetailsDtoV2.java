package com.effigo.shared.dto.external.v2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalBankDetailsDtoV2 {
	private String bankCountry;
	private String bankKey;
	private Long bankAccount;
	private String accountHolder;
	private Integer bankControlKey;
	private String referenceDetails;
	private String bankName;
	private String region;
	private String street;
	private String city;
	private String branchName;
	private String bankNumber;
}
