package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.PaymentMainSupplierTitlesView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMainSupplierTitlesViewRepository extends JpaRepository<PaymentMainSupplierTitlesView,String> {
}
