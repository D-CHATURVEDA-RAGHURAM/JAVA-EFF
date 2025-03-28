package com.effigo.shared.common;

public enum S3ModuleEnum {
	PO("po"),
	GRN("grn"),
	ASN("asn"),
	SES("ses"),;
	public final String module;

	private S3ModuleEnum(String module) {
		this.module = module;
	}
}
