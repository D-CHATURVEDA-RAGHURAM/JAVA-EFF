package com.effigo.shared.dto.v1;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class MetadataInfoDto {

	private String id;

	private String documentId;

	private int docVersion;
	private String projectCode;
	private String wbsCode;
	private String itemCode;
	private String description;
	private String category;

	private String status;

	private String documentName;

	@ToString.Exclude
	private String fileContent;

	private String type;

	private String attr1;

	private String attr2;

	private String attr3;

	private String attr4;

	private String attr5;
	private String attr6;

	private String attr7;

	private String attr8;

	private String attr9;
	private String filepath;
	private String attr11;

	private String updatedVersion;

	private String updatedVersionStatus;

	private String fileUrl;

	private String fileVersion;

	private String documentNumber;

	private String documentOwner;

	private String latestVersion;

	private String itemRevision;

	private String archived;

	private String fileSize;

	private String projectName;
	
	private String fileName;


}

