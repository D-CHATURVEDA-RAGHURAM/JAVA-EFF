package com.effigo.shared.dto.external.v1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Sender {

    @XmlElement(name = "LogicalID")
    private String logicalId;

    @XmlElement(name = "ComponentID")
    private String componentId;

    @XmlElement(name = "ConfirmationCode")
    private String confirmationCode;

    public Sender() {
    }

    public Sender(String s, String erp, String onError) {
    }
}
