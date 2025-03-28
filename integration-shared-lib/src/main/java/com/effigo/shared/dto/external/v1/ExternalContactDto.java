package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalContactDto {

    @JsonProperty("serialnumber")
    private String serialNumber;
     @JsonProperty("detserialnumber")
     private String detSerialNumber;
    @JsonProperty("mcode")
    private String mCode;
    @JsonProperty("contactname")
    private String contactName;
    @JsonProperty("contactdesignation")
    private String contactDesignation;
    @JsonProperty("phone")
    private String phoneNumber;
    @JsonProperty("mobile")
    private String mobileNumber;
    @JsonProperty("email")
    private String email;
}
