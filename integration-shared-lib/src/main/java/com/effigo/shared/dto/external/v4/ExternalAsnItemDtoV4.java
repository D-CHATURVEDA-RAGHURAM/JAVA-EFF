package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalAsnItemDtoV4 {
    @JsonProperty("poItem")
    private String poItem;

    @JsonProperty("destinationType")
    private String destinationType;

    @JsonProperty("itemCode")
    private String itemCode;

    @JsonProperty("itemDesc")
    private String itemDesc;

    @JsonProperty("itemQuantity")
    private BigDecimal  itemQuantity;

    @JsonProperty("dispatchUom")
    private String dispatchUom;

    @JsonProperty("dispatchQuantity")
    private BigDecimal dispatchQuantity;
}
