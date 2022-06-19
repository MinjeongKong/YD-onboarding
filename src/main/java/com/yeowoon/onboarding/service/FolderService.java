package com.yeowoon.onboarding.service;

import com.yeowoon.onboarding.domain.account.Account;
import com.yeowoon.onboarding.domain.account.AccountRepository;
import com.yeowoon.onboarding.domain.folder.Folder;
import com.yeowoon.onboarding.domain.folder.FolderRepository;
import com.yeowoon.onboarding.web.dto.ResponseDto;
import com.yeowoon.onboarding.web.dto.folder.FolderCreateDto;
import com.yeowoon.onboarding.web.dto.folder.FolderResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class FolderService {

    private final AccountRepository accountRepository;
    private final FolderRepository folderRepository;

    @Transactional
    public ResponseDto createFolder(Long accountId, FolderCreateDto requestDto) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("해당 회원이 없습니다. id=" + accountId));

        Folder folder = requestDto.toEntity();
        folder.setAccount(account);

        folderRepository.save(folder);
        FolderResponseDto responseDto = new FolderResponseDto(folder);
        return new ResponseDto("SUCCESS", responseDto);
    }
}
