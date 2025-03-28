package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class DocumentDtoV3 {
    @JsonProperty("ATTACHMENT1")
   private String file1;

    @JsonProperty("ATTACHMENT2")
    private String file2;

    @JsonProperty("ATTACHMENT3")
    private String file3;

    @JsonProperty("ATTACHMENT4")
    private String file4;

    @JsonProperty("ATTACHMENT5")
    private String file5;



}
