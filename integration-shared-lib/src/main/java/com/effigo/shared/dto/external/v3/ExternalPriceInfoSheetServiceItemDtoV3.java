package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetServiceItemDtoV3 {

    @JsonProperty("EBELP")
    private String cusField40;

    @JsonProperty("EXTROW")
    private String cusField24;

    @JsonProperty("DEL")
    private String cusField25;

    @JsonProperty("SRVPOS")
    private String materialNumber;

    @JsonProperty("KTEXT1")
    private String cusField9;

    @JsonProperty("INTROW")
    private String cusField35;

    @JsonProperty("MENGE")
    private String poQty;

    @JsonProperty("MEINS")
    private String poUom;

    @JsonProperty("PEINH")
    private String priceUnit;

    @JsonProperty("BRTWR")
    private String cusField38;

    @JsonProperty("NETWR")
    private String cusField13;



}

