package com.effigo.shared.dto.external.v2;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalCommunicationDtoV2 {
	private Integer phoneNumber;
	private String email;
	private String taxNumber;
	private String taxNumber3;
	private String taxNumber4;
	private String taxNumber5;
	private String socInsurance;
	private String socInsCode;
	private String actualQmSys;
	private Timestamp qySystemTo;

}
