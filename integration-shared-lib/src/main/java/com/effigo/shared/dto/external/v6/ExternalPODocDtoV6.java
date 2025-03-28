package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPODocDtoV6 {

    @JsonProperty("doc")
    public String doc;
}
