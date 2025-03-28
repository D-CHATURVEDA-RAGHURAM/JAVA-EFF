package com.effigo.shared.dto.external.v9;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentAdvanceDtoV9 {
    private String paymenttId;
    private String companyCode;
    private String vendorNo;
    private String clearingDoc;
    private String clearingDate;
    private String clearingYear;
    private String fiDocNo;
    private String fiDocPostingDate;
    private String fiDocDocDate;
    private String fiDocYear;

    private String invoiceNo;

    private String amt;


    private String tds;


    private String grossAmount;

    private String advanceInd;


    private String debitOrCreditInd;


    private String poNumber;


    private String poItem;

    private String currency;


    private String revDocNo;

    private String revYear;

    private String docCategory;

    private String postingKey;

    private String docType;

    private String charField1;

    private String charField2;

    private String charField3;

    private String currenyField1;

    private String currenyField2;

    private String currenyField3;

    private String dateField1;

    private String dateField2;

    private String field1;

    private String field2;

    private String field3;

    private String field4;


    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
}
