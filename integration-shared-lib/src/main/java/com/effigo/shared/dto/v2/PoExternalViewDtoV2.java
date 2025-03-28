package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PoExternalViewDtoV2 {
    @JsonProperty("ZxPoNo")
    private String cusField24= "";
    @JsonProperty("ZxPoDate")
    private String cusField14= "";
    @JsonProperty("Bsart")
    private String cusField33= "";
    @JsonProperty("Aedat")
    private String validityStartDate= "";
    @JsonProperty("Lifnr")
    private String vendorAccNumber= "";
    @JsonProperty("Ekorg")
    private String purchaseOrg= "";
    @JsonProperty("Ekgrp")
    private String purchaseGrp= "";
    @JsonProperty("Bukrs")
    private String plant= "";
    @JsonProperty("Zterm")
    private String cusField34= "";
    @JsonProperty("Waers")
    private String currency= "";
    @JsonProperty("Wkurs")
    private String wkurs = "1";
    @JsonProperty("Inco1")
    private String  incoTerms1= "";
    @JsonProperty("Inco2")
    private String incoTermsLoc= "";
    @JsonProperty("ZxRfqNo")
    private String cusField11= "";
    @JsonProperty("ZxRfqDate")
    private String rfqDate= ""; // cusField14
    @JsonProperty("ZxVendxId")
    private String vendxId= ""; //999
    @JsonProperty("ZxInitId")
    private String initId= "";//999
    @JsonProperty("ZxAppId")
    private String appId= "";//999
    @JsonProperty("ZxAutId")
    private String autId= "";//999
    @JsonProperty("Bedat")
    private String approvedDate; //cusField14
    @JsonProperty("Zdist")
    private String dist= "";
    @JsonProperty("Zstat")
    private String  stat= "";
    @JsonProperty("ZxPoStatus")
    private String poStatus= "";//6CRT
    @JsonProperty("ZxPoText")
    private String cusField27= "";
    @JsonProperty("ZxInsertDt")
    private String insertDate= "";
    @JsonProperty("ZxInsertTm")
    private String insertTime;
    @JsonProperty("ZvHeaderText1")
    private String text1= "";
    @JsonProperty("ZvHeaderText2")
    private String text2= "";
    @JsonProperty("ZvHeaderText3")
    private String text3= "";
    @JsonProperty("ZvHeaderText4")
    private String text4= "";
    @JsonProperty("ZvHeaderText5")
    private String text5= "";
    @JsonProperty("ZvHeaderText6")
    private String text6= "";
    @JsonProperty("ZvHeaderText7")
    private String text7= "";
    @JsonProperty("ZvHeaderText8")
    private String text8= "";
    @JsonProperty("HEADITEMN")
    private List<PoItemsV2> headerItem = new ArrayList<>();
    @JsonProperty("HEADCONDN")
    private List<PriceDtoV2> headerPrice = new ArrayList<>();
}
