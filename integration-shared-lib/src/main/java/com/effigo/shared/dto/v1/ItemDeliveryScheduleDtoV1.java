package com.effigo.shared.dto.v1;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemDeliveryScheduleDtoV1 {
	public String reqitmid;
	public String requireddate;
	public String qty;
	public String warehouse;
	public String comments;

}
