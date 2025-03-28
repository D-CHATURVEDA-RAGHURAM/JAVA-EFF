package com.effigo.shared.dto.V5;

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
public class AsnItemOutboundRequestDtoV5 {

    @JsonProperty("EBELP")
    private String poItem;

    @JsonProperty("MATNR")
    private String itemCode;

    @JsonProperty("MAKTX")
    private String itemDesc;

    @JsonProperty("MENGE")
    private BigDecimal itemQuantity;

    @JsonProperty("MEINS")
    private String uom;

    @JsonProperty("DISPTACH_UOM")
    private String dispatchUom;

    @JsonProperty("DISPTACH_QUANTITY")
    private BigDecimal  dispatchQuantity;
}
