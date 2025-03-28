package com.effigo.shared.dto.external.v1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationArea {

    @XmlElement(name = "Sender")
    private Sender sender;

    @XmlElement(name = "CreationDateTime")
    private String creationDateTime;

    @XmlElement(name = "BODID")
    private String bodId;


}
