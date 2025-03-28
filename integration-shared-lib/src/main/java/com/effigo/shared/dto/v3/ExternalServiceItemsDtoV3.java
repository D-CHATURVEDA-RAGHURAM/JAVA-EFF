package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalServiceItemsDtoV3 {

    @JsonProperty("ZEILE")
    private String grnItemId;
    @JsonProperty("ZEBELP")
    private String poItemId;
    @JsonProperty("ZNETPR")
    private String itemPrice;
    @JsonProperty("ZERFMG")
    private String quantity;
    @JsonProperty("ZLFBNR")
    private String serviceNo;
    @JsonProperty("ZLFPOS")
    private String grnServiceNo;
    @JsonProperty("ZPTEXT")
    private String itemCategoryDescription;
    @JsonProperty("ZSGTXT")
    private String itemText;

    @JsonProperty("packageNumber")
    private String packageNumber;

    @JsonProperty("lineNumber")
    private String lineNumber;

    @JsonProperty("extLine")
    private String extLine;

    @JsonProperty("subPackage")
    private String subPackage;

    @JsonProperty("itemCode")
    private String itemCode;

    @JsonProperty("baseUom")
    private String baseUom;

    @JsonProperty("uomIso")
    private String uomIso;

    @JsonProperty("priceUnit")
    private String priceUnit;


    private String grossPrice;

    @JsonProperty("shortText")
    private String shortText;

    @JsonProperty("plantPackage")
    private String plantPackage;

    @JsonProperty("plantLine")
    private String plantLine;

    @JsonProperty("text1")
    private String  text1;

    @JsonProperty("text2")
    private String  text2;

    @JsonProperty("text3")
    private String  text3;

    @JsonProperty("text4")
    private String  text4;

    @JsonProperty("text5")
    private String  text5;
}
