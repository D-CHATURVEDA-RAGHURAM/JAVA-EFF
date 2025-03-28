package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.CreditDebitEntity;
import com.effigo.shared.dto.v1.CreditDebitDtoV1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CreditDebitMapper extends IEntityMapper<CreditDebitDtoV1, CreditDebitEntity>{

    CreditDebitEntity toDomain(CreditDebitDtoV1 creditDebitDtoV1);
    CreditDebitDtoV1 toDto(CreditDebitEntity creditDebitEntity);
    List<CreditDebitEntity> toDomainList(List<CreditDebitDtoV1> creditDebitDtoV1List);
    List<CreditDebitDtoV1> toDtoList(List<CreditDebitEntity> creditDebitEntityList);

    @Mapping(target = "creditDebitId", ignore = true)
    void partialUpdate(CreditDebitEntity source, @MappingTarget CreditDebitEntity target);
}
