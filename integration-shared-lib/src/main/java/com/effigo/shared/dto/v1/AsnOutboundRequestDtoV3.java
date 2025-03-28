package com.effigo.shared.dto.v1;


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
public class AsnOutboundRequestDtoV3 {
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

    @JsonProperty("CONTACT_PERSON")
    private String contactPerson;

    @JsonProperty("TEL_NUMBER")
    private String telNumber;

    @JsonProperty("MODE_OF_SHIPMENT")
    private String modeOfShipment;

    @JsonProperty("LOADING_PORT")
    private String loadingPort;

    @JsonProperty("DISCHARGE_PORT")
    private String dischargePort;

    @JsonProperty("FINAL_DESTINATION")
    private String finalDestination;

    @JsonProperty("BATCH_NUMBER")
    private String batchNumber;

    @JsonProperty("BILL_OF_ENTRY_NO")
    private String billOfEntryNumber;

    @JsonProperty("BILL_OF_ENTRY_DATE")
    private String billOfEntryDate;

    @JsonProperty("PACKING_NO")
    private String packingNo;

    @JsonProperty("PACKING_DATE")
    private String packingDate;

    @JsonProperty("NO_OF_PALLETS")
    private String noOfPallets;

    @JsonProperty("NET_WEIGHT")
    private BigDecimal netWeight;

    @JsonProperty("GROSS_WEIGHT")
    private BigDecimal grossWeight;

    @JsonProperty("IRN_NO")
    private String irrNo;

    @JsonProperty("SHIPMENT_TYPE")
    private String shipmentType;

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

    @JsonProperty("ITEMS")
    private List<AsnItemOutboundRequestDtoV3> items;
}