package com.effigo.paymentintegration.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchCriteria {
	private String key;
	private boolean isCentralizedUser;
	private String value;
}
