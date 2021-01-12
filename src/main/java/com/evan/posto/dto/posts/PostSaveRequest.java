package com.evan.posto.dto.posts;

import com.evan.posto.domain.posts.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostSaveRequest {

    private String title;
    private String content;
    private String author;

    public Post toEntity() {
        return Post.builder()
                .title(this.title)
                .content(this.content)
                .author(this.author)
                .build();
    }
}
