package com.effigo.paymentintegration.mapper;

import com.effigo.paymentintegration.entity.InvoiceIntegrationView;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceIntegrationInternalViewDto;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceInternalViewDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceDtoViewMapper {

    List<InvoiceIntegrationInternalViewDto> toDto(List<InvoiceIntegrationView> invoiceIntegrationViews);
    @Mapping(target = "documentPostingDate", source = "documentPostingDate", qualifiedByName = "dateConverter")
    @Mapping(target = "postingDate", source = "postingDate", qualifiedByName = "dateConverter")
    @Mapping(target = "entryDate", source = "entryDate", qualifiedByName = "dateConverter")
    InvoiceIntegrationInternalViewDto toDto(InvoiceIntegrationView invoiceIntegrationView);

    @Named("dateConverter")
    default String dateConverter(String dateStr) {
        if(StringUtils.hasLength(dateStr) ) {
            try {
                if ("0000-00-00".equals(dateStr) || "00-00-0000".equals(dateStr)) {
                    return " ";
                }
                SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date = inputFormat.parse(dateStr);
                return outputFormat.format(date);
            } catch (Exception e) {
               // e.printStackTrace();
                return dateStr;
            }
        }
        return "";
    }

}
