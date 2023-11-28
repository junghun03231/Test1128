package com.example.demo2.article;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleForm {

    @NotEmpty(message = "제목을 입력하세요")
    private String subject;

    @NotEmpty(message = "제목을 입력하세요")
    private String content;
}