package com.effigo.paymentintegration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import com.effigo.paymentintegration.entity.InvoiceIntegrations;
import com.effigo.paymentintegration.entity.PaymentAdvance;
import com.effigo.paymentintegration.mapper.PaymentAdvanceMapper;
import com.effigo.paymentintegration.mapper.PaymentResponseMapper;
import com.effigo.paymentintegration.repository.PaymentRepository;
import com.effigo.shared.dto.v1.PaymentAdvanceDtoV1;
import com.effigo.shared.dto.v1.PaymentAdvanceResponseDtoV1;
import com.effigo.shared.dto.v1.PaymentExternalResponseDtoV1;

import lombok.extern.slf4j.Slf4j;

import static com.effigo.paymentintegration.utils.CommonUtil.getPaymentExistingKey;
import static com.effigo.paymentintegration.utils.CommonUtil.getPaymentReversalExistingKey;

@Slf4j
@Service
public class PaymentAdvanceService {

	@Autowired
	private PaymentAdvanceMapper paymentAdvanceMapper;

	@Autowired
	private PaymentResponseMapper paymentResponseMapper;

	@Autowired
	private PaymentRepository paymentRepository;

	public PaymentExternalResponseDtoV1 savePaymentDetails(List<PaymentAdvanceDtoV1> paymentAdvanceDtoV1s) {
		PaymentExternalResponseDtoV1 paymentAdvanceResponseDtoV1 = new PaymentExternalResponseDtoV1();

		try {
			if (!CollectionUtils.isEmpty(paymentAdvanceDtoV1s)) {
				List<PaymentAdvance> paymentAdvances = paymentAdvanceMapper.toDomainList(paymentAdvanceDtoV1s);
				List<PaymentAdvance> existingPayments = new ArrayList<>();
				List<PaymentAdvance> removePayments = new ArrayList<>();
				paymentAdvances.forEach(i -> {
					boolean hasReversalInfo = StringUtils.isNotBlank(i.getRevDocNo()) &&
							StringUtils.isNotBlank(i.getRevYear());
					log.info("savePaymentDetails -  hasReversalInfo : {}", hasReversalInfo);
					if (hasReversalInfo) {
						List<PaymentAdvance> existingReversalPayments = paymentRepository.findReversalByPaymentKey(
								getPaymentReversalExistingKey.apply(i));
						log.info("savePaymentDetails -  reversalPayments  : {}", existingReversalPayments);
						if (!CollectionUtils.isEmpty(existingReversalPayments)) {
							for (PaymentAdvance existingPayment : existingReversalPayments) {
								existingPayment.setStatus(Boolean.FALSE);
								paymentRepository.save(existingPayment);
							}
							i.setStatus(Boolean.FALSE);
						} else {
							updatePayments(existingPayments, removePayments, i);
							i.setStatus(Boolean.TRUE);
						}
					} else {
						updatePayments(existingPayments, removePayments, i);
						i.setStatus(Boolean.TRUE);
					}
				});
				log.info("savePaymentDetails -  paymentAdvances : {} , existingPayments : {} , removePayments : {}",
						paymentAdvances, existingPayments, removePayments);
				if (!CollectionUtils.isEmpty(existingPayments)) {
					paymentAdvances.removeAll(removePayments);
					paymentAdvances.addAll(existingPayments);
				}
				List<PaymentAdvance> savedPayments = paymentRepository.saveAll(paymentAdvances);
				if (!CollectionUtils.isEmpty(savedPayments)) {
					List<PaymentAdvanceResponseDtoV1> paymentAdvanceResponseDtoV1s = paymentResponseMapper.toDto(
							savedPayments);

					paymentAdvanceResponseDtoV1.setPaymentAdvanceResponseDtoV1s(paymentAdvanceResponseDtoV1s);
				}
			}
		} catch (Exception e) {
			log.error("Exception while saving payment details: {}", e.getMessage());
		}

		return paymentAdvanceResponseDtoV1;
	}

	private void updatePayments(List<PaymentAdvance> existingPayments, List<PaymentAdvance> removePayments,
			PaymentAdvance i) {
		final Optional<PaymentAdvance> byPaymentKey = paymentRepository.findByPaymentKey(
				getPaymentExistingKey.apply(i));
		byPaymentKey.ifPresent(pa -> {
			paymentAdvanceMapper.partialUpdate(i, pa);
			existingPayments.add(pa);
			removePayments.add(i);
		});
	}
}