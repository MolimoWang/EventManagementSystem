package org.work1.eventmanagement.config;
/**
 * Package: org.work1.eventmanagement.config
 *
 * Security Configuration for the Event Management Application.
 *
 * <p>This class is annotated with {@link Configuration} and defines the security
 * settings for the application. It configures authentication, authorization,
 * password encoding, login, logout, session management, and exception handling.
 *
 * Responsibilities:
 * - Define the security filter chain for handling HTTP security.
 * - Configure login and logout behavior, including custom success and failure handlers.
 * - Set up role-based access control for different routes (ADMIN, ORGANIZER, CUSTOMER).
 * - Integrate a custom authentication provider for validating credentials.
 * - Configure a password encoder for secure password storage and validation.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
public class SecurityConfig {
    /**
     * Configures the security filter chain for the application.
     *
     * @param http The {@link HttpSecurity} object for configuring web security.
     * @return A {@link SecurityFilterChain} object representing the configured filter chain.
     * @throws Exception If a configuration error occurs.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/", "/login", "/register", "/static/css/**", "/js/**", "/images/**").permitAll()
                        .requestMatchers("/process-login").permitAll()
                        .requestMatchers("/admin/**").hasAuthority("ADMIN")
                        .requestMatchers("/organizer/**").hasAuthority("ORGANIZER")
                        .requestMatchers("/customer/**").hasAuthority("CUSTOMER")
                        .requestMatchers("/register", "/process-login").permitAll()

                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/process-login")
                        .usernameParameter("username")
                        .passwordParameter("password")
                        .successHandler(customSuccessHandler())
                        .failureHandler(customFailureHandler())
                        .permitAll()
                )
                .sessionManagement(session -> session
                        .maximumSessions(100)
                        .maxSessionsPreventsLogin(false)
                )
                .logout(logout -> logout.permitAll())
                .exceptionHandling(exception -> exception.accessDeniedPage("/403"));

        return http.build();
    }
    @Bean
    public AuthenticationManager authManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, CustomAuthenticationProvider customAuthProvider)
            throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .authenticationProvider(customAuthProvider)
                .build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationSuccessHandler customSuccessHandler() {
        return new CustomAuthenticationSuccessHandler();
    }

    @Bean
    public AuthenticationFailureHandler customFailureHandler() {
        return new CustomAuthenticationFailureHandler();
    }
}

