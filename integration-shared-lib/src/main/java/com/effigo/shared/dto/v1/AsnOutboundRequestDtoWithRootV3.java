package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AsnOutboundRequestDtoWithRootV3 {
    @JsonProperty("root")
    private AsnOutboundRequestDtoV3 asnOutboundRequestDtoV3;
}
