package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AsnItemOutboundRequestDtoV3 {
    @JsonProperty("PO_ITEM")
    private String poItem;

    @JsonProperty("ITEM_CODE")
    private String itemCode;

    @JsonProperty("ITEM_DESC")
    private String itemDesc;

    @JsonProperty("ITEM_QUANTITY")
    private BigDecimal itemQuantity;

    @JsonProperty("UOM")
    private String uom;

    @JsonProperty("DISPTACH_UOM")
    private String dispatchUom;

    @JsonProperty("DISPTACH_QUANTITY")
    private BigDecimal  dispatchQuantity;
}
