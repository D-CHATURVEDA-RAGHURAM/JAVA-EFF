package com.effigo.shared.dto.v1;

import com.effigo.shared.dto.v6.PrItemBom;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PRInboundRequestItemsDtoV1 {
	@NotEmpty(message = "300026")
	@JsonProperty("reqitmid")
	public String requisitionItemId;

	@NotEmpty(message = "300027")
	@Size(max = 50, message = "300028")
	@JsonProperty("itemcode")
	public String itemId;

	@NotEmpty(message = "300029")
	@JsonProperty("description")
	public String itemDescription;

	@NotEmpty(message = "300030")
	@Size(max = 50, message = "300030")
	@JsonProperty("suggsupplier")
	public String suggestedSupplierCompany;

	@NotEmpty(message = "300031")
	@Size(max = 50, message = "300032")
	@PositiveOrZero(message = "300032")
	@JsonProperty("qty")
	public String itemQuantity;

	@NotEmpty(message = "300033")
	@Size(max = 50, message = "300034")
	@JsonProperty("uom")
	public String itemUom;

	@NotEmpty(message = "300035")
	@Size(max = 50, message = "300036")
	@PositiveOrZero(message = "300036")
	@JsonProperty("unitprice")
	public String itemPrice;

	@NotEmpty(message = "300035")
	@Size(max = 50, message = "300036")
	@PositiveOrZero(message = "300036")
	@JsonProperty("estimatedprice")
	public String itemTotalPrice;

	@NotEmpty(message = "300037")
	@Size(max = 50, message = "300038")
	@JsonProperty("costcenter")
	public String costingAccount;

	@NotEmpty(message = "300039")
	@JsonProperty("priceperunit")
	@Positive(message = "300039")
	public String pricePerUnit;

	@JsonProperty("status")
	public String itemStatus;


	@JsonProperty("closed")
	public String closed;

	@JsonProperty("auccode")
	public String aucCode;

	@JsonProperty("reqId")
	public String reqId;

	@JsonProperty("manufacturePartNumber")
	public String manufacturePartNumber;

	@JsonProperty("manufactureNumber")
	public String manufactureNumber;

	@JsonProperty("orderUnit")
	public String orderUnit;

	@JsonProperty("index")
	public Integer index;

	@JsonProperty("internalOrderNumber")
	public String internalOrderNumber;

	@JsonProperty("assetNumber")
	public String assetNumber;

	public String requiredDate;

	public Integer itemType;

	@JsonProperty("categoryId")
	private String categoryId;

	@JsonProperty("customField1")
	private String customField1;

	@JsonProperty("customField2")
	private String customField2;
	@JsonProperty("customField3")
	private String customField3;
	@JsonProperty("customField4")
	private String customField4;
	@JsonProperty("customField5")
	private String customField5;
	@JsonProperty("customField6")
	private String customField6;
	@JsonProperty("customField7")
	private String customField7;
	@JsonProperty("customField8")
	private String customField8;
	@JsonProperty("customField9")
	private String customField9;
	@JsonProperty("customField10")
	private String customField10;
	@JsonProperty("customField11")
	private String customField11;
	@JsonProperty("customField12")
	private String customField12;
	@JsonProperty("customField13")
	private String customField13;
	@JsonProperty("customField14")
	private String customField14;
	@JsonProperty("customField15")
	private String customField15;
	@JsonProperty("customField16")
	private String customField16;
	@JsonProperty("customField17")
	private String customField17;
	@JsonProperty("customField18")
	private String customField18;
	@JsonProperty("customField19")
	private String customField19;
	@JsonProperty("customField20")
	private String customField20;
	@JsonProperty("customField21")
	private String customField21;
	@JsonProperty("customField22")
	private String customField22;
	@JsonProperty("customField23")
	private String customField23;
	@JsonProperty("customField24")
	private String customField24;
	@JsonProperty("customField25")
	private String customField25;
	@JsonProperty("customField26")
	private String customField26;
	@JsonProperty("customField27")
	private String customField27;
	@JsonProperty("customField28")
	private String customField28;
	@JsonProperty("customField29")
	private String customField29;
	@JsonProperty("customField30")
	private String customField30;
	@JsonProperty("customField31")
	private String customField31;
	@JsonProperty("customField32")
	private String customField32;
	@JsonProperty("customField33")
	private String customField33;
	@JsonProperty("customField34")
	private String customField34;
	@JsonProperty("customField35")
	private String customField35;
	@JsonProperty("customField36")
	private String customField36;
	@JsonProperty("customField37")
	private String customField37;
	@JsonProperty("customField38")
	private String customField38;
	@JsonProperty("itembom")
	private List<PrItemBom> itemBom;
	@JsonProperty("seritems")
	public List<PRInboundServiceItems> serviceItems;

	@JsonProperty("partition_group")
	private String partitionGroup;
}
