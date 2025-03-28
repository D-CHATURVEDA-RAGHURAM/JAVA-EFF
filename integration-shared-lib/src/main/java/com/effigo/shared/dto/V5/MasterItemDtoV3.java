package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterItemDtoV3 {

    @JsonProperty("id")
    private String itemId;

    @JsonProperty("type")
    private String type;
    @JsonProperty("categoryid")
    private String categoryId;

    private String l3CategoryId;

    @JsonProperty("subcategory")
    private String subcategory;

    private String plantcode;
    private String plantstatus;
    @JsonProperty("code")
    private String itemCode;

    @JsonProperty("name")
    private String itemName;

    @JsonProperty("status")
    private int status;

    private String createdBy;

    private String createdDate;

    private String updatedDate;

    @JsonProperty("glcode")
    private String glCode;

    @JsonProperty("hsnslno")
    private String hsnCode;

    @JsonProperty("quality")
    private int quality;

    @JsonProperty("description")
    private String description;

    @JsonProperty("qualityassurance")
    private boolean qualityAssurance;

    @JsonProperty("estimatedPrice")
    private BigDecimal estimatedPrice;

    @JsonProperty("marketPrice")
    private BigDecimal marketPrice;

    @JsonProperty("uom")
    private String uom;

    @JsonProperty("itemCategoryId")
    private String itemCategoryId;

    @JsonProperty("itemSubCategoryId")
    private String itemSubCategoryId;

    @JsonProperty("mastersType")
    private int mastersType;

    @JsonProperty("genericMasters")
    private int genericMasters;


    @JsonProperty("leadBuyerId")
    private String leadBuyerId;

    @JsonProperty("itemCategoryName")
    private String itemCategoryName;

    @JsonProperty("subCategoryName")
    private String subCategoryName;

    @JsonProperty("clientId")
    private String clientId;

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

    @JsonProperty("Attributes")
    private List<ExternalAttributeDtoV5> masterItemAttributeEntity;

    @JsonProperty("partition_group")
    private String partitionGroup;
    @JsonProperty("recordid")
    private String recordId;
}
