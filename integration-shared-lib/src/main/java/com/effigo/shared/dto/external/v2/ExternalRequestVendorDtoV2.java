package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class ExternalRequestVendorDtoV2 {
	List<ExternalVendorDtoV2> vendors = new ArrayList<>();
}
