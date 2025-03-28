package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovementHeaderDtoV7 {
    @JsonProperty("Posting_date")
    private String postingDate;

    @JsonProperty("Document_date")
    private String documentDate;

    @JsonProperty("Header_text")
    private String headerText;

    @JsonProperty("Reference_doc_number")
    private String refDocNo;
}
