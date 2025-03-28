package com.effigo.shared.dto.external.v4;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Quantity {

    @XmlAttribute(name = "unitCode")
    private String unitCode;

    @XmlValue
    private String value;
}
