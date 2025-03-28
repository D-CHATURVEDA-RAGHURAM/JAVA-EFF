package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.GrnDtoV1;
import com.effigo.shared.dto.v1.GrnItemsDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class GrnDtoV2 {

	private String grnId;


	public GrnDtoV1 grnDtoV1;


}
