package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QrCodeDtoV1 {

	private String url;
	private String dispatchNotificationId;
	private int width;
	private int height;
}
