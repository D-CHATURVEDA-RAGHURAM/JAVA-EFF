package com.effigo.shared.dto.internal.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PoTaxDto {

    private String sourcingRequisitionItemId;
    private String chargeCode;
    private String chargeUnit;
    private String chargeDesc;
    private String chargeValue;
    private String precedence;
    private String index;
    private String cusField1;
    private String cusField2;
    private String cusField3;
    private String cusField4;
    private String cusField5;

}
