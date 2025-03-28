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
public class GseCancelOutboundResponseDto {

    @JsonProperty("GUIID")
    private String transactionId;

    @JsonProperty("MBLNR")
    private String existingErpId;

    @JsonProperty("MJAHR")
    private String existingYear;

    @JsonProperty("SMBLN")
    private String newErpId;

    @JsonProperty("SJAHR")
    private String year;


    @JsonProperty("ERROR_LOG")
    private GrnCancelItemOutboundResponseDto grnCancelItems;


}
