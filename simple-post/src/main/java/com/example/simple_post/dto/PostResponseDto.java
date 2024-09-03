package com.example.simple_post.dto;

import com.example.simple_post.domain.Post;
import lombok.Getter;

@Getter
public class PostResponseDto {
    private String title;
    private String content;


    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContents();
    }
}
