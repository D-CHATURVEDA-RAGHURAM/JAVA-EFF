package com.effigo.shared.dto.external.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

/**
 * @Author Srinivas Kota
 * This is for Thermax.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationDtoV5 {


    @JsonProperty("buId")
    private String buId;


    @JsonProperty("vendorId")
    private String vendorId;

    @JsonProperty("company_id")
    private String companyId;

    @JsonProperty("companyCode")
    private String companyCode;

    @JsonProperty("addressId")
    private String addressId;

    @JsonProperty("vendorName")
    private String vendorName;

    @JsonProperty("oracleVendorCode")
    private String oracleVendorCode;

    @JsonProperty("oneTimeVendor")
    private String oneTimeVendor;

    @JsonProperty("vendorType")
    private String vendorType;

    @JsonProperty("enabledFlag")
    private String enabledFlag;

    @JsonProperty("invoiceCurrencyCode")
    private String invoiceCurrencyCode;

    @JsonProperty("paymentCurrencyCode")
    private String paymentCurrencyCode;

    @JsonProperty("msmeType")
    private String msmeType;

    @JsonProperty("msmeNumber")
    private String msmeNumber;

    @JsonProperty("udyamRegistrationNumber")
    private String udyamRegistrationNumber;

    @JsonProperty("msmeRegisteredDate")
    private String msmeRegisteredDate;

    @JsonProperty("cinNumber")
    private String cinNumber;

    @JsonProperty("payTerm")
    private String payTerm;

    @JsonProperty("sapVendorCode")
    private String sapVendorCode;

    @JsonProperty("inforVendorCode")
    private String inforVendorCode;

    @JsonProperty("custom1")
    private String custom1;

    @JsonProperty("orcaleCustom1")
    private String orcaleCustom1;


    @JsonProperty("division")
    private String division;

    @JsonProperty("site_name")
    private String siteName;

    @JsonProperty("address1")
    private String address1;

    @JsonProperty("address2")
    private String address2;

    @JsonProperty("address3")
    private String address3;

    @JsonProperty("address4")
    private String address4;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("pin")
    private String pin;

    @JsonProperty("country")
    private String country;

    @JsonProperty("landLine")
    private String landLine;

    @JsonProperty("vendorEmail")
    private String vendorEmail;

    @JsonProperty("keyContactType")
    private String keyContactType;


    @JsonProperty("vendorContactFirstName")
    private String vendorContactFirstName;

    @JsonProperty("vendorContactMiddleName")
    private String vendorContactMiddleName;

    @JsonProperty("vendorContactLastName")
    private String vendorContactLastName;

    @JsonProperty("vendorContactDesignation")
    private String vendorContactDesignation;

    private String vendorContactPanCard;

    private String vendorContactAdharCard;

    private String vendorContactLandLine;

    private String vendorContactMobile;

    private String vendorContactEmail;

    private String bankName;

    private String bankNumber;

    private String bankCountry;

    private String ifscCode;

    private String swiftCode;

    private String beneficiaryName;

    private String accountNumber;


    private String regAddressLine1;

    private String regAddressLine2;

    private String regCity;

    private String regState;

    private String regPin;

    private String regCountry;

    private String taxVendorCode;

    private String taxVendorSiteCode;

    private String taxPanCard;

    private String gstNumber;

    private String isGstPresent;

    private String gstExemptionFlag;

    private String corAddressLine1;

    private String corAddressLine2;

    private String corCity;

    private String corState;

    private String corPin;

    private String corCountry;

    private List<VendorSalesDetailsDto> vendorSalesDetailsDtos;

    private List<VendorFinanceDetailsDto> vendorFinanceDetailsDtos;

    private List<VendorLogisticsDetailsDto> vendorLogisticsDetailsDtos;



    @JsonProperty("status")
    private String status;

    @JsonProperty("oracleBuId")
    private String oracleBuId;

    @JsonProperty("corAddressType")
    private String corAddressType;

    @JsonProperty("regAddressType")
    private String regAddressType;
    @JsonProperty("branch")
    private String branch;
    @JsonProperty("vendor_cat")
    private String vendorCategory;

    private String cusField1;
    private String cusField2;
    private String cusField3;
    private String cusField4;
    private String cusField5;
    private String cusField6;
    private String cusField7;
    private String cusField8;
    private String cusField9;
    private String cusField10;
    private String cusField11;
    private String cusField12;
    private String cusField13;
    private String cusField14;
    private String cusField15;
    private String cusField16;
    private String cusField17;
    private String cusField18;
    private String cusField19;
    private String cusField20;

    private String basicDetailsName;

    private String basicDetailsMail;

    private String basicDetailsMobile;



}

