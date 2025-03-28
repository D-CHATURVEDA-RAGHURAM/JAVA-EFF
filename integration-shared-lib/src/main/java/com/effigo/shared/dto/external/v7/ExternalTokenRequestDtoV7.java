package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalTokenRequestDtoV7 {

	@JsonProperty("client_id")
	private String clientId;

	@JsonProperty("client_secret")
	private String clientSecret;

	@JsonProperty("username")
	private String userName;

	@JsonProperty("password")
	private String pwd;

	@JsonProperty("grant_type")
	private String grantType;


}
