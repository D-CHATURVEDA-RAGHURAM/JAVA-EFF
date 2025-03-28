package com.effigo.shared.common;

import com.ibm.icu.text.NumberFormat;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Locale;

import static com.effigo.shared.common.AppConstant.*;

@Slf4j
public class CurrencyFormatter {
	//Currency formating method
	public static String formatCurrencyForINR(BigDecimal currency, int noOfFraction) {
//		log.info("currency:{}", currency);
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale(EN, IN));
		nf.setMinimumFractionDigits(noOfFraction);
		nf.setMaximumFractionDigits(noOfFraction);
		String cur = nf.format(currency);
//		log.info("comma separated currency:{}", cur);
		return cur;

	}

	//Currency formating method
	public static String formatCurrencyForINRWithOutFractions(BigDecimal currency) {
//		log.info("currency:{}", currency);
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale(EN, IN));
		nf.setMinimumFractionDigits(TWO);
		nf.setMaximumFractionDigits(SIX);
		String cur = nf.format(currency);
//		log.info("comma separated currency:{}", cur);
		return cur;
	}

	//formatCurrencyNonIndians
	public static String formatCurrencyForUSD(BigDecimal currency, int noOfFraction) {
		log.info("currency:{}", currency);
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale(EN, USD));
		nf.setMinimumFractionDigits(noOfFraction);
		nf.setMaximumFractionDigits(noOfFraction);
		String cur = nf.format(currency);
		log.info("comma separated currency:{}", cur);
		return cur;
	}

	public static String formatCurrencyForUSDWithOutFraction(BigDecimal currency) {
//		log.info("currency:{}", currency);
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale(EN, USD));
		nf.setMinimumFractionDigits(TWO);
		nf.setMaximumFractionDigits(SIX);
		String cur = nf.format(currency);
//		log.info("comma separated currency:{}", cur);
		return cur;
	}

}
