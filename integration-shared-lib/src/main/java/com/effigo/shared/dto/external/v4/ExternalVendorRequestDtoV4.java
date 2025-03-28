package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorRequestDtoV4 {

	@JsonProperty("Id")
	private String id = "";

	@JsonProperty("Tokenno")
	private String tokenNo;

	@JsonProperty("Cdate")
	private String cDate;

	@JsonProperty("Ctime")
	private String cTime;

	@JsonProperty("Vendtype")
	private String vendorType;

	@JsonProperty("Anred")
	private String title;

	@JsonProperty("Name1")
	private String name1;

	@JsonProperty("Name2")
	private String name2;

	@JsonProperty("Sortl")
	private String sortField;

	@JsonProperty("Adress1")
	private String address1;

	@JsonProperty("Adress2")
	private String address2;

	@JsonProperty("Adress3")
	private String address3;

	@JsonProperty("City")
	private String city;

	@JsonProperty("Ort02")
	private String district;

	@JsonProperty("Land1")
	private String country;

	@JsonProperty("Bland")
	private String region;

	@JsonProperty("Pstlz")
	private String postalCode;

	@JsonProperty("CitypCode")
	private String districtCode;

	@JsonProperty("TelNumber")
	private String telephoneNo1;

	@JsonProperty("FaxNumber")
	private String faxNo1;

	@JsonProperty("SmtpAddr")
	private String smtpMail;

	@JsonProperty("ConPerson")
	private String contractPerson;

	@JsonProperty("ConPerson1")
	private String person2;

	@JsonProperty("Detai1")
	private String designation;

	@JsonProperty("Detai2")
	private String eMail;

	@JsonProperty("Detai3")
	private String phoneNo;

	@JsonProperty("Detai4")
	private String mobileNo;

	@JsonProperty("Reason")
	private String reason;

	@JsonProperty("Nofempl")
	private String noOfEmpl;

	@JsonProperty("Deatil5")
	private String detail5;

	@JsonProperty("Deatil6")
	private String detail6;

	@JsonProperty("Deatil7")
	private String detail7;

	@JsonProperty("Panno")
	private String panNo;

	@JsonProperty("Bank")
	private String bankNo;

	@JsonProperty("Acctno")
	private String accountNo;

	@JsonProperty("Branch")
	private String branch;

	@JsonProperty("Ifsc")
	private String ifsc;

	@JsonProperty("Micr")
	private String micr;

	@JsonProperty("B_Yearinco")
	private String yearOfIncorporation;

	@JsonProperty("B_Regino")
	private String regNo;

	@JsonProperty("B_Pname1")
	private String promotor1;

	@JsonProperty("B_Desig1")
	private String designation1;

	@JsonProperty("B_Mobile1")
	private String mobileNo1;

	@JsonProperty("B_Email1")
	private String eMail1;

	@JsonProperty("B_Pname2")
	private String promotor2;

	@JsonProperty("B_Desig2")
	private String designation2;

	@JsonProperty("B_Mobile2")
	private String mobileNo2;

	@JsonProperty("B_Email2")
	private String eMail2;

	@JsonProperty("B_Pname3")
	private String promotor3;

	@JsonProperty("B_Desig3")
	private String designation3;

	@JsonProperty("B_Mobile3")
	private String mobileNo3;

	@JsonProperty("B_Email3")
	private String eMail3;

	@JsonProperty("B_Pname4")
	private String promotor4;

	@JsonProperty("B_Desig4")
	private String designation4;

	@JsonProperty("B_Mobile4")
	private String mobileNo4;

	@JsonProperty("B_Email4")
	private String eMail4;

	@JsonProperty("BTypecom")
	private String companyType;

	@JsonProperty("B_Bustype")
	private String businessType;

	@JsonProperty("B_Parncom")
	private String parentCompany;

	@JsonProperty("B_Group")
	private String bussinessGroupName;

	@JsonProperty("B_Namegroupco")
	private String grpCompanyName;

	@JsonProperty("B_Unit1")
	private String address_1;

	@JsonProperty("B_Unit2")
	private String address_2;

	@JsonProperty("B_Clbrt")
	private String collaboration;

	@JsonProperty("B_Iso")
	private String isoCertified;

	@JsonProperty("B_Isodate")
	private String isoValidityDate;

	@JsonProperty("B_Ohs")
	private String ohsCertified;

	@JsonProperty("B_Ohsdate")
	private String ohsValidityDate;

	@JsonProperty("B_Sa8000")
	private String sa8000Certified;

	@JsonProperty("B_Sa8000dt")
	private String saValidityDate;

	@JsonProperty("B_Totno")
	private String totalNoEmp;

	@JsonProperty("B_Totswo")
	private String totalNoSkill;

	@JsonProperty("B_Totuwo")
	private String totalNoUnskill;

	@JsonProperty("B_Prdgrp1")
	private String productGroup1;

	@JsonProperty("B_Prdname1")
	private String groupName1;

	@JsonProperty("B_Prddesc1")
	private String productGroupDesc1;

	@JsonProperty("B_Dlvtime1")
	private String deliveryTime1;

	@JsonProperty("B_Capicity1")
	private String capacity1;

	@JsonProperty("B_Prdgrp2")
	private String productGroup2;

	@JsonProperty("B_Prdname2")
	private String groupName2;

	@JsonProperty("B_Prddesc2")
	private String productGroupDesc2;

	@JsonProperty("B_Dlvtime2")
	private String deliveryTime2;

	@JsonProperty("B_Capicity2")
	private String capacity2;

	@JsonProperty("B_Prdgrp3")
	private String productGroup3;

	@JsonProperty("B_Prdname3")
	private String groupName3;

	@JsonProperty("B_Prddesc3")
	private String productGroupDesc3;

	@JsonProperty("B_Dlvtime3")
	private String deliveryTime3;

	@JsonProperty("B_Capicity3")
	private String capacity3;

	@JsonProperty("B_Prdgrp4")
	private String productGroup4;

	@JsonProperty("B_Prdname4")
	private String groupName4;

	@JsonProperty("B_Prddesc4")
	private String productGroupDesc4;

	@JsonProperty("B_Dlvtime4")
	private String deliveryTime4;

	@JsonProperty("B_Capicity4")
	private String capacity4;

	@JsonProperty("Ven_Class")
	private String vendorClassification;

	@JsonProperty("Stcd3")
	private String gstNo;

	@JsonProperty("Msme")
	private String msmeNo;

	@JsonProperty("Iecno")
	private String iecNo;

	@JsonProperty("Cheque")
	private String cheque;

	@JsonProperty("Doknr")
	private String documentNumber;

	@JsonProperty("Brsch")
	private String industryKey;

	@JsonProperty("J_1kftind")
	private String industryType;

	@JsonProperty("Msmedat")
	private String msmeDate;

	@JsonProperty("Plantfor")
	private String plantFor;

	@JsonProperty("Rad1")
	private String rad1;

	@JsonProperty("Rad2")
	private String rad2;

	@JsonProperty("Rad3")
	private String rad3;

	@JsonProperty("Rad4")
	private String rad4;

	@JsonProperty("Rad5")
	private String rad5;

	@JsonProperty("Rad6")
	private String rad6;

	@JsonProperty("Rad7")
	private String rad7;

	@JsonProperty("Rad8")
	private String rad8;

	@JsonProperty("Rad9")
	private String rad9;

	@JsonProperty("Rad10")
	private String rad10;

	@JsonProperty("Rad11")
	private String Score1;

	@JsonProperty("Rad12")
	private String Score2;

	@JsonProperty("Addn_13")
	private String addn13;


	@JsonProperty("Addn_14")
	private String addn14;

	@JsonProperty("Addn_15")
	private String addn15;

	@JsonProperty("Addn_16")
	private String addn16;

	@JsonProperty("Addn_17")
	private String addn17;

	@JsonProperty("Addn_18")
	private String addn18;

	@JsonProperty("Addn_19")
	private String addn19;

	@JsonProperty("Addn_20")
	private String addn20;

	@JsonProperty("Addn_21")
	private String addn21;

	@JsonProperty("Addn_22")
	private String addn22;

	@JsonProperty("Addn_23")
	private String addn23;

	@JsonProperty("Addn_24")
	private String addn24;

	@JsonProperty("Addn_25")
	private String addn25;

	@JsonProperty("Addn_26")
	private String addn26;

	@JsonProperty("Addn_27")
	private String addn27;

	@JsonProperty("Addn_28")
	private String addn28;

	@JsonProperty("Addn_29")
	private String addn29;

	@JsonProperty("Addn_30")
	private String addn30;

	@JsonProperty("Addn_31")
	private String addn31;

	@JsonProperty("Addn_32")
	private String addn32;

	@JsonProperty("Addn_33")
	private String addn33;

	@JsonProperty("Addn_34")
	private String addn34;

	@JsonProperty("Addn_35")
	private String addn35;

	@JsonProperty("Addn_36")
	private String addn36;

	@JsonProperty("Addn_37")
	private String addn37;

	@JsonProperty("Addn_38")
	private String addn38;

	@JsonProperty("Addn_39")
	private String addn39;

	@JsonProperty("Addn_40")
	private String addn40;

	@JsonProperty("Addn_41")
	private String addn41;

	@JsonProperty("Addn_42")
	private String addn42;

	@JsonProperty("Addn_43")
	private String addn43;

	@JsonProperty("Addn_44")
	private String addn44;

	@JsonProperty("Addn_45")
	private String addn45;

	@JsonProperty("Addn_46")
	private String addn46;

	@JsonProperty("Addn_47")
	private String addn47;

	@JsonProperty("Addn_48")
	private String addn48;

	@JsonProperty("Addn_49")
	private String addn49;

	@JsonProperty("Addn_50")
	private String addn50;

	@JsonProperty("Status")
	private String status;

}
