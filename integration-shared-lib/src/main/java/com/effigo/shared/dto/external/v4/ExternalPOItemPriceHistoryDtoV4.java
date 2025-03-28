package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalPOItemPriceHistoryDtoV4 {

    @JsonProperty("AMD_EBELP")
    private String poItemId;

    @JsonProperty("AMD_EBELN")
    private String poId;

    @JsonProperty("AMD_RATE_OLD")
    private Double oldBasePrice;

    @JsonProperty("AMD_KDATB_OLD")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String oldStartDate;

    @JsonProperty("AMD_KDATE_OLD")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String oldEndDate;

    @JsonProperty("AMD_RATE_NEW")
    private Double newBasePrice;

    @JsonProperty("AMD_KDATB_NEW")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String newStartDate;

    @JsonProperty("AMD_KDATE_NEW")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String newEndDate;

    @JsonProperty("AMD_AMENDNO")
    private String amendNo;

    @JsonProperty("AMD_ERDAT")
    private String amendDate;

    @JsonProperty("AMD_ZTERM_OLD")
    private String paymentTermOld;

    @JsonProperty("AMD_ZTERM_NEW")
    private String paymenterTermNew;

    @JsonProperty("AMD_INCO1_OLD")
    private String incotermOld;

    @JsonProperty("AMD_INCO1_NEW")
    private String incotermNew;

    @JsonProperty("AMD_INCO2_OLD")
    private String incoterm2Old;

    @JsonProperty("AMD_INCO2_NEW")
    private String incoterm2New;


    @JsonProperty("AMD_MENGE_OLD")
    private String uomOld;

    @JsonProperty("AMD_MENGE_NEW")
    private String uomNew;

    @JsonProperty("AMD_UNAME")
    private String createdBy;

    @JsonProperty("AMD_DESCR2")
    private String description2;

    @JsonProperty("AMD_RCODE")
    private String reasonCode;

    @JsonProperty("AMD_ZZCOST")
    private String costCenter;

    @JsonProperty("AMD_LOEKZ")
    public String itemStatus;

}
