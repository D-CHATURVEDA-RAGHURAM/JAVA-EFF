package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnQtyRejectionResponseDtoV1 {

	@JsonProperty("Status")
	private HttpStatus status=HttpStatus.INTERNAL_SERVER_ERROR;

	@JsonProperty("INSPLOT_RESPONSE")
	List<ExternalGrnQualityRejectionResponseDtoV1> externalGrnQualityRejectionResponseDtoV1s;
}
