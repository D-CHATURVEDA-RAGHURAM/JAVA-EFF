package com.effigo.shared.dto.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationDtoV6 {

	private String companyId;

	private String vendorId;

	private String companyCode;

	private String purchOrg;

	private String accountGroup;

	private String name1;

	private String name2;

	private String name3;

	private String name4;

	private String searchTerm1;

	private String searchTerm2;

	private String street2;

	private String district;

	private String street;

	private String houseNo;

	private String postalCode;

	private String city;

	private String country;

	private String region;

	private String language;

	private String mobilePhone;

	private String eMail;

	private String eMail1;

	private String eMail2;

	private String eMail3;

	private String eMail4;

	private String eMail5;

	private String eMail6;

	private String eMail7;

	private String eMail8;

	private String eMail9;

	private String gstNo;

	private String msme;

	private String msmeType;

	private String msmeRegDate;

	private Boolean eInvoice;

	private String vendorApprovedBy;

	private String qmCertificate;

	private String qmCertificateEndDate;

	private String bankCountry;

	private String bankKey;

	private String bankRegion;

	private String bankAccount;

	private String bankCtrlKey;

	private String reconnAccount;

	private String paymentTerms;

	private String checkDoubleInvoice;

	private String paymentMethods;

	private String orderCurrency;

	private String termsOfPayment;

	private String incoTerms;

	private String schemaGroup;

	private String salesPerson;

	private String telephone;

	private String grBasedInvVerification;

	private String evaluatedReceiptSettlement;

	private String automaticEvaluatedReceipt;

	private String priceMarketingAgreed;

	private String pan;

	private String centralPurchaseBlocked;

	private String deletionFlag;

	private String blockedForPurchaseOrganizartion;

	private String title;

	private String bankAccountHolder;

	private String bankName;

	private String branch;

	private String vendorPriceMarking;

	private String status;

	private String refVendorCode;

	private String refCompanyCode;

	private String refPurchOrg;

	private String buId;

	private String companyCodeId;

	private String beneficiaryName;

}
