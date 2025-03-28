package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoItemServiceDtoV4 {

    @JsonProperty("poId")
    private String poId;
    @JsonProperty("poItemNumber")
    private String poItemNumber;
    @JsonProperty("serviceItemNumber")
    private String poItmId;
    @JsonProperty("packNumber")
    private String packNumber;
    @JsonProperty("qty")
    private String qty;
    @JsonProperty("uom")
    private String uom;
    @JsonProperty("itempriceper")
    private String uomQuantity; //uomQty
    @JsonProperty("price")
    private String price;
    @JsonProperty("status")
    private Integer itemStatus;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description2")
    private String description2;

    @JsonProperty("packNumber1")
    private String packNumber1;
    @JsonProperty("lineNumber")
    private String lineNumber;

    @JsonProperty("itemCode")
    private String itemCode;
    @JsonProperty("subPackage")
    private String subPackage;
    @JsonProperty("plnPackageNUmber")
    private String plnPackageNUmber; //default i
    @JsonProperty("plnIntro")
    private String plnIntro; // default 1
    @JsonProperty("packageNumber")
    private String packageNumber;
    @JsonProperty("shortText")
    private String shortText;

}
