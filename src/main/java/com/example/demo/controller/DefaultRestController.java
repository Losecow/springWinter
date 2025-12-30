package com.example.demo.controller;

import com.example.demo.ParamTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/api")
@RestController // (responsebody + controller)
public class DefaultRestController {

    @RequestMapping("/test")
    public Map<String, Object> test(@RequestParam Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>();
        map.put("test1", params.get("a"));
        map.put("test2", 1122333);

        return map;
    }

    @RequestMapping("/test2")
    public Map<String, Object> test2(ParamTest params) { // 객체값이 정해져있어서 리퀘팜 필요없음₩
        Map<String, Object> map = new HashMap<>();
        map.put("test1", params.getParam1());
        map.put("test2", params.getParam2());

        return map;
    }
}
