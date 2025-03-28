package com.effigo.shared.dto.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PRItemsV1 {
	private String id;
	private String number;
	private String itemcode;
	private Boolean status;
	private String errorCode;
	private String errorMessage;
	private String serviceItemId;
	private String reqItemId;
	@JsonProperty("recordid")
	private String recordId;


}
