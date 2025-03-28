package com.effigo.shared.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@JsonPropertyOrder({
        "success",
        "message",
        "data",
        "status"

})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse implements Serializable {

    @JsonIgnore
    private static final long serialVersionUID = 7702134516418120340L;

    @JsonProperty("success")
    private Boolean success=Boolean.FALSE;
    @JsonProperty("message")
    private String message="";
    @JsonProperty("errors")
    private Object errors=new ArrayList<>();
    @JsonProperty("data")
    private Object data=new ArrayList<>();
    @JsonIgnore
    @JsonProperty("status")
    private HttpStatus status=HttpStatus.INTERNAL_SERVER_ERROR;

    @JsonProperty("Status")
    private Boolean statusValue;
}