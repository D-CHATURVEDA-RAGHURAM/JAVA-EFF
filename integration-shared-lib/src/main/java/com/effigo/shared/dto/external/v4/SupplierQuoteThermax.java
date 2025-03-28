package com.effigo.shared.dto.external.v4;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "SupplierQuote")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplierQuoteThermax {

    @XmlElement(name = "SupplierQuoteHeader")
    private SupplierQuoteHeader supplierQuoteHeader;

    @XmlElement(name = "SupplierQuoteLine")
    private List<SupplierQuoteLine> supplierQuoteLines;
}
