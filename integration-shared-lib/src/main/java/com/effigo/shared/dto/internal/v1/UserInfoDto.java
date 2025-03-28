package com.effigo.shared.dto.internal.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDto {
	private String userId;
	private String email;
	private String userName;
	private String firstName;
	private String lastName;
	private Set<String> roles;
}
