package com.yeowoon.onboarding.web.dto.post;

import com.yeowoon.onboarding.domain.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostResponseDto {

    private Long postId;

    public PostResponseDto(Post entity) {
        this.postId = entity.getId();
    }
}
