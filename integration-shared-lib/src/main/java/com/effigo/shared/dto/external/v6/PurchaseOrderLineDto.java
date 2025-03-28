package com.effigo.shared.dto.external.v6;

import com.effigo.shared.dto.external.v3.ItemChargeDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PurchaseOrderLineDto {
    @JsonProperty("line_num")
    private String cusField24;

    @JsonProperty("shipment_num")
    private String cusField7;

    @JsonProperty("requisition_line_id")
    private String cusField27;

    @JsonProperty("line_type")
    private String longText;

    @JsonProperty("item")
    private String materialNumber;

    @JsonProperty("category")
    private String cusField12;

    @JsonProperty("item_description")
    private String cusField33;

    @JsonProperty("uom_code")
    private String poUom;

    @JsonProperty("quantity")
    private String poQty;

    @JsonProperty("unit_price")
    private String cusField38;

    @JsonProperty("ship_to_organization_code")
    private String cusField1;

    @JsonProperty("ship_to_location")
    private String cusField4;

    @JsonProperty("need_by_date")
    private String plannedDeliveryDays;

    @JsonProperty("promised_date")
    private String promisedDate;

    @JsonProperty("attribute_category")
    private String attributeCategory;

    @JsonProperty("attribute1")
    private String attribute1;

    @JsonProperty("attribute2")
    private String attribute2;

    @JsonProperty("attribute3")
    private String attribute3;

    @JsonProperty("attribute4")
    private String attribute4;

    @JsonProperty("attribute5")
    private String attribute5;

    @JsonProperty("attribute6")
    private String attribute6;

    @JsonProperty("attribute7")
    private String attribute7;

    @JsonProperty("attribute8")
    private String attribute8;

    @JsonProperty("attribute9")
    private String attribute9;

    @JsonProperty("attribute10")
    private String attribute10;

    @JsonProperty("attribute11")
    private String attribute11;

    @JsonProperty("attribute12")
    private String attribute12;

    @JsonProperty("attribute13")
    private String attribute13;

    @JsonProperty("attribute14")
    private String attribute14;

    @JsonProperty("attribute15")
    private String attribute15;

    @JsonProperty("line_locations")
    private PurchaseOrderLineLocationDto lineLocations;

    @JsonProperty("taxes")
    private PurchaseOrderTaxesDto taxes;

    @JsonIgnore
    private String standardInfoRecInd;

    @JsonProperty("item_charges")
    private List<ItemChargeDto> itemCharges;
}
