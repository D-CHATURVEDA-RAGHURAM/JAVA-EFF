package com.effigo.shared.dto.external.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "ProcessThermaxRFQBidder")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcessThermaxRFQBidder {

    @XmlElement(name = "ApplicationArea")
    private ApplicationArea applicationArea;

    @XmlElement(name = "DataArea")
    private DataArea dataArea;


}

