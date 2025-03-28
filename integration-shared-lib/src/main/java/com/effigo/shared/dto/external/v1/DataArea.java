package com.effigo.shared.dto.external.v1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DataArea {

    @XmlElement(name = "Process")
    private Process process;

    @XmlElement(name = "ThermaxRFQBidder")
    private ThermaxRFQBidder thermaxRFQBidder;


}
