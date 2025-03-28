package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SapItemChargeDto {

    @JsonProperty("CHARGE_CODE")
    private String chargeCode;

    @JsonProperty("CHARGE_DESC")
    private String chargeDesc;

    @JsonProperty("CHARGE_VALUE")
    private String chargeValue;

    @JsonProperty("CHARGE_UNIT")
    private String chargeUnit;

    @JsonProperty("precedence")
    private String precedence;

    @JsonProperty("index")
    private String index;
}
