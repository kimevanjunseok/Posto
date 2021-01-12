package com.evan.posto.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evan.posto.domain.posts.PostRepository;
import com.evan.posto.dto.posts.PostSaveRequest;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostRepository postRepository;

    @GetMapping("hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void save(@RequestBody PostSaveRequest postSaveRequest) {
        postRepository.save(postSaveRequest.toEntity());
    }
}
