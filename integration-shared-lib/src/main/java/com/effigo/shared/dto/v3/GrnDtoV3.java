package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public class GrnDtoV3{
    private String grnId;
    private String effigorefno;

    @JsonProperty("PSTNG_DATE")
    public String postingdate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("DOC_DATE")
    public String docdate;

//	@JsonProperty("LOWER_TXT")
//	public String Lowertext;

    @JsonProperty("HEADER_TXT")
    public String headertext;

    @JsonProperty("REF_DOC_NO")
    public String asnreferenceno;

    @JsonProperty("INV_VALUE")
    public String supplierinvoicevalue;

    @JsonProperty("MAT_YEAR")
    public String matYear;

    @JsonProperty("STATUS")
    public String status;

    @JsonProperty("items")
    List<GrnItemsDtoV3> items;

    }


