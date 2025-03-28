package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.PaymentMain;
import com.effigo.paymentintegration.entity.PaymentStatusLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentStatusLogRepository extends CrudRepository<PaymentStatusLog, UUID> {
}
