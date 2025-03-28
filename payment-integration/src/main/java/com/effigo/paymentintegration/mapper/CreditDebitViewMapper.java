package com.effigo.paymentintegration.mapper;

import com.effigo.shared.dto.v1.CreditDebitDtoV1;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.CreditDebitInternalViewDto;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.math.BigDecimal;
import java.util.List;

import static com.effigo.shared.util.CommonUtil.currencyChanges;

@Mapper(componentModel = "spring")
public interface CreditDebitViewMapper {

	@Mapping(target = "docCurrencyAmount", source = "creditDebitView", qualifiedByName = "docCurrencyAmount")
	@Mapping(target = "cgst", source = "creditDebitView", qualifiedByName = "cgst")
	@Mapping(target = "sgst", source = "creditDebitView", qualifiedByName = "sgst")
	@Mapping(target = "igst", source = "creditDebitView", qualifiedByName = "igst")
	@Mapping(target = "gross", source = "creditDebitView", qualifiedByName = "gross")
	@Mapping(target = "localCurrencyAmount", source = "creditDebitView", qualifiedByName = "localCurrencyAmount")
	@Mapping(target = "rate", source = "creditDebitView", qualifiedByName = "rate")
	CreditDebitDtoV1 toDto(CreditDebitInternalViewDto creditDebitView);

	List<CreditDebitDtoV1> toDtoList(List<CreditDebitInternalViewDto> creditDebitViewList);
	@Named(value = "docCurrencyAmount")
	default String docCurrencyAmount(CreditDebitInternalViewDto creditDebitDtoV1) {
		if (!StringUtils.isEmpty(creditDebitDtoV1.getDocCurrencyAmount()) &&
				creditDebitDtoV1.getDocCurrencyAmount().matches("-?\\d+(\\.\\d+)?")) {
			return currencyChanges(new BigDecimal(creditDebitDtoV1.getDocCurrencyAmount()),
					creditDebitDtoV1.getCurrencyKey());
		} else
			return creditDebitDtoV1.getDocCurrencyAmount();
	}
	@Named(value = "cgst")
	default String cgst(CreditDebitInternalViewDto creditDebitDtoV1) {
		if (!StringUtils.isEmpty(creditDebitDtoV1.getDocCurrencyAmount()) &&
				creditDebitDtoV1.getCgst().matches("-?\\d+(\\.\\d+)?")) {
			return currencyChanges(new BigDecimal(creditDebitDtoV1.getCgst()),
					creditDebitDtoV1.getCurrencyKey());
		} else
			return creditDebitDtoV1.getCgst();
	}
	@Named(value = "sgst")
	default String sgst(CreditDebitInternalViewDto creditDebitDtoV1) {
		if (!StringUtils.isEmpty(creditDebitDtoV1.getSgst()) &&
				creditDebitDtoV1.getDocCurrencyAmount().matches("-?\\d+(\\.\\d+)?")) {
			return currencyChanges(new BigDecimal(creditDebitDtoV1.getSgst()),
					creditDebitDtoV1.getCurrencyKey());
		} else
			return creditDebitDtoV1.getSgst();
	}
	@Named(value = "igst")
	default String igst(CreditDebitInternalViewDto creditDebitDtoV1) {
		if (!StringUtils.isEmpty(creditDebitDtoV1.getIgst()) &&
				creditDebitDtoV1.getIgst().matches("-?\\d+(\\.\\d+)?")) {
			return currencyChanges(new BigDecimal(creditDebitDtoV1.getIgst()),
					creditDebitDtoV1.getCurrencyKey());
		} else
			return creditDebitDtoV1.getIgst();
	}
	@Named(value = "gross")
	default String gross(CreditDebitInternalViewDto creditDebitDtoV1) {
		if (!StringUtils.isEmpty(creditDebitDtoV1.getGross()) &&
				creditDebitDtoV1.getGross().matches("-?\\d+(\\.\\d+)?")) {
			return currencyChanges(new BigDecimal(creditDebitDtoV1.getGross()),
					creditDebitDtoV1.getCurrencyKey());
		} else
			return creditDebitDtoV1.getGross();
	}
	@Named(value = "localCurrencyAmount")
	default String localCurrencyAmount(CreditDebitInternalViewDto creditDebitDtoV1) {
		if (!StringUtils.isEmpty(creditDebitDtoV1.getLocalCurrencyAmount()) &&
				creditDebitDtoV1.getLocalCurrencyAmount().matches("-?\\d+(\\.\\d+)?")) {
			return currencyChanges(new BigDecimal(creditDebitDtoV1.getLocalCurrencyAmount()),
					creditDebitDtoV1.getCurrencyKey());
		} else
			return creditDebitDtoV1.getLocalCurrencyAmount();
	}
	@Named(value = "rate")
	default String rate(CreditDebitInternalViewDto creditDebitDtoV1) {
		if (!StringUtils.isEmpty(creditDebitDtoV1.getRate()) &&
				creditDebitDtoV1.getRate().matches("-?\\d+(\\.\\d+)?")) {
			return currencyChanges(new BigDecimal(creditDebitDtoV1.getRate()),
					creditDebitDtoV1.getCurrencyKey());
		} else
			return creditDebitDtoV1.getRate();
	}
}
