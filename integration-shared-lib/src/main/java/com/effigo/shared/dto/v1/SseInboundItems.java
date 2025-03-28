package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SseInboundItems {
    private String grnItemId;
    private String poItemId;
    private String quantity;
    private String serviceNo;
    private String grnServiceNo;
    private String itemCategoryDescription;
    private String itemText;
    private String packageNumber;
    private String lineNumber;
    private String extLine;
    private String subPackage;
    private String itemCode;
    private String baseUom;
    private String uomIso;
    private Integer index;

    @JsonProperty("priceUnit")
    private String priceUnit;

    private String grossPrice;

    @JsonProperty("itemPrice")
    private String itemPrice;

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
