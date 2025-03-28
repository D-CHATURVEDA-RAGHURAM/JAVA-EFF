package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDtoV1 {
	private String userId;
	private String name;
	private String designation;
	private String location;
	private String mobileNo;
	private String email;
}
