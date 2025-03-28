package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalAddressDtoV1 {
    @JsonProperty("serialnumber")
    private String serialNumber;
    
    @JsonProperty("detserialnumber")
    private String detserialnumber;
    
    @JsonProperty("mcode")
    private String mcode;
    
    @JsonProperty("addresstype")
    private String addresstype;
    
    @JsonProperty("address1")
    private String address1;
    
    @JsonProperty("address2")
    private String address2;
    
    @JsonProperty("address3")
    private String address3;
    
    @JsonProperty("address4")
    private String address4;
    
    @JsonProperty("city")
    private String city;
    
    @JsonProperty("district")
    private String district;
    
    @JsonProperty("statecode")
    private String statecode;
    
    @JsonProperty("countrycode")
    private String countrycode;
    
    @JsonProperty("postalcode")
    private String postalcode;
    
    @JsonProperty("mobileno")
    private String mobileno;
    
    @JsonProperty("emailid")
    private String emailid;
}




