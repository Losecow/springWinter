package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class PostingDto {

    @Getter @Setter
    public static class CreateReqDto {
        String title;
        String content;
        String author;
    }
    @Getter @Setter
    public static class CreateResDto {
        Long id;
    }

    @Getter @Setter
    public static class UpdateReqDto {

    }
    @Getter @Setter
    public static class DetailReqDto {
        Long id;

    }
    @Getter @Setter
    public static class DetailResDto {
        Long id;
        String title;
        String content;
        String author;

        LocalDateTime createdAt;
        LocalDateTime modifiedAt;
    }
}
