package com.effigo.shared.entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class OutputDtoV1 {
    private Map<String, Object> data = new HashMap<>();
    public Map<String, Object> getData() {
        return data;
    }

    @JsonAnySetter
    public void addData(String property, Object value) {
        this.data.put(property, value);
    }
}
