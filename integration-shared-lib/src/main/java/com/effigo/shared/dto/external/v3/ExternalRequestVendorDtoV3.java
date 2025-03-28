package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class ExternalRequestVendorDtoV3 {
    @JsonProperty("VENDORDETAILS")
    List<ExternalVendorDtoV3> vendors = new ArrayList<>();

    @JsonProperty("DOCUMENTS")
    List<ExternalReqDocumentDtoV3> documents = new ArrayList<>();

}