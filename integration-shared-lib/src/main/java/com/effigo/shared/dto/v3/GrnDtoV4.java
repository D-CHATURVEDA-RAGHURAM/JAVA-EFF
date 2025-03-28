package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class GrnDtoV4 {

	private String grnId;


	public GrnDtoV3 grnDtoV3;

@Generated
	public  GrnDtoV3 getGrnDtoV3() {
	return this.grnDtoV3;
}
}
