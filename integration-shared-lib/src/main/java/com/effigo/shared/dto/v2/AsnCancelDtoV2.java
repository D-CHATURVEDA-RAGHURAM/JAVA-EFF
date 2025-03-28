package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.AsnCancelDto;
import com.effigo.shared.dto.v1.ImRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnCancelDtoV2 implements Serializable {

	private String asnId;
	private AsnCancelDto asnCancelDto;


}
