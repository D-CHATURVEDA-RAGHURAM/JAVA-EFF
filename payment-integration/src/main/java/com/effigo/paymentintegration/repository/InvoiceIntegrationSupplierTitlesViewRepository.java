package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.InvoiceIntegrationSupplierTitlesView;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InvoiceIntegrationSupplierTitlesViewRepository extends JpaRepository<InvoiceIntegrationSupplierTitlesView,String> {

}
