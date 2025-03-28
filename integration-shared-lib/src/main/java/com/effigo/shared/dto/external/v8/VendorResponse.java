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
public class VendorResponse {
   @JsonProperty("vendorId")
   private String vendorId;
   @JsonProperty("erpId")
   private String erpId;
   @JsonProperty("addressId")
   private String addressId;
   @JsonProperty("buId")
   private String buId;
   @JsonProperty("status")
   private String status;
   @JsonProperty("erpType")
   private String erpType;
   @JsonProperty("type")
   private String type;
   @JsonProperty("businessId")
   private String businessId;
}





