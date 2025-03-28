package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalMasterItemReqDtoV3 {

	@JsonProperty("ZASNUM")
	private String code2;

	private String type;

	@JsonProperty("ZMATNR")
	private String code;

	@JsonProperty("ZASKTX")
	private String name2;

	@JsonProperty("ZWERK")
	private String plantcode;

	@JsonProperty("ZWGBEZ")
	private String cusField10;


	@JsonProperty("ZMAKTX")
	private String name;

	@JsonProperty("ZLVORM_PLANT")
	private String plantstatus;

	@JsonProperty("ZLVORM")
	private String status;

	@JsonProperty("ZMEINS")
	private String uom;

	@JsonProperty("ZZMAT_SUB")
	private String subCategory;

	@JsonProperty("ZERSDA")
	private String cusField1;

	@JsonProperty("ZNTGEW")
	private String cusField2;

	@JsonProperty("ZPLIFZ")
	private String cusField3;

	@JsonProperty("ZWEBAZ")
	private String cusField4;

	@JsonProperty("cusField5")
	private String cusField5;

	@JsonProperty("cusField6")
	private String cusField6;

	@JsonProperty("cusField7")
	private String cusField7;

	@JsonProperty("cusField8")
	private String cusField8;

	@JsonProperty("ZMATKL")
	private String cusField9;

	@JsonProperty("ZASTYP")
	private String categoryid;

	/* Extra fields */

	@JsonProperty("ZWERKS_NAME1")
	private String plantName;

	@JsonProperty("ZBESKZ")
	private String procurementType;

	@JsonProperty("ZSOBSL")
	private String specialProcurement;

	@JsonProperty("ZEXTWG")
	private String extMaterialGroup;

	@JsonProperty("ZZMAT_SUB_DESC")
	private String materialSubcategoryDescription;

}
