package com.effigo.shared.dto.external.v2;


import com.effigo.shared.dto.external.v1.ExternalPriceInfoResDtoV1;
import com.effigo.shared.dto.v2.ErrorItemV2;
import com.effigo.shared.dto.v2.ErrorLogV2Thermax;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)


public class ExternalPriceInfoResponseDtoV2Thermax {

    @JsonProperty("IV_EBELN")
    private String erpId;
    @JsonProperty("IV_MAG_YEAR")
    public String docYear;

    @JsonProperty("IV_MAT_DOC")
    public String matDoc;

    @JsonProperty("IV_STATUS")
    public String status;

    @JsonProperty("IT_ERROR_LOG")
    private ErrorLogV2Thermax errorLog;


}

