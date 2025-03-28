package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPOItemStagesV8 {

    @JsonProperty("poId")
    private String poId;

    @JsonProperty("itemNumber")
    private String poItemId;

    @JsonProperty("stage")
    private String stage;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("deadlineDate")
    private String deadlineDate;

    @JsonProperty("stageFilledBy")
    private String stageFilledBy;

}
