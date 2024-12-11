package org.work1.eventmanagement.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.util.Collection;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        HttpSession session = request.getSession();
        session.setAttribute("username",authentication.getPrincipal());


        if (authorities.stream().anyMatch(a -> a.getAuthority().equals("ADMIN"))) {
            session.setAttribute("role","ADMIN");
            response.sendRedirect("/dashboard?role=1");
        } else if (authorities.stream().anyMatch(a -> a.getAuthority().equals("ORGANIZER"))) {
            session.setAttribute("role","ORGANIZER");
            response.sendRedirect("/dashboard?role=2");
        } else if (authorities.stream().anyMatch(a -> a.getAuthority().equals("CUSTOMER"))) {
            session.setAttribute("role","CUSTOMER");
            response.sendRedirect("/dashboard?role=3");
        } else {
            response.sendRedirect("/login?error=true");
        }
    }

}
