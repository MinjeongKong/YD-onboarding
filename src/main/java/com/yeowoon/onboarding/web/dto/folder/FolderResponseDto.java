package com.yeowoon.onboarding.web.dto.folder;

import com.yeowoon.onboarding.domain.folder.Folder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FolderResponseDto {

    private Long folderId;

    public FolderResponseDto(Folder entity) {
        this.folderId = entity.getId();
    }
}
