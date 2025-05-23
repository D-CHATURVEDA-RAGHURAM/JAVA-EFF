package com.effigo.shared.dto.v1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequisitionItemErpDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String reqItmId;
	private String erpid;
}
