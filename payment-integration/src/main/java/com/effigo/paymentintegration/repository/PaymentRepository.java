package com.effigo.paymentintegration.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.effigo.paymentintegration.entity.PaymentAdvance;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentAdvance, String>{


	List<PaymentAdvance> findByFiDocNoAndFiDocYear(String fiDocNo, String fiDocYear);


	@Query(nativeQuery = true, value = "select * from upeg.payment_advance pa where " +
			"status = true and " +
			"(pa.clearing_year ||''|| pa.clearing_doc ||''||pa.clearing_date  ||''|| pa.fi_doc_no  ||''|| pa.fi_doc_posting_date  ||''|| pa.debit_or_credit_ind ) = " +
			":paymentKey")
	Optional<PaymentAdvance> findByPaymentKey(final String paymentKey);


	@Query(nativeQuery = true, value = "select * from upeg.payment_advance pa where " +
			"status = true and " +
			"(pa.clearing_year ||''|| pa.clearing_doc ||''||pa.clearing_date  ||''|| pa.fi_doc_no  ||''|| pa.fi_doc_year  ||''|| pa.debit_or_credit_ind ) = " +
			":paymentKey")
	List<PaymentAdvance> findReversalByPaymentKey(final String paymentKey);


}
