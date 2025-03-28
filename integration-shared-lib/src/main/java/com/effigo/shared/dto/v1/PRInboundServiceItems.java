package com.effigo.shared.dto.v1;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PRInboundServiceItems {
	@NotEmpty(message = "300026")
	@JsonProperty("servitmid")
	public String serviceItemId;

	@NotEmpty(message = "300026")
	@JsonProperty("servcode")
	public String serviceCode;

	@NotEmpty(message = "300031")
	@Size(max = 50, message = "300032")
	@PositiveOrZero(message = "300032")
	@JsonProperty("servqty")
	public String servItemQuantity;

	@NotEmpty(message = "300033")
	@Size(max = 50, message = "300034")
	@JsonProperty("servuom")
	public String servItemUom;

	@NotEmpty(message = "300035")
	@Size(max = 50, message = "300036")
	@PositiveOrZero(message = "300036")
	@JsonProperty("servestimatedprice")
	public String servItemPrice;

	@NotEmpty(message = "300035")
	@Size(max = 50, message = "300036")
	@PositiveOrZero(message = "300036")
	@JsonProperty("servnetPrice")
	public String servNetPrice;

	@NotEmpty(message = "300035")
	@Size(max = 1000, message = "300036")
	@PositiveOrZero(message = "300036")
	@JsonProperty("servdescription2")
	public String servDescription2;

	@NotEmpty(message = "300035")
	@Size(max = 1000, message = "300036")
	@PositiveOrZero(message = "300036")
	@JsonProperty("servDescription")
	public String servDescription;

	@JsonProperty("INTROW")
	public String customField1;

	@JsonProperty("customField2")
	public String customField2;
	@JsonProperty("customField3")
	public String customField3;

	@JsonProperty("customField4")
	public String customField4;

	

	@JsonProperty("partition_group")
	private String partitionGroup;
}
