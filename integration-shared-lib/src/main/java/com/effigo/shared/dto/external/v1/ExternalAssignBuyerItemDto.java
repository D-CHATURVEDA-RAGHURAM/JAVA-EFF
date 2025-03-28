package com.effigo.shared.dto.external.v1;

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
public class ExternalAssignBuyerItemDto {

    @JsonProperty("requisition_id")
    private String reqId;

    @JsonProperty("buyer_id")
    private String buyerId;

    @JsonProperty("requisition_line_num")
    private String itemNo;

    @JsonProperty("org_id")
    private String orgId;
}
