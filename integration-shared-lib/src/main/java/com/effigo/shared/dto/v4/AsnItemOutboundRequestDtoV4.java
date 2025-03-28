package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AsnItemOutboundRequestDtoV4 {
    @JsonProperty("PO_ITEM")
    private String poItem;

    @JsonProperty("DESTINATION_TYPE")
    private String customField1;

    @JsonProperty("ITEM_CODE")
    private String itemCode;

    @JsonProperty("ITEM_DESC")
    private String itemDesc;

    @JsonProperty("DISPATCH_UOM")
    private String dispatchUom;

    @JsonProperty("DISPATCH_QUANTITY")
    private BigDecimal dispatchQuantity;
}
