package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.InvoiceIntegrationView;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceIntegrationInternalDtoV1;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceIntegrationsInternalMapper extends IEntityMapper<InvoiceIntegrationInternalDtoV1, InvoiceIntegrationView>{

    List<InvoiceIntegrationView> toDomainList(List<InvoiceIntegrationInternalDtoV1> invoiceIntegrationViews);
    InvoiceIntegrationView toDomain(InvoiceIntegrationInternalDtoV1 invoiceIntegrationView);
    InvoiceIntegrationInternalDtoV1 toDto(InvoiceIntegrationView invoiceIntegrationInternalDtoV1);
    List<InvoiceIntegrationInternalDtoV1> toDtoList(List<InvoiceIntegrationView> invoiceIntegrationInternalDtoV1s);
}
