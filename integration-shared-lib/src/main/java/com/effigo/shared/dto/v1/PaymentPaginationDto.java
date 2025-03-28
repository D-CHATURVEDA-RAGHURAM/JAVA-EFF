package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPaginationDto {
	private String pageNo;
	private String pageSize;
	private String userId;
	private String fromDate;
	private String toDate;
	private String companyId;
}
