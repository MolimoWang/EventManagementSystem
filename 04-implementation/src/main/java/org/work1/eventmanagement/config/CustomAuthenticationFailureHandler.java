package org.work1.eventmanagement.config;
/**
 * Package: org.work1.eventmanagement.config
 *
 * This class defines a custom authentication failure handler for handling login failures
 * in a Spring Security-based application.
 *
 * <p>Responsibilities:
 * - Sets an error message when authentication fails.
 * - Redirects the user back to the login page with an error indicator.
 */

package org.work1.eventmanagement.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import java.io.IOException;

public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        // Set the error message for authentication failure
        request.setAttribute("loginError", "Invalid username or password, please try again!");
        // Redirect to the login page and append the error message
        response.sendRedirect("/login?error=true");
    }
}
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import java.io.IOException;

public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        // Set the error message for authentication failure
        request.setAttribute("loginError", "Invalid username or password, please try again!");
        // Redirect to the login page and append the error message
        response.sendRedirect("/login?error=true");
    }
}
