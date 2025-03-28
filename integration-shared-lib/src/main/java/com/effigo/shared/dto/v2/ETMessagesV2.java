package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.ErrorItemV1;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ETMessagesV2 {

    @JsonProperty("item")
    private ErrorItemMessageV2 errorItemV1s;


}
