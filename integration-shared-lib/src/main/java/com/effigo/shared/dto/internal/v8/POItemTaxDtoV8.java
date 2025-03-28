package com.effigo.shared.dto.internal.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class POItemTaxDtoV8 {

    @JsonProperty("taxCategoryName")
    private String taxCode;

    @JsonProperty("index")
    private String index;

    @JsonProperty("precedence")
    private String precedence;

    @JsonProperty("hsnCode")
    private Integer hsnCode;

    @JsonProperty("sacCode")
    private String sacCode;

    @JsonProperty("compType")
    private String compType;

    @JsonProperty("taxVal")
    private String taxVal;

    @JsonProperty("chargeType")
    private Integer calcType;

    @JsonProperty("calculatedTaxValue")
    private String rowCalcTax;

    @JsonProperty("totalValue")
    private String rowCalcTotal;

}
