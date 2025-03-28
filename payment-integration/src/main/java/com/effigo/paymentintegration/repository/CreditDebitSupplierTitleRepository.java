package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.CreditDebitSupplierTitleView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditDebitSupplierTitleRepository extends JpaRepository<CreditDebitSupplierTitleView,String> {
}
