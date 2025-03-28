package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPriceInfoDetailsRequestV4 {

	@JsonProperty("ZWERKS")
	private String plant;

	@JsonProperty("ZEKORG")
	private String purchaseOrg;

	@JsonProperty("ZMATNR")
	private String materialNumber;

	@JsonProperty("ZMAKTX")
	private String materialDescription;

	@JsonProperty("ZOBJECTID")
	private String inforRecordNumber;

	@JsonProperty("ZESOKZ")
	private String category;

	@JsonProperty("ZLIFNR")
	private String vendorNumber;

	@JsonProperty("ZNETPR")
	private String netPrice;

	@JsonProperty("ZWAERS")
	private String currency;

	@JsonProperty("ZBPRME")
	private String orderPriceUnit;

	@JsonProperty("ZERDAT")
	private String creationDate;

	@JsonProperty("ZDATAB")
	private String validityStartDate;

	@JsonProperty("ZDATBI")
	private String validityEndDate;

	@JsonProperty("ZMWSKZ")
	private String taxCode;

}
