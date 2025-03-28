package com.effigo.shared.dto.external.v3;

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
public class  ExternalAsnDtoV3 {
    @JsonProperty("dispatchNotificationId")
    private String dispatchNotificationId;
    @JsonProperty("poNumber")
    private String poNumber;

    @JsonProperty("ewaybillNo")
    private String ewaybillNo;

    @JsonProperty("ewaybillDate")
    private String ewaybillDate;

    @JsonProperty("transporterName")
    private String transporterName;

    @JsonProperty("vehicleNumber")
    private String vehicleNo;

    @JsonProperty("plant")
    private String plant;

    @JsonProperty("storageLocation")
    private String storageLocation;

    @JsonProperty("vendor")
    private String vendor;

    @JsonProperty("contactPerson")
    private String contactPerson;

    @JsonProperty("telNumber")
    private String telNumber;

    @JsonProperty("modeOfShipment")
    private String modeOfShipment;

    @JsonProperty("loadingPort")
    private String loadingPort;

    @JsonProperty("dischargePort")
    private String dischargePort;

    @JsonProperty("finalDestination")
    private String finalDestination;

    @JsonProperty("batchNumber")
    private String batchNumber;

    @JsonProperty("billOfEntryNo")
    private String billOfEntryNumber;

    @JsonProperty("billOfEntryDate")
    private String billOfEntryDate;

    @JsonProperty("packingNo")
    private String packingNo;

    @JsonProperty("packingDate")
    private String packingDate;

    @JsonProperty("noOfPallets")
    private String noOfPallets;

    @JsonProperty("netWeight")
    private BigDecimal netWeight;

    @JsonProperty("grossWeight")
    private BigDecimal grossWeight;

    @JsonProperty("irrNo")
    private String irrNo;

    @JsonProperty("shipmentType")
    private String shipmentType;

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("invNumber")
    private String invNumber;

    @JsonProperty("invDate")
    private String invDate;

    @JsonProperty("lrNo")
    private String lrNo;

    @JsonProperty("eInvoice")
    private String eInvoice;

    @JsonProperty("status")
    private String status;

    @JsonProperty("erp_flag")
    private String erpFlag;

    @JsonProperty("custom_field_1") //boe_port_code - thmx
    private String customField1;

    @JsonProperty("custom_field_2") //transaction_type - thmx
    private String customField2;

    @JsonProperty("custom_field_3") //premise_gate_reference - thmx
    private String customField3;

    @JsonProperty("custom_field_4") //supplier_dc_number - thmx
    private String customField4;

    @JsonProperty("custom_field_5") //packing_slip - thmx
    private String customField5;

    @JsonProperty("custom_field_6") //bill_of_lading - thmx
    private String customField6;

    @JsonProperty("custom_field_7") //old_grn_for_re_offer - thmx
    private String customField7;

    @JsonProperty("custom_field_8") //receipt_date - thmx
    private String customField8;

    @JsonProperty("custom_field_9") //comments - thmx
    private String customField9;

    @JsonProperty("custom_field_10") //operating_unit - thmx
    private String customField10;

    @JsonProperty("custom_field_11") //total_weight - thmx
    private String customField11;

    @JsonProperty("items")
    private List<ExternalAsnItemDtoV3> items;
}