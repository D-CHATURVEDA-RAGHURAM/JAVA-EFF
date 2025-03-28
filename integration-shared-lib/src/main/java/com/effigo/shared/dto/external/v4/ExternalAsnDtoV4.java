package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalAsnDtoV4 {

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

    @JsonProperty("plant")
    private String plant;

    @JsonProperty("vendor")
    private String vendor;

    @JsonProperty("vehicleNumber")
    private String vehicleNumber;

    @JsonProperty("billOfEntryNumber")
    private String billOfEntryNo;

    @JsonProperty("boePortCode")
    private String boePortCode;

    @JsonProperty("transactionType")
    private String transactionType;

    @JsonProperty("premiseGateReference")
    private String premiseGateReference;

    @JsonProperty("supplierDcNumber")
    private String supplierDcNumber;

    @JsonProperty("modeOfShipment")
    private String modeOfShipment;

    @JsonProperty("packingSlip")
    private String packingSlip;

    @JsonProperty("billOfLading")
    private String billOfLading;

    @JsonProperty("receiptDate")
    private String receiptDate;

    @JsonProperty("eInvoice")
    private String eInvoice;

    @JsonProperty("oldGrnForReOffer")
    private String oldGrnForReOffer;

    @JsonProperty("batchNumber")
    private String batchNumber;

    @JsonProperty("comments")
    private String comments;

    @JsonProperty("billOfEntryDate")
    private String billOfEntryDate;

    @JsonProperty("storageLocation")
    private String storageLocation;

    @JsonProperty("irrNo")
    private String irrNo;

    @JsonProperty("amount")
    private Integer amount;

    @JsonProperty("invNumber")
    private String invNumber;

    @JsonProperty("invDate")
    private String invDate;

    @JsonProperty("lrNo")
    private String lrNo;

    @JsonProperty("status")
    private String status;

    @JsonProperty("items")
    private List<ExternalAsnItemDtoV4> items;
}