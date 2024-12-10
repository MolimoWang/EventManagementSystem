package org.work1.eventmanagement.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole("ADMIN")) {
            return "redirect:/admin/dashboard";
        } else if (request.isUserInRole("ORGANIZER")) {
            return "redirect:/organizer/dashboard";
        } else if (request.isUserInRole("USER")) {
            return "redirect:/user/dashboard";
        }
        return "redirect:/login";
    }
}

