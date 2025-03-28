package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDtoV1 {

    @JsonProperty("FileName")
    private String fileName;

    @JsonProperty("FileExtension")
    private String fileExtension;

    @JsonProperty("FileData")
    private String fileData;
}
