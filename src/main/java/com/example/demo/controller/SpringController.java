package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SpringController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){

        // 변수 선언
        int int_a0 = 0; // 정수 class integer 와 똑같음
        double double_a0 = 0.0; // 실수
        String str_a0 = ""; // 문자열 (char 도 스트링으로 저장) 기본 자료형이 아니라 클래스여서 null 이 기본값
        boolean bool_a0 = false; // 논리형 // 클래스는 앞에가 대문자임

        // 배열

        int[] arr_a0 = new int[10];
        int[] arr_a1 = {0,1,2,3,4,5,6,7,8,9};
        // 반복문

        int sum_a0 = 0;
        for(int i = 0; i < arr_a0.length; i++) {
            int each = arr_a0[i];
            sum_a0 += arr_a0[i];
        }

        for(int each : arr_a1){
            sum_a0 += each;
        }

        System.out.println("sum_a0 = " + sum_a0);

        // 조건문
        if(sum_a0 == 0) {

        } else if (sum_a0 > 0){

        } else {

        }

        // 자료구조
        Map<String, Object> a_map = new HashMap<>();
        a_map.put("a", sum_a0);
        Object aaa = a_map.get("a");

        a_map.remove("a");
        // map 에 없는 애는 null 값 뱉어냄
//        System.out.println("")

        int aaa1 = (int) a_map.get("a");
        int aaa2 = Integer.parseInt(aaa + "");

        // List
        List<String> aaaList = new ArrayList<>();
        aaaList.add("122333");
        aaaList.add("122333");
        aaaList.add("122333");
        for(int i = 0; i < aaaList.size(); i++) {
//            String each = aaaList[i];
        }


        return "Hello World";
    }


    // assignment1 이라는 메서드를 만들고, url 은 /assignment 로 지정
    // 구구단을 1단부터 9단까지 출력하고, 리턴값은 '완료' 라는 한글 담기
}
