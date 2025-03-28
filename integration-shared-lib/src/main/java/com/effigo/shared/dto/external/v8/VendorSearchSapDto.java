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
public class VendorSearchSapDto {
   @JsonProperty("company_name")
   private String companyName;
   @JsonProperty("gst")
   private String gst;
   @JsonProperty("pan_no")
   private String panNo;
   @JsonProperty("org_id")
   private String orgId;
}