package com.example.demo.service.impl;

import com.example.demo.domain.Posting;
import com.example.demo.repository.PostingRepository;
import com.example.demo.service.PostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
// 서비스와 서비스는 이동 가능 (단방향)
@Service
public class PostingServiceImpl implements PostingService { // 구체화 필수

    final PostingRepository postingRepository;

//    Map<Integer, Map<String, Object>> postings = new HashMap<>();
    int sequence = 1;

    @Override
    public Map<String, Object> create(Map<String, Object> map) {

        Posting posting = new Posting();
//        Long id = Long.parseLong(map.get("id").toString());


        String title = map.get("title") + "";
        String content = map.get("content") + "";

        Map<String, Object> result = new HashMap<>();
        result.put("resultCode", 200);
//        result.put("id", id);
        result.put("id", posting.getId());

        return result;
    }

    @Override
    public Map<String, Object> detail(Long id) {

    }

    @Override
    public Map<String, Object> update(Map<String, Object> params) {
        Integer id = Integer.parseInt(params.get("id") + "");
        Map<String, Object> posting = postings.get(id);
        if(posting != null) {
            if(params.get("title") != null) {
                posting.put("title", params.get("title"));
            }
            if(params.get("content") != null) {
                posting.put("content", params.get("content"));
            }
        }

        Map<String, Object> map_result = new HashMap<>();
        map_result.put("status", 200);
        return map_result;
    }

    @Override
    public Map<String, Object> delete(Integer id) {
        postings.remove(id);

        Map<String, Object> map_result = new HashMap<>();
        map_result.put("status", 200);
        return map_result;
    }

    @Override
    public Map<String, Object> list() {


        List<Posting> list = new postingRepository.findAll();



        return map_result;
    }
}

