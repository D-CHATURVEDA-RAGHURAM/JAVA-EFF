package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.PaymentAdvance;
import com.effigo.shared.dto.v1.PaymentAdvanceDtoV1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentAdvanceMapper extends IEntityMapper<PaymentAdvanceDtoV1, PaymentAdvance> {

	PaymentAdvance toDomain(PaymentAdvanceDtoV1 paymentAdvanceDtoV1);

	PaymentAdvanceDtoV1 toDto(PaymentAdvance paymentAdvance);

	List<PaymentAdvance> toDomainList(List<PaymentAdvanceDtoV1> paymentAdvanceDtoV1s);

	List<PaymentAdvanceDtoV1> toDtoList(List<PaymentAdvance> paymentAdvances);

	@Mapping(target = "paymenttId", ignore = true)
	@Mapping(target = "status", constant = "true")
	void partialUpdate(PaymentAdvance source, @MappingTarget PaymentAdvance target);

}
