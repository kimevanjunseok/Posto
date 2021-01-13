package com.evan.posto.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evan.posto.domain.posts.PostRepository;
import com.evan.posto.dto.posts.PostSaveRequest;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostService {

    private PostRepository postRepository;

    @Transactional
    public Long save(final PostSaveRequest postSaveRequest) {
        return postRepository.save(postSaveRequest.toEntity()).getId();
    }
}
