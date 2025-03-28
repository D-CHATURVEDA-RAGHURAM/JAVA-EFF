package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;



@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnErrorOutboundResponseDtoV3 {

    @JsonProperty("item")
    private List<AsnErrorItemOutboundResponseDtoV3> errorItems;

}
