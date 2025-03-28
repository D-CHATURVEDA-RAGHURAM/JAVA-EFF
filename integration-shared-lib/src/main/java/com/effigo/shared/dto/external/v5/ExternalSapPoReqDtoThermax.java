package com.effigo.shared.dto.external.v5;

import com.effigo.shared.dto.external.v3.ExternalPriceInfoSheetItemDtoV3;
import com.effigo.shared.dto.external.v3.ExternalPriceInfoSheetServiceItemDtoV3;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalSapPoReqDtoThermax {

    @JsonProperty("IS_PO_HEADER")
    private ExternalSapPoHeaderDtoThermax purchaseOrderHeader;

    @JsonProperty("IT_PO_LINES")
    private List<ExternalSapPoItemDtoThermax> purchaseOrderItems;

    @JsonProperty("IT_PO_SES_ITEMS")
    private List<ExternalSapPoServiceItemDtoThermax> serviceItems;

    @JsonProperty("IT_ATTACH")
    private List docs = new ArrayList<>();


}

