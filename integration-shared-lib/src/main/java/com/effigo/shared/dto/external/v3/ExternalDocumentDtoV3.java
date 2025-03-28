package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalDocumentDtoV3 {

    @JsonProperty("ATTACHMENT1")
    byte[] attachment1 = {};

    @JsonProperty("ATTACHMENT2")
    byte[] attachment2 = {};

    @JsonProperty("ATTACHMENT3")
    byte[] attachment3 = {};

    @JsonProperty("ATTACHMENT4")
    byte[] attachment4 = {};


    @JsonProperty("ATTACHMENT5")
    byte[] attachment5 = {};

}
