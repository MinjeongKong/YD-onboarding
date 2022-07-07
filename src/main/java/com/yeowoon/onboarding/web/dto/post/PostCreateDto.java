package com.yeowoon.onboarding.web.dto.post;

import com.yeowoon.onboarding.domain.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostCreateDto {

    private String title;

    public Post toEntity(){
        return new Post(this.title);
    }
}
