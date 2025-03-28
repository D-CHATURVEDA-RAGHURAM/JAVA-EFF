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
public class ExternalTaxDetailsDtoV1 {
    @JsonProperty("serialnumber")
    private String serialnumber;
    
    @JsonProperty("partytype")
    private String partytype;
    
    @JsonProperty("gstregtype")
    private String gstregtype;
    
    @JsonProperty("stateslno")
    private String stateslno;
    
    @JsonProperty("fromdate")
    private String fromdate;
    
    @JsonProperty("isreg")
    private String isreg;
    
    @JsonProperty("taxsch")
    private String taxsch;
    
    @JsonProperty("panno")
    private String panno;
    
    @JsonProperty("tanno")
    private String tanno;
    
    @JsonProperty("tinno")
    private String tinno;
    
    @JsonProperty("proid")
    private String proid;
    
    @JsonProperty("gstin")
    private String gstin;
    
    @JsonProperty("regdate")
    private String regdate;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("address3")
    private String address3;
    @JsonProperty("city")
    private String city;
    @JsonProperty("pin")
    private String pin;

}




