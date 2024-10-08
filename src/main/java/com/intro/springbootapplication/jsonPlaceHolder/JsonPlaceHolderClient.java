package com.intro.springbootapplication.jsonPlaceHolder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jsonplaceholder", url="https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {
    @GetMapping("/posts")
    List<Post> getPosts();

    @GetMapping("/posts/{postId}")
    Post getPost(@PathVariable int postId);
}
