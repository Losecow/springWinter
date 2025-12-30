package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("") // 이 클래스 내의 모든 메서드 앞에 공통으로 해당
@Controller
public class DefaultController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/multiple")
    public String muitiple(int a, int b, Model model) {
//        System.out.println("a : "+ a);
//        System.out.println("b : "+ b);
//
//        int result = a * b;
//        model.addAttribute("result", result);
        return "multiple";
    }

    @RequestMapping("/board")
    public String board(@RequestParam String a, String b, Model model) {

        // 꼭 받아야 하는 파라미터 @RequestParam

        model.addAttribute("result", 112233);
        return "board";
    }

}
