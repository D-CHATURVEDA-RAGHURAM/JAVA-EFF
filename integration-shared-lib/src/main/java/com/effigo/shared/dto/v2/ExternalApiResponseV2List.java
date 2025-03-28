package com.effigo.shared.dto.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExternalApiResponseV2List {
    private UUID transId;
    private List<ExternalApiResponseV2> responseV2List;
    private boolean status;
}
