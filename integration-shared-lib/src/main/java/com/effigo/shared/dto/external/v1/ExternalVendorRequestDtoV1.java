package com.effigo.shared.dto.external.v1;

import java.util.List;

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
public class ExternalVendorRequestDtoV1 {
	@JsonProperty("serialnumber")
    private String serialNumber;

    @JsonProperty("submcode")
    private String submCode;

    @JsonProperty("mname")
    private String mname;

    @JsonProperty("companies")
    private String companies;

    @JsonProperty("primaryroletype")
    private String primaryRoleType;

    @JsonProperty("roletypes")
    private String roleTypes;

    @JsonProperty("MorAddress")
    private List<ExternalAddressDtoV1> morAddress;
    
    @JsonProperty("Taxdetails")
    private List<ExternalTaxDetailsDtoV1> taxDetails;
    @JsonProperty("MorContact")
    private List<ExternalContactDto> contactDetails;
    
}
