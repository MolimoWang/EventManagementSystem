package org.work1.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.work1.eventmanagement.entity.Role;
import org.work1.eventmanagement.entity.User;
import org.work1.eventmanagement.repository.RoleRepository;
import org.work1.eventmanagement.repository.UserRepository;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // 返回注册页面
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, @RequestParam("role") String roleName, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        // 添加打印信息，确认方法被调用
        System.out.println("进入注册控制器: /register 请求被处理");

        if (result.hasErrors()) {
            System.out.println("注册表单中存在错误: " + result.getAllErrors());
            return "register"; // 如果有错误，返回注册页面
        }

        // 检查用户名是否存在
        if (userRepository.findByUsername(user.getUsername()) != null) {
            System.out.println("用户名已存在: " + user.getUsername());
            model.addAttribute("error", "用户名已存在！");
            return "register";
        }

        // 检查邮箱是否存在（如果需要）
         if (userRepository.findByEmail(user.getEmail()) != null) {
             System.out.println("邮箱已被注册: " + user.getEmail());
             model.addAttribute("error", "邮箱已被注册！");
             return "register";
         }

        // 加密密码并保存用户
        System.out.println("加密用户密码: " + user.getPassword());
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

        // 根据用户在表单中选择的角色名进行分配
        Role role = roleRepository.findByName("ROLE_" + roleName.toUpperCase());
        if (role == null) {
            // 如果角色不存在，手动创建并保存到数据库中
            role = new Role();
            role.setName("ROLE_" + roleName.toUpperCase());
            roleRepository.save(role);
            System.out.println("创建新的角色: ROLE_" + roleName.toUpperCase());
        } else {
            System.out.println("角色存在：ROLE_" + roleName.toUpperCase());
        }

        user.getRoles().add(role); // 为新用户分配角色
        System.out.println("为用户分配角色: ROLE_" + roleName.toUpperCase());

        // 保存用户到数据库
        System.out.println("保存用户到数据库: " + user.getUsername());
        userRepository.save(user);

        // 注册成功后，添加成功消息，并重定向到登录页面
        System.out.println("用户注册成功，重定向到登录页面");
        redirectAttributes.addFlashAttribute("message", "Register successfully, please login!");
        return "redirect:/login";
    }

}
