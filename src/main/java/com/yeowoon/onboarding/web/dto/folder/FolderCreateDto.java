package com.yeowoon.onboarding.web.dto.folder;

import com.yeowoon.onboarding.domain.folder.Folder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FolderCreateDto {

    private String title;

    public Folder toEntity(){
        return new Folder(this.title);
    }
}
