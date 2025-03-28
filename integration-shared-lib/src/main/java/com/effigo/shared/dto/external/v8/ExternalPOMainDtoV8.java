package com.effigo.shared.dto.external.v8;

import com.effigo.shared.dto.external.v5.ExternalPRRequestItemsDtoV6;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPOMainDtoV8 {

        @JsonProperty("PO_DOCUMENT")
        private ExternalPODocumentDtoV8 poDocument;

        @JsonProperty("poId") //Using H_ for header
        public @NotBlank(
                message = "{id.not-null}"
        )String poId;

        @JsonProperty("createdBy")
        public String createdBy;

        @JsonProperty("createdDate")
        public String createdDate;

        @JsonProperty("companyId")
        public @NotBlank(
                message = "{companyId.not-null}"
        )String companyId;

        @JsonProperty("status")
        public Integer status;

        @JsonProperty("erpRefNum")
        public String erpRefNum;

        @JsonProperty("siteName")
        public String siteName;

        @JsonProperty("poType")
        public String poType;

        @JsonProperty("amendmentNumber")
        public String amendmentNumber;

        @JsonProperty("totalPrice")
        public String poPriceTotal;

        @JsonProperty("billingAddressId")
        public String billingAddressId;

        @JsonProperty("billingAddress")
        public String billingAddress;

        @JsonProperty("deliveryAddress")
        public String deliveryAddress;

        @JsonProperty("currency")
        public String currency;

        @JsonProperty("currencyRate")
        public String currencyRate;

        @JsonProperty("paymentTerm")
        public String paymentTerm;

        @JsonProperty("deliveryTerm")
        public String deliveryTerm;

        @JsonProperty("businessUnit")
        public String businessUnit;

        @JsonProperty("supplierAddressId")
        public String supplierAddressId;

        @JsonProperty("purchasingGroup")
        public String purchasingGroup;

        @JsonProperty("purchasingDocumentCategory")
        public String purchasingDocumentCategory;

        @JsonProperty("incoTermsId1")
        public String incoTermsId1;

        @JsonProperty("incoTermsId2")
        public String incoTermsId2;

        @JsonProperty("headerText")
        public String headerText;

        @JsonProperty("validityStartDate")
        public String validityStartDate;

        @JsonProperty("validityEndDate")
        public String validityEndDate;

        @JsonProperty("region")
        public String region;

        @JsonProperty("LDApplicability")
        public String ldApplicability;

        @JsonProperty("LDPenaltyPerWeek")
        public String ldPenaltyPerWeek;

        @JsonProperty("maxPercentImposed")
        public String maxPercentImposed;

        @JsonProperty("LCApplicable")
        public String lcApplicable;

        @JsonProperty("QCApplicable")
        public String qcApplicable;

        @JsonProperty("ABGApplicable")
        public String abgApplicable;

        @JsonProperty("CPBGApplicable")
        public String cpbgApplicable;

        @JsonProperty("PBGApplicable")
        public String pbgApplicable;

        @JsonProperty("countryOfTaxReturn")
        public String countryOfTaxReturn;

        @JsonProperty("freight")
        public String freight;

        @JsonProperty("releaseFormProfile")
        public String releaseFormProfile;

        @JsonProperty("importPO")
        public String importPO;

        @JsonProperty("recordId")
        public String recordId;

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

        @JsonProperty("ITEMS")
        private List<ExternalPOItemDtoV8> poItems;

}
