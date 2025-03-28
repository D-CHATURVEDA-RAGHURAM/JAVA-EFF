package com.effigo.shared.dto.v1;

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
public class AsnItemOutboundRequestDto {

    @JsonProperty("MATERIAL")
    private String itemCode;

    @JsonProperty("PLANT")
    private String plantCode; //todo

    @JsonProperty(value = "MOVE_TYPE", defaultValue = "102")
    private String moveType;

    @JsonProperty("ENTRY_QNT")
    private String qty;

    @JsonProperty("ENTRY_UOM")
    private String uom;
    	
    @JsonProperty("ENTRY_UOM_ISO")
    private String uomIso;
    

    @JsonProperty("PO_NUMBER")
    private String poNumber; //todo

    @JsonProperty("PO_ITEM")
    private String poItemId;

    @JsonProperty(value = "MVT_IND", defaultValue = "B")
    private String mtvInd;

    @JsonProperty("GR_RCPT")
    private String createdBy; //todo

}
