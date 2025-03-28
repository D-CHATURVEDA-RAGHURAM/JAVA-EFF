package com.effigo.shared.dto.external.v4;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class LandedCost {

    @XmlElement(name = "CostCode")
    private String costCode;

    @XmlElement(name = "CalculationMethod")
    private String calculationMethod;

    @XmlElement(name = "Percentage")
    private String percentage;

    @XmlElement(name = "LandedCostAmount")
    private String landedCostAmount;

    @XmlElement(name = "Price")
    private String price;

    @XmlElement(name = "Currency")
    private String currency;

    @XmlElement(name = "TaxCode")
    private String taxCode;

    @XmlElement(name = "TaxCountry")
    private String taxCountry;

    @XmlElement(name = "IncludeinCustomsValueCalculation")
    private String includeInCustomsValueCalculation;
}
