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
public class ExternalPOItemOtherChargesV8 {

    @JsonProperty("chargeCode")
    private String taxCode;

    @JsonProperty("chargeValue")
    private String taxVal;

    @JsonProperty("calculatedTaxValue")
    private String rowCalcTax;

    @JsonProperty("totalValue")
    private String rowCalcTotal;

    @JsonProperty("chargeUnit")
    private String compType;

    @JsonProperty("chargeType")
    private String calcType;

    @JsonProperty("precedence")
    private String precedence;

    @JsonProperty("index")
    private Integer index;
}
