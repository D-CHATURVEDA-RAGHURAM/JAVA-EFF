package com.effigo.shared.dto.v2;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class PoDetailsDtoV2 {

	private String erpid;
	private String amendno;
	private String amenddate;

	//project details 
	private String project;
	private String projectStateCode;
	private String projectGstn;

	private String reqId;

	//vendor details
	private String vendorId;
	private String vendorGst;
	private String vendorStateCode;

	//address fields
	private String billingAddressId;
	private String deliveryAddress;
	private String vendorAddressId;

	//po details
	private String poType;
	private String poId;

	private String purchaseCenter;
	private String currency;
	private String orgCode;
	private String createdBy;
	private String createdDate;
	private String inspection;
	private String priceChange;
	private String sailentFeatures;
	private String approvedBy;
	private String approvedDate;

	private String deliveryTerms;
	private BigDecimal poAmt;
	private String status;
	private String originalPoNo;
	private boolean gstType;

	private List<PaymentTermDtoV2> paymentTerms;
	private List<PoItemsDtoV2> poItems;
	private List<PriceDetailsDtoV2> priceDetails;
	private List<ScheduleDtoV2> schedule;
}
