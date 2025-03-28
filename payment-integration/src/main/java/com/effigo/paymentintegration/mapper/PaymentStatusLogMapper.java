package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.PaymentMain;
import com.effigo.paymentintegration.entity.PaymentStatusLog;
import com.effigo.shared.dto.v1.PaymentMainDtoV1;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentStatusLogMapper {
    PaymentStatusLog toDomain(PaymentMain paymentMain);
    PaymentMain toDto(PaymentStatusLog paymentStatusLog);
    List<PaymentStatusLog> toDomainList(List<PaymentMain> paymentMains);
    List<PaymentMain> toDtoList(List<PaymentStatusLog> paymentStatusLogs);

    void partialUpdate(PaymentStatusLog source, @MappingTarget PaymentStatusLog target);

}

