package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceSheetHeaderDetailsDtoV5 {
    @JsonProperty("DPT_SERVICE_NOTE_NO")
    private String dptServiceNoteNo;

    @JsonProperty("SAP_SES_NO")
    private String sapSesNo;

    @JsonProperty("PO_NUMBER")
    private String poNumber;

    @JsonProperty("PO_ITEM")
    private String poItem;

    @JsonProperty("DOC_DATE")
    private String docDate;

    @JsonProperty("POST_DATE")
    private String postDate;

    @JsonProperty("REF_DOC_NO")
    private String refDocNo;

    @JsonProperty("USER_FIELD")
    private String userField;

    @JsonProperty("ACCEPTANCE")
    private String acceptance;

    @JsonProperty("EINVOICE")
    private String eInvoice;

    @JsonProperty("PERSON_INT")
    private String personInt;

    @JsonProperty("PCKG_NO")
    private String pckgNo;

    @JsonProperty("SHORT_TEXT")
    private String shortText;

    @JsonProperty("ZCB_LABOUR_LAW_COMPLINCE")
    private String zcbLabourLawCompliance;

    @JsonProperty("ZCB_NO_LABOUR_DEPLOYMENT")
    private String zcbNoLabourDeployment;

    @JsonProperty("ZCB_NOT_APPLICABLE")
    private String zcbNotApplicable;

    @JsonProperty("ZSINV_INV_TYPE")
    private String zsinvInvType;

    @JsonProperty("EFFIGO_CRT_DT")
    private String effigoCrtDt;

    @JsonProperty("APPROVED_BY_MAIL")
    private String approvedByMail;
}
