package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExternalServiceDtoMainV5 {
    @JsonProperty("IS_SES_HEADER")
    List<ServiceSheetHeaderDetailsDtoV5> headerDetailsV5;
    @JsonProperty("IT_ATTACH")
    List<SesAttachmentDtoV5> sesAttachmentDetails;
    @JsonProperty("IT_SES_ITEMS")
    List<SesItemsDtoV5> sesItemsList;
}
