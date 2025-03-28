package com.effigo.shared.dto.external.v4;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    @XmlElement(name = "ItemID")
    private ItemID itemID;
}
