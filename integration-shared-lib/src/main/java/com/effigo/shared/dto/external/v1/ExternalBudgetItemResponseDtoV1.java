package com.effigo.shared.dto.external.v1;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalBudgetItemResponseDtoV1 {
	private String project;
	private List<ExternalItemStatus> itmstatus;
	private String status;
	private String errmsg;

}
