package com.effigo.shared.dto.v10;

import com.effigo.shared.dto.v1.Errors;
import com.effigo.shared.dto.v1.OutputDtoV1;
import com.effigo.shared.dto.v1.PRItemsV1;
import com.effigo.shared.dto.v2.ItemsV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalApiResponseV10 {
    private HttpStatus statusCode;
    private String message;
    private String errorCode;
    private List<Errors> errors;
    private List<PRItemsV10> items;
    private OutputDtoV1 response;

    private List<ItemsV2> itemDetails;
    @JsonProperty(value = "Status")
    private boolean status;
    private Integer registrationIntegrationStatus;
}
