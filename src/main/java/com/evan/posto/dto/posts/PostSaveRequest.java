package com.evan.posto.dto.posts;

import com.evan.posto.domain.posts.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostSaveRequest {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostSaveRequest(final String title, final String content, final String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Post toEntity() {
        return Post.builder()
                .title(this.title)
                .content(this.content)
                .author(this.author)
                .build();
    }
}
