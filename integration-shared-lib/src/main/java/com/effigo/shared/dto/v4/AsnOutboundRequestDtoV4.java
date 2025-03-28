package com.effigo.shared.dto.v4;


import com.effigo.shared.dto.v1.AsnItemOutboundRequestDtoV3;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnOutboundRequestDtoV4 {

    @JsonProperty("EFFIGO_ASN_NO")
    private String effigoAsnNo;

    @JsonProperty("OPERATING_UNIT")
    private String operatingUnit;

    @JsonProperty("SOURCE_TYPE")
    private String sourceType;

    @JsonProperty("STATUS")
    private String status;

    @JsonProperty("TRANSACTION_TYPE")
    private String transactionType;

    @JsonProperty("PO_NUMBER")
    private String poNumber;

    @JsonProperty("EWAYBILL_NO")
    private String ewaybillNo;

    @JsonProperty("EWAYBILL_DATE")
    private String ewaybillDate;

    @JsonProperty("BILL_OF_LADING")
    private String billOfLading;

    @JsonProperty("PO_SHIPMENT_NUMBER")
    private String poShipmentNumber;

    @JsonProperty("PREMISE_GATE_REFERENCE")
    private String premiseGateReference;

    @JsonProperty("OLD_GRN_FOR_RE_OFFER")
    private String oldGrnForReOffer;

    @JsonProperty("SUPPLIER_DC_NUMBER")
    private String supplierDcNumber;

    @JsonProperty("PACKING_SLIP")
    private String packingSlip;

    @JsonProperty("COMMENTS")
    private String comments;

    @JsonProperty("TRANSPORTER_NAME")
    private String transporterName;

    @JsonProperty("VEHICLE_NUMBER")
    private String vehicleNo;

    @JsonProperty("PLANT")
    private String plant;

    @JsonProperty("RECEIPT_DATE")
    private String receiptDate;

    @JsonProperty("STORAGE_LOC")
    private String storageLocation;

    @JsonProperty("VENDOR")
    private String vendor;

    @JsonProperty("MODE_OF_SHIPMENT")
    private String modeOfShipment;

    @JsonProperty("BATCH_NUMBER")
    private String batchNumber;

    @JsonProperty("BILL_OF_ENTRY_NO")
    private String billOfEntryNumber;

    @JsonProperty("BILL_OF_ENTRY_DATE")
    private String billOfEntryDate;

    @JsonProperty("IRN_NO")
    private String irrNo;

    @JsonProperty("AMOUNT")
    private BigDecimal amount;

    @JsonProperty("TOTAL_WEIGHT")
    private String totalWeight;

    @JsonProperty("BOE_PORT_CODE")
    private String boePortCode;

    @JsonProperty("INV_NUMBER")
    private String invNumber;

    @JsonProperty("INV_DATE")
    private String invDate;

    @JsonProperty("LR_NO")
    private String lrNo;

    @JsonProperty("E_INVOICE")
    private String eInvoice;

    @JsonProperty("ITEMS")
    private List<AsnItemOutboundRequestDtoV4> items;
}