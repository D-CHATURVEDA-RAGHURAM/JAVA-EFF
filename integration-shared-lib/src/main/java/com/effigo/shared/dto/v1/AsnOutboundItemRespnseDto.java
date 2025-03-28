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
public class AsnOutboundItemRespnseDto {

    @JsonProperty("EBELP")
    private String poItemId;

    @JsonProperty("EBELN")
    private String poId;

    @JsonProperty("REF_DOC_IT")
    private String asnItemErpId;
}
