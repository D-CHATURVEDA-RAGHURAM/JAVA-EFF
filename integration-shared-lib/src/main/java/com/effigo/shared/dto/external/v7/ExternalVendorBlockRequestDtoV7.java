package com.effigo.shared.dto.external.v7;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorBlockRequestDtoV7 {
	
	private List<ExternalVendorBlockDtoV7> vendorBlockDtoV7s;

}
