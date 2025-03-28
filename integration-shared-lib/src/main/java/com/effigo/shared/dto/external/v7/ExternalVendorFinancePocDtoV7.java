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
public class ExternalVendorFinancePocDtoV7 {


    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("middle_name")
    private String middleName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("designation")
    private String designation;

    @JsonProperty("contact_number")
    private String contactNumber;

    @JsonProperty("email_id")
    private String emailId;

    @JsonProperty("pan_card")
    private String panCard;

    @JsonProperty("adhar_card")
    private String adharCard;

    @JsonProperty("department")
    private String department;

    @JsonProperty("contact_type")
    private String contactType;

}
