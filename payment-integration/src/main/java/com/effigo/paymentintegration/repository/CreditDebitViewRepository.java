package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.CreditDebitDropdownViewEntity;
import com.effigo.paymentintegration.entity.CreditDebitView;
import com.effigo.paymentintegration.entity.DropDown;
import com.effigo.paymentintegration.entity.DropdownViewEntity;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.CreditDebitInternalViewDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditDebitViewRepository extends JpaRepository<CreditDebitView, String> {
	@Query(value = "select distinct company_code as companyCode,fiscal_year as fiscalYear,accounting_doc_no as accountingDocNo," +
			"document_type as documentType,document_date as documentDate,posting_date as postingDate,doc_currency_amount as docCurrencyAmount,cgst,sgst,igst,material_no as materialNo,material_desc as materialDesc," +
			"gross,vendor_acc_no as vendorAccNo,doc_lot_no as docLotNo,assignment_no as assignmentNo,doc_header_text as docHeaderText,ref_doc_no as refDocNo,item_text as itemText," +
			"category,read_text as readText,invoice_doc_no as invoiceDocNo,invoice_doc_year as invoiceDocYear,rev_doc_no as revDocNo,rev_doc_fiscal_year as revDocFiscalYear,currency_key as currencyKey," +
			"local_currency_amount as localCurrencyAmount,field1,field2,field3,field4,field5,field6,field7,field8,field9,field10," +
			"quantity,uom,hsn_code as hsnCode,rate,plant,company_id as companyId,company_name as companyName,created_date as createdDate" +
			" ,  purchase_doc_no as purchaseDocNo, business_unit as businessUnit" +
			"  from upeg.v_credit_debit vcd" +
			" JOIN masters.user_organization_rel_info uori ON vcd.business_unit = uori.dept_id" +
			" where uori.user_id = :userId  and  uori.status = 1 and internal_company_id like :companyId and " +
			" to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc ",
			countQuery = "select count(*) from (select distinct company_code as companyCode,fiscal_year as fiscalYear,accounting_doc_no as accountingDocNo," +
					"document_type as documentType,document_date as documentDate,posting_date as postingDate,doc_currency_amount as docCurrencyAmount,cgst,sgst,igst,material_no as materialNo,material_desc as materialDesc," +
					"gross,vendor_acc_no as vendorAccNo,doc_lot_no as docLotNo,assignment_no as assignmentNo,doc_header_text as docHeaderText,ref_doc_no as refDocNo,item_text as itemText," +
					"category,read_text as readText,invoice_doc_no as invoiceDocNo,invoice_doc_year as invoiceDocYear,rev_doc_no as revDocNo,rev_doc_fiscal_year as revDocFiscalYear,currency_key as currencyKey," +
					"local_currency_amount as localCurrencyAmount,field1,field2,field3,field4,field5,field6,field7,field8,field9,field10," +
					"quantity,uom,hsn_code as hsnCode,rate,plant,company_id as companyId,company_name as companyName,created_date as createdDate " +
					",purchase_doc_no as purchaseDocNo, business_unit as businessUnit " +
					"from upeg.v_credit_debit vcd" +
					" JOIN masters.user_organization_rel_info uori ON vcd.business_unit = uori.dept_id" +
					" where uori.user_id = :userId  and  uori.status = 1 and internal_company_id like :companyId and " +
					" to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc ) as t ", nativeQuery = true)
	Page<CreditDebitInternalViewDto> findCreditDebitDetails(String companyId, Pageable pageable, String userId,
			String fromDate, String toDate);

	@Query(value = "select distinct company_code as companyCode,fiscal_year as fiscalYear,accounting_doc_no as accountingDocNo," +
			"document_type as documentType,document_date as documentDate,posting_date as postingDate,doc_currency_amount as docCurrencyAmount,cgst,sgst,igst,material_no as materialNo,material_desc as materialDesc," +
			"gross,vendor_acc_no as vendorAccNo,doc_lot_no as docLotNo,assignment_no as assignmentNo,doc_header_text as docHeaderText,ref_doc_no as refDocNo,item_text as itemText," +
			"category,read_text as readText,invoice_doc_no as invoiceDocNo,invoice_doc_year as invoiceDocYear,rev_doc_no as revDocNo,rev_doc_fiscal_year as revDocFiscalYear,currency_key as currencyKey," +
			"local_currency_amount as localCurrencyAmount,field1,field2,field3,field4,field5,field6,field7,field8,field9,field10," +
			"quantity,uom,hsn_code as hsnCode,rate,plant,company_id as companyId,company_name as companyName,created_date as createdDate" +
			" ,  purchase_doc_no as purchaseDocNo, business_unit as businessUnit" +
			" from upeg.v_credit_debit where internal_company_id like :companyId and " +
			" to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc",
			countQuery = "select count(*) from (select distinct company_code as companyCode,fiscal_year as fiscalYear,accounting_doc_no as accountingDocNo," +
					"document_type as documentType,document_date as documentDate,posting_date as postingDate,doc_currency_amount as docCurrencyAmount,cgst,sgst,igst,material_no as materialNo,material_desc as materialDesc," +
					"gross,vendor_acc_no as vendorAccNo,doc_lot_no as docLotNo,assignment_no as assignmentNo,doc_header_text as docHeaderText,ref_doc_no as refDocNo,item_text as itemText," +
					"category,read_text as readText,invoice_doc_no as invoiceDocNo,invoice_doc_year as invoiceDocYear,rev_doc_no as revDocNo,rev_doc_fiscal_year as revDocFiscalYear,currency_key as currencyKey," +
					"local_currency_amount as localCurrencyAmount,field1,field2,field3,field4,field5,field6,field7,field8,field9,field10," +
					"quantity,uom,hsn_code as hsnCode,rate,plant,company_id as companyId,company_name as companyName,created_date as createdDate" +
					" ,  purchase_doc_no as purchaseDocNo, business_unit as businessUnit" +
					" from upeg.v_credit_debit where internal_company_id like :companyId and " +
					" to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc) as t ", nativeQuery = true)
	Page<CreditDebitInternalViewDto> findCreditDebitDetailsForCentralizedUser(String companyId, Pageable pageable,
			String fromDate, String toDate);

//	@Query(value = "select distinct internal_company_id as companyId,company_name as companyName from upeg.v_credit_debit order by company_name asc ", nativeQuery = true)
//	List<DropDown> getCreditDebitDropDownDetails();


	@Query("SELECT new com.effigo.paymentintegration.entity.CreditDebitDropdownViewEntity(v.companyId, v.companyName) " +
			"FROM CreditDebitDropdownViewEntity v ORDER BY v.companyName asc")
	List<CreditDebitDropdownViewEntity> getCreditDebitDropDownDetails();

	@Query(value = "select distinct company_code as companyCode,fiscal_year as fiscalYear,accounting_doc_no as accountingDocNo," +
			"document_type as documentType,document_date as documentDate,posting_date as postingDate,doc_currency_amount as docCurrencyAmount,cgst,sgst,igst,material_no as materialNo,material_desc as materialDesc," +
			"gross,vendor_acc_no as vendorAccNo,doc_lot_no as docLotNo,assignment_no as assignmentNo,doc_header_text as docHeaderText,ref_doc_no as refDocNo,item_text as itemText," +
			"category,read_text as readText,invoice_doc_no as invoiceDocNo,invoice_doc_year as invoiceDocYear,rev_doc_no as revDocNo,rev_doc_fiscal_year as revDocFiscalYear,currency_key as currencyKey," +
			"local_currency_amount as localCurrencyAmount,field1,field2,field3,field4,field5,field6,field7,field8,field9,field10," +
			"quantity,uom,hsn_code as hsnCode,rate,plant,company_id as companyId,company_name as companyName,created_date as createdDate" +
			" ,  purchase_doc_no as purchaseDocNo, business_unit as businessUnit" +
			"  from upeg.v_credit_debit vcd" +
			" JOIN supplier.supplier_user_business_unit uori ON vcd.business_unit = uori.bu_id" +
			" where uori.user_id = :userId and internal_company_id like :companyId and " +
			" to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc ",
			countQuery = "select count(*) from (select distinct company_code as companyCode,fiscal_year as fiscalYear,accounting_doc_no as accountingDocNo," +
					"document_type as documentType,document_date as documentDate,posting_date as postingDate,doc_currency_amount as docCurrencyAmount,cgst,sgst,igst,material_no as materialNo,material_desc as materialDesc," +
					"gross,vendor_acc_no as vendorAccNo,doc_lot_no as docLotNo,assignment_no as assignmentNo,doc_header_text as docHeaderText,ref_doc_no as refDocNo,item_text as itemText," +
					"category,read_text as readText,invoice_doc_no as invoiceDocNo,invoice_doc_year as invoiceDocYear,rev_doc_no as revDocNo,rev_doc_fiscal_year as revDocFiscalYear,currency_key as currencyKey," +
					"local_currency_amount as localCurrencyAmount,field1,field2,field3,field4,field5,field6,field7,field8,field9,field10," +
					"quantity,uom,hsn_code as hsnCode,rate,plant,company_id as companyId,company_name as companyName,created_date as createdDate " +
					",purchase_doc_no as purchaseDocNo, business_unit as businessUnit " +
					"from upeg.v_credit_debit vcd" +
					" JOIN supplier.supplier_user_business_unit uori ON vcd.business_unit = uori.bu_id" +
					" where uori.user_id = :userId and internal_company_id like :companyId and " +
					" to_date(posting_date,'dd-mm-yyyy') between to_date(:fromDate,'yyyy-mm-dd') and  to_date(:toDate,'yyyy-mm-dd') order by postingDate desc ) as t ", nativeQuery = true)
	Page<CreditDebitInternalViewDto> findCreditDebitDetailsForAdditionalUsers(String companyId, Pageable pageable, String fromDate, String toDate, String userId);
}
