package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttachmentItemDtoV5 {
        @JsonProperty("FILE_NAME")
        private String fileName;

        @JsonProperty("FILE_MIME_TYPE")
        private String fileMimeType;

        @JsonProperty("FILE_DATA")
        private String fileData;

}
