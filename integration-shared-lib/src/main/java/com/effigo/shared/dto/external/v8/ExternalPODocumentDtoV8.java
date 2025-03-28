package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPODocumentDtoV8 {

    @JsonProperty("document")
    private String document;

    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("fileExtension")
    private String fileExtension;

}
