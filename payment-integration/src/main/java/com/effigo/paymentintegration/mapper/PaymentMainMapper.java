package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.PaymentMain;
import com.effigo.shared.dto.v1.PaymentMainDtoV1;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMainMapper {

  @Mapping(target = "invoiceDate", source = "invoiceDate", qualifiedByName = "dateValidationCheck")
  @Mapping(target = "paymentDate",source = "paymentDate", qualifiedByName = "dateValidationCheck")
  @Mapping(target = "vendorInvoiceDate",source = "vendorInvoiceDate", qualifiedByName = "dateValidationCheck")

    PaymentMain toDomain(PaymentMainDtoV1 paymentMainDtoV1);
    PaymentMainDtoV1 toDto(PaymentMain paymentMain);
    List<PaymentMain> toDomain(List<PaymentMainDtoV1> paymentMainDtoV1);
    List<PaymentMainDtoV1> toDtoList(List<PaymentMain> paymentMain);

    @Mapping(target = "paymentId", ignore = true)
    void partialUpdate(PaymentMain paymentMain, @MappingTarget PaymentMain target);

  @Named("dateValidationCheck")
  default String documentPostingDate(String dateStr) {
    if ("0000-00-00".equals(dateStr) || "00-00-0000".equals(dateStr)){
      return null;
    }
    return dateStr;
  }

   /* @Named("dateConverter")
    default java.sql.Date dateConverter(String dateStr) {
        java.sql.Date date = null;
        try{
            if(StringUtils.isNotEmpty(dateStr)) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = format.parse(dateStr);
                date = new java.sql.Date(parse.getTime());
            }
        } catch (Exception e) {

        }
        return date;
    }*/
}

