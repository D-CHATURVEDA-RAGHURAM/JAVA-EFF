package com.effigo.paymentintegration.service;

import com.effigo.paymentintegration.entity.PaymentMain;
import com.effigo.paymentintegration.mapper.PaymentStatusLogMapper;
import com.effigo.paymentintegration.repository.PaymentStatusLogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentStatusLogService {
    private final Logger log = LoggerFactory.getLogger(PaymentStatusLogService.class);
    @Autowired
    private PaymentStatusLogRepository paymentStatusLogRepository;
    @Autowired
    private PaymentStatusLogMapper paymentStatusLogMapper;

    public void saveAddPaymentsStatusLog(List<PaymentMain> paymentMains) {
        log.info("PaymentMain: {}", paymentMains);
        try {
            paymentStatusLogRepository.saveAll(paymentStatusLogMapper.toDomainList(paymentMains));
        }catch (Exception e){
            log.info(e.getMessage());
        }

    }
}
