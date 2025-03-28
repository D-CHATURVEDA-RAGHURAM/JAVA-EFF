package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PODocDtoV1 {
	
	@JsonProperty("doc")
    public String doc;
}
