package com.effigo.shared.dto.external.v5;

import com.effigo.shared.dto.external.v3.ItemChargeDto;
import com.effigo.shared.dto.external.v3.SapItemChargeDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ExternalSapPoItemDtoThermax {

    @JsonProperty("EBELP")
    private String cusField7;

    @JsonProperty("LOEKZ")
    private String cusField8;

    @JsonProperty("TXZ01")
    private String cusField9;

    @JsonProperty("MATNR")
    private String materialNumber;

    @JsonProperty("WERKS")
    private String plant;

    @JsonProperty("LGORT")
    private String cusField10;

    @JsonProperty("BEDNR")
    private String cusField11;

    @JsonProperty("MATKL")
    private String cusField12;

    @JsonProperty("MENGE")
    private String poQty;

    @JsonProperty("MEINS")
    private String poUom;

    @JsonProperty("NETPR")
    private String netPrice;

    @JsonProperty("PEINH")
    private String priceUnit;

    @JsonProperty("NETWR")
    private String cusField13;

    @JsonProperty("BRTWR")
    private String cusField14;

    @JsonProperty("TAX_CODE")
    private String cusField15;

    @JsonProperty("SGST_PERCENT")
    private String cusField32;

    @JsonProperty("CGST_PERCENT")
    private String cusField17;

    @JsonProperty("IGST_PERCENT")
    private String cusField18;

    @JsonProperty("UGST_PERCENT")
    private String cusField19;

    @JsonProperty("TRANSPORT_COST")
    private String cusField20;

    @JsonProperty("BANFN")
    private String cusField21;

    @JsonProperty("BNFPO")
    private String cusField30;

    @JsonProperty("HSN_SAC_CODE")
    private String cusField23;

    @JsonProperty("COSTCENTRE")
    private String cusField45;

    @JsonProperty("DEL_DATE")
    private String plannedDeliveryDays;

    @JsonIgnore
    private String standardInfoRecInd;

    @JsonProperty("ITEM_CHARGES")
    private List<SapItemChargeDto> itemCharges;

}

