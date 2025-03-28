package com.effigo.shared.dto.external.v8;

import com.effigo.shared.dto.v2.AttachmentDtoV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemAttachDtoV8 {
	
	@JsonProperty("item")
	private AttachmentDtoV2 item;

}
