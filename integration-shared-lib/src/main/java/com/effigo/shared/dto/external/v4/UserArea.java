package com.effigo.shared.dto.external.v4;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class UserArea {

    @XmlElement(name = "Property")
    private List<Property> properties;

    @XmlElement(name = "LandedCostDetails")
    private LandedCostDetails landedCostDetails;
}
