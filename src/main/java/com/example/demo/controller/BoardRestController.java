package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/board")
@RestController
public class BoardRestController {


    // 임시로 저장할 게시판 정보
    List<Map<String, Object>> list = new ArrayList<>();
    int sequence = 0;

    @RequestMapping("/create")
    public Map<String, Object> create(@RequestParam Map<String, Object> params) {

        String title =  (String) params.get("title");
        String content =  (String) params.get("content");
        String author =  (String) params.get("author");

//        System.out.println("title: " + title);

        // id 값

        params.put("id", ++sequence);
        LocalDateTime now = LocalDateTime.now();
        params.put("cratedAT",  now.toString());

        list.add(params);
        System.out.println("list : " + list.toString());

        Map<String, Object> map_result = new HashMap<>();
        map_result.put("resultCode", 200);

        return map_result;
    }
}
