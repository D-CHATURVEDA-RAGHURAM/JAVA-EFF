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
public class AsnOutboundResponseDtoV3 {

    @JsonProperty("GUIID")
    private String transactionId;

    @JsonProperty("EBELN")
    private String poId;

    @JsonProperty("effigorefno")
    private String effigoRefNo;

    @JsonProperty("MAT_DOC")
    private String erpRefNo;

    @JsonProperty("responsecode")
    private String responseCode;

    @JsonProperty("message")
    private String message;


    @JsonProperty("DOC_YEAR")
    private String year;


    @JsonProperty("PO_DETAILS")
    private AsnItemOutboundResponseDtoV3 asnItemOutboundResponseDtoV3;

    @JsonProperty("ERROR_LOG")
    private AsnErrorOutboundResponseDtoV3 asnErrorOutboundResponseDtoV3 ;


}
