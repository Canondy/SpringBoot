package com.lzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * @author 刘欢
 * @since JDK 1.8
 * ClassName: ThymeleafController
 * date: 2020/9/26 22:08
 * Description:
 * 1.thymeleaf必须经过控制器controller访问， static可以不经过控制器
 */
@Controller
public class ThymeleafController {
    @GetMapping("/thymeleaf")
    public String thymeleaf(Model model, HttpSession session){
        model.addAttribute("username","张三");
        model.addAttribute("age","20");
        model.addAttribute("sex","女");
        session.setAttribute("userCount","10");
        ServletContext context = session.getServletContext();
        context.setAttribute("context","测试ServletContext作用域");
        return "thymeleaf";
    }
}
