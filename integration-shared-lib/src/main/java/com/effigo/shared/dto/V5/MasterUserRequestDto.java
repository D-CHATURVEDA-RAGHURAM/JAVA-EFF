package com.effigo.shared.dto.V5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MasterUserRequestDto {

	private String prefix;
	private String tableName;
	private String columnName;
	private String schemaName;


}
