package com.example.demo.controller;

import com.example.demo.service.PostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RequiredArgsConstructor
@RequestMapping("/api/posting")
@RestController
public class PostingRestController {

//    @Autowired
//    private PostingService postingService;
    final PostingService postingService; // @RequiredARgsConstructor

    @GetMapping("/create")
    public Map<String, Object> create(@RequestParam Map<String, Object> map) {
        return postingService.create(map);
    }

    @GetMapping("/detail")
    public Map<String, Object> detail(@RequestParam Long id) {
        return postingService.detail(id);
    }

    @GetMapping("/update")
    public Map<String, Object> update(@RequestParam Map<String, Object> map) {
        return postingService.update(map);
    }

    @GetMapping("/delete")
    public Map<String, Object> delete(@RequestParam Integer id) {
        return postingService.delete(id);
    }

    @GetMapping("/list")
    public Map<String, Object> list() {
        return postingService.list();
    }
}