package com.effigo.shared.dto.external.v4;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class UnitPrice {

    @XmlElement(name = "Amount")
    private Amount amount;

    @XmlElement(name = "PerQuantity")
    private PerQuantity perQuantity;
}
