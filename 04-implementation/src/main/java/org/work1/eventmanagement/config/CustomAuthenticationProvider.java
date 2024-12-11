package org.work1.eventmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.work1.eventmanagement.entity.Admin;
import org.work1.eventmanagement.entity.Customer;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.repository.AdminRepository;
import org.work1.eventmanagement.repository.CustomerRepository;
import org.work1.eventmanagement.repository.OrganizerRepository;

import java.util.Collections;
import java.util.List;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();


        System.out.println("Authenticating username: " + username);
        System.out.println("Password: " + password);

        Admin admin = adminRepository.findByUsername(username);
        System.out.println("Admin fetched: " + admin);
        if (admin != null) {
            System.out.println("Admin fetched: " + admin);
            System.out.println("Database password: " + admin.getPassword());
            System.out.println("Input password matches: " + passwordEncoder.matches(password, admin.getPassword()));
            if (passwordEncoder.matches(password, admin.getPassword())) {
                System.out.println("Authentication object: " + new UsernamePasswordAuthenticationToken(username, password, List.of(new SimpleGrantedAuthority("ADMIN"))));
                System.out.println("Returning Authentication: " + admin);
                return new UsernamePasswordAuthenticationToken(
                        admin.getUsername(),
                        password,
                        List.of(new SimpleGrantedAuthority("ADMIN"))
                );
            }
        }


        Organizer organizer = organizerRepository.findByUsername(username);
        System.out.println("Organizer fetched: " + organizer);
        if (organizer != null) {
            System.out.println("Database password: " + organizer.getPassword());
            System.out.println("Password matches: " + passwordEncoder.matches(password, organizer.getPassword()));
            if (passwordEncoder.matches(password, organizer.getPassword())) {
                System.out.println("Organizer authenticated successfully!");
                return new UsernamePasswordAuthenticationToken(
                        organizer,
                        password,
                        List.of(new SimpleGrantedAuthority("ORGANIZER"))
                );
            }
        }


        Customer customer = customerRepository.findByUsername(username);
        System.out.println("Customer fetched: " + customer);
        if (customer != null) {
            System.out.println("Database password: " + customer.getPassword());
            System.out.println("Password matches: " + passwordEncoder.matches(password, customer.getPassword()));
            if (passwordEncoder.matches(password, customer.getPassword())) {
                System.out.println("Customer authenticated successfully!");
                return new UsernamePasswordAuthenticationToken(
                        customer.getUsername(),
                        password,
                        List.of(new SimpleGrantedAuthority("CUSTOMER"))
                );
            }
        }


        System.out.println("Authentication failed for username: " + username);
        throw new BadCredentialsException("Invalid username or password");
    }



    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
