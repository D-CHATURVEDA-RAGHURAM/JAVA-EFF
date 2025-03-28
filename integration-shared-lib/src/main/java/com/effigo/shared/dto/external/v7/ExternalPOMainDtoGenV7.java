package com.effigo.shared.dto.external.v7;

import com.effigo.shared.dto.external.v8.ExternalPOItemDtoV8;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPOMainDtoGenV7 {
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

        @JsonProperty("paymentTerm")
        public String paymentTerm;

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

        @JsonProperty("countryOfTaxReturn")
        public String countryOfTaxReturn;

        @JsonProperty("ITEMS")
        private List<ExternalPOItemDtoGenV7> poItems;

}
