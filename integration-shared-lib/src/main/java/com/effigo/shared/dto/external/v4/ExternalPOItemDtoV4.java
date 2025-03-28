package com.effigo.shared.dto.external.v4;

import com.effigo.shared.dto.external.v2.ExternalPODelivaryScheduleDtoV2;
import com.effigo.shared.dto.v2.PoPriceTemplateStructureDtoV2;
import com.effigo.shared.dto.v4.PoPriceTemplateStructureDtoV4;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalPOItemDtoV4 {

    @JsonProperty("I_EBELP")
    public String poItmId;

    @JsonProperty("I_EBELN")
    public String poId;

    @JsonProperty("I_MATNR")
    public String itemCode;

    @JsonProperty("I_EMATN")
    private String materialMpn;

    @JsonProperty("I_MFRPN")
    private String partNumber;

    @JsonProperty("I_MFRNR")
    private String manufacturerNumber;

    @JsonProperty("I_MAKTX")
    public String description;

    @JsonProperty("I_MENGE")
    public String qty;

    @JsonProperty("I_MEINS")
    public String uom;


    @JsonProperty("I_NETPR")
    public String price;

    @JsonProperty("costcenter")
    public String costCenter;

    @JsonProperty("I_PEINH")
    public String  uomQuantity;

    @JsonProperty("I_BPRME")
    public String uom2;

    @JsonProperty("I_IGST_PER")
    public String IgstPer;

    @JsonProperty("I_SGST_PER")
    public String sgstPer;

    @JsonProperty("I_CGST_PER")
    public String cgstPer;

    @JsonProperty("I_UTGST_PER")
    public String utgstPer;

    @JsonProperty("I_CESS_PER")
    public String cessPer;

    @JsonProperty("I_P_F_PER")
    public String pfPer;

    @JsonProperty("I_DISC_PER")
    public String discPer;

    @JsonProperty("I_ITEM_AMT")
    public String itemAmt;

    @JsonProperty("I_GROSS_AMT")
    public String grossAmt;

    @JsonProperty("I_TOTAL_AMT")
    public String totalAmt;

    @JsonProperty("I_OTHER_AMT")
    public String otherAmt;

    @JsonProperty("I_LEWED")
    public String itemValidityDate;

    @JsonProperty("I_ELIKZ")
    public String deliveryCompletionStatus;

    @JsonProperty("I_LOEKZ")
    public String itemStatus;

    @JsonProperty("I_LGORT")
    private String storageLocation;

    @JsonProperty("I_BANFN")
    private String reqId;

    @JsonProperty("I_BNFPO")
    private String purReqId;

    @JsonProperty("PRICEDETAILS")
    public List<PoPriceTemplateStructureDtoV4> poPriceTemplateStructureDtoV2s;

    @JsonProperty("POSCHEDULEITEMS")
    public List<ExternalPODelivaryScheduleDtoV4> externalPODelivaryScheduleDtoV2s;

}
