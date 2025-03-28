package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.V5.ExternalPROdataMetadataDtoV5;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceDtoV2 {
    @JsonProperty("__metadata")
    private String metadata = "";

    @JsonProperty("ZxPoNo")
    private String poId="";
    @JsonProperty("ZxPoiNo")
    private String itemNo="";
    @JsonProperty("Kschl")
    private String kschl="";

    @JsonProperty("Banfn")
    private String prId="";
    @JsonProperty("Bnfpo")
    private String prItemId="";

    @JsonProperty("Kbetr")
    private String conditionPrice="";
    @JsonProperty("Waers")
    private String currency="";
    @JsonProperty("Peinh")
    private String unitPrice="";
    @JsonProperty("Meins")
    private String uom="";
}
