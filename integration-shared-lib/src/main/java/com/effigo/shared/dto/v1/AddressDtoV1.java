package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDtoV1 {
	private String addFssaiNo;
	private String city;
	private String state;
	private String country;
	private String address;
	private String pincode;
	private String divisonPlantInfo;
	private String gstNo;
	private String erpId;
	private String addressType;
}
