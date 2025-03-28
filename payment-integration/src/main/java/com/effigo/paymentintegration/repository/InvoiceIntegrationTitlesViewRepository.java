package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.InvoiceIntegrationTitlesView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceIntegrationTitlesViewRepository extends JpaRepository<InvoiceIntegrationTitlesView,String> {
}
