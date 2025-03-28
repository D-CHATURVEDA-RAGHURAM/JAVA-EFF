package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalWbsMainDtoV1 implements Serializable {

	private static final long serialVersionUID = 9216790552368745858L;

	@JsonProperty("wbs")
	List<ExternalWbsDtoV1> externalWbsDtoV1List;


}
