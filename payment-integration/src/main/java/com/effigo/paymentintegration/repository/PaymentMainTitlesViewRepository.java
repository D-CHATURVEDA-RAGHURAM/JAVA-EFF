package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.PaymentMainTitlesView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMainTitlesViewRepository extends JpaRepository<PaymentMainTitlesView,String> {
}
