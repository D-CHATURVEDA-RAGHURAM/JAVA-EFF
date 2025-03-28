package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.InvoiceIntegrations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Repository
public interface InvoiceIntegrationsRepository extends JpaRepository<InvoiceIntegrations, UUID> {

	@Query(nativeQuery = true, value = "select * from upeg.invoice_integrations where inv_doc_no in (:invoiceDocNumbers)")
	List<InvoiceIntegrations> findAllByInvoiceDocNumber(Set<String> invoiceDocNumbers);

	@Query(nativeQuery = true, value = "select CAST(invoice_integrations_id as varchar)  from upeg.invoice_integrations ii " +
			" where concat(cast(ii.inv_doc_no as varchar),cast(ii.fiscal_year  as varchar)) in (:docFiscalYear)")
	List<String> findAllByDocNumberAndFiscalYear(Set<String> docFiscalYear);


	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update upeg.invoice_integrations set status =:status where" +
			" cast(invoice_integrations_id as varchar) in (:invoiceIds)")
	void updateStatusByInvoiceIds(@Param("status") boolean status, @Param("invoiceIds") List<String> invoiceIds
			);

	List<InvoiceIntegrations> findByAccountingDocumentNumberAndFiscalYearAndDocumentPostingDateAndInvoiceDocumentItemAndStatus
			(String accountingDocumentNumber,
			String fiscalYear, String postingDate, String invoiceItem, boolean status);


	@Query(nativeQuery = true , value = " select * from upeg.invoice_integrations ii where " +
			" (ii.accounting_doc_no ||''|| ii.fiscal_year ||''|| ii.posting_date ||''|| ii.inv_doc_item) =:key " +
			" and status =:status")
	Optional<InvoiceIntegrations> findExistingInvoicesByKey(String key, boolean status);

	List<InvoiceIntegrations> findByInvoiceDocumentNumberAndFiscalYearAndDocumentPostingDateAndInvoiceDocumentItem
			(String accountingDocumentNumber,
					String fiscalYear, String postingDate, String invoiceItem);

}
