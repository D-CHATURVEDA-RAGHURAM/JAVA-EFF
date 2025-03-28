package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class ExternalVendorDtoV2 {

	@JsonProperty("LIFNR")
	private String lifnr;

	@JsonProperty("BUKRS")
	private String bukrs;

	@JsonProperty("EKORG")
	private String ekorg;

	@JsonProperty("KTOKK")
	private String ktokk;

	@JsonProperty("ANRED")
	private String anred;

	@JsonProperty("NAME1")
	private String name1;

	@JsonProperty("NAME2")
	private String name2;

	@JsonProperty("NAME3")
	private String name3;

	@JsonProperty("NAME4")
	private String name4;

	@JsonProperty("SORT1")
	private String sort1;

	@JsonProperty("SORT2")
	private String sort2;

	@JsonProperty("STR_SUPPL1")
	private String strSuppl1;

	@JsonProperty("CITY2")
	private String city2;

	@JsonProperty("STREET")
	private String street;

	@JsonProperty("HOUSE_NUM1")
	private String houseNum1;

	@JsonProperty("POST_CODE2")
	private String postCode2;

	@JsonProperty("CITY1")
	private String city1;

	@JsonProperty("COUNTRY")
	private String country;

	@JsonProperty("REGION")
	private String region;

	@JsonProperty("LANGU")
	private String langu;

	@JsonProperty("PERSNUMBER")
	private String persnumber;

	@JsonProperty("SMTP_ADDR")
	private String smtpAddr;

	@JsonProperty("SMTP_ADDR_1")
	private String smtpAddr1;

	@JsonProperty("SMTP_ADDR_2")
	private String smtpAddr2;

	@JsonProperty("SMTP_ADDR_3")
	private String smtpAddr3;

	@JsonProperty("SMTP_ADDR_4")
	private String smtpAddr4;

	@JsonProperty("SMTP_ADDR_5")
	private String smtpAddr5;

	@JsonProperty("SMTP_ADDR_6")
	private String smtpAddr6;

	@JsonProperty("SMTP_ADDR_7")
	private String smtpAddr7;

	@JsonProperty("SMTP_ADDR_8")
	private String smtpAddr8;

	@JsonProperty("SMTP_ADDR_9")
	private String smtpAddr9;

	@JsonProperty("ACTSS")
	private String actss;

	@JsonProperty("STCD3")
	private String stcd3;

	@JsonProperty("STCD4")
	private String stcd4;

	@JsonProperty("STENR")
	private String stenr;

	@JsonProperty("STCD5")
	private String stcd5;

	@JsonProperty("REGSS")
	private String regss;

	/*@JsonProperty("ACTSS")
	private String actss;*/

	@JsonProperty("QSSYS")
	private String qssys;

	@JsonProperty("QSSYSDAT")
	private String qssysdat;

	@JsonProperty("BANKS")
	private String banks;

	@JsonProperty("BANKL")
	private String bankl;

	@JsonProperty("BANKN")
	private String bankn;

	@JsonProperty("BKONT")
	private String bkont;

	@JsonProperty("AKONT")
	private String akont;

	@JsonProperty("ZTERM_COMP")
	private String ztermComp;

	@JsonProperty("REPRF")
	private String reprf;

	@JsonProperty("ZWELS")
	private String zwels;

	@JsonProperty("WAERS")
	private String waers;

	@JsonProperty("ZTERM_PUR")
	private String ztermPur;

	@JsonProperty("INCO1")
	private String inco1;

	@JsonProperty("INCO2")
	private String inco2;

	@JsonProperty("KALSK")
	private String kalsk;

	@JsonProperty("MEPRF")
	private String meprf;

	@JsonProperty("VERKF")
	private String verkf;

	@JsonProperty("TELF1")
	private String telf1;

	@JsonProperty("WEBRE")
	private String webre;

	@JsonProperty("XERSY")
	private String xersy;

	@JsonProperty("XERSR")
	private String xersr;

	@JsonProperty("LIPRE")
	private String lipre;

	@JsonProperty("J_1IPANNO")
	private String j1ipanno;

	@JsonProperty("SPERM_COMP")
	private String spermComp;

	@JsonProperty("LOEVM")
	private String loevm;

	@JsonProperty("SPREM_PUR")
	private String spremPur;

	@JsonProperty("KOINH")
	private String koinh;

	@JsonProperty("BANKA")
	private String bankA;

	@JsonProperty("PROVZ")
	private String provz;

	@JsonProperty("STRAS")
	private String stras;

	@JsonProperty("ORT01")
	private String ort01;

	@JsonProperty("BRNCH")
	private String brnch;

	@JsonProperty("STATUS")
	private String status;

	@JsonProperty("REF_LIFNR")
	private String refLifnr;

	@JsonProperty("REF_BUKRS")
	private String refBukrs;

	@JsonProperty("REF_EKORG")
	private String refEkorg;

	@JsonProperty("VEN_CHAR")
	private String venChar ;
}

