package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @Author Srinivas Kota
 * This is for Thermax.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorTaxDtoV6 {

    @JsonProperty("vendor_code")
    private String vendorCode;

    @JsonProperty("vendor_site_code")
    private String vendorSiteCode;

    @JsonProperty("pan_card")
    private String panCard;

    @JsonProperty("gst_number")
    private String gstNumber;

    @JsonProperty("is_gst_present")
    private String isGstPresent;

    @JsonProperty("gst_exemption_flag")
    private String gstExemptionFlag;



}
