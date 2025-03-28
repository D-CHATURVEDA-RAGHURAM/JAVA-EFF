package com.effigo.shared.dto.v6;


import com.effigo.shared.dto.internal.v1.PoTaxDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PoAmendInternalDto {

    private String poNumber;
    private String poItemId;
    private String status;
    private String orgId;
    private String lineNum;
    private String shipmentNum;
    private String requisitionId;
    private String requisitionLineId;
    private String lineType;
    private String item;
    private String category;
    private String itemDescription;
    private String uomCode;
    private String quantity;
    private String unitPrice;
    private String shipToOrganizationCode;
    private String shipToLocation;
    private String needByDate;
    private String promisedDate;
    private String attributeCategory;
    private String lineStatus;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;
    private String attribute11;
    private String attribute12;
    private String attribute13;
    private String attribute14;
    private String attribute15;
    private String shipmentType;
    private String matchApprovalLevel;
    private String matchOption;
    private String receivingRouting;
    private String reqDistributionId;
    private String distributionNum;
    private String distributionOrgId;
    private String quantityOrdered;
    private String quantityDelivered;
    private String quantityBilled;
    private String quantityCancelled;
    private String deliverToLocation;
    private String deliverToPersonFullName;
    private String destinationType;
    private String setOfBooks;
    private String chargeAccount;
    private String amountBilled;
    private String projectNumber;
    private String taskNumber;
    private String taxCategoryName;
    private String taxCategoryGroup;
    private String taxIndex;
    private String taxPrecedence;
    private String intendedUse;
    private String hsnCode;
    private String sacCode;
    private List<PoTaxDto> otherCharges;
}

