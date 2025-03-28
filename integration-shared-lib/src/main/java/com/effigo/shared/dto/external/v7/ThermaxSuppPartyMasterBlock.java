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

public class ThermaxSuppPartyMasterBlock {

        @JsonProperty("PartyIDs")
        private ExternalPartyIDsReqDtoV7 partyIDs;

        @JsonProperty("Status")
        private ExternalStatusReqDtoV7 externalStatusReqDtoV7;

        @JsonProperty("Note")
        private String note;

        @JsonProperty("EffigoSupplierID")
        private String effigoSupplierId;

        @JsonProperty("Name")
        private String name;
}

