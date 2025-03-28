package com.effigo.shared.dto.v4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileRequestDto {
    private String module;
    private String moduleId;
    private List<FilesList> files;


}
