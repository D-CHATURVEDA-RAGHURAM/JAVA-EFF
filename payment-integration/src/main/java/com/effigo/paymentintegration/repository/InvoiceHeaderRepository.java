package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.InvoiceHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceHeaderRepository extends JpaRepository<InvoiceHeader, String> {

}
