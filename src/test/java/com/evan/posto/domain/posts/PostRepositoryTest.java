package com.evan.posto.domain.posts;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @AfterEach
    public void cleanUP() {
        postRepository.deleteAll();
    }

    @Test
    void findAll() {
        // given
        postRepository.save(Post.builder()
                .title("테스트 게시글")
                .content("테스트 본문")
                .author("jnunseok@gmail.com")
                .build());

        // when
        List<Post> posts = postRepository.findAll();

        // then
        Post post = posts.get(0);
        assertThat(post.getTitle()).isEqualTo("테스트 게시글");
        assertThat(post.getContent()).isEqualTo("테스트 본문");
    }
}