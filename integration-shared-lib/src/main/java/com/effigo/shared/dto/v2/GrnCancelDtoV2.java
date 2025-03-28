package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.GrnCancelDto;
import com.effigo.shared.dto.v1.GrnImRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder(toBuilder = true)
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnCancelDtoV2 implements Serializable {


	private GrnCancelDto grnCancelDto;


	private String grnId;

}
