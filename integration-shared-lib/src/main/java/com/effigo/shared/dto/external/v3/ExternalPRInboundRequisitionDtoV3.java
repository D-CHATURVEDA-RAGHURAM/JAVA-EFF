package com.effigo.shared.dto.external.v3;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPRInboundRequisitionDtoV3 {
   // public String internalId;
    public String requisitionId;

    public String requisitionType;

    public String businessUnit;
    public String poType;
    public String budgetCode;

    public List<ExternalPRRequestItemsDtoV3> requisitionItems;

}
