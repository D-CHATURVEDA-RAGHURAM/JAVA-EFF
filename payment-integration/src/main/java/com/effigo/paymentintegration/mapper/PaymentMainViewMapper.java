package com.effigo.paymentintegration.mapper;

import com.effigo.shared.dto.v1.InvoiceIntegrtations.PaymentInternalViewDto;
import com.effigo.shared.dto.v1.PaymentMainViewInternalDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

import static com.effigo.shared.util.CommonUtil.currencyChanges;

@Mapper(componentModel = "spring")
public interface PaymentMainViewMapper {
	@Mapping(target = "invoiceBasicAmount", source = "paymentMainView", qualifiedByName = "basicAmountCurrencyConverter")
	@Mapping(target = "invoiceTaxAmount", source = "paymentMainView", qualifiedByName = "invoiceTaxAmountCurrencyConverter")
	@Mapping(target = "invoiceTotalAmount", source = "paymentMainView", qualifiedByName = "invoiceTotalAmountCurrencyConverter")
	@Mapping(target = "customField10", source = "paymentMainView", qualifiedByName = "customField10")
	@Mapping(target = "customField3", source = "paymentMainView", qualifiedByName = "customField3")
	@Mapping(target = "customField4", source = "paymentMainView", qualifiedByName = "customField4")
	@Mapping(target = "customField5", source = "paymentMainView", qualifiedByName = "customField5")
	PaymentMainViewInternalDto toDto(PaymentInternalViewDto paymentMainView);

	List<PaymentMainViewInternalDto> toDtoList(List<PaymentInternalViewDto> paymentMainView);

	@Named(value = "basicAmountCurrencyConverter")
	default String basicAmountCurrencyConverter(PaymentInternalViewDto paymentMainView) {
		if (StringUtils.hasLength(paymentMainView.getInvoiceBasicAmount()) ){
			if(paymentMainView.getInvoiceBasicAmount().trim().matches("-?\\d+(\\.\\d+)?")) {
				return currencyChanges(new BigDecimal(paymentMainView.getInvoiceBasicAmount().trim()),
						paymentMainView.getCurrency());
		}
		} else {
			return " ";
		}
			return paymentMainView.getInvoiceBasicAmount().toString();

	}

	@Named(value = "invoiceTaxAmountCurrencyConverter")
	default String invoiceTaxAmountCurrencyConverter(PaymentInternalViewDto paymentMainView) {
		if (StringUtils.hasLength(paymentMainView.getInvoiceTaxAmount())) {
			if(paymentMainView.getInvoiceTaxAmount().trim().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(paymentMainView.getInvoiceTaxAmount().trim()),
					paymentMainView.getCurrency());
		}else{
			return " ";
		}
			return paymentMainView.getInvoiceTaxAmount().toString();
	}

	@Named(value = "invoiceTotalAmountCurrencyConverter")
	default String invoiceTotalAmountCurrencyConverter(PaymentInternalViewDto paymentMainView) {
		if (StringUtils.hasLength(paymentMainView.getInvoiceTotalAmount())){
			if(paymentMainView.getInvoiceTotalAmount().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(paymentMainView.getInvoiceTotalAmount()),
					paymentMainView.getCurrency());
		}else{
			return " ";
		}
			return paymentMainView.getInvoiceTotalAmount().toString();
	}

	@Named(value = "customField10")
	default String customField10(PaymentInternalViewDto paymentMainView) {
		if (StringUtils.hasLength(paymentMainView.getCustomField10())) {
			if (paymentMainView.getCustomField10().trim().matches("-?\\d+(\\.\\d+)?"))
				return currencyChanges(new BigDecimal(paymentMainView.getCustomField10().trim()), paymentMainView.getCurrency());

		}
		else {
			return " ";
		}
			return paymentMainView.getCustomField10();
	}
	@Named(value = "customField3")
	default String customField3(PaymentInternalViewDto paymentMainView) {
		if (StringUtils.hasLength(paymentMainView.getCustomField3()) ) {
			if (
					paymentMainView.getCustomField3().trim().matches("-?\\d+(\\.\\d+)?"))
				return currencyChanges(new BigDecimal(paymentMainView.getCustomField3().trim()), paymentMainView.getCurrency());
		}else{
				return " ";
			}
				return paymentMainView.getCustomField3();

	}
	@Named(value = "customField4")
	default String customField4(PaymentInternalViewDto paymentMainView) {
		if (StringUtils.hasLength(paymentMainView.getCustomField4()) ) {if (
				paymentMainView.getCustomField4().trim().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(paymentMainView.getCustomField4().trim()), paymentMainView.getCurrency());
	}else{
		return " ";
	}
			return paymentMainView.getCustomField4();
	}
	@Named(value = "customField5")
	default String customField5(PaymentInternalViewDto paymentMainView) {
		if (StringUtils.hasLength(paymentMainView.getCustomField5())) {
			if (
					paymentMainView.getCustomField5().trim().matches("-?\\d+(\\.\\d+)?"))
				return currencyChanges(new BigDecimal(paymentMainView.getCustomField5().trim()), paymentMainView.getCurrency());
		}else{
			return " ";
		}
			return paymentMainView.getCustomField5();
	}

}
