package com.yeowoon.onboarding.domain.account;

import com.yeowoon.onboarding.domain.folder.Folder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ACCOUNT_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToOne(mappedBy = "account")
    private Folder folder;
}
