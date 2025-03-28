package com.effigo.shared.dto.internal.v8;

import com.effigo.shared.dto.external.v8.ExternalPOItemDtoV8;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoMainDtoV8 {

    @JsonProperty("po_id")
    private String poId;

    @JsonProperty("requisition_id")
    private String requisitionId;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("created_date")
    private String createdDate;

    @JsonProperty("company_id")
    private String companyId;

    @JsonProperty("siteName")
    private String siteName;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("approved_date")
    private LocalDateTime approvedDate;

    @JsonProperty("recieved_quantity")
    private String receivedQuantity;

    @JsonProperty("erp_ref_num")
    private String erpRefNum;

    @JsonProperty("delivery_term")
    private String deliveryTerm;

    @JsonProperty("terms_and_conditions")
    private String termsAndConditions;

    @JsonProperty("po_price_total")
    private String poPriceTotal;

    @JsonProperty("closed_date")
    private LocalDateTime closedDate;

    @JsonProperty("po_type")
    private String poType;

    @JsonProperty("billing_address_id")
    public String billingAddressId;

    @JsonProperty("billing_address")
    private String billingAddress;

    @JsonProperty("delivery_address")
    private String deliveryAddress;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("payment_term")
    private String paymentTerm;

    @JsonProperty("invoice_balance")
    private String invoiceBalance;

    @JsonProperty("purchasing_group")
    public String purchasingGroup;

    @JsonProperty("sourcing_type")
    private Boolean sourcingType;

    @JsonProperty("purchase_order_type")
    private String purchaseOrderType;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("direct_purchase_order")
    private Integer directPurchaseOrder;

    @JsonProperty("req_created_by")
    private String reqCreatedBy;

    @JsonProperty("supplier_primary_state")
    private String supplierPrimaryState;

    @JsonProperty("supplier_address_id")
    private String supplierAddressId;

    @JsonProperty("actual_po_price")
    private String actualPoPrice;

    @JsonProperty("costing_account")
    private String costingAccount;

    @JsonProperty("invoice_raiseby")
    private Integer invoiceRaiseBy;

    @JsonProperty("invoice_creator")
    private String invoiceCreator;

    @JsonProperty("amend_po_ref")
    private String amendPoRef;

    @JsonProperty("version")
    private Integer version;

    @JsonProperty("advance_amount")
    private BigDecimal advanceAmount;

    @JsonProperty("business_place")
    private String businessPlace;

    @JsonProperty("section_code")
    private String sectionCode;

    @JsonProperty("vendor_code")
    private String vendorCode;

    @JsonProperty("advance_balance")
    private BigDecimal advanceBalance;

    @JsonProperty("inco_terms_id1")
    private String incoTermsId1;

    @JsonProperty("inco_terms_id2")
    private String incoTermsId2;

    @JsonProperty("supplier_rcm_status")
    private Boolean supplierRcmStatus;

    @JsonProperty("last_update_date")
    private LocalDateTime lastUpdateDate;

    @JsonProperty("advance_amount_status")
    private Integer advanceAmountStatus;

    @JsonProperty("sap_integration_status")
    private Integer sapIntegrationStatus;

    @JsonProperty("integration_date")
    private LocalDateTime integrationDate;

    @JsonProperty("conversion_rate")
    private BigDecimal conversionRate;

    @JsonProperty("project")
    private String project;

    @JsonProperty("on_behalf_of_user_id")
    private String onBehalfOfUserId;

    @JsonProperty("po_title")
    private String poTitle;

    @JsonProperty("text_2")
    private String text2;

    @JsonProperty("text_3")
    private String text3;

    @JsonProperty("text_4")
    private String text4;

    @JsonProperty("text_5")
    private String text5;

    @JsonProperty("text_6")
    private String text6;

    @JsonProperty("text_7")
    private String text7;

    @JsonProperty("po_header_text")
    private String poHeaderText;

    @JsonProperty("po_header_note")
    private String poHeaderNote;

    @JsonProperty("po_pricing_types")
    private String poPricingTypes;

    @JsonProperty("po_deadlines")
    private String poDeadlines;

    @JsonProperty("po_doc")
    private String poDoc;

    @JsonProperty("po_doc_url")
    private String poDocUrl;

    @JsonProperty("parent_company_id")
    private String parentCompanyId;

    @JsonProperty("purchase_center_id")
    private String purchaseCenterId;

    @JsonProperty("inspection")
    private String inspection;

    @JsonProperty("price_escalation")
    private String priceEscalation;

    @JsonProperty("delivery_address_id")
    private String deliveryAddressId;

    @JsonProperty("group_id")
    private String groupId;

    @JsonProperty("supplier_amount")
    private Boolean supplierAmount;

    @JsonProperty("validity_start_date")
    private String validityStartDate;

    @JsonProperty("validity_end_date")
    private String validityEndDate;

    @JsonProperty("acknowledge_status")
    private Integer acknowledgeStatus;

    @JsonProperty("acknowledge_comments")
    private String acknowledgeComments;

    @JsonProperty("acknowledge_date")
    private LocalDateTime acknowledgeDate;

    @JsonProperty("ld_applicability")
    public String ldApplicability;

    @JsonProperty("ld_penalty_per_week")
    public String ldPenaltyPerWeek;

    @JsonProperty("max_percent_imposed")
    public String maxPercentImposed;

    @JsonProperty("lc_applicable")
    public String lcApplicable;

    @JsonProperty("abg_applicable")
    public String abgApplicable;

    @JsonProperty("cpbg_applicable")
    public String cpbgApplicable;

    @JsonProperty("pbg_applicable")
    public String pbgApplicable;

    @JsonProperty("partition_group")
    private String partitionGroup;

    @JsonProperty("release_form_profile")
    public String releaseFormProfile;

    @JsonProperty("currencyRate")
    public String currencyRate;

    @JsonProperty("amendmentNumber")
    public String amendmentNumber;

    @JsonProperty("importPO")
    public String importPO;

    @JsonProperty("customField1")
    public String customField1;

    @JsonProperty("customField2")
    public String customField2;

    @JsonProperty("customField3")
    public String customField3;

    @JsonProperty("customField4")
    public String customField4;

    @JsonProperty("customField5")
    public String customField5;

    @JsonProperty("customField6")
    public String customField6;

    @JsonProperty("ITEMS")
    private List<PoItemDtoV8> poItems;

}
