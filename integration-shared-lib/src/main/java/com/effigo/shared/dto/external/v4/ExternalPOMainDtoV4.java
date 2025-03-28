package com.effigo.shared.dto.external.v4;

import com.effigo.shared.dto.external.v2.ExternalPODelivaryScheduleDtoV2;
import com.effigo.shared.dto.external.v2.ExternalPOItemDtoV2;
import com.effigo.shared.dto.external.v2.ExternalPOItemPriceHistoryDtoV2;
import com.effigo.shared.dto.external.v2.ExternalPoItemServiceDtoV2;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalPOMainDtoV4 {

    @NotBlank(message = "{id.not-null}")
    @NotNull
    @JsonProperty("H_EBELN")
    public String poId;

    @JsonProperty("reqid")
    public String reqId;

    @NotBlank(message = "{vendorId.not-null}")
    @JsonProperty("H_LIFNR")
    public String vendorId;

    @JsonProperty("billingaddressid")
    public String billingAddressId;

    @JsonProperty("deliveryaddress")
    public String deliveryAddress;

    @JsonProperty("vendoraddressid")
    public String vendorAddressId;

    @JsonProperty("H_BSART")
    public String poType;

    @JsonProperty("purchasecenter")
    public String purchaseCenterId;

    @JsonProperty("H_WAERS")
    public String currency;

    @JsonProperty("PLANT")
    public String orgCode;

    @NotNull
    @JsonProperty("H_ERNAM")
    public String createdBy;

    @NotNull
    @JsonProperty("H_AEDAT") // CURRENT DATE
    public String createdDate;

    @JsonProperty("approveddate") // CURRENT DATE
    public String approvedDate;

    @JsonProperty("PO_AMT")
    public String actualPoPrice;

    @JsonProperty("H_ZTERM")
    public String paymentTerm;

    @JsonProperty("H_BSTYP")
    public String poCategory;

    @JsonProperty("H_INCO1")
    public String incoTerms;

    @JsonProperty("H_INCO2")
    public String incoTerms2;

    @JsonProperty("BEDAT")
    public String validityDate;

    @JsonProperty("H_KDATB")
    public String validityStartDate;

    @JsonProperty("H_KDATE")
    public String validityEndDate;

    @JsonProperty("POITEMS")
    public List<ExternalPOItemDtoV4> poItems;


    @JsonProperty("SCHEDULE_ITEM")
    public List<ExternalPODelivaryScheduleDtoV4> schedulePoItems;

    @JsonProperty("AMENDMENT")
    public List<ExternalPOItemPriceHistoryDtoV4> scheduleAmendments;

    @JsonProperty("SERVICE_ITEM")
    public List<ExternalPoItemServiceDtoV4> serviceItems;


}
