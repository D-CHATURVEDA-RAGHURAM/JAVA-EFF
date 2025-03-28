package com.effigo.shared.dto.internal.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class InternalLineItemsDtoV7Readable {
    @JsonProperty("PoItem") //EBELP
    private String poItem;

    @JsonProperty("quantity") //LSMNG
    private String quantity;

    @JsonProperty("uom") //LSMEH
    private String uom;
}
