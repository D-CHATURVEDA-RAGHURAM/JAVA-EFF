package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

    @Builder
    @AllArgsConstructor
    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class PaymentRequestDtoV8 {
        @JsonProperty("IM_REQ")
        List<PaymentMainDtoV8> paymentMainDtoV8s;
}
