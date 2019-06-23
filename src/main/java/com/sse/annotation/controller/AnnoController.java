package com.sse.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnnoController {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "welcome, this is spring-annotation!";
    }
}
