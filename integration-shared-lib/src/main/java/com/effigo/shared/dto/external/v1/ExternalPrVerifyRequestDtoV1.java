package com.effigo.shared.dto.external.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPrVerifyRequestDtoV1 {
	@JsonProperty("project")
	public String project;
	public List<ExternalPRRequestItemsDtoV1> items;
}
