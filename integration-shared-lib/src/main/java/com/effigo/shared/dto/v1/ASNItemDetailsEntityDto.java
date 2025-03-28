package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ASNItemDetailsEntityDto {

    @JsonProperty("internalRefItemNo")
    private String internalRefItemNo;

    @JsonProperty("internalRefNo")
    private String internalRefNo;

    @JsonProperty("poItemId")
    private String poItemId;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("itemUnit")
    private String itemUnit;

    @JsonProperty("materialCode")
    private String materialCode;

    @JsonProperty("erpnumber")
    private String erpNumber;

    @JsonProperty("asnItem")
    private ASNDetailsEntityDto asnItem;

    @JsonProperty("index")
    private String index;
}
