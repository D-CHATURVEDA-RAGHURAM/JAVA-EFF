package com.effigo.shared.dto.external.v4;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplierQuoteLine {

    @XmlElement(name = "LineNumber")
    private String lineNumber;

    @XmlElement(name = "Item")
    private Item item;

    @XmlElement(name = "Quantity")
    private Quantity quantity;

    @XmlElement(name = "UnitPrice")
    private UnitPrice unitPrice;

    @XmlElement(name = "EffectiveTimePeriod")
    private EffectiveTimePeriod effectiveTimePeriod;

    @XmlElement(name = "Status")
    private Status status;

    @XmlElement(name = "UserArea")
    private UserArea userArea;
}
