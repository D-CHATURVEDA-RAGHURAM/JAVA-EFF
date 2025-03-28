package com.effigo.shared.dto.external.v7;

import com.effigo.shared.dto.v7.GrnItemsDtoV7Readable;
import com.effigo.shared.dto.v7.LineItemsDtoV7Readable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGRNReqDtoV7Readable {

    @JsonProperty("GOODSMVT_CODE")
    private List<MovementCodeDtoV7> movementCode;

    @JsonProperty("GOODSMVT_HEADER")
    private List<MovementHeaderDtoV7> movementHeaderDetails;

    @JsonProperty("invoice_value")
    private String invoiceValue;

    @JsonProperty("material_year")
    private String materialYear;

    @JsonProperty("Zsinv_invoice_Type")
    private String invoiceTypeZsinv;

    @JsonProperty("Document_attachment")
    private String documentAttachment;

    @JsonProperty("GOODSMVT_ITEM")
    private List<GrnItemsDtoV7Readable> goodsMovementItems;

    // List for LINE_DETAILS
    @JsonProperty("LINE_DETAILS")
    private List<LineItemsDtoV7Readable> lineDetails;
}

