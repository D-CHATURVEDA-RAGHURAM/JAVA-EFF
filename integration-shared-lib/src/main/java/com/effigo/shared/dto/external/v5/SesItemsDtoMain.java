package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SesItemsDtoMain {
    @JsonProperty("PCKG_NO")
    private String pckgNo;

    @JsonProperty("LINE_NO")
    private String lineNo;

    @JsonProperty("EXT_LINE")
    private String extLine;

    @JsonProperty("OUTL_IND")
    private String outlInd;

    @JsonProperty("SUBPCKG_NO")
    private String subpckgNo;

    @JsonProperty("SERVICE")
    private String service;

    @JsonProperty("QUANTITY")
    private String quantity;

    @JsonProperty("BASE_UOM")
    private String baseUom;

    @JsonProperty("UOM_ISO")
    private String uomIso;

    @JsonProperty("PRICE_UNIT")
    private String priceUnit;

    @JsonProperty("GR_PRICE")
    private String grPrice;

    @JsonProperty("CURRENCY")
    private String currency;

    @JsonProperty("SHORT_TEXT")
    private String shortText;

    @JsonProperty("PLN_PCKG")
    private String plnPckg;

    @JsonProperty("PLN_LINE")
    private String plnLine;

    @JsonProperty("NET_PRICE")
    private String netPrice;
}
