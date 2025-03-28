package com.effigo.shared.dto.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnOutboundRequestDtoV8 {
    @JsonProperty("EFFIGO_ASN_NO")
    private String effigoAsnNo;

    @JsonProperty("PO_NUMBER")
    private String poNumber;

    @JsonProperty("EWAYBILL_NO")
    private String ewaybillNo;

    @JsonProperty("EWAYBILL_DATE")
    private String ewaybillDate;

    @JsonProperty("TRANSPORTER_NAME")
    private String transporterName;

    @JsonProperty("VEHICLE_NUMBER")
    private String vehicleNo;

    @JsonProperty("PLANT")
    private String plant;

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

    @JsonProperty("INV_NUMBER")
    private String invNumber;

    @JsonProperty("INV_DATE")
    private String invDate;

    @JsonProperty("LR_NO")
    private String lrNo;

    @JsonProperty("E_INVOICE")
    private String eInvoice;

    @JsonProperty("PO_ITEM")
    private String poItem;

    @JsonProperty("ITEM_CODE")
    private String itemCode;

    @JsonProperty("ITEM_DESC")
    private String itemDesc;

    @JsonProperty("DISPATCH_UOM")
    private String dispatchUom;

    @JsonProperty("DISPATCH_QUANTITY")
    private BigDecimal dispatchQuantity;

    @JsonProperty("DESTINATION_TYPE")
    private String destinationType;

    @JsonProperty("TRANSACTION_TYPE")
    private String transactionType;

    @JsonProperty("OPERATING_UNIT")
    private Integer operatingUnit;

    @JsonProperty("SOURCE_TYPE")
    private String sourceType;

    @JsonProperty("PO_LINE_NUMBER")
    private Integer poLineNumber;

    @JsonProperty("PO_SHIPMENT_NUMBER")
    private Integer poShipmentNumber;

    @JsonProperty("RECEIPT_DATE")
    private String receiptDate;

    @JsonProperty("BILL_OF_LADING")
    private String billOfLading;

    @JsonProperty("PACKING_SLIP")
    private String packingSlip;

    @JsonProperty("COMMENTS")
    private String comments;

    @JsonProperty("BOE_AMOUNT")
    private String boeAmount;

    @JsonProperty("BOE_PORT_CODE")
    private Integer boePortCode;

    @JsonProperty("PREMISE_GATE_REFERENCE")
    private String premiseGateReference;

    @JsonProperty("OLD_GRN_FOR_RE_OFFER")
    private Integer oldGrnForReOffer;

    @JsonProperty("SUPPLIER_DC_NUMBER")
    private String supplierDcNumber;

    @JsonProperty("STATUS")
    private String status;


}