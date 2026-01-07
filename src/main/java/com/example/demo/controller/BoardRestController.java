package com.example.demo.controller;

import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RequestMapping("/api/board")
@RestController
public class BoardRestController {


    final BoardService boardService;
//
//    public BoardRestController(BoardService boardService) {
//        this.boardService = boardService;
//    }
//

//    // 임시로 저장할 게시판 정보
//    List<Map<String, Object>> list = new ArrayList<>();
//    int sequence = 0;

    @RequestMapping("/create")
    public Map<String, Object> create(@RequestParam Map<String, Object> params) {

//        String title =  (String) params.get("title");
//        String content =  (String) params.get("content");
//        String author =  (String) params.get("author");
//
////        System.out.println("title: " + title);
//
//        // id 값
//
//        params.put("id", ++sequence);
//        // 시간
//        LocalDateTime now = LocalDateTime.now();
//        params.put("createdAT",  now.toString());
//        // params.put("cratedAT",  now + "");
//
//
//
//        list.add(params);
//        System.out.println("list : " + list.toString());
//
//        Map<String, Object> map_result = new HashMap<>();
//        map_result.put("resultCode", 200);
//
//        return map_result;
        return boardService.create(params);
    }

    @GetMapping("/update")
    public void update(@RequestParam Map<String, Object> params){
//    public Map<String, Object> update(@RequestParam Map<String, Object> params){

//        String id = params.get("id") + "";
//
//        Map<String, Object> map_board = null;
//        for(Map<String, Object> each : list){
//            String tempId = each.get("id") + "";
//            if(tempId.equals(id)){
//                map_board = each;
//            }
//        }
//        if(map_board != null){
//            String title = (String) params.get("title");
//            if(title != null){
//                map_board.put("title", title);
//            }
//            String content = (String) params.get("content");
//            if(content != null){
//                map_board.put("content", content);
//            }
//        }
//
//        Map<String, Object> map_result = new HashMap<>();
//        map_result.put("result_code", 200);
//
//        return map_result;
        boardService.update(params);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam int id){
        boardService.delete(id);
    }

    @GetMapping("/detail/{id}")
    public Map<String, Object> detail(@PathVariable int id){
//
//        //String id = params.get("id") + "";
//        System.out.println("id : " + id);
//
//        Map<String, Object> map_board = null;
//        for(Map<String, Object> each : list){
//            String tempId = each.get("id") + "";
//            if(tempId.equals(id)){
//                map_board = each;
//            }
//        }
//
//        Map<String, Object> map_result = new HashMap<>();
//        map_result.put("result_code", 200);
//        map_result.put("data", map_board);
//
//        return list;
        return boardService.detail(id);
    }



//    @RequestMapping("/list")
//    public list<Map<String, Object>> list(@RequestParam Map<String, Object> params) {
//        return map_result;
//    }


    @GetMapping("/list")
    public Map<String, Object> list(@RequestParam Map<String, Object> params){

//        Map<String, Object> map_result = new HashMap<>();
//        map_result.put("result_code", 200);
//        map_result.put("data", list);
//
//        return map_result;
        return boardService.list();
    }
}
