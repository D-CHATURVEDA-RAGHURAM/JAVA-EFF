package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPRServiceItemsDtoV6 {
    @JsonProperty("SRVPOS")
    public String serviceCode;
    @JsonProperty("EXTROW")
    public String serviceItemId;
    @JsonProperty("MENGE")
    public String servItemQuantity;
    @JsonProperty("MEINS")
    public String servItemUom;
    @JsonProperty("TBTWR")
    public String servItemPrice;
    @JsonProperty("NETWR")
    public String servNetPrice;
    @JsonProperty("KTEXT1")
    public String servDescription2;
    @JsonProperty("USERF1_TXT")
    public String servDescription;
    @JsonProperty("INTROW")
    public String customField1;
    @JsonProperty("MATKL")
    public String materialGroup;
    @JsonProperty("PEINH")
    public String pricePer;
    @JsonProperty("BRTWR")
    public String grossPrice;
}