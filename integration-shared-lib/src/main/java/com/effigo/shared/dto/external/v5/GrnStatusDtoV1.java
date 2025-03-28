package com.effigo.shared.dto.external.v5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GrnStatusDtoV1 {
    private String grnItemId;
    private String grnId;
    private Boolean status;
    private String errorMessage;
    private String recordId;
}