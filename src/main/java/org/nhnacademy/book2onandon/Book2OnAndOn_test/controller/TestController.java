package org.nhnacademy.book2onandon.Book2OnAndOn_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home(){
        return "의존성 테스트";
    }
}

