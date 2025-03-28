package com.effigo.shared.dto.external.v4;

import com.effigo.shared.dto.external.v3.ExternalDocumentDtoV3;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class ExternalRequestVendorDtoV4 {

	@JsonProperty("VENDORDETAILS")
	ExternalVendorRequestDtoV4 extrenalRequestDtos;

	@JsonProperty("YVendormedSet")
	List<ExternalRequestDocumentDtoV4> documents = new ArrayList<>();
}
