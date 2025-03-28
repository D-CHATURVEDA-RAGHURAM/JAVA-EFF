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
public class ExternalVendorSiteDtoV6 {

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

    @JsonProperty("land_line")
    private String landLine;

    @JsonProperty("vendor_email")
    private String vendorEmail;

    @JsonProperty("vendor_contact")
    private List<ExternalVendorContactDtoV6> vendorContacts;

    @JsonProperty("bank_accounts")
    private List<ExternalVendorBankDtoV6> bankDetails;

    @JsonProperty("registered_address")
    private List<ExternalVendorRegAddressDtoV6> regAddress;

    @JsonProperty("taxes")
    private List<ExternalVendorTaxDtoV6> taxDetails;


    @JsonProperty("sales_poc")
    private  List<ExternalVendorSalesPocDtoV6> salesPoc;


    @JsonProperty("logistics_poc")
    private List<ExternalVendorSalesPocDtoV6> logisticsPoc;





}
