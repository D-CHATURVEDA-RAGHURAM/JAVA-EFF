package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalServiceDtoV3 {
        @JsonProperty("ZEBELN")
        private String poId;
        @JsonProperty("ZBLDAT")
        private String invoiceDate;
        @JsonProperty("ZBUDAT")
        private String postingDate;
        @JsonProperty("ZMBLNR")
        private String grnId;
        @JsonProperty("ZDMBTR")
        private String grnAmount;
        @JsonProperty("ZXBLNR")
        private String einvoice;
        @JsonProperty("ZEBELP")
        private String poItemId;
        @JsonProperty("ZMJAHR")
        public String matYear;
        @JsonProperty("ZBTEXT")
        private String movementTypeText;
        @JsonProperty("ZBWART")
        private String movementType;
        @JsonProperty("ZWAERS")
        private String currency;
        @JsonProperty("ZNAME1")
        private String plantName;
        @JsonProperty("ZWERKS")
        private String plant;
        @JsonProperty("ZMAKTX")
        private String materialDescription;
        @JsonProperty("ZBSART")
        private String purchasingDocumentType;
        @JsonProperty("ZLIFNR")
        private String vendor;
        @JsonProperty("ZKTOKK")
        private String vendorCategoryDescription;
        @JsonProperty("ZNAME1_VENDOR")
        private String vendorName;
        @JsonProperty("ZKALSB")
        private String schemaGroupDesc;
        @JsonProperty("ZMATKL")
        private String materialGroup;
        @JsonProperty("ZWGBEZ")
        private String materialGroupDesc;
        @JsonProperty("ZKDAUF")
        private String salesOrder;
        @JsonProperty("ZKDPOS")
        private String salesOrderItem;
        @JsonProperty("goodsReceivedBy")
        private String goodsReceivedBy;
        @JsonProperty("packageNumber")
        private String packageNumber;
        @JsonProperty("shortText")
        private String shortText;
        @JsonProperty("dispatchNotificationId")
        private String dispatchNotificationId;

        @JsonProperty("comments")
        private String comments;

        @JsonProperty("acceptance")
        private String acceptance;
        @JsonProperty("text1")
        private String  text1;

        @JsonProperty("text2")
        private String  text2;

        @JsonProperty("text3")
        private String  text3;

        @JsonProperty("text4")
        private String  text4;

        @JsonProperty("text5")
        private String  text5;
//service items
        @JsonProperty("ZEILE")
        private String grnItemId;
        @JsonProperty("ZNETPR")
        private String itemPrice;
        @JsonProperty("ZERFMG")
        private String quantity;
        @JsonProperty("ZLFBNR")
        private String serviceNo;
        @JsonProperty("ZLFPOS")
        private String grnServiceNo;
        @JsonProperty("ZPTEXT")
        private String itemCategoryDescription;
        @JsonProperty("ZSGTXT")
        private String itemText;

        @JsonProperty("lineNumber")
        private String lineNumber;

        @JsonProperty("extLine")
        private String extLine;

        @JsonProperty("subPackage")
        private String subPackage;

        @JsonProperty("ZMATNR")
        private String itemCode;

        @JsonProperty("baseUom")
        private String baseUom;

        @JsonProperty("uomIso")
        private String uomIso;

        @JsonProperty("priceUnit")
        private String priceUnit;

        private String grossPrice;

        @JsonProperty("plantPackage")
        private String plantPackage;

        @JsonProperty("plantLine")
        private String plantLine;

}
