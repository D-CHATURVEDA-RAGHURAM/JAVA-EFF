package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRAssignBuyerResponseDto {

    @JsonProperty("data")
    private ExternalPRBuyerDTO data;

    @JsonProperty("message")
    private String message;

}
