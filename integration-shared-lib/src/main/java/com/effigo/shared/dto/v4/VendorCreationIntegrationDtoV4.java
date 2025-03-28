package com.effigo.shared.dto.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorCreationIntegrationDtoV4 {

	@JsonProperty("vendorId")
	private String vendorId;
	@JsonProperty("client")
	private String client;
	@JsonProperty("ggid")
	private String ggid;
	@JsonProperty("tokenNo")
	private String tokenNo;
	@JsonProperty("date")
	private String date;
	@JsonProperty("time")
	private String time;
	@JsonProperty("vendorType")
	private String vendorType;
	@JsonProperty("title")
	private String title;
	@JsonProperty("name1")
	private String name1;
	@JsonProperty("name2")
	private String name2;
	@JsonProperty("sortField")
	private String sortField;
	@JsonProperty("address1")
	private String address1;
	@JsonProperty("address2")
	private String address2;
	@JsonProperty("address3")
	private String address3;
	@JsonProperty("address4")
	private String address4;
	@JsonProperty("city")
	private String city;
	@JsonProperty("district")
	private String district;
	@JsonProperty("country")
	private String country;
	@JsonProperty("region")
	private String region;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("districtCode")
	private String districtCode;
	@JsonProperty("telephoneNo1")
	private String telephoneNo1;
	@JsonProperty("faxNo1")
	private String faxNo1;
	@JsonProperty("smtpMail")
	private String smtpMail;
	@JsonProperty("contractPerson")
	private String contractPerson;
	@JsonProperty("person2")
	private String person2;
	@JsonProperty("designation")
	private String designation;
	@JsonProperty("eMail")
	private String eMail;
	@JsonProperty("phoneNo")
	private String phoneNo;
	@JsonProperty("mobileNo")
	private String mobileNo;
	@JsonProperty("reason")
	private String reason;
	@JsonProperty("noOfEmpl")
	private String noOfEmpl;
	@JsonProperty("detail5")
	private String detail5;
	@JsonProperty("detail6")
	private String detail6;
	@JsonProperty("detail7")
	private String detail7;
	@JsonProperty("panNo")
	private String panNo;
	@JsonProperty("bankNo")
	private String bankNo;
	@JsonProperty("accountNo")
	private String accountNo;
	@JsonProperty("branch")
	private String branch;
	@JsonProperty("ifsc")
	private String ifsc;
	@JsonProperty("micr")
	private String micr;
	@JsonProperty("yearOfIncorporation")
	private String yearOfIncorporation;
	@JsonProperty("regNo")
	private String regNo;
	@JsonProperty("promotor1")
	private String promotor1;
	@JsonProperty("designation1")
	private String designation1;
	@JsonProperty("mobileNo1")
	private String mobileNo1;
	@JsonProperty("eMail1")
	private String eMail1;
	@JsonProperty("promotor2")
	private String promotor2;
	@JsonProperty("designation2")
	private String designation2;
	@JsonProperty("mobileNo2")
	private String mobileNo2;
	@JsonProperty("eMail2")
	private String eMail2;
	@JsonProperty("promotor3")
	private String promotor3;
	@JsonProperty("designation3")
	private String designation3;
	@JsonProperty("mobileNo3")
	private String mobileNo3;
	@JsonProperty("eMail3")
	private String eMail3;
	@JsonProperty("promotor4")
	private String promotor4;
	@JsonProperty("designation4")
	private String designation4;
	@JsonProperty("mobileNo4")
	private String mobileNo4;
	@JsonProperty("eMail4")
	private String eMail4;
	@JsonProperty("companyType")
	private String companyType;
	@JsonProperty("businessType")
	private String businessType;
	@JsonProperty("parentCompany")
	private String parentCompany;
	@JsonProperty("bussinessGroupName")
	private String bussinessGroupName;
	@JsonProperty("grpCompanyName")
	private String grpCompanyName;
	@JsonProperty("address_1")
	private String address_1;
	@JsonProperty("address_2")
	private String address_2;
	@JsonProperty("collaboration")
	private String collaboration;
	@JsonProperty("isoCertified")
	private String isoCertified;
	@JsonProperty("isoValidityDate")
	private String isoValidityDate;
	@JsonProperty("ohsCertified")
	private String ohsCertified;
	@JsonProperty("ohsValidityDate")
	private String ohsValidityDate;
	@JsonProperty("sa8000Certified")
	private String sa8000Certified;
	@JsonProperty("saValidityDate")
	private String saValidityDate;
	@JsonProperty("totalNoEmp")
	private String totalNoEmp;
	@JsonProperty("totalNoSkill")
	private String totalNoSkill;
	@JsonProperty("totalNoUnskill")
	private String totalNoUnskill;
	@JsonProperty("productGroup1")
	private String productGroup1;
	@JsonProperty("groupName1")
	private String groupName1;
	@JsonProperty("productGroupDesc1")
	private String productGroupDesc1;
	@JsonProperty("deliveryTime1")
	private String deliveryTime1;
	@JsonProperty("capacity1")
	private String capacity1;
	@JsonProperty("productGroup2")
	private String productGroup2;
	@JsonProperty("groupName2")
	private String groupName2;
	@JsonProperty("productGroupDesc2")
	private String productGroupDesc2;
	@JsonProperty("deliveryTime2")
	private String deliveryTime2;
	@JsonProperty("capacity2")
	private String capacity2;
	@JsonProperty("productGroup3")
	private String productGroup3;
	@JsonProperty("groupName3")
	private String groupName3;
	@JsonProperty("productGroupDesc3")
	private String productGroupDesc3;
	@JsonProperty("deliveryTime3")
	private String deliveryTime3;
	@JsonProperty("capacity3")
	private String capacity3;
	@JsonProperty("productGroup4")
	private String productGroup4;
	@JsonProperty("groupName4")
	private String groupName4;
	@JsonProperty("productGroupDesc4")
	private String productGroupDesc4;
	@JsonProperty("deliveryTime4")
	private String deliveryTime4;
	@JsonProperty("capacity4")
	private String capacity4;
	@JsonProperty("vendorClassification")
	private String vendorClassification;
	@JsonProperty("gstNo")
	private String gstNo;
	@JsonProperty("msmeNo")
	private String msmeNo;
	@JsonProperty("iecNo")
	private String iecNo;
	@JsonProperty("cheque")
	private String cheque;
	@JsonProperty("documentNumber")
	private String documentNumber;
	@JsonProperty("industryKey")
	private String industryKey;
	@JsonProperty("industryType")
	private String industryType;
	@JsonProperty("msmeDate")
	private String msmeDate;
	@JsonProperty("plantFor")
	private String plantFor;
	@JsonProperty("rad1")
	private String rad1;
	@JsonProperty("rad2")
	private String rad2;
	@JsonProperty("rad3")
	private String rad3;
	@JsonProperty("rad4")
	private String rad4;
	@JsonProperty("rad5")
	private String rad5;
	@JsonProperty("rad6")
	private String rad6;
	@JsonProperty("rad7")
	private String rad7;
	@JsonProperty("rad8")
	private String rad8;
	@JsonProperty("rad9")
	private String rad9;
	@JsonProperty("rad10")
	private String rad10;
	@JsonProperty("Score1")
	private String Score1;
	@JsonProperty("Score2")
	private String Score2;
	@JsonProperty("addn13")
	private String addn13;
	@JsonProperty("addn14")
	private String addn14;
	@JsonProperty("addn15")
	private String addn15;
	@JsonProperty("addn16")
	private String addn16;
	@JsonProperty("addn17")
	private String addn17;
	@JsonProperty("addn18")
	private String addn18;
	@JsonProperty("addn19")
	private String addn19;
	@JsonProperty("addn20")
	private String addn20;
	@JsonProperty("addn21")
	private String addn21;
	@JsonProperty("addn22")
	private String addn22;
	@JsonProperty("addn23")
	private String addn23;
	@JsonProperty("addn24")
	private String addn24;
	@JsonProperty("addn25")
	private String addn25;
	@JsonProperty("addn26")
	private String addn26;
	@JsonProperty("addn27")
	private String addn27;
	@JsonProperty("addn28")
	private String addn28;
	@JsonProperty("addn29")
	private String addn29;
	@JsonProperty("addn30")
	private String addn30;
	@JsonProperty("addn31")
	private String addn31;
	@JsonProperty("addn32")
	private String addn32;
	@JsonProperty("addn33")
	private String addn33;
	@JsonProperty("addn34")
	private String addn34;
	@JsonProperty("addn35")
	private String addn35;
	@JsonProperty("addn36")
	private String addn36;
	@JsonProperty("addn37")
	private String addn37;
	@JsonProperty("addn38")
	private String addn38;
	@JsonProperty("addn39")
	private String addn39;
	@JsonProperty("addn40")
	private String addn40;
	@JsonProperty("addn41")
	private String addn41;
	@JsonProperty("addn42")
	private String addn42;
	@JsonProperty("addn43")
	private String addn43;
	@JsonProperty("addn44")
	private String addn44;
	@JsonProperty("addn45")
	private String addn45;
	@JsonProperty("addn46")
	private String addn46;
	@JsonProperty("addn47")
	private String addn47;
	@JsonProperty("addn48")
	private String addn48;
	@JsonProperty("addn49")
	private String addn49;
	@JsonProperty("addn50")
	private String addn50;
	@JsonProperty("status")
	private String status;
}
