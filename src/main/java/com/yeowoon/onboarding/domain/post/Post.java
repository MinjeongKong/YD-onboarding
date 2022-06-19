package com.yeowoon.onboarding.domain.post;

import com.yeowoon.onboarding.domain.account.Account;
import com.yeowoon.onboarding.domain.folder.Folder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="POST_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @OneToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "FOLDER_ID")
    private Folder folder;

    public Post(String title) {
        this.title = title;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
