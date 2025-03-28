package com.effigo.shared.dto.external.v2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalAddressDtoV2 {
	private String corporate;
	private String street2;
	private String street3;
	private String district;
	private String houseNumber;
	private String country;
	private String region;

}
