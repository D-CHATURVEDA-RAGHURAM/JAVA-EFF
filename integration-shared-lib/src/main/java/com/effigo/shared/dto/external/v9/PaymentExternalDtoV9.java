package com.effigo.shared.dto.external.v9;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentExternalDtoV9 {
   @JsonProperty("ZBUKRS")
   private String companyCode;
   @JsonProperty("ZLIFNR")
   private String vendorNo;
   @JsonProperty("ZAUGBL")
   private String clearingDoc;
   @JsonProperty("ZAUGDT")
   private String clearingDate;
   @JsonProperty("ZAUGGJ")
   private String clearingYear;
   @JsonProperty("ZBELNR")
   private String fiDocNo;
   @JsonProperty("ZBUDAT")
   private String fiDocPostingDate;
   @JsonProperty("ZBLDAT")
   private String fiDocDocDate;
   @JsonProperty("ZGJAHR")
   private String fiDocYear;
   @JsonProperty("ZXBLNR")
   private String invoiceNo;
   @JsonProperty("ZAMT")
   private String amt;
   @JsonProperty("ZMWSTS")
   private String tds;
   @JsonProperty("ZDMBTR")
   private String grossAmount;
   @JsonProperty("ZZUMSK")
   private String advanceInd;
   @JsonProperty("ZSHKZG")
   private String debitOrCreditInd;
   @JsonProperty("ZEBELN")
   private String poNumber;
   @JsonProperty("ZEBELP")
   private String poItem;
   @JsonProperty("ZWAERS")
   private String currency;
   @JsonProperty("ZSTBLG")
   private String revDocNo;
   @JsonProperty("ZSTJAH")
   private String revYear;
   @JsonProperty("ZDOCCAT")
   private String docCategory;
   @JsonProperty("ZBSCHL")
   private String postingKey;
   @JsonProperty("ZBLART")
   private String docType;
   @JsonProperty("field1")
   private String field1;
   @JsonProperty("field2")
   private String field2;
   @JsonProperty("field3")
   private String field3;
   @JsonProperty("field4")
   private String field4;
   @JsonProperty("field5")
   private String field5;
   @JsonProperty("field6")
   private String field6;
   @JsonProperty("field7")
   private String field7;
   @JsonProperty("field8")
   private String field8;
   @JsonProperty("field9")
   private String field9;
   @JsonProperty("field10")
   private String field10;
}
