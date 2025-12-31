package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // → JSON 반환
@RequestMapping("/hw2")
public class DetectWordRestController {
    @RequestMapping("/concat")
    public Map<String, Object> concat(@RequestParam Map<String, Object> params) {
        Map<String, Object> map = new HashMap<>();

        String a = (String) params.get("a");
        String b = (String) params.get("b");

        map.put("result", a + b);

        return map;
    }

}
