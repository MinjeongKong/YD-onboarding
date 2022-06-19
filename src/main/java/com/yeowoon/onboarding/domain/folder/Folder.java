package com.yeowoon.onboarding.domain.folder;

import com.yeowoon.onboarding.domain.account.Account;
import com.yeowoon.onboarding.domain.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="FOLDER_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @OneToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    @OneToMany(mappedBy = "folder")
    private List<Post> posts = new ArrayList<>();

    public Folder(String title) {
        this.title = title;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
