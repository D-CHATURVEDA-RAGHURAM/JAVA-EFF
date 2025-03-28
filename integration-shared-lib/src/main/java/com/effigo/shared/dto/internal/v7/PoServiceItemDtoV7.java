package com.effigo.shared.dto.internal.v7;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PoServiceItemDtoV7 {
    @JsonProperty("po_item_id")
    private String poItemId;

    @JsonProperty("purchase_order_id")
    private String purchaseOrderId;

    @JsonProperty("activity_number")
    private String activityNumber;

    @JsonProperty("item_code")
    private String itemCode;

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty("category_id")
    private String categoryId;

    @JsonProperty("supplier_company")
    private String supplierCompany;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("item_description")
    private String itemDescription;

    @JsonProperty("hsn_code")
    private String hsnCode;

    @JsonProperty("item_quantity")
    private String itemQuantity;

    @JsonProperty("open_quantity")
    public String openQty;

    @JsonProperty("item_unit")
    private String itemUnit;

    @JsonProperty("item_price_per")
    private Integer itemPricePer;

    @JsonProperty("item_type")
    private Integer itemType;

    @JsonProperty("item_price")
    private String itemPrice;

    @JsonProperty("other_charges")
    public String otherCharges;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("created_date")
    private LocalDateTime createdDate;

    @JsonProperty("reference_item_id")
    private String referenceItemId;

    @JsonProperty("requisition_id")
    private String requisitionId;

    @JsonProperty("recieved_quantity")
    private String receivedQuantity;

    @JsonProperty("invoice_balance")
    private String invoiceBalance;

    @JsonProperty("tax_code")
    private String taxCode;

    @JsonProperty("auc_code")
    private String aucCode;

    @JsonProperty("costing_account")
    private String costingAccount;

    @JsonProperty("item_text_1")
    private String itemText1;

    @JsonProperty("item_text_2")
    private String itemText2;

    @JsonProperty("item_text_3")
    private String itemText3;

    @JsonProperty("item_status")
    private String itemStatus;

    @JsonProperty("po_item_text")
    private String poItemText;

    @JsonProperty("po_item_info_record")
    private String poItemInfoRecord;

    @JsonProperty("po_item_material_text")
    private String poItemMaterialText;

    @JsonProperty("po_item_delvery_text")
    private String poItemDeliveryText;

    @JsonProperty("pre_dispatch")
    private Boolean preDispatch;

    @JsonProperty("received_item_amount")
    private String receivedItemAmount;

    @JsonProperty("in_bound")
    private Integer inBound;

    @JsonProperty("batch_details")
    private String batchDetails;

    @JsonProperty("overall_limit")
    private String overallLimit;

    @JsonProperty("service_sl_no")
    private String serviceSlNo;

    @JsonProperty("ref_requisition_item_id")
    private String refRequisitionItemId;

    @JsonProperty("parent_company_id")
    private String parentCompanyId;

    @JsonProperty("unit_name")
    private String unitName;

    @JsonProperty("po_id")
    private String poId;

    @JsonProperty("uom2")
    private String uom2;

    @JsonProperty("uom_quantity")
    private String uomQuantity;

    @JsonProperty("validity_date")
    private LocalDateTime validityDate;

    @JsonProperty("item_validity_date")
    private LocalDateTime itemValidityDate;

    @JsonProperty("index")
    private String index;

    @JsonProperty("reference_id")
    private String referenceId;

    @JsonProperty("storage_location")
    private String storageLocation;

    @JsonProperty("dispatch_index")
    private Integer dispatchIndex;

    @JsonProperty("delivery_date")
    private String deliveryDate;

    @JsonProperty("used_quantity")
    public String usedQty;

    @JsonProperty("gross_price")
    private String grossPrice;

    @JsonProperty("custom_field1")
    private String customField1;

    @JsonProperty("custom_field2")
    private String customField2;

    @JsonProperty("custom_field3")
    private String customField3;

    @JsonProperty("custom_field4")
    private String customField4;

    @JsonProperty("custom_field5")
    private String customField5;

    @JsonProperty("custom_field6")
    private String customField6;

    @JsonProperty("packageNumber")
    private String packageNumber;

    @JsonProperty("line")
    private String line;

    @JsonProperty("lineNumber")
    private String lineNumber;

    @JsonProperty("itemQty")
    private String itemQty; //item_quantity

    @JsonProperty("uom")
    private String uom; //item_uom

    @JsonProperty("subPackage")
    private String subPackage;


}
