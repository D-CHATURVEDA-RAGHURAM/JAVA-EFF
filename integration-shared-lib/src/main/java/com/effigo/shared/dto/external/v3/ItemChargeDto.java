package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemChargeDto {

    @JsonProperty("charge_code")
    private String chargeCode;

    @JsonProperty("charge_desc")
    private String chargeDesc;

    @JsonProperty("charge_value")
    private String chargeValue;

    @JsonProperty("charge_unit")
    private String chargeUnit;

    @JsonProperty("precedence")
    private String precedence;

    @JsonProperty("index")
    private String index;
}
