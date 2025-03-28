package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.CreditDebitEntity;
import com.effigo.shared.dto.v1.CreditDebitResponseDtoV1;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.http.HttpStatus;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CreditDebitResponseMapper extends IEntityMapper<CreditDebitResponseDtoV1, CreditDebitEntity>{

	@Mapping(target = "accountingDocNo", source = "accountingDocNo")
	@Mapping(target = "fiscalYear", source = "fiscalYear")
	@Mapping(target = "message",constant="Record Inserted Successfully")
	@Mapping(target = "httpStatus", constant = "OK")
	CreditDebitResponseDtoV1 toDto(CreditDebitEntity e);

	List<CreditDebitResponseDtoV1> toDto(List<CreditDebitEntity> eList);

}
