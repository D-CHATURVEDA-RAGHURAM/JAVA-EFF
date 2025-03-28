package com.effigo.shared.common;

import java.util.stream.Stream;

public final class PRConstant {
	
	public enum ForeignkeyConstraintColumns {
		
		REQUISITION_TYPE("requisition_type", "300006"),
		DELIVARY_ADDR("warehouse_id", "300008"),
		BILLING_ADDR("billing_address","300010"),
		CURRENCY("currency", "300012"),
		ORGCODE("business_unit", "300014"),
		PO_TYPE("po_type","300020"),
		ITEM_ID("item_id", "300028"),
		SUGGESTED_SUPPLIER("suggested_supplier_company", "300030"),
		UOM("item_uom","300034"),
		CREATED_DT("createdDate", "300018"),
		APPROVED_DT("approvedDate", "300024");
		
		
		private final String columnName;
		private final String errCode;
		
		private ForeignkeyConstraintColumns(String columnName, String errCode) {
			this.columnName = columnName;
			this.errCode = errCode;
		}

		public String getColumnName() {
			return columnName;
		}
		
		public String getErrCode() {
			return errCode;
		}
		
		public static ForeignkeyConstraintColumns fromColumnName(String value) {
			return Stream.of(ForeignkeyConstraintColumns.values()).filter(keyConst -> keyConst.getColumnName().equals(value)).findFirst().orElse(null);
		}
	}
	
	public enum PRErrorCodes {
		INVALID_REQUISITION_DETAILS("300000", "Invalid Requistion Details"),
		VALIDATE_FIELD_MAXLENGTH("300001", "Max Length for <fieldname> should be less than <maxlengthoffield>"),
		PRNO_MANDATORY("300002", "PR No is Mandatory field"), 
		PRNO_INVALID("300003", "Invalid PR No"),
		TITTLE_MANDATORY("300004", "Requisition title is mandatory"),
		REQTYPE_MANDATORY("300005", "Requisition Type is mandatory"),
		REQTYPE_NOTMATCH("300006", "Requisition Type is not matching with the system"),
		DELIVARY_ADDR_MANDATORY("300007",	"Delivery address is mandatory"),
		DELIVARY_ADDR_MATCH("300008", "Delivery address id should match with the system"),
		BILLING_ADDR_MANDATORY("300009",	"Billing address is mandatory"),
		BILLING_ADDR_MATCH("300010", "Billing address id should match with the system"),
		CURRENCY_MANDATORY("300011",	"Currency is mandatory"),
		CURRENCY_MATCH("300012", "Currency id should match with the system"),
		ORGCODE_MANDATORY("300013",	"OrgCode is mandatory"),
		ORGCODE_MATCH("300014", "Orgcode id should match with the system"),
		CREATED_BY_MANDATORY("300015",	"CreatedBY is mandatory"),
		CREATED_BY_MATCH("300016", "CreatedBY id should match with the system"),
		CREATED_DATE_MANDATORY("300017",	"Created date is mandatory"),
		CREATED_DATE_MATCH("300018", "Created date format should be YYYY-MM-DD"),
		PO_TYPE_MANDATORY("300019",	"Po Type is mandatory"),
		PO_TYPE_MATCH("300020", "PO Type id should match with the system "),
		ESTIMATED_MANDATORY("300021",	"Estimated value is mandatory"),
		ESTIMATED_MATCH("300022", "Estimated value should be numeric"),
		APPROVED_DATE_MANDATORY("300023",	"Approved date is mandatory"),
		APPROVED_DATE_MATCH("300024", "Approved date format should be YYYY-MM-DD"),
		CONVERSION_RATE_MANDATORY("300025",	"Conversion rate should be numeric"),
		PR_ITEM_NO_MANDATORY("300026",	"PR Item No is Mandatory field"),
		ITEM_ID_MANDATORY("300027",	"Item Id is mandatory"),
		ITEM_ID_MATCH("300028", "Item Id should match with the system"),
		ITEM_DESCRIPTION_MANDATORY("300029",	"Item description is mandatory"),
		SUGGESTED_SUPPLIER_MATCH("300030", "Suggested Supplier should match with the system"),
		ITEM_QTY_MANDATORY("300031",	"Item Qty is mandatory"),
		ITEM_QTY_MATCH("300032", "Item Qty should be numeric"),
		UOM_MANDATORY("300033",	"UOM is mandatory"),
		UOM_MATCH("300034", "UOM Should match with the system"),
		ESTIMATED_PRICE_MANDATORY("300035",	"Estimated price is mandatory"),
		ESTIMATED_PRICE_MATCH("300036", "Estimated price should be numeric"),
		COST_CENTER_MANDATORY("300037",	"Cost center is mandatory"),
		COST_CENTER_MATCH("300038", "Cost center should match with the system"),//
		PRICE_PER_UNIT_MANDATORY("300039",	"Price per unit should be mandatory"),
		PRICE_PER_UNIT_MATCH("300040", "Price per unit should be mandatory 1 or  2"),//
		BUID_IS_MANDATORY("300041", "BusinessUnit is mandatory");
		
		private final String errCode;
		private final String errDescription;

		private PRErrorCodes(String code, String description) {
			this.errCode = code;
			this.errDescription = description;
		}

		public String getErrCode() {
			return errCode;
		}

		public String getErrDescription() {
			return errDescription;
		}
		
		public static PRErrorCodes fromErrorCode(String value) {
			return Stream.of(PRErrorCodes.values()).filter(prerr -> prerr.getErrCode().equals(value)).findFirst().orElse(null);
		}

		@Override
		public String toString() {
			return errCode + ": " + errDescription;
		}

	}
	
	public enum PRSuccessCodes {
		PR_REQUISITION_CREATED_SUCCESSFULLY("PR Requisition Created Successfully"),
		PR_REQUISITION_UPDATE_SUCCESSFULLY("PR Requisition Update Successfully"),
		PR_REQUISITION_AMEND_SUCCESSFULLY("PR Requisition For Amend Successfully"),
		PR_REQUISITION_CANCEL_SUCCESSFULLY("PR Requisition For Cancel Successfully");
		private final String value;

		PRSuccessCodes(final String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
