package com.effigo.shared.dto.external.v2;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRInboundRequisitionDtoV2 {
    @JsonProperty("BANFN")
    public String requisitionId;

    @JsonProperty("BSART")
    public String requisitionType;

    @JsonProperty("WERKS")
    public String businessUnit;

    private String createdDate;

    private String createdBy;

    private String approvedDate;

    private String status;

    private String companyCode;

    @JsonProperty("REQITEMS")
    public List<ExternalPRRequestItemsDtoV2> requisitionItems;
}
