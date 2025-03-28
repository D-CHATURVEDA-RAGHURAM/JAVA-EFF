package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDebitRequestDtoV1 {

    @JsonProperty("IM_REQUEST")
    private List<CreditDebitExternalDtoV1>  creditDebitExternalDtoV1List;
}
