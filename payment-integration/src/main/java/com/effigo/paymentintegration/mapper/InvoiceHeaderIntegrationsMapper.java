package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.InvoiceHeader;
import com.effigo.paymentintegration.entity.InvoiceIntegrations;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceIntegrationInternalDtoV1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceHeaderIntegrationsMapper extends IEntityMapper<InvoiceIntegrations, InvoiceHeader> {

	@Mapping(target = "invDocNo", source="invoiceDocumentNumber")
	@Mapping(target = "fiscalYear", source="fiscalYear")
	@Mapping(target = "documentType", source="documentType")
	@Mapping(target = "transactionType", source="transactionType")
	@Mapping(target = "reversalDoc", source="reversalDoc")
	@Mapping(target = "reverseYear", source="reverseYear")
	@Mapping(target = "purchaseDoc", source="purchaseDocumentNumber")
	@Mapping(target = "fiDocument", source="accountingDocumentNumber")
	@Mapping(target = "postingDate", source="postingDate")
	@Mapping(target = "awkey", source="objectKey")
	@Mapping(target = "plant", source="plant")
	@Mapping(target = "refDoc", source="referenceDocument")
	@Mapping(target = "matDoc", source="materialDocumentNumber")
	@Mapping(target = "taxAmount", source="tds")
	@Mapping(target = "totalAmount", source="grossDocumentValue")
	@Mapping(target = "basicAmount", source="documentCurrencyAmount")
	@Mapping(target = "cusfield1", source="customField1")
	@Mapping(target = "cusfield2", source="customField2")
	@Mapping(target = "cusfield3", source="customField3")
	@Mapping(target = "cusfield4", source="customField4")
	@Mapping(target = "cusfield5", source="customField5")
	@Mapping(target = "cusfield6", source="customField6")
	InvoiceHeader toDomain(InvoiceIntegrations invoiceIntegrationInternalDtoV1);

	List<InvoiceHeader> toDomainList(List<InvoiceIntegrations> invoiceIntegrations);

}

