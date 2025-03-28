package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderItemPriceHistoryDtoV4 {

    @JsonProperty("poItemId")
    private String poItemId;

    @JsonProperty("poId")
    private String poId;

    @JsonProperty("oldBasePrice")
    private Double oldBasePrice;

    @JsonProperty("oldStartDate")
    private String oldStartDate;

    @JsonProperty("oldEndDate")
    private String oldEndDate;

    @JsonProperty("newBasePrice")
    private Double newBasePrice;

    @JsonProperty("newStartDate")
    private String newStartDate;

    @JsonProperty("newEndDate")
    private String newEndDate;

    @JsonProperty("amendNo")
    private String amendNo;

    @JsonProperty("amendDate")
    private String amendDate;

    @JsonProperty("paymentTermOld")
    private String paymentTermOld;

    @JsonProperty("paymenterTermNew")
    private String paymenterTermNew;

    @JsonProperty("incotermOld")
    private String incotermOld;

    @JsonProperty("incotermNew")
    private String incotermNew;

    @JsonProperty("incoterm2Old")
    private String incoterm2Old;

    @JsonProperty("incoterm2New")
    private String incoterm2New;

    @JsonProperty("itemPriceOld")
    private String itemPriceOld;

    @JsonProperty("priceStartDateOld")
    private String priceStartDateOld;

    @JsonProperty("priceEndDateOld")
    private String priceEndDateOld;

    @JsonProperty("itemPriceNew")
    private String itemPriceNew;

    @JsonProperty("startDateNew")
    private String startDateNew;

    @JsonProperty("endDateOld")
    private String endDateOld;

    @JsonProperty("uomOld")
    private String uomOld;

    @JsonProperty("uomNew")
    private String uomNew;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("reasonCode")
    private String reasonCode;

    @JsonProperty("costCenter")
    private String costCenter;

    @JsonProperty("description2")
    private String description2;

    @JsonProperty("itemStatus")
    public String itemStatus;

}
