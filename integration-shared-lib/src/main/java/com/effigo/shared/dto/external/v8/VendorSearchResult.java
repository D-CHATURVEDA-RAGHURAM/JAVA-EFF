package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorSearchResult {
    @JsonProperty("company_name")
    public String companyName;
    @JsonProperty("gst")
    public String gst;
    @JsonProperty("pan_no")
    public String panNo;
    @JsonProperty("org_id")
    public String orgId;
    @JsonProperty("site_id")
    public String siteId;
    @JsonProperty("site_name")
    public String  siteName;
    @JsonProperty("status")
    public String status;
    @JsonProperty("vendor_code")
    public String vendorCode;
}
