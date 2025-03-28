package com.effigo.shared.dto.v1;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BudgetItemResponseDtoV1 {

	private String project;
	private List<ItemStatus> itmstatus;
	private Boolean status;
	private String errmsg;
}
