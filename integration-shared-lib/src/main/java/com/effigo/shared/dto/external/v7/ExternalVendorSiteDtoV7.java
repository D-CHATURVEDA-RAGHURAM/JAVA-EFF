package com.effigo.shared.dto.external.v7;

import com.effigo.shared.dto.external.v6.ExternalVendorCorAddressDtoV6;
import com.effigo.shared.dto.external.v6.ExternalVendorRegAddressDtoV6;
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
public class ExternalVendorSiteDtoV7 {

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
	private List<ExternalVendorContactDtoV7> vendorContacts;

	@JsonProperty("bank_accounts")
	private List<ExternalVendorBankDtoV7> bankDetails;

/*	@JsonProperty("address")
	private List<ExternalVendorRegAddressDtoV7> regAddress;*/

	@JsonProperty("taxes")
	private List<ExternalVendorTaxDtoV7> taxDetails;

	@JsonProperty("process_type")
	private String processType;

	@JsonProperty("registered_address")
	private ExternalVendorRegAddressDtoV6 regAddress;

	@JsonProperty("correspondence_address")
	private ExternalVendorCorAddressDtoV6 corAddress;

	/*


	@JsonProperty("sales_poc")
	private List<ExternalVendorSalesPocDtoV7> salesPoc;

	@JsonProperty("logistics_poc")
	private List<ExternalVendorLogisticsPocDtoV7> logisticsPoc;*/

}
