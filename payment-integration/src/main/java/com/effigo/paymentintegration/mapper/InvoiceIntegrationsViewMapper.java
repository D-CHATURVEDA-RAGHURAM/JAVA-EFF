package com.effigo.paymentintegration.mapper;

import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceInternalDtoV1;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceInternalViewDto;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.math.BigDecimal;
import java.util.List;

import static com.effigo.shared.util.CommonUtil.currencyChanges;

@Mapper(componentModel = "spring")
public interface InvoiceIntegrationsViewMapper {

	List<InvoiceInternalDtoV1> toDto(List<InvoiceInternalViewDto> invoiceIntegrationViews);

	@Mapping(target = "documentCurrencyAmount", source = "invoiceIntegrationView", qualifiedByName = "documentCurrencyAmount")
	@Mapping(target = "grossDocumentValue", source = "invoiceIntegrationView", qualifiedByName = "grossDocumentValue")
	@Mapping(target = "sgst", source = "invoiceIntegrationView", qualifiedByName = "sGst")
	@Mapping(target = "cgst", source = "invoiceIntegrationView", qualifiedByName = "cGst")
	@Mapping(target = "igst", source = "invoiceIntegrationView", qualifiedByName = "iGst")
	@Mapping(target = "tcs", source = "invoiceIntegrationView", qualifiedByName = "tcs")
	@Mapping(target = "tds", source = "invoiceIntegrationView", qualifiedByName = "tds")
	InvoiceInternalDtoV1 toDto(InvoiceInternalViewDto invoiceIntegrationView);

	@Named("documentCurrencyAmount")
	default String documentCurrencyAmount(InvoiceInternalViewDto invoiceIntegrationView) {
		if (!StringUtils.isEmpty(invoiceIntegrationView.getDocumentCurrencyAmount()) && invoiceIntegrationView.getDocumentCurrencyAmount().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(invoiceIntegrationView.getDocumentCurrencyAmount()),
					invoiceIntegrationView.getCurrency());
		else
			return invoiceIntegrationView.getDocumentCurrencyAmount();
	}

	@Named("grossDocumentValue")
	default String grossDocumentValue(InvoiceInternalViewDto invoiceIntegrationView) {
		if (!StringUtils.isEmpty(invoiceIntegrationView.getGrossDocumentValue()) && invoiceIntegrationView.getGrossDocumentValue().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(invoiceIntegrationView.getGrossDocumentValue()),
					invoiceIntegrationView.getCurrency());
		else
			return invoiceIntegrationView.getGrossDocumentValue();
	}

	@Named("sGst")
	default String sGst(InvoiceInternalViewDto invoiceIntegrationView) {
		if (!StringUtils.isEmpty(invoiceIntegrationView.getSgst()) && invoiceIntegrationView.getSgst().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(invoiceIntegrationView.getSgst()),
					invoiceIntegrationView.getCurrency());
		else
			return invoiceIntegrationView.getSgst();
	}

	@Named("cGst")
	default String cGst(InvoiceInternalViewDto invoiceIntegrationView) {
		if (!StringUtils.isEmpty(invoiceIntegrationView.getCgst()) && invoiceIntegrationView.getCgst().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(invoiceIntegrationView.getCgst()),
					invoiceIntegrationView.getCurrency());
		else
			return invoiceIntegrationView.getCgst();
	}

	@Named("iGst")
	default String iGst(InvoiceInternalViewDto invoiceIntegrationView) {
		if (!StringUtils.isEmpty(invoiceIntegrationView.getIgst()) && invoiceIntegrationView.getIgst().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(invoiceIntegrationView.getIgst()),
					invoiceIntegrationView.getCurrency());
		else
			return invoiceIntegrationView.getIgst();
	}

	@Named("tcs")
	default String tcs(InvoiceInternalViewDto invoiceIntegrationView) {
		if (!StringUtils.isEmpty(invoiceIntegrationView.getTcs()) && invoiceIntegrationView.getTcs().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(invoiceIntegrationView.getTcs()),
					invoiceIntegrationView.getCurrency());
		else
			return invoiceIntegrationView.getTcs();
	}

	@Named("tds")
	default String tds(InvoiceInternalViewDto invoiceIntegrationView) {
		if (!StringUtils.isEmpty(invoiceIntegrationView.getTds()) && invoiceIntegrationView.getTds().matches("-?\\d+(\\.\\d+)?"))
			return currencyChanges(new BigDecimal(invoiceIntegrationView.getTds()),
					invoiceIntegrationView.getCurrency());
		else
			return invoiceIntegrationView.getTds();
	}


}