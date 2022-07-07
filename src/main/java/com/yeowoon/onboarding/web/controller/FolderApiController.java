package com.yeowoon.onboarding.web.controller;

import com.yeowoon.onboarding.service.FolderService;
import com.yeowoon.onboarding.web.dto.ResponseDto;
import com.yeowoon.onboarding.web.dto.folder.FolderCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FolderApiController {

    private final FolderService folderService;

    @PostMapping("/{accountId}/folder")
    public ResponseDto createFolder(@PathVariable Long accountId, @RequestBody FolderCreateDto requestDto){
        return folderService.createFolder(accountId, requestDto);
    }

}
