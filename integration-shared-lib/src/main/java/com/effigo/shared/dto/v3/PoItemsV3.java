package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PoItemsV3 {
    @JsonProperty("__metadata")
    private String metadata= "";

    @JsonProperty("ZxPoNo")
    private String cusField24= "";
    @JsonProperty("ZxPoiNo")
    private String cusField7= "";
//    private String cusField35= "";
//    @JsonProperty("Extrow")
//    private String cusField7= "";
    @JsonProperty("Knttp")
    private String accAssignCat= ""; // cusField2
    @JsonProperty("Pstyp")
    private String poItemCat= "";// cusField2
    @JsonProperty("Matnr")
    private String cusField37= "";
    @JsonProperty("Txz01")
    private String description= "";
    @JsonProperty("Menge")
    private String qty= ""; //poQty
    @JsonProperty("Meins")
    private String uom; // poUom
    @JsonProperty("Eeind")
  //  @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private String cusField29= "";
    @JsonProperty("Netpr")
    private String cusField13= "";
    @JsonProperty("Peinh")
    private String priceUnit= "";
    @JsonProperty("Matkl")
    private String materialType= ""; // cusField2 - categoryId
    @JsonProperty("Werks")
    private String plannedDeliveryDays= "";
    @JsonProperty("Lgort")
    private String lgort= "";// cusField2 - categoryId
    @JsonProperty("Afnam")
    private String cusField28= "";
    @JsonProperty("Banfn")
    private String cusField21= "";
    @JsonProperty("Bnfpo")
    private String cusField22= "";
    @JsonProperty("Uebto")
    private String tolerance= ""; // 5
    @JsonProperty("Mwskz")
    private String cusField15= "";
    @JsonProperty("Tdid1")
    private String tdId1= ""; //F02
    @JsonProperty("ZxTdtext1")
    private String tdText1= "";
    @JsonProperty("Tdid2")
    private String tdId2= ""; // F04
    @JsonProperty("ZxTdtext2")
    private String tdText2= "";
    @JsonProperty("Untto")
    private String untto= ""; //0.0
    @JsonProperty("Bednr")
    private String cusField30= "";
    @JsonProperty("Sakto")
    private String materialNumber= "";
    @JsonProperty("Kostl")
    private String cusField31;
    @JsonProperty("PspPnr")
    private String cusField32= "";
    @JsonProperty("ZvVendorDelRem")
    private String vendorDeliveryRemarks= "";
    @JsonProperty("ZvFrtVendor")
    private String frightVendor= "";
    @JsonProperty("ZvItemText1")
    private String itemText1= "";
    @JsonProperty("ZvItemText2")
    private String itemText2= "";
    @JsonProperty("ZvItemText3")
    private String itemText3= "";
    @JsonProperty("ZvItemText4")
    private String itemText4= "";
    @JsonProperty("ZvItemText5")
    private String itemText5= "";
    @JsonProperty("ZvItemText6")
    private String itemText6= "";
    @JsonProperty("ZvItemText7")
    private String itemText7= "";
    @JsonProperty("ZvItemText8")
    private String itemText8= "";
    @JsonProperty("Ebelp")
    private String activityNo= "";

    @JsonProperty("Zi11Lifnr")
    private String zi11Lifnr;

    @JsonProperty("Zf11Lifnr")
    private String zf11Lifnr;

    @JsonProperty("JcdbLifnr")
    private String jcdbLifnr;

    @JsonProperty("ZswsLifnr")
    private String zswsLifnr;

    @JsonProperty("ZcecLifnr")
    private String zcecLifnr;

    @JsonProperty("ZclgLifnr")
    private String zclgLifnr;

    @JsonProperty("ZispLifnr")
    private String zispLifnr;

    @JsonProperty("ZlbcLifnr")
    private String zlbcLifnr;

    @JsonProperty("Zo14Lifnr")
    private String zo14Lifnr;

    @JsonProperty("Zo16Lifnr")
    private String zo16Lifnr;

    @JsonProperty("ZplrLifnr")
    private String zplrLifnr;

    @JsonProperty("ZwfgLifnr")
    private String zwfgLifnr;

    @JsonProperty("ZsdmLifnr")
    private String zsdmLifnr;

    @JsonProperty("ZsecLifnr")
    private String zsecLifnr;

    @JsonProperty("ZwmcLifnr")
    private String zwmcLifnr;

    @JsonProperty("ZsrvLifnr")
    private String zsrvLifnr;

    @JsonProperty("ZplcLifnr")
    private String aplcLifnr;

    @JsonProperty("ZotiLifnr")
    private String zotiLifnr;

    @JsonProperty("ZsqaLifnr")
    private String zsqaLifnr;

    @JsonProperty("ZxInsrtDt")
    private String insertDate= "";

    @JsonProperty("ZxInsrtTm")
    private String insertTime;

}
