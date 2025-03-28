package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalItemDtoV5 {
    @JsonProperty("matid")
    private String matid;
    @JsonProperty("matcode")
    private String code;
    @JsonProperty("matdesc")
    public String name;
    @JsonProperty("buom")
    private String uom;
    @JsonProperty("cat")
    public String categoryid;
    @JsonProperty("subcat")
    private String subCategory;
    @JsonProperty("istatus")
    private String status;
    @JsonProperty("status")
    private String plantStatus;
    @JsonProperty("buid")
    private String plantcode;
    private String description;
    private String type;
    @JsonProperty("l3cat")
    private String l3cat;
    @JsonProperty("hsn")
    private String hsncode;
    private String code2;
    private String name2;
    private String hsncode2;
    @JsonProperty("inspec")
    public  String quality;
    @JsonProperty("custom1")
    private String cusField1;
    @JsonProperty("ouom")
    private String cusField2;
    @JsonProperty("buyer")
    private String cusField3;
    @JsonProperty("supplier")
    private String cusField4;
    private String cusField5;
    private String cusField6;
    private String cusField7;
    private String cusField8;
    private String cusField9;
    private String cusField10;
    @JsonProperty("minlife")
    private String minLife;
    @JsonProperty("totlife")
    private String totLife;
    @JsonProperty("toleranceactioncode")
    private String toleranceActionCode;
    @JsonProperty("tolerancepercentage")
    private String tolerancePercentage;
    @JsonProperty("crossreferencetype")
    private String crossReferenceType;
    @JsonProperty("crossreference")
    private String crossReference;
    @JsonProperty("crossreferencedesc")
    private String crossReferenceDesc;
    private List<ExternalAttributeDtoV5> attr;
    @JsonProperty("erptype")
    private String erpType;
    @JsonProperty("recordid")
    private String recordId;
}