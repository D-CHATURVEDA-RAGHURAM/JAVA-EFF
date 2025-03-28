package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPOItemTaxV8 {

    @JsonProperty("taxCategoryName")
    private String taxCode;

    @JsonProperty("index")
    private String index;

    @JsonProperty("precedence")
    private String precedence;

    @JsonProperty("hsnCode")
    private String hsnCode;

    @JsonProperty("sacCode")
    private String sacCode;

    @JsonProperty("taxVal")
    private String taxVal;

    @JsonProperty("chargeType")
    private Integer calcType;

    @JsonProperty("calculatedTaxValue")
    private String rowCalcTax;

    @JsonProperty("totalValue")
    private String rowCalcTotal;

}
