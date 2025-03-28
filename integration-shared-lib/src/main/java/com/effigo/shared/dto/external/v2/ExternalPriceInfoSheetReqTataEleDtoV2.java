package com.effigo.shared.dto.external.v2;

import com.effigo.shared.dto.external.v3.ExternalPriceInfoSheetReqDtoV3;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetReqTataEleDtoV2 {

    @JsonProperty("root")
    private ExternalPriceInfoSheetReqDtoV3 root;

}
