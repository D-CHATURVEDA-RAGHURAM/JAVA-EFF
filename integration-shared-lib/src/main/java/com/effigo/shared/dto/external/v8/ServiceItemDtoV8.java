package com.effigo.shared.dto.external.v8;

import com.effigo.shared.dto.external.v1.ServiceItemDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemDtoV8 {
	
	@JsonProperty("item")
	private ServiceItemDtoItemV8 item;

}
