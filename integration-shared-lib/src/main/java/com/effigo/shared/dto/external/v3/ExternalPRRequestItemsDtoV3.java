package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonIgnoreProperties(
        ignoreUnknown = true
)

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPRRequestItemsDtoV3 {
    @JsonProperty("itemNo")
    public String requisitionItemId;
    
    @JsonProperty("itemCode")
    public String itemId;

    public String itemName;

    public String itemDescription;

    public String itemQuantity;

    public String itemUom;

    public String itemPrice;

    public String internalOrderNumber;

    public String itemText;

    public String pricePerUnit;

    public String approvedDate;

    public String itemTotalPrice;

    public String currency;

    public String assetNumber;
    public String closed;

    public String itemStatus;

    public String createdBy;

    public String createdDate;

    public String manufacturePartNumber;

    public String manufactureNumber;

    public String orderUnit;

    public Integer itemType;

    //public List<ExternalPRServiceItemsDtoV2> serviceItems;
}
