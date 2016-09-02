package com.wuxingliang.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wu on 2016/9/2.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String home(Model model) {
        return "home";
    }
}
