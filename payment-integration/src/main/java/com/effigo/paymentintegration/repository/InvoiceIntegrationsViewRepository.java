package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.DropDown;
import com.effigo.paymentintegration.entity.InvoiceIntegrationView;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.*;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceInternalViewDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.effigo.paymentintegration.entity.DropdownViewEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

@Repository
public interface InvoiceIntegrationsViewRepository extends JpaRepository<InvoiceIntegrationView, UUID>, JpaSpecificationExecutor<InvoiceIntegrationView>
		 {

	@Query(value = "select distinct company_code as companyCode,inv_doc_no as invoiceDocumentNumber,inv_doc_item as invoiceDocumentItem,fiscal_year as fiscalYear,   "  +
			"document_type as documentType,doc_posting_date as documentPostingDate,transaction_code as transactionCode,transaction_type as transactionType, " +
			"ref_doc_no as referenceDocumentNumber,purchase_doc_no as purchaseDocumentNumber,purchase_doc_item as purchaseDocumentItem,doc_currency_amount as documentCurrencyAmount, " +
			"accounting_doc_no as accountingDocumentNumber,posting_date as postingDate,fiscal_period as fiscalPeriod,obj_key as objectKey,quantity,po_uom as purchaseOrderUom, " +
			"plant,material_no as materialNumber,ref_doc as referenceDocument,ref_doc_item as referenceDocumentItem,fiscal_year_curr_period as fiscalYearCurrentPeriod,s_gst as sgst, " +
			"c_gst as cgst,i_gst as igst,tcs ,tds,gross_doc_val as grossDocumentValue,material_doc_no as materialDocumentNumber,material_doc_item as materialDocumentItem,  " +
			"dn_quantity as deliveryNoteQuantity,dn_uom as deliveryNoteUom,unit_entry_quantity as unitEntryQuantity,service_code as serviceCode,service_line as serviceLine,  " +
			"entry_time as entryTime,entry_date as entryDate,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,  " +
			"cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9  as customField9,cus_field_10 as customField10, " +
			"reversal_doc as reversalDoc,reverse_year as reverseYear,company_name as companyName,iiv.created_date as createdDate,currency,business_unit as businessUnit,grn_date as grnDate,material_description as materialDescription,  " +
			"asn_id as asnId, dispatch_doc_name as dispatchDoc,supplier_id as supplierId  " +
			"from upeg.invoice_integrations_view iiv where internal_company_id like :companyId " +
			" and to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and to_date(:toDate,'yyyy-mm-dd') order by postingDate desc"
			, countQuery = "SELECT COUNT(*)  from (select distinct company_code as companyCode,inv_doc_no as invoiceDocumentNumber,inv_doc_item as invoiceDocumentItem,fiscal_year as fiscalYear,  " +
			"document_type as documentType,doc_posting_date as documentPostingDate,transaction_code as transactionCode,transaction_type as transactionType, " +
			"ref_doc_no as referenceDocumentNumber,purchase_doc_no as purchaseDocumentNumber,purchase_doc_item as purchaseDocumentItem,doc_currency_amount as documentCurrencyAmount, " +
			"accounting_doc_no as accountingDocumentNumber,posting_date as postingDate,fiscal_period as fiscalPeriod,obj_key as objectKey,quantity,po_uom as purchaseOrderUom, " +
			"plant,material_no as materialNumber,ref_doc as referenceDocument,ref_doc_item as referenceDocumentItem,fiscal_year_curr_period as fiscalYearCurrentPeriod,s_gst as sgst, " +
			"c_gst as cgst,i_gst as igst,tcs ,tds,gross_doc_val as grossDocumentValue,material_doc_no as materialDocumentNumber,material_doc_item as materialDocumentItem,  " +
			"dn_quantity as deliveryNoteQuantity,dn_uom as deliveryNoteUom,unit_entry_quantity as unitEntryQuantity,service_code as serviceCode,service_line as serviceLine,  " +
			"entry_time as entryTime,entry_date as entryDate,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,  " +
			"cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9  as customField9,cus_field_10 as customField10, " +
			"reversal_doc as reversalDoc,reverse_year as reverseYear,company_name as companyName,iiv.created_date as createdDate,currency,business_unit as businessUnit,grn_date as grnDate,material_description as materialDescription,  " +
			"asn_id as asnId, dispatch_doc_name as dispatchDoc,supplier_id as supplierId  " +
			"from upeg.invoice_integrations_view iiv  where internal_company_id like :companyId " +
			" and to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and to_date(:toDate,'yyyy-mm-dd') order by entryDate desc) as t "
			, nativeQuery = true)
	Page<InvoiceInternalViewDto> findInvoiceForCentralUser( Pageable pageable,String fromDate,String toDate,String companyId);

	@Query(value =" select distinct company_code as companyCode,inv_doc_no as invoiceDocumentNumber,inv_doc_item as invoiceDocumentItem,fiscal_year as fiscalYear, "+
			"document_type as documentType,doc_posting_date as documentPostingDate,transaction_code as transactionCode,transaction_type as transactionType, "+
			"ref_doc_no as referenceDocumentNumber,purchase_doc_no as purchaseDocumentNumber,purchase_doc_item as purchaseDocumentItem,doc_currency_amount as documentCurrencyAmount, "+
			"accounting_doc_no as accountingDocumentNumber,posting_date as postingDate,fiscal_period as fiscalPeriod,obj_key as objectKey,quantity,po_uom as purchaseOrderUom,  "+
			"plant,material_no as materialNumber,ref_doc as referenceDocument,ref_doc_item as referenceDocumentItem,fiscal_year_curr_period as fiscalYearCurrentPeriod,s_gst as sgst,  "+
			"c_gst as cgst,i_gst as igst,tcs ,tds,gross_doc_val as grossDocumentValue,material_doc_no as materialDocumentNumber,material_doc_item as materialDocumentItem,  "+
			"dn_quantity as deliveryNoteQuantity,dn_uom as deliveryNoteUom,unit_entry_quantity as unitEntryQuantity,service_code as serviceCode,service_line as serviceLine,  "+
			"entry_time as entryTime,entry_date as entryDate,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,  "+
			"cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9  as customField9,cus_field_10 as customField10, "+
			"reversal_doc as reversalDoc,reverse_year as reverseYear,company_name as companyName,vpoipha.created_date as createdDate,currency,business_unit as businessUnit,grn_date as grnDate,material_description as materialDescription,  "+
			"asn_id as asnId, dispatch_doc_name as dispatchDoc, supplier_id as supplierId from upeg.invoice_integrations_view vpoipha  "+
			"JOIN masters.user_organization_rel_info uori ON vpoipha.business_unit = uori.dept_id  " +
			" where uori.user_id like :userId  and  uori.status = 1 and internal_company_id like :companyId and to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc",
			countQuery = "SELECT COUNT(*)   FROM (select distinct company_code as companyCode,inv_doc_no as invoiceDocumentNumber,inv_doc_item as invoiceDocumentItem,fiscal_year as fiscalYear, " +
					"document_type as documentType,doc_posting_date as documentPostingDate,transaction_code as transactionCode,transaction_type as transactionType, " +
					"ref_doc_no as referenceDocumentNumber,purchase_doc_no as purchaseDocumentNumber,purchase_doc_item as purchaseDocumentItem,doc_currency_amount as documentCurrencyAmount, " +
					"accounting_doc_no as accountingDocumentNumber,posting_date as postingDate,fiscal_period as fiscalPeriod,obj_key as objectKey,quantity,po_uom as purchaseOrderUom,  " +
					"plant,material_no as materialNumber,ref_doc as referenceDocument,ref_doc_item as referenceDocumentItem,fiscal_year_curr_period as fiscalYearCurrentPeriod,s_gst as sgst,  " +
					"c_gst as cgst,i_gst as igst,tcs ,tds,gross_doc_val as grossDocumentValue,material_doc_no as materialDocumentNumber,material_doc_item as materialDocumentItem,  " +
					"dn_quantity as deliveryNoteQuantity,dn_uom as deliveryNoteUom,unit_entry_quantity as unitEntryQuantity,service_code as serviceCode,service_line as serviceLine,  " +
					"entry_time as entryTime,entry_date as entryDate,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,  " +
					"cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9  as customField9,cus_field_10 as customField10, " +
					"reversal_doc as reversalDoc,reverse_year as reverseYear,company_name as companyName,vpoipha.created_date as createdDate,currency,business_unit as businessUnit,grn_date as grnDate,material_description as materialDescription,  " +
					"asn_id as asnId, dispatch_doc_name as dispatchDoc, supplier_id as supplierId from upeg.invoice_integrations_view vpoipha  " +
					"JOIN masters.user_organization_rel_info uori ON vpoipha.business_unit = uori.dept_id  " +
					" where uori.user_id like :userId  and  uori.status = 1 and internal_company_id like :companyId and to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc) as t"
			, nativeQuery = true)
	Page<InvoiceInternalViewDto> findInvoiceDetails(@Param("companyId") String companyId,@Param("userId") String userId, Pageable pageable,String fromDate,String toDate);

//			 @Query(value = "select * from upeg.vendor_dropdown_view order by company_name asc;", nativeQuery = true)
//			 List<DropdownViewEntity> getInvoiceDropDownDetails();

			 @Query("SELECT new com.effigo.paymentintegration.entity.DropdownViewEntity(v.companyId, v.companyName) " +
					 "FROM DropdownViewEntity v ORDER BY v.companyName DESC")
			 List<DropdownViewEntity> getInvoiceDropDownDetails();


			 @Query(value =" select distinct company_code as companyCode,inv_doc_no as invoiceDocumentNumber,inv_doc_item as invoiceDocumentItem,fiscal_year as fiscalYear, "+
					 "document_type as documentType,doc_posting_date as documentPostingDate,transaction_code as transactionCode,transaction_type as transactionType, "+
					 "ref_doc_no as referenceDocumentNumber,purchase_doc_no as purchaseDocumentNumber,purchase_doc_item as purchaseDocumentItem,doc_currency_amount as documentCurrencyAmount, "+
					 "accounting_doc_no as accountingDocumentNumber,posting_date as postingDate,fiscal_period as fiscalPeriod,obj_key as objectKey,quantity,po_uom as purchaseOrderUom,  "+
					 "plant,material_no as materialNumber,ref_doc as referenceDocument,ref_doc_item as referenceDocumentItem,fiscal_year_curr_period as fiscalYearCurrentPeriod,s_gst as sgst,  "+
					 "c_gst as cgst,i_gst as igst,tcs ,tds,gross_doc_val as grossDocumentValue,material_doc_no as materialDocumentNumber,material_doc_item as materialDocumentItem,  "+
					 "dn_quantity as deliveryNoteQuantity,dn_uom as deliveryNoteUom,unit_entry_quantity as unitEntryQuantity,service_code as serviceCode,service_line as serviceLine,  "+
					 "entry_time as entryTime,entry_date as entryDate,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,  "+
					 "cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9  as customField9,cus_field_10 as customField10, "+
					 "reversal_doc as reversalDoc,reverse_year as reverseYear,company_name as companyName,vpoipha.created_date as createdDate,currency,business_unit as businessUnit,grn_date as grnDate,material_description as materialDescription,  "+
					 "asn_id as asnId, dispatch_doc_name as dispatchDoc, supplier_id as supplierId from upeg.invoice_integrations_view vpoipha  "+
					 "JOIN supplier.supplier_user_business_unit uori ON vpoipha.business_unit = uori.bu_id  " +
					 " where uori.user_id like :userId  and internal_company_id like :companyId and to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc",
					 countQuery = "SELECT COUNT(*)   FROM (select distinct company_code as companyCode,inv_doc_no as invoiceDocumentNumber,inv_doc_item as invoiceDocumentItem,fiscal_year as fiscalYear, " +
							 "document_type as documentType,doc_posting_date as documentPostingDate,transaction_code as transactionCode,transaction_type as transactionType, " +
							 "ref_doc_no as referenceDocumentNumber,purchase_doc_no as purchaseDocumentNumber,purchase_doc_item as purchaseDocumentItem,doc_currency_amount as documentCurrencyAmount, " +
							 "accounting_doc_no as accountingDocumentNumber,posting_date as postingDate,fiscal_period as fiscalPeriod,obj_key as objectKey,quantity,po_uom as purchaseOrderUom,  " +
							 "plant,material_no as materialNumber,ref_doc as referenceDocument,ref_doc_item as referenceDocumentItem,fiscal_year_curr_period as fiscalYearCurrentPeriod,s_gst as sgst,  " +
							 "c_gst as cgst,i_gst as igst,tcs ,tds,gross_doc_val as grossDocumentValue,material_doc_no as materialDocumentNumber,material_doc_item as materialDocumentItem,  " +
							 "dn_quantity as deliveryNoteQuantity,dn_uom as deliveryNoteUom,unit_entry_quantity as unitEntryQuantity,service_code as serviceCode,service_line as serviceLine,  " +
							 "entry_time as entryTime,entry_date as entryDate,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,  " +
							 "cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9  as customField9,cus_field_10 as customField10, " +
							 "reversal_doc as reversalDoc,reverse_year as reverseYear,company_name as companyName,vpoipha.created_date as createdDate,currency,business_unit as businessUnit,grn_date as grnDate,material_description as materialDescription,  " +
							 "asn_id as asnId, dispatch_doc_name as dispatchDoc, supplier_id as supplierId from upeg.invoice_integrations_view vpoipha  " +
							 "JOIN supplier.supplier_user_business_unit uori ON vpoipha.business_unit = uori.bu_id  " +
							 " where uori.user_id like :userId and internal_company_id like :companyId and to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc) as t"
					 , nativeQuery = true)
			 Page<InvoiceInternalViewDto> findInvoiceDetailsForAdditionalUsers(String companyId, Pageable pageable, String fromDate, String toDate, String userId);

			 Page<InvoiceIntegrationView> findAll(Pageable pageable);
//			 @Query(nativeQuery = true, name = "InvoiceIntegrationView.findInvoices")
//			 Page<InvoiceIntegrationView> findInvoices(
//			         @Param("documentType") String documentType,
//			         @Param("documentCurrencyAmount") String documentCurrencyAmount,
//			         @Param("cgst") String cgst,
//			         @Param("fiscalYear") String fiscalYear,
//			         @Param("transactionCode") String transactionCode,
//			         Pageable pageable
//			 );

		 }
