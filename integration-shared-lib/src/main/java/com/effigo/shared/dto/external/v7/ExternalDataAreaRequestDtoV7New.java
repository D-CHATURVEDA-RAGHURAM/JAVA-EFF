package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalDataAreaRequestDtoV7New {
        @JsonProperty("Process")
        private ExternalProcessDtoV7 externalProcessDtoV7;

        @JsonProperty("ThermaxSupplierPartyMaster")
        private ExternalThermaxSupPartyMasterReqDtoV7New thermaxSupplierPartyMaster;

}
