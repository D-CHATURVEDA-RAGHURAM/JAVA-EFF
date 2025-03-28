package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.V5.ExternalPROdataMetadataDtoV5;
import com.effigo.shared.util.CustomDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPoResponseDtoV2 {

    @JsonProperty("__metadata")
    private ExternalPROdataMetadataDtoV5 metadata;

    @JsonProperty("ZxPoNo")
    private String poId;

    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
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
    @JsonProperty("ZxRfqNo")
    private String rfqNo;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @JsonProperty("ZxRfqDate")
    private String rfqDate;
    @JsonProperty("ZxVendxId")
    private String vendxId;
    @JsonProperty("ZxInitId")
    private String initId;
    @JsonProperty("ZxAppId")
    private String appId;
    @JsonProperty("ZxAutId")
    private String autId;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
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
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @JsonProperty("ZxInsertDt")
    private String insertDate;
    @JsonProperty("ZxInsertTm")
    private String insertTime;
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
    @JsonProperty("Waers")
    private String currency;
    @JsonProperty("HEADITEMN")
    private HeadItems HEADITEMN;
    @JsonProperty("HEADCONDN")
    private HeadCondn HEADCONDN;
}


