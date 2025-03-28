package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnOutboundRequestDto {

    @JsonProperty("EINVOICE")
    private String invoiceNumber;

    @JsonProperty("EWAYBILLDATE")
    private String ewayBillDate;

    @JsonProperty("EWAYBILLNO")
    private String ewayBillNo;

    @JsonProperty("GOODSMVT_CODE")
    private AsnOutboundCodeDto asnOutboundCodeDto;

    @JsonProperty("GOODSMVT_HEADER")
    private AsnOutboundHeaderDto asnOutboundHeaderDto;


    @JsonProperty("LRNUM")
    private String lrNo;

    @JsonProperty("TRANS_NAME")
    private String transporter;

    @JsonProperty("VEHNO")
    private String vehicleNo;

    @JsonProperty("GOODSMVT_ITEM")
    private List<AsnItemOutboundRequestDto> items;

    @JsonProperty("LINE_DETAILS")
    private List<AsnOutboundLineDetailDto> asnOutboundLineDetailDtos;


}
