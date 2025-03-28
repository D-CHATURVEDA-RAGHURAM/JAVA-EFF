package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemsDto {
    private String  packageNumber;
    private String  lineNumber;
    private String  extLine;
    private String  subPackage;
    private String  itemCode;
    private String  quantity;
    private String  baseUom;
    private String  uomIso;
    private String  priceUnit;
    private String  grossPrice;
    private String  itemPrice;
    private String  shortText;
    private String  plantPackage;
    private String  plantLine;
    private String  text1;
    private String  text2;
    private String  text3;
    private String  text4;
    private String  text5;
    private String  text6;

}
