package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnStorageLocationDtoV1 {

	private String grnId;
	private String grnItemId;
	private String storageLocation;
	private String quantity;
	private String batchNo;
	private String dateOfManufacture;
}
