package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnCancelOutboundItemResponseDto {

    @JsonProperty("TYPE")
    private String type;


    @JsonProperty("NUMBER")
    private String number;



    @JsonProperty("MESSAGE")
    private String message;


}
