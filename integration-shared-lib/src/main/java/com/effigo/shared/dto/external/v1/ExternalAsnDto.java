package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalAsnDto {

    @JsonProperty("effigorefno")
    private String effigoRefNo;

    @JsonProperty("einvoice")
    private String invoiceNumber;

    @JsonProperty("erprefno")
    private String erpRefNo;

    @JsonProperty("ewaybilldate")
    private String ewayBillDate;

    @JsonProperty("ewaybillno")
    private String ewayBillNo;

    @JsonProperty("postingdate")
    private String postingDate;

    @JsonProperty("docdate")
    private String docDate;

    @JsonProperty("headertext")
    private String headerText;

    @JsonProperty("supplierinvoiceno")
    private String supplierInvoiceNo;

    @JsonProperty("lrno")
    private String lrNo;

    @JsonProperty("transporter")
    private String transporter;

    @JsonProperty("plantcode")
    private String plantCode;

    @JsonProperty("ponumber")
    private String poNumber;

    @JsonProperty("status")
    private String status;

    @JsonProperty("createdby")
    private String createdBy;

    @JsonProperty("businessunit")
    private String businessUnit;

    @JsonProperty("vehicleno")
    private String vehicleNo;

    @JsonProperty("headertxt")
    private String headerTxt;

    @JsonProperty("items")
    private List<ExternalAsnItemDto> items;

}
