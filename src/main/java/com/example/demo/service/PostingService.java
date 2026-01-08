package com.example.demo.service;

import com.example.demo.domain.Posting;
import com.example.demo.dto.PostingDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface PostingService {

    public PostingDto.CreateResDto create(PostingDto.CreateReqDto param);
    public void update(PostingDto.UpdateReqDto param);
    public void delete(PostingDto.CreateReqDto param);
    public PostingDto.DetailResDto detail(PostingDto.DetailReqDto param);
    public List<PostingDto.DetailReqDto> list();
}

