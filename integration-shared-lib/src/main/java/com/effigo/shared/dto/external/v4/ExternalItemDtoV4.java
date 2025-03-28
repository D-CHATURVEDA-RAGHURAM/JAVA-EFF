package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalItemDtoV4 {

    @JsonProperty("MATNR")
    private String code;

    @JsonProperty("MAKTX")
    public String name;

    @JsonProperty("MEINS")
    private String uom;

    @JsonProperty("MATKL")
    public String categoryid;

    @JsonProperty("WGBEZ60")
    private String subCategory;

    @JsonProperty("WERKS")
    private String plantcode;

    @JsonProperty("MMSTA")
    private String plantstatus;

    @JsonProperty("STEUC")
    private String hsncode;

    @JsonProperty("MHDRZ")
    public String quality;

    @JsonProperty("LVORM")
    public String status;

    @JsonProperty("DESCRIPTION")
    private String description;

    private String type;
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

    @JsonProperty("WGBEZ")
    private String cusField8;

    @JsonProperty("cusField9")
    private String cusField9;

    @JsonProperty("cusField10")
    private String cusField10;
}