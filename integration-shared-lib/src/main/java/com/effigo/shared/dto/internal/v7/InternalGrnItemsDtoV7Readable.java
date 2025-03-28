package com.effigo.shared.dto.internal.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class InternalGrnItemsDtoV7Readable {
    @JsonProperty("MATERIAL")
    private String material;

    @JsonProperty("PLANT")
    private String plant;

    @JsonProperty("MOVE_TYPE")
    private String moveType;

    @JsonProperty("ENTRY_QNT")
    private String entryQuantity;

    @JsonProperty("ENTRY_UOM")
    private String entryUom;

    @JsonProperty("ENTRY_UOM_ISO")
    private String entryUomIso;

    @JsonProperty("PO_NUMBER")
    private String poNumber;

    @JsonProperty("PO_ITEM")
    private String poItem;

    @JsonProperty("MVT_IND")
    private String movementIndicator;

    @JsonProperty("STGE_LOC")
    private String storageLocation;

    @JsonProperty("VENDRBATCH")
    private String vendorBatch;

    @JsonProperty("PROD_DATE")
    private String productionDate;

    @JsonProperty("GR_RCPT")
    private String goodsReceiptBy;

    @JsonProperty("REF_DOC_YR")
    private String refDocYear;

    @JsonProperty("REF_DOC")
    private String refDoc;

    @JsonProperty("REF_DOC_IT")
    private String refDocItem;
}
