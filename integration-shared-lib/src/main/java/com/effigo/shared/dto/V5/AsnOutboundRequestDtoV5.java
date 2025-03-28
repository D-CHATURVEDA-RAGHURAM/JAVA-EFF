package com.effigo.shared.dto.V5;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnOutboundRequestDtoV5 {

    @JsonProperty("REFDOC")
    private String effigoAsnNo;

    @JsonProperty("EBELN")
    private String poNumber;

    @JsonProperty("EWAYBILLNO")
    private String ewaybillNo;

    @JsonProperty("EWAYBILLDATE")
    private String ewaybillDate;

    @JsonProperty("TRANS_NAME")
    private String transporterName;

    @JsonProperty("VEHNO")
    private String vehicleNo;

    @JsonProperty("PLANT")
    private String plant;

    @JsonProperty("LGORT")
    private String storageLocation;

    @JsonProperty("LIFNR")
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

    @JsonProperty("LRNUM")
    private String lrNo;

    @JsonProperty("ZEINVC")
    private String eInvoice;

    @JsonProperty("GRUND")
    private String cancelReason;

    @JsonProperty("ITEMS")
    private List<AsnItemOutboundRequestDtoV5> items;
}