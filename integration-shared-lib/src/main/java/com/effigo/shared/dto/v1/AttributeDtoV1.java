package com.effigo.shared.dto.v1;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AttributeDtoV1 {
	public String id;
	public String status;
	public String code;
	public String name;
	public String type;
	public String createdby;
	public String createdon;
	public List<ValueDtoV1> values;
}
