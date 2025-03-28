package com.effigo.shared.dto.v4;


public class IntegrationsFileUploadDtoV2 {
    public IntegrationsFileUploadDtoV2() {
    }

    public IntegrationsFileUploadDtoV2(String path) {
        this.path = path;
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
