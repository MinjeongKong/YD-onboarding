package com.yeowoon.onboarding.service;

import com.yeowoon.onboarding.domain.account.Account;
import com.yeowoon.onboarding.domain.account.AccountRepository;
import com.yeowoon.onboarding.web.dto.ResponseDto;
import com.yeowoon.onboarding.web.dto.account.AccountCreateDto;
import com.yeowoon.onboarding.web.dto.account.AccountResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Transactional
    public ResponseDto createAccount(AccountCreateDto requestDto){

        Account account = requestDto.toEntity();
        accountRepository.save(account);

        AccountResponseDto responseDto = new AccountResponseDto(account);
        return new ResponseDto("SUCCESS", responseDto);
    }
}
