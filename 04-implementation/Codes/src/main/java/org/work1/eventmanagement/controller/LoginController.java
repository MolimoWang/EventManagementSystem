package org.work1.eventmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showHomePage() {
        return "index"; // 返回首页
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // 返回登录页面
    }
}
