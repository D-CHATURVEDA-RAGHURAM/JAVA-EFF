package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.DropDown;
import com.effigo.paymentintegration.entity.DropdownViewEntity;
import com.effigo.paymentintegration.entity.PaymentDropdownViewEntity;
import com.effigo.paymentintegration.entity.PaymentMainView;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.PaymentInternalViewDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PaymentMainViewRepository extends JpaRepository<PaymentMainView, UUID> {

	@Query(value = "select  po_number as poId,VENDOR_CODE as vendorCode,IV_DOCUMENT as invoiceDocument,IV_DATE as invoiceDate,IV_QUANTITY as invoiceQuantity,IV_BASIC_AMOUNT as invoiceBasicAmount,IV_TAX_AMOUNT as invoiceTaxAmount,IV_TOTAL_AMOUNT as invoiceTotalAmount,VENDOR_INVOICE_NUMBER as vendorInvoiceNumber,PAYMENT_DOC_NUMBER as paymentDocumentNumber, company_name as companyName ,created_date as createdDate ,to_date(payment_date,'dd-mm-yyyy') as payment , PAYMENT_DATE as paymentDate ," +
			"vendor_inv_date as vendorInvDate,currency,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9 as customField9,cus_field_10 as customField10 , business_unit as businessUnit , asn_year as asnYear, " +
			"cus_field_11 as customField11,cus_field_12 as customField12,cus_field_13 as customField13,cus_field_14 as customField14,cus_field_15 as customField15,cus_field_16 as customField16,cus_field_17 as customField17,cus_field_18 as customField18,cus_field_19 as customField19,cus_field_20 as customField20 , credit_debit_ind as creditDebitInd , advance_ind as advanceInd" +
			" , fi_doc_posting_date as fiDocPostingDate , fi_doc_doc_date as fiDocDocDate, clearing_doc_no as clearingDocNo ,  posting_key as postingKey" +
			"  from upeg.payment_main_view pmv " +
			"JOIN masters.user_organization_rel_info uori on pmv.business_unit = uori.dept_id " +
			" where uori.user_id like :userId  and  uori.status = 1 and " +
			"( internal_company_id = :companyId or :companyId is null) and  " +
			" case " +
			"  when payment_date is not null then to_date(payment_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') " +
			" else true " +
			" end order by payment desc",
			countQuery = "select count(*)  from (select  po_number as poId,VENDOR_CODE as vendorCode,IV_DOCUMENT as invoiceDocument,IV_DATE as invoiceDate,IV_QUANTITY as invoiceQuantity,IV_BASIC_AMOUNT as invoiceBasicAmount,IV_TAX_AMOUNT as invoiceTaxAmount,IV_TOTAL_AMOUNT as invoiceTotalAmount,VENDOR_INVOICE_NUMBER as vendorInvoiceNumber,PAYMENT_DOC_NUMBER as paymentDocumentNumber, company_name as companyName ,created_date as createdDate ,to_date(payment_date,'dd-mm-yyyy') as payment , PAYMENT_DATE as paymentDate ," +
					"vendor_inv_date as vendorInvDate,currency,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9 as customField9,cus_field_10 as customField10 , business_unit as businessUnit , asn_year as asnYear, " +
					"cus_field_11 as customField11,cus_field_12 as customField12,cus_field_13 as customField13,cus_field_14 as customField14,cus_field_15 as customField15,cus_field_16 as customField16,cus_field_17 as customField17,cus_field_18 as customField18,cus_field_19 as customField19,cus_field_20 as customField20 , credit_debit_ind as creditDebitInd , advance_ind as advanceInd" +
					" , fi_doc_posting_date as fiDocPostingDate , fi_doc_doc_date as fiDocDocDate, clearing_doc_no as clearingDocNo ,  posting_key as postingKey " +
					"  from upeg.payment_main_view pmv " +
					"JOIN masters.user_organization_rel_info uori on pmv.business_unit = uori.dept_id " +
					" where uori.user_id like :userId  and  uori.status = 1 and " +
					"( internal_company_id = :companyId or :companyId is null) and  " +
					" case " +
					"  when payment_date is not null then to_date(payment_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') " +
					" else true " +
					" end order by payment desc) as t "
			, nativeQuery = true)
	Page<PaymentInternalViewDto> findPaymentDetails(String companyId, Pageable pageable, String fromDate, String toDate,
			String userId);

//	@Query(value = "select distinct internal_company_id as companyId,company_name as companyName from upeg.payment_main_view pmv order by company_name asc ", nativeQuery = true)
//	List<DropDown> getPaymentDropDownDetails();


	@Query("SELECT new com.effigo.paymentintegration.entity.PaymentDropdownViewEntity(v.companyId, v.companyName) " +
			"FROM PaymentDropdownViewEntity v ORDER BY v.companyName aSC")
	List<PaymentDropdownViewEntity> getPaymentDropDownDetails();
	@Query(value = "select  po_number as poId,VENDOR_CODE as vendorCode,IV_DOCUMENT as invoiceDocument,IV_DATE as invoiceDate,IV_QUANTITY as invoiceQuantity,IV_BASIC_AMOUNT as invoiceBasicAmount,IV_TAX_AMOUNT as invoiceTaxAmount,IV_TOTAL_AMOUNT as invoiceTotalAmount,VENDOR_INVOICE_NUMBER as vendorInvoiceNumber,PAYMENT_DOC_NUMBER as paymentDocumentNumber, company_name as companyName ,created_date as createdDate ,to_date(payment_date,'dd-mm-yyyy') as payment , PAYMENT_DATE as paymentDate ," +
			"vendor_inv_date as vendorInvDate,currency,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9 as customField9,cus_field_10 as customField10 , business_unit as businessUnit , asn_year as asnYear, " +
			"cus_field_11 as customField11,cus_field_12 as customField12,cus_field_13 as customField13,cus_field_14 as customField14,cus_field_15 as customField15,cus_field_16 as customField16,cus_field_17 as customField17,cus_field_18 as customField18,cus_field_19 as customField19,cus_field_20 as customField20 , credit_debit_ind as creditDebitInd , advance_ind as advanceInd" +
			" , fi_doc_posting_date as fiDocPostingDate , fi_doc_doc_date as fiDocDocDate, clearing_doc_no as clearingDocNo ,  posting_key as postingKey" +
			"  from upeg.payment_main_view pmv " +
			" where" +
			"   ( internal_company_id = :companyId or :companyId is null )   and" +
			" case " +
			"  when payment_date is not null then to_date(payment_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') " +
			" else true " +
			" end order by payment desc",
			countQuery = "select count(*) from (select  po_number as poId,VENDOR_CODE as vendorCode,IV_DOCUMENT as invoiceDocument,IV_DATE as invoiceDate,IV_QUANTITY as invoiceQuantity,IV_BASIC_AMOUNT as invoiceBasicAmount,IV_TAX_AMOUNT as invoiceTaxAmount,IV_TOTAL_AMOUNT as invoiceTotalAmount,VENDOR_INVOICE_NUMBER as vendorInvoiceNumber,PAYMENT_DOC_NUMBER as paymentDocumentNumber, company_name as companyName ,created_date as createdDate ,to_date(payment_date,'dd-mm-yyyy') as payment , PAYMENT_DATE as paymentDate ," +
					"vendor_inv_date as vendorInvDate,currency,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9 as customField9,cus_field_10 as customField10 , business_unit as businessUnit , asn_year as asnYear, " +
					"cus_field_11 as customField11,cus_field_12 as customField12,cus_field_13 as customField13,cus_field_14 as customField14,cus_field_15 as customField15,cus_field_16 as customField16,cus_field_17 as customField17,cus_field_18 as customField18,cus_field_19 as customField19,cus_field_20 as customField20 , credit_debit_ind as creditDebitInd , advance_ind as advanceInd" +
					" , fi_doc_posting_date as fiDocPostingDate , fi_doc_doc_date as fiDocDocDate, clearing_doc_no as clearingDocNo ,  posting_key as postingKey " +
					"  from upeg.payment_main_view pmv " +
					" where" +
					"   ( internal_company_id = :companyId or :companyId is null )   and" +
					" case " +
					"  when payment_date is not null then to_date(payment_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') " +
					" else true " +
					" end order by payment desc) as t  "
			, nativeQuery = true)
	Page<PaymentInternalViewDto> findPaymentDetailsForCentralizedUser(String companyId, Pageable pageable,
			String fromDate, String toDate);


	@Query(value = "select  po_number as poId,VENDOR_CODE as vendorCode,IV_DOCUMENT as invoiceDocument,IV_DATE as invoiceDate,IV_QUANTITY as invoiceQuantity,IV_BASIC_AMOUNT as invoiceBasicAmount,IV_TAX_AMOUNT as invoiceTaxAmount,IV_TOTAL_AMOUNT as invoiceTotalAmount,VENDOR_INVOICE_NUMBER as vendorInvoiceNumber,PAYMENT_DOC_NUMBER as paymentDocumentNumber, company_name as companyName ,created_date as createdDate ,to_date(payment_date,'dd-mm-yyyy') as payment , PAYMENT_DATE as paymentDate ," +
			"vendor_inv_date as vendorInvDate,currency,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9 as customField9,cus_field_10 as customField10 , business_unit as businessUnit , asn_year as asnYear, " +
			"cus_field_11 as customField11,cus_field_12 as customField12,cus_field_13 as customField13,cus_field_14 as customField14,cus_field_15 as customField15,cus_field_16 as customField16,cus_field_17 as customField17,cus_field_18 as customField18,cus_field_19 as customField19,cus_field_20 as customField20 , credit_debit_ind as creditDebitInd , advance_ind as advanceInd" +
			" , fi_doc_posting_date as fiDocPostingDate , fi_doc_doc_date as fiDocDocDate, clearing_doc_no as clearingDocNo ,  posting_key as postingKey" +
			"  from upeg.payment_main_view pmv " +
			"JOIN supplier.supplier_user_business_unit uori on pmv.business_unit = uori.bu_id " +
			" where uori.user_id = :userId   and " +
			"( internal_company_id = :companyId or :companyId is null) and  " +
			" case " +
			"  when payment_date is not null then to_date(payment_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') " +
			" else true " +
			" end order by payment desc",
			countQuery = "select count(*)  from (select  po_number as poId,VENDOR_CODE as vendorCode,IV_DOCUMENT as invoiceDocument,IV_DATE as invoiceDate,IV_QUANTITY as invoiceQuantity,IV_BASIC_AMOUNT as invoiceBasicAmount,IV_TAX_AMOUNT as invoiceTaxAmount,IV_TOTAL_AMOUNT as invoiceTotalAmount,VENDOR_INVOICE_NUMBER as vendorInvoiceNumber,PAYMENT_DOC_NUMBER as paymentDocumentNumber, company_name as companyName ,created_date as createdDate ,to_date(payment_date,'dd-mm-yyyy') as payment , PAYMENT_DATE as paymentDate ," +
					"vendor_inv_date as vendorInvDate,currency,cus_field_1 as customField1,cus_field_2 as customField2,cus_field_3 as customField3,cus_field_4 as customField4,cus_field_5 as customField5,cus_field_6 as customField6,cus_field_7 as customField7,cus_field_8 as customField8,cus_field_9 as customField9,cus_field_10 as customField10 , business_unit as businessUnit , asn_year as asnYear, " +
					"cus_field_11 as customField11,cus_field_12 as customField12,cus_field_13 as customField13,cus_field_14 as customField14,cus_field_15 as customField15,cus_field_16 as customField16,cus_field_17 as customField17,cus_field_18 as customField18,cus_field_19 as customField19,cus_field_20 as customField20 , credit_debit_ind as creditDebitInd , advance_ind as advanceInd" +
					" , fi_doc_posting_date as fiDocPostingDate , fi_doc_doc_date as fiDocDocDate, clearing_doc_no as clearingDocNo ,  posting_key as postingKey " +
					"  from upeg.payment_main_view pmv " +
					"JOIN supplier.supplier_user_business_unit uori on pmv.business_unit = uori.bu_id " +
					" where uori.user_id = :userId   and " +
					"( internal_company_id = :companyId or :companyId is null) and  " +
					" case " +
					"  when payment_date is not null then to_date(payment_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') " +
					" else true " +
					" end order by payment desc) as t "
			, nativeQuery = true)
	Page<PaymentInternalViewDto> findPaymentDetailsForAdditionalUsers(String companyId, Pageable pageable, String fromDate, String toDate,String userId);
}
