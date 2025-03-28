package com.effigo.shared.common;

public final class AppConstant {

	public enum APIResponseConst {

		STATUS_SUCCESS("true"), STATUS_FAIL("false"), ERR_CODE("errorCode"), ERR_MSG("message"), ERRS("errors"); 

		private final String value;

		APIResponseConst(final String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
	
	public enum DateFormatter {
		DATE_FORMATTER_WITH_TIME("yyyy-MM-dd HH:mm:ss"),
		DATE_FORMATTER("yyyy-MM-dd");
		
		private final String value;

		DateFormatter(final String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
	
	public enum ValidationConst{
		DATE_REGX("^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$");
		
		private final String value;

		ValidationConst(final String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public enum MasterItemStrConst {
		CREATED_BY("Auto"), UPDATED_BY("Auto"), STATUS("1"), ERPIDS(" For erpIds: "), ITEMIDS(" For ItemId: "), ATTRID(
				" For Attribute: "), MASTER_ITEM("MasterItem"), MASTER_ITEM_ERR_RESPONSE(
						"MasterItemErrorResponse"), MASTER_ATTRIBUTE_ERR_RESPONSE(
								"MasterAttributeErrorResponse"), ITEM_CREATE_OR_UPDATE_SUCCESSFULLY(
										"Add Item Request Processed Successfully"), ATTRIBUTE("Attribute");

		private final String value;

		MasterItemStrConst(final String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public enum MasterItemIntConst {
		STATUS(1);

		private final int value;

		MasterItemIntConst(final int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public enum MasterItemErrorCodes {

		CATEGORY_MISSING("100001", "Category field is mandatory"), ITEM_CODE_MISSING("100002",
				"item code field is mandatory"),

		ITEM_NAME_MISSING("100003", "item name is mandatory"), ITEM_CODE_UOM_MISSING("100004",
				"item code in UOM is mandatory"),

		UOM_MISSING("100005", "UOM is mandatory"), UOM_CODE_MISMATCH("100006", "UOM Not matching with existing UOMs"),

		ATTRIBUTE_MISSING("100007", "Attribute is mandatory"), ATTRIBUTE_TYPE_MISSING("100008",
				"Attribite type is mandatory"),

		ATTRIBUTE_MISMATCH("100009",
				"Attribute is not matching with existing attributes"), ATTRIBUTE_VALUE_TYPE_MISSING("100010",
						"Attribite value type is mandatory"),

		ATTRIBUTE_VALUE_MISMATCH("100011", "Attribute value is not matching with existing values"),

		MANDATORY_VALUE_MISSING("100012", "mandatory field value is required"), VALUE_MISMATCH("100013",
				"Value should be Y or N"),

		CONSTRAINT_VIOLATION("100014", "Constraint Violation"), UNKNOWN_ERROR("100015", "Un known Error"),

		INSPECTION_MISSING("100016", "Inspection field is mandatory"),
		DELETION_FLAG_MISSING("100017","Deletion flag is mandatory"),
		PLANT_CODE_MISSING("100019","Plant_Code is Mandatory"),
		MATERIAL_ID_MISSING("100018", "Material-id is mandatory");

		private final String errCode;
		private final String errDescription;

		private MasterItemErrorCodes(String code, String description) {
			this.errCode = code;
			this.errDescription = description;
		}

		public String getErrCode() {
			return errCode;
		}

		public String getErrDescription() {
			return errDescription;
		}

		@Override
		public String toString() {
			return errCode + ": " + errDescription;
		}

	}

	public enum MasterAttributeErrorCodes {

		SERIALNUMBER_MISSING("110001", "Attribute Serial Number field is mandatory"), NAME_MISSING("110002",
				"Attribute Name is mandatory"), TYPE_MISSING("110003", "Attribute Type is mandatory"),

		CODE_MISSING("110004", "Attribute code is not matching"), VALUE_MISSING("110005",
				"Attribute Value is mandatory"),

		VALUE_ID_MISSING("110006", "Attribute Value Id is mandatory"),

		CONSTRAINT_VIOLATION("110007", "Constraint Violation Exception"), UNKNOWN_ERROR("110008", "Un known Error");

		private final String errCode;
		private final String errDescription;

		private MasterAttributeErrorCodes(String code, String description) {
			this.errCode = code;
			this.errDescription = description;
		}

		public String getErrCode() {
			return errCode;
		}

		public String getErrDescription() {
			return errDescription;
		}

		@Override
		public String toString() {
			return errCode + ": " + errDescription;
		}

	}

	public enum VendorConstants{
		REGISTERED_ADDRESS_TYPE("04");

		private final String value;

		VendorConstants(final String value) {
			this.value = value;
		}
		public String getValue() {
			return value;
		}
	}

	public enum ItemCodeType {
		SERVICES(2),
		GOODS(1),
		OTHERS(3);
		private final  Integer code;
		ItemCodeType(final Integer code) {
			this.code = code;
		}

		public Integer getCode() {
			return code;
		}

	}

	public enum ServiceSheetConstants {
		DYNAMIC_SERVICE("5"),
		NORMAL_SERVICE("4"),
		GRN("0");
		private final  String code;
		ServiceSheetConstants(final String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}
	}

	public static final String EN = "en";
	public static final String IN = "in";
	public static final String USD = "USD";
	public static final String INR = "INR";
	public static final int TWO = 2;
	public static final int Status = 4;

	public static final int SIX = 6;
	public static final String STATUS = "2";

}
