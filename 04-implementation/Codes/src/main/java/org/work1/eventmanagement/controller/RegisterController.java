package org.work1.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.work1.eventmanagement.entity.Admin;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.entity.Customer;
import org.work1.eventmanagement.repository.AdminRepository;
import org.work1.eventmanagement.repository.OrganizerRepository;
import org.work1.eventmanagement.repository.CustomerRepository;

@Controller
public class RegisterController {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Autowired
    private CustomerRepository customerRepository;

    private final BCryptPasswordEncoder passwordEncoder;
    @Autowired
    public RegisterController(AdminRepository adminRepository,
                              OrganizerRepository organizerRepository,
                              CustomerRepository customerRepository,
                              BCryptPasswordEncoder passwordEncoder) {
        this.adminRepository = adminRepository;
        this.organizerRepository = organizerRepository;
        this.customerRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("admin", new Admin());
        model.addAttribute("organizer", new Organizer());
        model.addAttribute("customer", new Customer());
        return "register"; // 返回注册页面
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("email") String email,
                               @RequestParam("password") String password,
                               @RequestParam("role") String role,
                               RedirectAttributes redirectAttributes) {
        if ("admin".equalsIgnoreCase(role)) {
            Admin admin = new Admin(username, email, passwordEncoder.encode(password));
            System.out.println("Encoded password during registration: " + admin.getPassword());
            adminRepository.save(admin);
            redirectAttributes.addFlashAttribute("message", "Admin registered successfully!");
        } else if ("organizer".equalsIgnoreCase(role)) {
            Organizer organizer = new Organizer(username, email, null, passwordEncoder.encode(password));
            organizerRepository.save(organizer);
            redirectAttributes.addFlashAttribute("message", "Organizer registered successfully!");
        } else if ("customer".equalsIgnoreCase(role)) {
            Customer customer = new Customer(username, email, null, passwordEncoder.encode(password));
            customerRepository.save(customer);
            redirectAttributes.addFlashAttribute("message", "Customer registered successfully!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid role selected!");
            return "redirect:/register";
        }
        return "redirect:/login";
    }

}
