package com.effigo.shared.dto.v8;

import com.effigo.shared.dto.external.v1.ServiceItemDto;
import com.effigo.shared.dto.external.v8.ServiceItemAttachDtoV8;
import com.effigo.shared.dto.external.v8.ServiceItemDtoHeaderV8;
import com.effigo.shared.dto.external.v8.ServiceItemDtoV8;
import com.effigo.shared.dto.v2.AttachmentDtoV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceSheetResponseDtoV8 {

	@JsonProperty("IS_SES_HEADER")
	ServiceItemDtoHeaderV8 serviceHeaderDto;

	@JsonProperty("IT_ATTACH")
	ServiceItemAttachDtoV8 serviceDocAttachment;

	@JsonProperty("IT_SES_ITEMS")
	ServiceItemDtoV8 serviceItemsDto;
	
}
