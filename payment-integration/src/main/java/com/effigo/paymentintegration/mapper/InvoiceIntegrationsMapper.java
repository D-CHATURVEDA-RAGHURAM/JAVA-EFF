package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.InvoiceIntegrations;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceIntegrationInternalDtoV1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.util.StringUtils;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceIntegrationsMapper extends IEntityMapper<InvoiceIntegrationInternalDtoV1, InvoiceIntegrations> {
	@Mapping(target = "documentPostingDate", source = "documentPostingDate", qualifiedByName = "dateValidationCheck")
	@Mapping(target = "entryDate", source = "entryDate", qualifiedByName = "dateValidationCheck")
	@Mapping(target = "postingDate", source = "postingDate", qualifiedByName = "dateValidationCheck")
	InvoiceIntegrations toDomain(InvoiceIntegrationInternalDtoV1 invoiceIntegrationInternalDtoV1);

	InvoiceIntegrationInternalDtoV1 toDto(InvoiceIntegrations invoiceIntegrations);

	List<InvoiceIntegrations> toDomainList(List<InvoiceIntegrationInternalDtoV1> invoiceIntegrationInternalDtoV1s);

	List<InvoiceIntegrationInternalDtoV1> toDtoList(List<InvoiceIntegrations> paymentMain);



	@Mapping(target = "invoiceIntegrationsId", ignore = true)
	void partialUpdate(@MappingTarget InvoiceIntegrations target, InvoiceIntegrations source);

	@Named("dateValidationCheck")
	default String documentPostingDate(String dateStr) {
		if (!StringUtils.hasLength(dateStr) || "00-00-0000".equals(dateStr)) {
			return null;
		}
		return dateStr;
	}
}

