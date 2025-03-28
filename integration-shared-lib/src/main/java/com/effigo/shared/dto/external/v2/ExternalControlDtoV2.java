package com.effigo.shared.dto.external.v2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalControlDtoV2 {
	private String grBasedInvVerification;
	private String autoEvalGRSetmtDel;
	private String autoEvalGRSetmtRet;

}
