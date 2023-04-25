package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //기본이 되는 첫 페이지
    @GetMapping
    public String index() {
        return "index";
    }
}
