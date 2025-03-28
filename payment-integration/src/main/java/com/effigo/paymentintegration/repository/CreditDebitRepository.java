package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.CreditDebitEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditDebitRepository extends JpaRepository<CreditDebitEntity,String> {


	List<CreditDebitEntity> findByAccountingDocNoAndFiscalYearAndPostingDate(String accountingDocNo, String fiscalYear, String postingDate);

	@Query(nativeQuery = true, value = "select * from upeg.credit_debit cd where (cd.fiscal_year || '' || cd.accounting_doc_no || '' || cd.posting_date  )" +
			" = :cdKey and status = true")
	Optional<CreditDebitEntity> findByExistingKey(final String cdKey);
}
