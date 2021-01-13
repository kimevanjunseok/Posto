package com.evan.posto.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evan.posto.dto.posts.PostSaveRequest;
import com.evan.posto.service.PostService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostService postService;

    @GetMapping("hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void save(@RequestBody final PostSaveRequest postSaveRequest) {
        postService.save(postSaveRequest);
    }
}
