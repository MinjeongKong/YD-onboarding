package com.yeowoon.onboarding.web.dto.account;

import com.yeowoon.onboarding.domain.account.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AccountCreateDto {

    private String name;

    public Account toEntity(){
        return new Account(this.name);
    }
}
