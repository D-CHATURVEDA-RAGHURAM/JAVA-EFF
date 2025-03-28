package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class
ExternalPRInboundRequisitionDtoV6 {

    @JsonProperty("reqid")
    public String requisitionId;
    @JsonProperty("prtype")
    public String requisitionType;
    @JsonProperty("buid")
    public String businessUnit;
    @JsonProperty("apprdate")
    private String approvedDate;
    @JsonProperty("cur")
    private String currency;
   //new fileds
   @JsonProperty("reqorg")
   private String requestingOrg;
   @JsonProperty("cust")
   private String customerName;
   @JsonProperty("proj")
   private String projectNo;
   @JsonProperty("createdBy")
   private String createdBy;
   @JsonProperty("reqdate")
   private String createdDate;
   @JsonProperty("pproj")
   private String peggedProjNo;
   @JsonProperty("reqitems")
   private List<ExternalPRRequestItemsDtoV6>requisitionItems;
//not used
    @JsonProperty("YSTATUS_CODE")
    public String statusCode;
    @JsonProperty("BUKRS")
    public String companyCode;
    @JsonProperty("FRGKZ")
    private String  releaseState;
    private String status;
    @JsonProperty("erp_type")
    private String erpType;
    @JsonProperty("recordid")
    private String recordId;
    @JsonProperty("wrenchlink")
    private String wrenchLink;
}
