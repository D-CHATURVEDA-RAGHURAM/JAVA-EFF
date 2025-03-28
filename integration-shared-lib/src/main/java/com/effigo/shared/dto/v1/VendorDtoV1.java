package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendorDtoV1 {
	private String vendorId; // TO DO: Get readable format (Prudhvi will share the logic) 
	private String companyName;
	private String companyType;
	private String registeredCountry;
	private String registrationNo;
	private String tanNo;
	private String panNo;
	private String category; // TO DO: Get readable format (Prudhvi will share the logic)
	private String website;
	private String companyEmail; 
	private String phoneNo;
	private String faxNo;
	private Integer isGSTRegistered;
	private String fssaiNo;
	private String tinNo;
	private String establishmentDate;
	private String msmeRegistrationNumber;
	private String paymentTerm;
	private String paymentTermDesc;
	private String incoTerm1;
	private String incoTermDesc;
	private String currency;
	private String countryName;
	
	private PersonDtoV1 contact; // master_user
	private AddressDtoV1 registeredAddress;
	private List<AddressDtoV1> additionalAddress; // Prudhvi will share the database table
}
