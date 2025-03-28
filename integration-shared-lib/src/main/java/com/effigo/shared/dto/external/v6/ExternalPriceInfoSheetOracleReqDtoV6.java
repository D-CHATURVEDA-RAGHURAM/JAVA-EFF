package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetOracleReqDtoV6 {

    @JsonProperty("NFA Number")
    private String priceUnit1;

    @JsonProperty("URL")
    private String orderPriceUnit1;

    @JsonProperty("org_id")
    private String plant;

    @JsonProperty("document_type_code")
    private String salesCode;

    @JsonProperty("currency_code")
    private String currency;

    @JsonProperty("agent_name")
    private String cusField3;

    @JsonProperty("vendor_name")
        private String cusField2;

    @JsonProperty("vendor_site_code")
    private String vendorAccNumber;

    @JsonProperty("ship_to_location")
    private String cusField4;

    @JsonProperty("bill_to_location")
    private String cusField8;

    @JsonProperty("payment_terms")
    private String cusField5;

    @JsonProperty("approved_date")
    private String cusField6;

    @JsonProperty("revision_num")
    private String cusField17;

    @JsonProperty("creation_date")
    private String cusField18;

    @JsonProperty("freight_terms")
    private String incoTerms1;

    @JsonProperty("fob")
    private String incoTermsLoc;

    @JsonProperty("status")
    private String cusField19;

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

    @JsonProperty("lines")
    private List<PurchaseOrderLineDto> lines;
}

