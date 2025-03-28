package com.effigo.shared.dto.external.v1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ThermaxRFQBidder {

    @XmlElement(name = "RFQ")
    private RFQ rfq;

    @XmlElement(name = "BidderDetail")
    private List<BidderDetail> bidderDetails;


}
