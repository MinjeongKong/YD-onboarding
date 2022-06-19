package com.yeowoon.onboarding.service;

import com.yeowoon.onboarding.domain.account.AccountRepository;
import com.yeowoon.onboarding.domain.folder.Folder;
import com.yeowoon.onboarding.domain.folder.FolderRepository;
import com.yeowoon.onboarding.domain.post.Post;
import com.yeowoon.onboarding.domain.post.PostRepository;
import com.yeowoon.onboarding.web.dto.ResponseDto;
import com.yeowoon.onboarding.web.dto.post.PostCreateDto;
import com.yeowoon.onboarding.web.dto.post.PostResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {
    private final FolderRepository folderRepository;
    private final PostRepository postRepository;

    @Transactional
    public ResponseDto createPost(Long accountId, Long folderId, PostCreateDto requestDto) {
        Folder folder = folderRepository.findById(folderId)
                .orElseThrow(() -> new IllegalArgumentException("해당 폴더는 없습니다. id=" + folderId));

        if(!folder.getAccount().getId().equals(accountId)){
            return new ResponseDto("FAIL");
        }else{
            Post post = requestDto.toEntity();
            post.setAccount(folder.getAccount());
            post.setFolder(folder);

            postRepository.save(post);
            PostResponseDto responseDto = new PostResponseDto(post);
            return new ResponseDto("SUCCESS", responseDto);
        }
    }
}
