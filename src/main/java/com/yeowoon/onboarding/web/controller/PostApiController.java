package com.yeowoon.onboarding.web.controller;


import com.yeowoon.onboarding.service.PostService;
import com.yeowoon.onboarding.web.dto.ResponseDto;
import com.yeowoon.onboarding.web.dto.post.PostCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostService postService;

    @PostMapping("/{accountId}/{folderId}/post")
    public ResponseDto createFolder(@PathVariable Long accountId, @PathVariable Long folderId, @RequestBody PostCreateDto requestDto){
        return postService.createPost(accountId, folderId, requestDto);
    }

}
