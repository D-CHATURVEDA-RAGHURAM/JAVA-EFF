package com.effigo.shared.dto.external.v2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalPurchaseDtoV2 {
	private String orderCurrency;
	private String termsOfPayment;
	private String incoTerms;
	private String schemaGroup;
	private Integer pricingGroupControl;

}
