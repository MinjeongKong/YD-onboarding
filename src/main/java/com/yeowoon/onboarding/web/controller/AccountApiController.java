package com.yeowoon.onboarding.web.controller;

import com.yeowoon.onboarding.service.AccountService;
import com.yeowoon.onboarding.web.dto.ResponseDto;
import com.yeowoon.onboarding.web.dto.account.AccountCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AccountApiController {

    private final AccountService accountService;

    //회원가입
    @PostMapping("/auth/register")
    public ResponseDto createAccount(@RequestBody AccountCreateDto requestDto){
        return accountService.createAccount(requestDto);
    }
}
