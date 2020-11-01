package com.lzc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘欢
 * @since JDK 1.8
 * ClassName: Test
 * date: 2020/9/26 20:53
 * Description:
 */
//@RestController
public class Test {
    @GetMapping("/hello")
    public String hello(){
        return "hello springboot!";
    }
}
