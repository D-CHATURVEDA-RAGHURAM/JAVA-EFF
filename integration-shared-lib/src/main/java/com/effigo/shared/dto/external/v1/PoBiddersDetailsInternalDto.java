package com.effigo.shared.dto.external.v1;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PoBiddersDetailsInternalDto {

    private String rfqId;

    private List<PoBiddersDetailsDto> data;


}
