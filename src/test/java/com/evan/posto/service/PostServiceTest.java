package com.evan.posto.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.evan.posto.domain.posts.Post;
import com.evan.posto.domain.posts.PostRepository;
import com.evan.posto.dto.posts.PostSaveRequest;

@SpringBootTest
class PostServiceTest {

    @Autowired
    private PostService postService;

    @Autowired
    private PostRepository postRepository;

    @AfterEach
    public void cleanUp() {
        postRepository.deleteAll();
    }

    @Test
    void save() {
        // given
        PostSaveRequest postSaveRequest = PostSaveRequest.builder()
                .title("테스트 타이틀")
                .content("테스트 본문")
                .author("jnunseok@gmail.com")
                .build();

        // when
        postService.save(postSaveRequest);

        // then
        Post post = postRepository.findAll().get(0);
        assertThat(post.getTitle()).isEqualTo("테스트 타이틀");
        assertThat(post.getContent()).isEqualTo("테스트 본문");
        assertThat(post.getAuthor()).isEqualTo("jnunseok@gmail.com");
    }
}