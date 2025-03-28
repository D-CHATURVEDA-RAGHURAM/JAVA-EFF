package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalAsnItemDtoV3 {
    @JsonProperty("poItem")
    private String poItem;

    @JsonProperty("itemCode")
    private String itemCode;

    @JsonProperty("itemDesc")
    private String itemDesc;

    @JsonProperty("itemQuantity")
    private BigDecimal itemQuantity;

    @JsonProperty("uom")
    private String uom;

    @JsonProperty("dispatchUom")
    private String dispatchUom;

    @JsonProperty("dispatchQuantity")
    private BigDecimal dispatchQuantity;

    @JsonProperty("customField1")
    private String customField1;
}
