package com.effigo.shared.dto.audit;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class RetryResponseDto {
    private boolean status;
    private String response;
    private int statusCode;
}
