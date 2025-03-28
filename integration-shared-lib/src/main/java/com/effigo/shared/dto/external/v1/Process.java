package com.effigo.shared.dto.external.v1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Process {

    @XmlElement(name = "TenantID")
    private String tenantId;

    @XmlElement(name = "AccountingEntityID")
    private String accountingEntityId;

    @XmlElement(name = "LocationID")
    private String locationId;

    @XmlElement(name = "ActionCriteria")
    private ActionCriteria actionCriteria;


}
