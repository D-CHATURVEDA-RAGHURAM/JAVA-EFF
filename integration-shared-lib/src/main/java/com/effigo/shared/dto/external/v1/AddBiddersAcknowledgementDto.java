package com.effigo.shared.dto.external.v1;

import lombok.*;
import org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class AddBiddersAcknowledgementDto {
    private String status;
    private String code;
    private String message;
    private List<Object> errors;
}
