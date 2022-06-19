package com.yeowoon.onboarding.web.dto.account;

import com.yeowoon.onboarding.domain.account.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AccountResponseDto {

    private Long accountId;

    public AccountResponseDto(Account entity) {
        this.accountId = entity.getId();
    }
}
