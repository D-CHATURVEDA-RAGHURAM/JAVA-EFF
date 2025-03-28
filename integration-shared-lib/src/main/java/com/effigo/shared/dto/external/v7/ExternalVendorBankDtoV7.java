package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @Author Srinivas Kota
 * This is for Thermax.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorBankDtoV7 {

    @JsonProperty("bank_name")
    private String bankName;

    @JsonProperty("bank_number")
    private String bankNumber;

    @JsonProperty("bank_country")
    private String bankCountry;

    @JsonProperty("ifsc_code")
    private String ifscCode;

    @JsonProperty("swift_code")
    private String swiftCode;

    @JsonProperty("beneficiary_name")
    private String beneficiaryName;

    @JsonProperty("bank_account_number")
    private String accountNumber;

    @JsonProperty("bank_account_type")
    private String bankAccountType;

    @JsonProperty("branch_name")
    private String branchName;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;


}
