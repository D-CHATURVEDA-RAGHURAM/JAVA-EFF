package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetadataInfoResponseDto {

	private String id;
	private String documentId;
	private String docVersion;
	private String projectCode;
	private String wbsCode;
	private String itemCode;
	private String description;
	private String category;
	private boolean dmsStatus;
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
	private byte[] byteStream;
	@JsonProperty("createdDateTime")
	private String createdDateTime;


}
