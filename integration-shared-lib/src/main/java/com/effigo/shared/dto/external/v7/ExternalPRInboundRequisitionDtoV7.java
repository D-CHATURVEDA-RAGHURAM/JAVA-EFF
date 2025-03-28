package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRInboundRequisitionDtoV7 {
    @JsonProperty("BANFN")
    public String requisitionId;

    @JsonProperty("BSART")
    public String requisitionType;

    @JsonProperty("WERKS")
    public String businessUnit;

    private String createdDate;

    private String approvedDate;

    private String status;

    private String companyCode;

    @JsonProperty("REQITEMS")
    public List<ExternalPRRequestItemsDtoV7> requisitionItems;
}
