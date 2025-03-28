package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.PaymentMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface PaymentMainRepository extends JpaRepository<PaymentMain, UUID> {

	@Query(nativeQuery = true, value = "select * from upeg.payment_main where payment_doc_number in (:docNumbers) and iv_document in (:invDocNumbers)")
	List<PaymentMain> getPaymentDetailsByDocNumber(Set<String> docNumbers,Set<String> invDocNumbers);
}
