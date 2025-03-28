package com.effigo.shared.dto.internal.v8;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PoItemBomDtoV8 {
    @JsonProperty("po_item_bom_dts_id")
    private String poItemBomDtsId;

    @JsonProperty("po_id")
    private String poId;

    @JsonProperty("po_item_id")
    private String poItemId;

    @JsonProperty("bom_code")
    private String bomCode;

    @JsonProperty("version")
    private String version;

    @JsonProperty("bom_qty")
    private String bomQty;

    @JsonProperty("bom_desc")
    private String bomDesc;

    @JsonProperty("bom_units")
    private String bomUnits;

    @JsonProperty("import_date")
    private LocalDateTime importDate;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("partition_group")
    private String partitionGroup;
}
