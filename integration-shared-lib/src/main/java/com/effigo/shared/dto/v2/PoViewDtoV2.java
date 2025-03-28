package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoViewDtoV2 {
    @JsonProperty("ZxPoNo")
    private String poId;
    @JsonProperty("ZxPoDate")
    private String createdDate;
    @JsonProperty("Bsart")
    private String poType;
    @JsonProperty("Aedat")
    private String currentDate;
    @JsonProperty("Lifnr")
    private String vendorId;
    @JsonProperty("Ekorg")
    private String businessUnit;
    @JsonProperty("Ekgrp")
    private String purchasingGroup;
    @JsonProperty("Bukrs")
    private String companyId;
    @JsonProperty("Zterm")
    private String paymentTerm;
    @JsonProperty("Wkurs")
    private String wkurs;
    @JsonProperty("Inco1")
    private String  inco1;
    @JsonProperty("Inco2")
    private String inco2;
    @JsonProperty("ZvQuotationNo")
    private String quotationNo;
    @JsonProperty("ZxQcsNo")
    private String qcsNo;
    @JsonProperty("ZxRfqNo")
    private String rfqNo;
    @JsonProperty("ZxRfqDate")
    private String rfqDate;
    @JsonProperty("ZxGqcsNo")
    private String gqcsNo;
    @JsonProperty("ZxGqcsDt")
    private String  gqcsDate;
    @JsonProperty("ZxVendxId")
    private String vendxId;
    @JsonProperty("ZxInitId")
    private String initId;
    @JsonProperty("ZxAppId")
    private String appId;
    @JsonProperty("ZxAutId")
    private String autId;
    @JsonProperty("Bedat")
    private String approvedDate;
    @JsonProperty("Zdist")
    private String dist;
    @JsonProperty("Zstat")
    private String  stat;
    @JsonProperty("ZxPoStatus")
    private String poStatus;
    @JsonProperty("ZxPoText")
    private String poText;
    @JsonProperty("ZxInsertDt")
    private String insertDate;
    @JsonProperty("ZxInsertTm")
    private String insertTime;
    @JsonProperty("CountTemp")
    private String countTemp;
    @JsonProperty("CountHead")
    private String countHead;
    @JsonProperty("ZvHeaderText1")
    private String text1;
    @JsonProperty("ZvHeaderText2")
    private String text2;
    @JsonProperty("ZvHeaderText3")
    private String text3;
    @JsonProperty("ZvHeaderText4")
    private String text4;
    @JsonProperty("ZvHeaderText5")
    private String text5;
    @JsonProperty("ZvHeaderText6")
    private String text6;
    @JsonProperty("ZvHeaderText7")
    private String text7;
    @JsonProperty("ZvHeaderText8")
    private String text8;
    @JsonProperty("ZxPoiNo")
    private String itemNo;
    @JsonProperty("Ebelp")
    private String activityNo;
    @JsonProperty("Knttp")
    private String accAssignCat;
    @JsonProperty("Pstyp")
    private String poItemCat;
    @JsonProperty("Matnr")
    private String materialNo;
    @JsonProperty("Txz01")
    private String description;
    @JsonProperty("Menge")
    private String qty;
    @JsonProperty("Meins")
    private String uom;
    @JsonProperty("Eeind")
    private String deliveryDate;
    @JsonProperty("Netpr")
    private String netAmount;
    @JsonProperty("Peinh")
    private String unitPrice;
    @JsonProperty("Matkl")
    private String materialType;
    @JsonProperty("Werks")
    private String plant;
    @JsonProperty("Lgort")
    private String storageLocation;
    @JsonProperty("Afnam")
    private String requestor;
    @JsonProperty("Banfn")
    private String prId;
    @JsonProperty("Bnfpo")
    private String prItemId;
    @JsonProperty("Uebto")
    private String tolerance;
    @JsonProperty("Mwskz")
    private String taxCode;
    @JsonProperty("Tdid1")
    private String tdId1;
    @JsonProperty("ZxTdtext1")
    private String tdText1;
    @JsonProperty("Tdid2")
    private String tdId2;
    @JsonProperty("ZxTdtext2")
    private String tdText2;
    @JsonProperty("ChargD")
    private String chargd;
    @JsonProperty("Untto")
    private String untto;
    @JsonProperty("Insmk")
    private String insmk;
    @JsonProperty("Bednr")
    private String prTrackingNo;
    @JsonProperty("Sakto")
    private String serviceCode;
    @JsonProperty("Kostl")
    private String costCenter;
    @JsonProperty("Anln1")
    private String anln1;
    @JsonProperty("Anln2")
    private String anln2;
    @JsonProperty("PspPnr")
    private String wbsElement;
    @JsonProperty("ZxTrackNo")
    private String trackNo;
    @JsonProperty("ZxAttemptNo")
    private String attemptNo;
    @JsonProperty("ZvVendorDelRem")
    private String vendorDeliveryRemarks;
    @JsonProperty("ZvFrtVendor")
    private String frightVendor;
    @JsonProperty("CntRefItm")
    private String cntRefItm;
    @JsonProperty("CountItem")
    private String itemCount;
    @JsonProperty("ZvItemText1")
    private String itemText1;
    @JsonProperty("ZvItemText2")
    private String itemText2;
    @JsonProperty("ZvItemText3")
    private String itemText3;
    @JsonProperty("ZvItemText4")
    private String itemText4;
    @JsonProperty("ZvItemText5")
    private String itemText5;
    @JsonProperty("ZvItemText6")
    private String itemText6;
    @JsonProperty("ZvItemText7")
    private String itemText7;
    @JsonProperty("ZvItemText8")
    private String itemText8;
    @JsonProperty("Zverno")
    private String zverNo;
    @JsonProperty("Waers")
    private String currency;
    @JsonProperty("Extrow")
    private String lineNo;
    @JsonProperty("Secsrno")
    private String secSrNo;
    @JsonProperty("Seccode")
    private String secCode;
    @JsonProperty("Secdec")
    private String secDec;
    @JsonProperty("Srvpos")
    private String serviceItemCode;
    @JsonProperty("Ktext1")
    private String serviceDescription;
    @JsonProperty("SerLgtxt")
    private String serviceLongText;
    @JsonProperty("Brtwr")
    private String brtwr;
    @JsonProperty("Smenge")
    private String serviceQty;
    @JsonProperty("Smeins")
    private String serviceUom;
    @JsonProperty("Isqro")
    private String isqro;
    @JsonProperty("Kschl")
    private String kschl;
    @JsonProperty("Kbetr")
    private String conditionPrice;
}
