package com.effigo.shared.dto.v6;

import com.effigo.shared.dto.v1.PaymentMainDtoV1;
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
public class PaymentRequestDtoV6 {

	@JsonProperty("IM_REQ")
	List<PaymentMainDtoV6> paymentMainDtoV6List;
}
