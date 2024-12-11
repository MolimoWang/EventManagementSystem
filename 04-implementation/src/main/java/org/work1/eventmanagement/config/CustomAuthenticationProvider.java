package org.work1.eventmanagement.config;
/**
 * Package: org.work1.eventmanagement.config
 *
 * Custom Authentication Provider for Spring Security.
 *
 * <p>This class provides a custom implementation of the {@link AuthenticationProvider}
 * interface to authenticate users of different roles (Admin, Organizer, Customer)
 * based on their username and password. It checks their credentials against the database
 * and assigns appropriate roles upon successful authentication.
 *
 * Responsibilities:
 * - Authenticate users by verifying their credentials.
 * - Fetch user details from the appropriate repository (Admin, Organizer, Customer).
 * - Assign roles based on the type of user (ADMIN, ORGANIZER, CUSTOMER).
 *
 * Dependencies:
 * - Repositories: AdminRepository, OrganizerRepository, CustomerRepository.
 * - Password Encoder: BCryptPasswordEncoder.
 *
 * This implementation throws a {@link BadCredentialsException} if authentication fails.
 */
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

    /**
     * Authenticates a user by verifying username and password against the database.
     *
     * @param authentication The authentication request object containing credentials.
     * @return An authenticated {@link UsernamePasswordAuthenticationToken} with the user's role.
     * @throws AuthenticationException If authentication fails.
     */
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


    /**
     * Determines if this provider supports the specified authentication type.
     *
     * @param authentication The authentication type.
     * @return True if the authentication type is {@link UsernamePasswordAuthenticationToken}.
     */
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
