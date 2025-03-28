package com.effigo.shared.dto.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CancelSseOutboundRequestDto {

    private String entrySheet;
    private String postingDate;
}
