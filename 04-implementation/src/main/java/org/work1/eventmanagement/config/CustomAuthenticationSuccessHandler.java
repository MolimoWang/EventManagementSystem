package org.work1.eventmanagement.config;
/**
 * Package: org.work1.eventmanagement.config
 *
 * Custom Authentication Success Handler for Spring Security.
 *
 * <p>This class implements {@link AuthenticationSuccessHandler} to handle successful
 * authentication events. Based on the user's role (ADMIN, ORGANIZER, CUSTOMER),
 * it sets session attributes and redirects the user to an appropriate dashboard.
 *
 * Responsibilities:
 * - Extract user roles from the {@link Authentication} object.
 * - Set session attributes for the authenticated user (username and role).
 * - Redirect the user to the appropriate page based on their role.
 *
 * Redirect Logic:
 * - ADMIN: Redirects to `/dashboard?role=1`.
 * - ORGANIZER: Redirects to `/dashboard?role=2`.
 * - CUSTOMER: Redirects to `/dashboard?role=3`.
 * - If no role matches, redirects to the login page with an error.
 */
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
    /**
     * Handles successful authentication events.
     *
     * @param request        The HTTP request.
     * @param response       The HTTP response.
     * @param authentication The authentication object containing the user's details.
     * @throws IOException      If an input or output exception occurs.
     * @throws ServletException If a servlet exception occurs.
     */
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
