package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class ExternalAttributeDtoV5 {
    private String matid;
    private String attcode;
    private String attvalue;
}
