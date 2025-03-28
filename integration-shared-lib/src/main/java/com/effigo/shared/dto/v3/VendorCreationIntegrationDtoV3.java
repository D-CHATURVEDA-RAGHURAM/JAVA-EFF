package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
	@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationDtoV3 {

	private String bobApplicationNo;
	private String companyId;
	private String bobEmpanelmentNo;
	private String vendorNumber;
	private String bpGroupRole;
	private String bpType;
	private String vendorAccountGroup;
	private String title;
	private String name1;
	private String name2;
	private String searchText1;
	private String houseNoOrBuildNoOrStreet1;
	private String street2;
	private String street3;
	private String postalCode;
	private String city;
	private String country;
	private String region;
	private String language;
	private String telephonic;
	private String mobile;
	private String email;
	private String gstNumber;
	private String bankCountry;
	private String bankKey;
	private String bankName;
	private String bankAccount;
	private String bankControlKey;
	private String bankReference;
	private String accountHolder;
	private String acctName;
	private String bankBranchName;
	private String pan;
	private String vatNumber;
	private String cstNo;
	private String lstNo;
	private String serRegNo;
	private String gstVendorClass;
	private String companyCode;
	private String reconcilliationAccount;
	private String sortKey;
	private String paymentTerms;
	private String paymentMethod;
	private String purchaseOrg;
	private String poCurrency;
	private String poPaymentTerms;
	private String isIntercom;
	private String msmeNumber;
	private String msmeType;
	private String msmeRegDate;
	private String trainStation;
	private String acctClerkFax;
	private String customField1;
	private String customField2;
	private String customField3;
	private String customField4;
	private String customField5;
	private String customField6;
	private String customField7;
	private String customField8;
	private String customField9;
	private String customField10;
	private String refVendorCode;
	private String refCompanyCode;
	private String refPurchOrg;
	private String status;
	private List<VendorCreationTaxDtoV3> taxDtoV3List;
	private List<VendorCreationTdsDtoV3> tdsDtoV3List;
	private String customField11;
	private String customField12;
	private String customField13;
	private String customField14;
	private String customField15;
	private String customField16;
	private String customField17;
	private String customField18;
	private String customField19;
	private String customField20;
	private String customField21;
	private String customField22;
	private String customField23;
	private String customField24;
	private String customField25;
	private String customField26;
	private String customField27;
	private String customField28;
	private String customField29;
	private String customField30;
	private String customField31;
	private String customField32;
	private String customField33;
	private String subject;
	private String buId;

	private String tdsSectionalGroup2;

	private String tdsExemptionNumber2;

	private String tdsExemptionRate2;

	private String tdsExemptFrom2;

	private String tdsExemptTo2;

	private String tdsExemptReason2;

	private String tdsWTaxType2;

	private String tdsWTaxCode2;

	private String tdsExemThreshold2;

	private String tdsSectionalGroup1;

	private String tdsExemptionNumber1;

	private String tdsExemptionRate1;

	private String tdsExemptFrom1;

	private String tdsExemptTo1;

	private String tdsExemptReason1;

	private String tdsWTaxType1;

	private String tdsWTaxCode1;

	private String tdsExemThreshold1;
	
	private String contactUser1;
	private String contactUser2;
	private String contactUser3;

}
