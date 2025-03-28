package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ExternalVendorDtoV6Tepl {

    @JsonProperty("BOB_APPLICATION_NO")
    private String bobApplicationNo;

    @JsonProperty("BOB_EMPANELMENT_NO")
    private String bobEmpanelmentNo;

    @JsonProperty("VENDOR_NUMBER")
    private String vendorNumber;

    @JsonProperty("BP_GROUPING")
    private String bpGroupRole;

    @JsonProperty("BP_TYPE")
    private String bpType;

    @JsonProperty("ACCOUNT_GROUP")
    private String vendorAccountGroup;

    @JsonProperty("TITLE")
    private String title;

    @JsonProperty("NAME")
    private String name1;

    @JsonProperty("NAME2")
    private String name2;

    @JsonProperty("SEARCH_TEXT_1")
    private String searchText1;

    @JsonProperty("SEARCH_TEXT_2")
    private String searchText2;

    @JsonProperty("HOUSE_NUM")
    private String houseNoOrBuildNoOrStreet1;

    @JsonProperty("STREET_1")
    private String buId;

    @JsonProperty("STREET_2")
    private String street2;

    @JsonProperty("STREET_3")
    private String street3;

    @JsonProperty("STREET_4")
    private String tdsSectionalGroup2;

    @JsonProperty("POSTAL_CODE")
    private String postalCode;

    @JsonProperty("CITY")
    private String city;

    @JsonProperty("COUNTRY")
    private String country;

    @JsonProperty("STATE_REGION")
    private String region;

    @JsonProperty("LANGUAGE")
    private String language;

    @JsonProperty("DEFAULT_TELEPHONIC")
    private String telephonic;

    @JsonProperty("MOBILE")
    private String mobile;

    @JsonProperty("EMAIL")
    private String email;

    @JsonProperty("GST_NUMBER")
    private String gstNumber;

    @JsonProperty("CIN_NUM")
    private String tdsExemptionNumber2;

    @JsonProperty("TURN_OVER_DEC")
    private String tdsExemptionRate2;

    @JsonProperty("BUSINESS_TYPE")
    private String tdsExemptFrom2;

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

    @JsonProperty("DISTRICT_CITY")
    private String districtCity;

    @JsonProperty("DIFFERENT_CITY")
    private String differentCity;

    @JsonProperty("Block")
    private String  block;

    @JsonProperty("PBLOCK_PORG")
    private String pblockPorg;

    @JsonProperty("TEXT_ID")
    private String textId;

    @JsonProperty("LANGUAGE_KEY")
    private String languageKey;

    @JsonProperty("TEXT")
    private String text;

    @JsonProperty("WHT_Section")
    private String whtSection;

    @JsonProperty("WHT_COUNTRY")
    private String whtCountry;

    @JsonProperty("W_TAX_TYPE")
    private String wtaxType;

    @JsonProperty("W_TAX_CODE")
    private String taxCode;

    @JsonProperty("WHY_SUBJECT")
    private String subject;

    @JsonProperty("Duplicate")
    private String duplicate;

    @JsonProperty("W_TAX_ID")
    private String taxId;

    @JsonProperty("TAX_TYPE")
    private String taxType;

    @JsonProperty("EXEMPATION_NUMBER")
    private String exempationNumber;

    @JsonProperty("EXEMPATION_RATE")
    private String exemptionRate;

    @JsonProperty("EXEMPT_FROM")
    private String exemptFrom;

    @JsonProperty("EXEMPT_TO")
    private String exemptTo ;

    @JsonProperty("EXEMPATION_REASON")
    private String exemptReason;

    @JsonProperty("EXEMPATION_THRESHOLD")
    private String exemptionThreshold;

    @JsonProperty("PURCHASE_GROUP")
    private String purchaseGroup;

    @JsonProperty("VENDOR_TELEPHONIC")
    private String vendorTelephonic;

    @JsonProperty("INCO_TERM")
    private String incoTerm;

    @JsonProperty("INCO_TERM1")
    private String incoTerm1;

    @JsonProperty("GRP_CAL_SCHEMA")
    private String grpCalSchema;

    @JsonProperty("GR_INVOICE")
    private String grInvoice;

    @JsonProperty("GRANT_FREE_GOODS")
    private String grantFreeGoods;

    @JsonProperty("SER_INVOICE")
    private String serInvoice;

    @JsonProperty("PARTNER_ROLE")
    private String partnerRole;

    @JsonProperty("BANK_REGION")
    private String bankRegion;

    @JsonProperty("BANK_CITY")
    private String bankCity;

    @JsonProperty("BANK_IBAN")
    private String bankIban;

    @JsonProperty("INDUSTRY_SECTOR")
    private String industry;

    @JsonProperty("TAX_CATEGORY")
    private String taxCategory;

    @JsonProperty("GST_TAX_NUMBER")
    private String gstTaxNo;

    @JsonProperty("ADD_VALID_FROM")
    private String addValidFrom;

    @JsonProperty("ADD_VALID_TO")
    private String addValidTo;

    @JsonIgnore
    private  String gstNum;

    @JsonProperty("DOUBLE_INVOICE")
    private String doubleInvoice;

    @JsonProperty("PAYMETHOD")
    private String payMethod;
    
    @JsonProperty("CONTACT_USER1")
    private String contactUser1;

    @JsonProperty("CONTACT_USER2")
    private String contactUser2;

    @JsonProperty("CONTACT_USER3")
    private String contactUser3;
}
