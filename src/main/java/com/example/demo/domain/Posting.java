package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity // 디비의 테이블과 똑같음
public class Posting {
    // 자바에서 선언하는 테이블은 무조건 아이디라는 애가 있어야 함

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // pk 로 사용할 부분 : 주민등록번호 같은 unique 하며 없어서는 안 됨
    String title;
    String content;
    Date createdAt;
    String author;
}

