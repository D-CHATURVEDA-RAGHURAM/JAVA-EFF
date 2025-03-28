package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalProjectDtoV1 {
   @JsonProperty("projid")
   @NotEmpty(message = "{projid.not-null}")
   @NotNull
   private String  projId;

   @JsonProperty("projcode")
   @NotEmpty(message = "{projcode.not-null}")
   @NotNull
   private String projCode;

   @JsonProperty("projname")
   @NotEmpty(message = "{projname.not-null}")
   @NotNull
   private String projName;

   @JsonProperty("status")
   @NotEmpty(message = "{status.not-null}")
   @NotNull
   private String status;

   @JsonProperty("buid")
   @NotEmpty(message = "{buid.not-null}")
   @NotNull
   private String buId;

   @JsonProperty("startdate")
   @NotEmpty(message = "{startdate.not-null}")
   @NotNull
   private String startDate;

   @JsonProperty("enddate")
   @NotEmpty(message = "{enddate.not-null}")
   @NotNull
   private String endDate;

   @JsonProperty("erpid")
   private String erpId;
   @JsonProperty("fincompany")
   private String finCompany;
   @JsonProperty("infoproj")
   private Boolean infoProj;

   @JsonProperty("recordid")
   private String recordId;
}
