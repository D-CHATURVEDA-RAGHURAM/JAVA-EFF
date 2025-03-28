package com.effigo.shared.dto.v4;

import com.effigo.shared.dto.v1.AsnErrorOutboundResponseDtoV3;
import com.effigo.shared.dto.v1.AsnItemOutboundResponseDtoV3;
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
public class AsnOutboundResponseDtoV4 {

    @JsonProperty("EV_GRN_MBLNR")
    private String erpRefNo;

    @JsonProperty("EV_GRN_MJAHR")
    private String fiscalYear;

    @JsonProperty("EV_MESSAGE")
    private String message;

    @JsonProperty("EV_MSGTY")
    private String msgType;

}
