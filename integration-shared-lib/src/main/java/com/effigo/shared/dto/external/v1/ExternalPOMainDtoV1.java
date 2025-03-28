package com.effigo.shared.dto.external.v1;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPOMainDtoV1 {
    @NotBlank(message = "{id.not-null}")
    @NotNull
    //@ErrorCode(message="400002")
    @JsonProperty("poid")
    public String poId;
    
    @JsonProperty("reqid")
    public String reqId;
    @NotBlank(message = "{vendorId.not-null}")
    //@ErrorCode(message="400004")
    
    @JsonProperty("vendorid")
    public String vendorId;
    
    @JsonProperty("billingaddressid")
    public String billingAddressId;
    
    @JsonProperty("deliveryaddress")
    public String deliveryAddress;
    
    @JsonProperty("vendoraddressid")
    public String vendorAddressId;
    
    @JsonProperty("potype")
    public String poType;
    
    @JsonProperty("purchasecenter")
    public String purchaseCenterId;
    
    @JsonProperty("currency")
    public String currency;
    
    @JsonProperty("orgCode")
    public String orgCode;
    
    @NotNull
    @JsonProperty("createdby")
    public String createdBy;
    
    
    @NotNull
    @JsonProperty("createddate")
    public String createdDate;
    
    @JsonProperty("approveddate")
    public String approvedDate;
    
    @JsonProperty("closeddate")
    public String closedDate;
    
    @JsonProperty("inspection")
    public String inspection;
    
    @JsonProperty("pricechange")
    public String priceChange;
    
    @JsonProperty("sailentfeatures")
    public String sailentFeatures;
    
    @JsonProperty("deliveryterms")
    public String deliveryTerms;
    
    @JsonProperty("poamt")
    public String actualPoPrice;
    
    @JsonProperty("paymentterm")
    public String paymentTerm;
    
    @JsonProperty("version")
    public String version;
    
    @JsonProperty("incoterms")
    public String incoTerms;
    
    @JsonProperty("conversionrate")
    public String conversionRate;
    
    @JsonProperty("project")
    public String project;
    
    @JsonProperty("podocname")
    public String poDocName;
    
    @JsonProperty("poitems")
    public List<ExternalPOItemDtoV1> poItems;
    
    @JsonProperty("poserviceitems")
    public List<ExternalPoItemServiceDtoV1> poServiceItems;
    
    @JsonProperty("pricedetails")
    public ArrayList<ExternalPoPriceTemplateStructureDtoV1> priceDetails;
    
    @JsonProperty("schedule")
    public ArrayList<ExternalPODelivaryScheduleDtoV1> schedule;
    
    @JsonProperty("podoc")
    public ArrayList<ExternalPODocDtoV1> poDoc;
}
