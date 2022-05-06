package com.cxy.csdntest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuhl
 * @createDate: 2022/5/6
 * @version: 1.0.0
 */
@RestController
@RequestMapping(value = "/Test")
public class TestController {

    @GetMapping("/hello")
    public String index(){
        return "hello world";
    }
}
