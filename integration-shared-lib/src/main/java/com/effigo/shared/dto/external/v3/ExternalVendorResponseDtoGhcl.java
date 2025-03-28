package com.effigo.shared.dto.external.v3;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalVendorResponseDtoGhcl {
    @JsonProperty("BOB_APPLICATION_NO")
    private String  bobApplicationNumber ;
    @JsonProperty("VENDOR_NUMBER")
    private String vendorNumber;

}