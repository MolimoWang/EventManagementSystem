package org.work1.eventmanagement.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import java.io.IOException;
import java.util.Collection;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        // 获取用户的权限信息
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        // 根据用户的权限跳转到对应的页面
        if (authorities.stream().anyMatch(a -> a.getAuthority().equals("ADMIN"))) {
            response.sendRedirect("/admin/dashboard");
        } else if (authorities.stream().anyMatch(a -> a.getAuthority().equals("ORGANIZER"))) {
            response.sendRedirect("/organizer/dashboard");
        } else if (authorities.stream().anyMatch(a -> a.getAuthority().equals("CUSTOMER"))) {
            response.sendRedirect("/user/dashboard");
        } else {
            response.sendRedirect("/login?error=true");
        }
    }

}
