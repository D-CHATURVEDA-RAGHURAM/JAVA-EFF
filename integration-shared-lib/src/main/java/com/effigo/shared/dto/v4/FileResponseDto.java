package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileResponseDto {
    /*{

        "doc_url": "download link",

            "doc_name": "",

            "status": "bool",

            "doc_size": "",

            "doc_id": ""

    }*/
    private Boolean status=Boolean.FALSE;
    private HttpStatus statusCode=HttpStatus.OK;
    @JsonProperty("doc_name")
    private String docName;
    @JsonProperty("doc_url")
    private String docUrl;
    @JsonProperty("doc_key")
    private String docKey;
    @JsonProperty("doc_size")
    private String docSize;
    @JsonProperty("doc_id")
    private String docId;

}
