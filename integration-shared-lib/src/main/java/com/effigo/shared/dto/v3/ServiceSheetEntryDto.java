package com.effigo.shared.dto.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceSheetEntryDto {
    private String goodsReceivedBy;
    private String  packageNumber;
    private String shortText;
    private String  poId;
    private String  poItemIndex;
    private String  invoiceDate;
    private String postingDate;
    private String  dispatchNotificationId; //gdm.gate_pass_no
    private String  comments;
    private String acceptance;
    private String einvoice;
    private String  text1; //gdm.invoice_type_id
    private String  text2; //X or ''
    private String  text3; //X or ''
    private String  text4; //X or ''
    private String  text5; //dnm.invoice_date
    private String  text6; //dnm.dispatch_notification_id
    private String  text7; //dnm.dispatch_doc_name
    private String  text8;
    private String  text9;
    private String  text10;
    private String grnId;
    private List<ServiceItemsDto> serviceItems;



}
