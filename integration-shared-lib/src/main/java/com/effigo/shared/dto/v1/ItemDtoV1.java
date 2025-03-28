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
public class ItemDtoV1 {
	public String type;
	public String categoryid;
	public String code;
	public String name;
	public String status;
	public String createdby;
	public String createddate;
	public List<UomDtoV1> uom;
	public String glcode;
	public String hsncode;
	public String quality;
	public List<AttributeDtoV1> attributes;
}
