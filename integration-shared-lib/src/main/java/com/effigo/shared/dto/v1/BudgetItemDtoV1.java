package com.effigo.shared.dto.v1;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class BudgetItemDtoV1 {
	private String project;
	private List<PrItems> items;

}
