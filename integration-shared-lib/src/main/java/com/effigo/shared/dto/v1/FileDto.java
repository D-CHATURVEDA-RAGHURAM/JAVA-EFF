package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.ByteArrayOutputStream;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileDto {
    public FileDto(ByteArrayOutputStream byteArrayOutputStream, String fileName) {
        this.byteArrayOutputStream = byteArrayOutputStream;
        this.fileName = fileName;
    }

    private ByteArrayOutputStream byteArrayOutputStream;
    private String fileName;

    private String mimeType;
    public ByteArrayOutputStream getByteArrayOutputStream() {
        return byteArrayOutputStream;
    }

    public void setByteArrayOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
        this.byteArrayOutputStream = byteArrayOutputStream;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
