package com.effigo.shared.dto.internal.v8;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class POItemStagesDtoV8 {

    @JsonProperty("po_id")
    private String poId;

    @JsonProperty("po_item_id")
    private String poItemId;

    @JsonProperty("stage")
    private String stage;

    @JsonProperty("stage_status")
    private Integer status;

    @JsonProperty("partition_group")
    private String partitionGroup;

    @JsonProperty("index")
    private String index;

    @JsonProperty("erp")
    private Boolean erp;

    @JsonProperty("deadline_date")
    private String deadlineDate;

    @JsonProperty("stage_filled_by")
    private String stageFilledBy;

}
