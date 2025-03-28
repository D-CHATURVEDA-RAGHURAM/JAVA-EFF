package com.effigo.shared.dto.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentAdvanceRequestDtoV1 {
	
	 @JsonProperty("IM_REQUEST")
	 private List<PaymentExternalDtoV1>  paymentExternalDtoV1s;

}
