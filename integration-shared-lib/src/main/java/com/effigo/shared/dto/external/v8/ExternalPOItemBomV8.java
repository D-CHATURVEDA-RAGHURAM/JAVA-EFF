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
public class ExternalPOItemBomV8 {

    @JsonProperty("poId")
    private String poId;

    @JsonProperty("itemNumber")
    private String poItemId;

    @JsonProperty("bomCode")
    private String bomCode;

    @JsonProperty("status")
    private String status;

    @JsonProperty("version")
    private String version;

}
