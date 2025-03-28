package com.effigo.shared.dto.external.v1;

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
public class ResponseDtoV1List {
    private boolean status;
    private UUID transId;
    private List<ResponseDtoV1> responseDtoV1s;
}
