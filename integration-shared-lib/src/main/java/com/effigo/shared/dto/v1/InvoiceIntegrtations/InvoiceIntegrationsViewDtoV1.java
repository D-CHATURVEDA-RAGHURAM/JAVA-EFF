package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class InvoiceIntegrationsViewDtoV1 {
    private UUID invoiceIntegrationsId;

    private String companyCode;

    private String invoiceDocumentNumber;

    private String invoiceDocumentItem;

    private String fiscalYear;

    private String documentType;

    private String documentPostingDate;

    private String transactionCode;

    private String transactionType;

    private String referenceDocumentNumber;

    private String purchaseDocumentNumber;

    private String purchaseDocumentItem;
    private String documentCurrencyAmount;
    private String accountingDocumentNumber;
    private String postingDate;
    private String fiscalPeriod;
    private String objectKey;
    private String quantity;
    private String purchaseOrderUom;
    private String plant;
    private String materialNumber;
    private String referenceDocument;
    private String referenceDocumentItem;
    private String fiscalYearCurrentPeriod;
    private String sgst;
    private String cgst;
    private String igst;
    private String tcs;
    private String tds;
    private String grossDocumentValue;
    private String materialDocumentNumber;
    private String materialDocumentItem;
    private String deliveryNoteQuantity;
    private String deliveryNoteUom;
    private String unitEntryQuantity;
    private String serviceCode;

    private String serviceLine;

    private String entryTime;

    private String entryDate;

    private String customField1;

    private String customField2;

    private String customField3;

    private String customField4;

    private String customField5;

    private String customField6;

    private String customField7;

    private String customField8;

    private String customField9;

    private String customField10;

    private String title;

    public InvoiceIntegrationsViewDtoV1(
            String invoiceIntegrationsId,
            String companyCode,
            String invoiceDocumentNumber,
            String invoiceDocumentItem,
            String fiscalYear,
            String documentType,
            String documentCurrencyAmount,
            String cgst,
            String sgst,
            String igst,
            String tcs,
            String tds,
            String grossDocumentValue,
            String title,
            String transactionCode
    ) {
        this.invoiceIntegrationsId = UUID.fromString(invoiceIntegrationsId); // Convert String to UUID
        this.companyCode = companyCode;
        this.invoiceDocumentNumber = invoiceDocumentNumber;
        this.invoiceDocumentItem = invoiceDocumentItem;
        this.fiscalYear = fiscalYear;
        this.documentType = documentType;
        this.documentCurrencyAmount = documentCurrencyAmount;
        this.cgst = cgst;
        this.sgst = sgst;
        this.igst = igst;
        this.tcs = tcs;
        this.tds = tds;
        this.title = title;
        this.grossDocumentValue = grossDocumentValue;
        this.transactionCode = transactionCode;
    }

}
