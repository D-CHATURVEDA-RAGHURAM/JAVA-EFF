package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentAdvanceExternalImResponseDtoV1 {

	@JsonProperty("Status")
	private HttpStatus status=HttpStatus.INTERNAL_SERVER_ERROR;

	@JsonProperty("IM_RESPONSE")
	List<PaymentAdvanceExternalResponseDtoV1> paymentAdvanceExternalResponseDtoV1s;


}
