package com.effigo.shared.dto.internal.v7;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class InternalGrnDtoV7Readable {

    private List<InternalMovementCodeDtoV7> movementCodeDetails;

    private List<InternalGrnMovementHeaderDetails> grnMovementHeaderDetails;

    private String invoiceValue;

    private String materialYear;

    private String invoiceTypeZsinv;

    private String documentAttachment;

    private List<InternalGrnItemsDtoV7Readable> goodsMovementItems;

    private List<InternalLineItemsDtoV7Readable> lineDetails;
}
