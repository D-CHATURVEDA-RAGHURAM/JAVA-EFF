package com.effigo.paymentintegration.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.effigo.paymentintegration.entity.PaymentAdvance;
import com.effigo.shared.dto.v1.PaymentAdvanceResponseDtoV1;

@Mapper(componentModel = "spring")
public interface PaymentResponseMapper extends IEntityMapper<PaymentAdvanceResponseDtoV1, PaymentAdvance>{
	
	@Mapping(target = "companyCode",source = "companyCode")
	@Mapping(target = "fiDocNo", source = "fiDocNo")
	@Mapping(target = "fiDocYear", source = "fiDocYear")
	@Mapping(target = "message",constant="Record Inserted Successfully")
	@Mapping(target = "httpStatus", constant = "OK")
	PaymentAdvanceResponseDtoV1 toDto(PaymentAdvance e);

	List<PaymentAdvanceResponseDtoV1> toDto(List<PaymentAdvance> eList);
}
