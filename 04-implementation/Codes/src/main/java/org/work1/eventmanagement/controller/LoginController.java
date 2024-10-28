package org.work1.eventmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // 配置根路径映射到 index.html
    @GetMapping("/")
    public String showHomePage() {
        return "index";  // 返回 index.html 视图
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";  // 返回登录页面 login.html
    }

//    @GetMapping("/register")
//    public String showRegisterForm() {
//        return "register";  // 返回注册页面 register.html
//    }
}
