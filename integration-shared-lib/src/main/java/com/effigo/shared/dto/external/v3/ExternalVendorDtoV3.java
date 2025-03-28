package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorDtoV3 {

    @JsonProperty("BOB_APPLICATION_NO")
    private String bobApplicationNo;

    @JsonProperty("BOB_EMPANELMENT_NO")
    private String bobEmpanelmentNo;

    @JsonProperty("VENDOR_NUMBER")
    private String vendorNumber;

    @JsonProperty("BP_GROUP_ROLE")
    private String bpGroupRole;

    @JsonProperty("BP_TYPE")
    private String bpType;

    @JsonProperty("VENDOR_ACCOUNT_GROUP")
    private String vendorAccountGroup;

    @JsonProperty("TITLE")
    private String title;

    @JsonProperty("NAME1")
    private String name1;

    @JsonProperty("NAME2")
    private String name2;

    @JsonProperty("SEARCH_TEXT_1")
    private String searchText1;

    @JsonProperty("HOUSE_NO_OR_BUILD_NO_OR_STREET_1")
    private String houseNoOrBuildNoOrStreet1;

    @JsonProperty("STREET_2")
    private String street2;

    @JsonProperty("STREET_3")
    private String street3;

    @JsonProperty("POSTAL_CODE")
    private String postalCode;

    @JsonProperty("CITY")
    private String city;

    @JsonProperty("COUNTRY")
    private String country;

    @JsonProperty("REGION")
    private String region;

    @JsonProperty("LANGUAGE")
    private String language;

    @JsonProperty("TELEPHONIC")
    private String telephonic;

    @JsonProperty("MOBILE")
    private String mobile;

    @JsonProperty("EMAIL")
    private String email;

    @JsonProperty("GST_NUMBER")
    private String gstNumber;

    @JsonProperty("BANK_COUNTRY")
    private String bankCountry;

    @JsonProperty("BANK_KEY")
    private String bankKey;

    @JsonProperty("BANK_NAME")
    private String bankName;

    @JsonProperty("BANK_ACCOUNT")
    private String bankAccount;

    @JsonProperty("BANK_CONTROL_KEY")
    private String bankControlKey;

    @JsonProperty("BANK_REFERENCE")
    private String bankReference;

    @JsonProperty("ACCOUNT_HOLDER")
    private String accountHolder;

    @JsonProperty("ACCT_NAME")
    private String acctName;

    @JsonProperty("BANK_BRANCH_NAME")
    private String bankBranchName;

    @JsonProperty("PAN")
    private String pan;

    @JsonProperty("VAT_NUMBER")
    private String vatNumber;

    @JsonProperty("CST_NO")
    private String cstNo;

    @JsonProperty("LST_NO")
    private String lstNo;

    @JsonProperty("SER_REG_NO")
    private String serRegNo;

    @JsonProperty("GST_VENDOR_CLASS")
    private String gstVendorClass;

	/*@JsonProperty("ACTSS")
	private String actss;*/

    @JsonProperty("COMPANY_CODE")
    private String companyCode;

    @JsonProperty("RECONCIALLATION_ACCOUNT")
    private String reconcilliationAccount;

    @JsonProperty("SORT_KEY")
    private String sortKey;

    @JsonProperty("PAYMENT_TERMS")
    private String paymentTerms;

    @JsonProperty("PAYMENT_METHOD")
    private String paymentMethod;

    @JsonProperty("PURCHASE_ORG")
    private String purchaseOrg;

    @JsonProperty("PO_CURRENCY")
    private String poCurrency;

    @JsonProperty("PO_PAYMENT_TERMS")
    private String poPaymentTerms;

    @JsonProperty("IS_INTERCOM")
    private String isIntercom;

    @JsonProperty("MSME_NUMBER")
    private String msmeNumber;

    @JsonProperty("MSME_TYPE")
    private String msmeType;

    @JsonProperty("MSME_REG_DATE")
    private String msmeRegDate;

    @JsonProperty("Train_Station")
    private String trainStation;

    @JsonProperty("Acct_clerks_fax")
    private String acctClerkFax;

    @JsonProperty("STATUS")
    private String status;

    @JsonProperty("TAX")
    List<ExternalTaxDtoV3> taxDtoV3List;

    @JsonProperty("TDS")
    List<ExternalTdsDtoV3> tdsDtoV3List;

}
