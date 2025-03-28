package com.effigo.shared.dto.external.v5;

import com.effigo.shared.dto.v6.ExternalPrItemBom;
import com.effigo.shared.util.TrimStringDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRRequestItemsDtoV6 {
    @JsonProperty("reqitmno")
    private String prItmId;
    //new fields
    @JsonProperty("reqdisid")
    private String prDistId; 
    @JsonProperty("itmcode")
    private String itemCode;
    @JsonProperty("reqitmid")
    private String reqItmId;
    @JsonProperty("itmdesc")
    private String itemDescription;
    @JsonProperty("pgr")
    private String purchaseGroup;
    @JsonProperty("buyer")
    private String buyerId;
    @JsonProperty("status") 
    private String status;
    @JsonProperty("prpno") 
    private String prpno;
    @JsonProperty("prpdate")
    private String prpDate; 
    @JsonProperty("pdt") 
    private String pdt;
    @JsonDeserialize(using = TrimStringDeserializer.class)
    @JsonProperty("qty")
    private String quantity;
    @JsonProperty("qtydel")
    private String qtyDelivered;
    @JsonProperty("uom")
    private String uom;
    @JsonProperty("estprice")
    private String estimatedPrice;
    @JsonProperty("mrp")
    private String mrp;
    @JsonProperty("accflag")
    private String accFlag; 
    @JsonProperty("itmsubflag")
    private String itmSubCat;
    @JsonProperty("revno") 
    private String revno;
    @JsonProperty("deldate") 
    private String deliveryDate;
    @JsonProperty("requestorno")
    private String employeeCode;
    @JsonProperty("requestorname") 
    private String requestorName;
    @JsonProperty("wbs")
    private String wbs;
    @JsonProperty("siteid")
    private String siteId;
    @JsonProperty("deladd")
    private String deliveryAddress; 
    @JsonProperty("glaccount")
    private String glAccount;
    @JsonProperty("costcenter")
    private String costcenter;
    @JsonProperty("salesorderno")
    private String salesOrderNumber;
    @JsonProperty("soi") 
    private String salesOrderItem;
    @JsonProperty("networkorder")
    private String networkOrder;
    @JsonProperty("shiptolocationid")
    private String shipTo;
    @JsonProperty("billtolocationid")
    private String billTo;
    @JsonProperty("shiptoorgcode")
    private String shipToOrgCode;
    @JsonProperty("KNTTP")
    public String accountAssgnCategory;
    @JsonProperty("LONG_TEXT")
    private String fullDescription;
    @JsonProperty("itembom")
    private List<ExternalPrItemBom>itemBom;
    @JsonProperty("SERITEMS")
    public List<ExternalPRServiceItemsDtoV6> serviceItems;
//unused
    @JsonProperty("LGORT")
    public String  storageLocation;
    @JsonProperty("BEDNR")
    public String trackingNo;
    @JsonProperty("MATKL")
    public String materialGroup;
    @JsonProperty("BADAT")
    private String createdDate;
    @JsonProperty("LFDAT")
    private String requiredDate;
    @JsonProperty("PREIS")
    private String price;
    @JsonProperty("PEINH")
    private String reqItem;
    @JsonProperty("PSTYP")
    private String itemCategory;
    @JsonProperty("SOBKZ")
    private String stockIndicator;
    @JsonProperty("CHARG")
    private String batchNo;
    @JsonProperty("ZV_LAST_PO_RATE")
    private String lastPoRate;
    @JsonProperty("ZV_LAST_PO_DATE")
    private String poItemChangeDate;
    @JsonProperty("ZV_LAST_PO_QTY")
    private String poQty;
    @JsonProperty("ZV_LAST_PO_SUPPLIER")
    private String vendorAccountNo;
    @JsonProperty("NAME1")
    private String purchaseOrg;
    @JsonProperty("PSP_PNR")
    private String wbsElement;
    @JsonProperty("wrenchlink")
    private String wrenchLink;
    @JsonProperty("service_category")
    private String serviceCategory;
    @JsonProperty("created_date")
    private String uniqueCreatedDate;

}
