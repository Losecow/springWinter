package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface PostingService {

    public Map<String, Object> create(Map<String, Object> params);
    public Map<String, Object> detail(Long id);
    public Map<String, Object> update(Map<String, Object> params);
    public Map<String, Object> delete(Integer id);
    public Map<String, Object> list();
}

