package com.effigo.shared.dto.external.v2;


import com.effigo.shared.dto.external.v1.ExternalPriceInfoResDtoV1;
import com.effigo.shared.dto.v2.ErrorItemV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)


public class ExternalPriceInfoResponseTataEleDto {

    @JsonProperty("root")
    private ExternalPriceInfoResponseDtoV2 root;

}

