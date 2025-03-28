package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectDtoV1 {
    @NotEmpty(message = "{projid.not-null}")
    @NotNull
    private String  projId;

    @NotEmpty(message = "{projcode.not-null}")
    @NotNull
    private String projCode;

    @NotEmpty(message = "{projname.not-null}")
    @NotNull
    private String projName;

    @NotEmpty(message = "{status.not-null}")
    @NotNull
    private String status;

    @NotEmpty(message = "{buid.not-null}")
    @NotNull
    private String buId;


    private String startDate;


    private String endDate;

    private String erpId;
    private String finCompany;
    private Boolean infoProj;
    private String recordId;
}
