package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalAsnItemDto {

    @JsonProperty("effigorefno")
    private String effigoRefNo;

    @JsonProperty("poitemid")
    private String poItemId;

    @JsonProperty("itemcode")
    private String itemCode;

    @JsonProperty("qty")
    private String qty;

    @JsonProperty("uom")
    private String uom;

    @JsonProperty("erpnumber")
    private String erpNumber;

    @JsonProperty("index")
    private String index;
}
