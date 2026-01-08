package com.example.demo.controller;

import com.example.demo.dto.PostingDto;
import com.example.demo.service.PostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RequiredArgsConstructor
@RequestMapping("/api/posting")
@RestController
public class PostingRestController {

//    @Autowired
//    private PostingService postingService;
    final PostingService postingService; // @RequiredARgsConstructor

//    @GetMapping("/create")
//    @PostMapping("")
//    public Map<String, Object> create(@RequestParam Map<String, Object> map) {
//        return postingService.create(map);
//    }

    @PostMapping("")
    public PostingDto.CreateResDto create(PostingDto.CreateReqDto param) {
        return postingService.create(param);
    }

//    @GetMapping("/update")
    @PutMapping("")
    public void update(@RequestParam PostingDto.UpdateReqDto param) {

        return postingService.update(param);
    }

//    @GetMapping("/delete")
    @DeleteMapping("")
    public void delete(@RequestParam PostingDto.UpdateReqDto param) {
        return postingService.delete(param);
    }
    @GetMapping("")
    public Map<String, Object> detail(@RequestParam PostingDto.DetailReqDto param) {

        return postingService.detail(param);
    }

    @GetMapping("/list")
    public Map<String, Object> list() {
        return postingService.list();
    }
}