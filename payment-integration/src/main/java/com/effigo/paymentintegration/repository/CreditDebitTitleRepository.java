package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.CreditDebitTitleView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditDebitTitleRepository extends JpaRepository<CreditDebitTitleView,String> {
}
