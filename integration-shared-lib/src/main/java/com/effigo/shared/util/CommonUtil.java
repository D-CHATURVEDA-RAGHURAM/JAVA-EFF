package com.effigo.shared.util;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;

import static com.effigo.shared.common.AppConstant.INR;
import static com.effigo.shared.common.CurrencyFormatter.formatCurrencyForINRWithOutFractions;
import static com.effigo.shared.common.CurrencyFormatter.formatCurrencyForUSDWithOutFraction;

public interface CommonUtil {
	static String currencyChanges(BigDecimal invoiceAmount, String currency) {
		if (!StringUtils.isEmpty(currency))
				if (currency.equalsIgnoreCase(INR)) {
					return (formatCurrencyForINRWithOutFractions(invoiceAmount));
				} else {
					return (formatCurrencyForUSDWithOutFraction(invoiceAmount));
				}

		return invoiceAmount.toString();

	}
}
