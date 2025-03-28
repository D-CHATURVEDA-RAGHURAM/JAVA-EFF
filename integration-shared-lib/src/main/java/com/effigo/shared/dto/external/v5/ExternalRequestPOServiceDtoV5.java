package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalRequestPOServiceDtoV5 {
	
		
		private String itemNumber;
		private String lineNumber;
		private String deletionFlag;
		private String serviceNumber;
		private String shortText;
		private String quantity;
		private String unitOfMeasure;
		private String priceUnit;
		private String grossPrice;
		private String netValueOfItem;

	


}
