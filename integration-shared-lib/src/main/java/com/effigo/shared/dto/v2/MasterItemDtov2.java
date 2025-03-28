package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.MasterItemDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterItemDtov2 extends MasterItemDto {
	private String subcategory;
	private String plantcode;
	private String plantstatus;

	@JsonProperty("partition_group")
	private String partitionGroup;
}
