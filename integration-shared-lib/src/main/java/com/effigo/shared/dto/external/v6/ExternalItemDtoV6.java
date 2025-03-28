package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalItemDtoV6 {

    @JsonProperty("Matnr")
    private String code;
    @JsonProperty("Maktx")
    public String name;
    @JsonProperty("Meins")
    private String uom;
    @JsonProperty("Wgbez")
    public String categoryid;
    @JsonProperty("Wgbez60")
    private String subCategory;
    @JsonProperty("Werks")
    private String plantcode;
    @JsonProperty("Ekgrp")
    private String purchaseGroup;
    @JsonProperty("LongText")
    private String description;
    private String type;

    @JsonProperty("MMSTA")
    private String plantstatus;
    @JsonProperty("STEUC")
    private String hsncode;
    @JsonProperty("MHDRZ")
    public String quality;
    @JsonProperty("LVORM")
    public String status;
    @JsonProperty("ASNUM")
    private String code2;
    @JsonProperty("ASKTX")
    private String name2;
    @JsonProperty("TAXTARIFFCODE")
    private String hsncode2;

    @JsonProperty("cusField1")
    private String cusField1;

    @JsonProperty("cusField2")
    private String cusField2;

    @JsonProperty("cusField3")
    private String cusField3;

    @JsonProperty("cusField4")
    private String cusField4;

    @JsonProperty("cusField5")
    private String cusField5;

    @JsonProperty("cusField6")
    private String cusField6;

    @JsonProperty("cusField7")
    private String cusField7;

    @JsonProperty("cusField8")
    private String cusField8;

    @JsonProperty("cusField9")
    private String cusField9;

    @JsonProperty("cusField10")
    private String cusField10;

}