package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PurchaseOrderTaxesDto {
    @JsonProperty("tax_category_name")
    private String cusField15;

    @JsonProperty("tax_category_group")
    private String currencyKey;

    @JsonProperty("index")
    private String index;

    @JsonProperty("precedence")
    private String precedence;

    @JsonProperty("intended_use")
    private String purchaseOrg;

    @JsonProperty("hsn_code")
    private String grInvoiceInd;

    @JsonProperty("sac_code")
    private String cusField17;
}
