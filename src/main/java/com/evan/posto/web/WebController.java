package com.evan.posto.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.evan.posto.service.PostService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {

    private PostService postService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postService.findAllDesc());
        return "main";
    }
}
