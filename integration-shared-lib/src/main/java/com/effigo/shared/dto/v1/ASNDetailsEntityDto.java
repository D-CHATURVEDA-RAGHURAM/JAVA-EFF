package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class ASNDetailsEntityDto {

    @JsonProperty("internalRefNo")
    private String internalRefNo;

    @JsonProperty("eInvoiceNo")
    private String invoiceNumber;

    @JsonProperty("suppInvNo")
    private String suppInvNo;

    @JsonProperty("postingDate")
    private String postingDate;

    @JsonProperty("ewayBillDate")
    private String ewayBillDate;

    @JsonProperty("ewayBillNo")
    private String ewayBillNo;

    @JsonProperty("lrNo")
    private String lrNo;

    @JsonProperty("transporter")
    private String transporter;

    @JsonProperty("poId")
    private String poId;

    @JsonProperty("plantCode")
    private String plantCode;

    @JsonProperty("docDate")
    private String docDate;

    @JsonProperty("erpRefNo")
    private String erpRefNo;

    @JsonProperty("headerText")
    private String headerText;

    @JsonProperty("status")
    private String status;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("vehicleno")
    private String vehicleNo;

    @JsonProperty("asnItems")
    private List<ASNItemDetailsEntityDto> asnItems;

}
