package com.effigo.paymentintegration.utils;

import com.effigo.paymentintegration.entity.CreditDebitEntity;
import com.effigo.paymentintegration.entity.InvoiceIntegrations;
import com.effigo.paymentintegration.entity.PaymentAdvance;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import static com.effigo.paymentintegration.utils.AppConstants.INR;
import static com.effigo.shared.common.CurrencyFormatter.formatCurrencyForINRWithOutFractions;
import static com.effigo.shared.common.CurrencyFormatter.formatCurrencyForUSDWithOutFraction;

public interface CommonUtil {
	String SORT_DESC = "desc";
	String LIKE_OPERATOR = "%";
	UnaryOperator<String> likeOperator = str -> {
		if (StringUtils.isEmpty(str)) {
			str = LIKE_OPERATOR;
		} else {
			str = str.trim();
		}

		return str;
	};

	static Pageable getPageable(String pageNo, String pageSize, String orderSortingColumn) {
		int pageNumber = 0;
		int eachPageSize = 10;
		if (StringUtils.isNotEmpty(pageNo)) {
			pageNumber = Integer.parseInt(pageNo);
		}
		if (StringUtils.isNotEmpty(pageSize)) {
			eachPageSize = Integer.parseInt(pageSize);
		}
		Sort sort = Sort.by(orderSortingColumn).descending();
		return PageRequest.of(pageNumber, eachPageSize, sort);
	}
	static Pageable getPageablePayment(String pageNo, String pageSize) {
		int pageNumber = 0;
		int eachPageSize = 10;
		if (StringUtils.isNotEmpty(pageNo)) {
			pageNumber = Integer.parseInt(pageNo);
		}
		if (StringUtils.isNotEmpty(pageSize)) {
			eachPageSize = Integer.parseInt(pageSize);
		}
		//Sort sort = Sort.by(orderSortingColumn).descending();
		return PageRequest.of(pageNumber, eachPageSize);
	}

	static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(keyExtractor.apply(t));
	}

	static String currencyChanges(BigDecimal invoiceAmount, String currency) {
		if (!StringUtils.isEmpty(currency))
			if (invoiceAmount.compareTo(BigDecimal.ZERO) >= 0) {
				if (currency.equals(INR)) {
					return (formatCurrencyForINRWithOutFractions(invoiceAmount));
				} else {
					return (formatCurrencyForUSDWithOutFraction(invoiceAmount));
				}
			}
		return invoiceAmount.toString();

	}

	Function<CreditDebitEntity, String> getCdExistingKey = creditDebitEntity -> creditDebitEntity.getFiscalYear()
			.concat(creditDebitEntity.getAccountingDocNo().concat(creditDebitEntity.getPostingDate()));

	Function<PaymentAdvance, String> getPaymentExistingKey
			= paymentAdvance -> paymentAdvance.getClearingYear()
			.concat(paymentAdvance.getClearingDoc().concat(paymentAdvance.getClearingDate()
					.concat(paymentAdvance.getFiDocNo()).concat(paymentAdvance.getFiDocPostingDate())
					.concat(paymentAdvance.getDebitOrCreditInd())));

	Function<PaymentAdvance, String> getPaymentReversalExistingKey
			= paymentAdvance -> paymentAdvance.getClearingYear()
			.concat(paymentAdvance.getClearingDoc().concat(paymentAdvance.getClearingDate()
					.concat(paymentAdvance.getRevDocNo()).concat(paymentAdvance.getRevYear())
					.concat(paymentAdvance.getDebitOrCreditInd())));

	Function<InvoiceIntegrations, String> getInvoiceExistingKey
			= ii -> ii.getAccountingDocumentNumber()
			.concat(ii.getFiscalYear().concat(ii.getPostingDate()
					.concat(ii.getInvoiceDocumentItem())));

}
