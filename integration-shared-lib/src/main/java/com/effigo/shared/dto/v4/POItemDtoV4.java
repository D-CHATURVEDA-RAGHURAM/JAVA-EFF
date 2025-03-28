package com.effigo.shared.dto.v4;

import com.effigo.shared.dto.v2.PoPriceTemplateStructureDtoV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class POItemDtoV4 {

    @JsonProperty("poid")
    public String poId;

    @JsonProperty("poitmid")
    public String poItmId;

    @JsonProperty("reqitemid")
    public String reqItemId;

    @JsonProperty("itemcode")
    public String itemCode;

    @JsonProperty("description")
    public String description;

    @JsonProperty("qty")
    public String qty;

    @JsonProperty("uom")
    public String uom;

    @JsonProperty("price")
    public String price;

    @JsonProperty("costcenter")
    public String costCenter;

    @JsonProperty("itempriceper")
    public String uomQuantity;

    ////////////////////////////////////

    @JsonProperty("sourcingreqid")
    public String sourcingReqId;

    @JsonProperty("sourcingitemid")
    public String sourcingItemId;

    @JsonProperty("text1")
    public String text1;

    @JsonProperty("text2")
    public String text2;

    @JsonProperty("text3")
    public String text3;

    @JsonProperty("itemtext")
    public String itemText;

    @JsonProperty("iteminfo")
    public String itemInfo;

    @JsonProperty("materialtext")
    public String materialText;

    @JsonProperty("deliverytext")
    public String deliveryText;

    @JsonProperty("predispatch")
    public String predisPatch;

    @JsonProperty("inbound")
    public String inbound;

    @JsonProperty("batch")
    public String batch;

    @JsonProperty("uom2")
    public String uom2;

    @JsonProperty("itemStatus")
    public Integer itemStatus;

    @JsonProperty("itemValidityDate")
    public Timestamp itemValidityDate;

    @JsonProperty("deliveryCompletionStatus")
    public String deliveryCompletionStatus;

    @JsonProperty("storageLocation")
    private String storageLocation;

    @JsonProperty("reqId")
    private String reqId;

    @JsonProperty("purReqId")
    private String purReqId;

    @JsonProperty("index")
    private String index;

    @JsonProperty("referenceId")
    private String referenceId;

    @JsonProperty("line")
    private String line;

    @JsonProperty("lineNumber")
    private String lineNumber;

    @JsonProperty("subPackage")
    private String subPackage;

    @JsonProperty("packageNumber")
    private String packageNumber;

    @JsonProperty("shortText")
    private String shortText;

    @JsonProperty("pricedetails")
    public List<PoPriceTemplateStructureDtoV4> poPriceTemplateStructureDtoV2s;

}
