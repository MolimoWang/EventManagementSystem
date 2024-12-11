package org.work1.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.work1.eventmanagement.entity.Admin;
import org.work1.eventmanagement.entity.Customer;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.repository.AdminRepository;
import org.work1.eventmanagement.repository.CustomerRepository;
import org.work1.eventmanagement.repository.OrganizerRepository;
import org.work1.eventmanagement.dto.AccountDTO;

import java.util.List;
import java.util.Optional;
@Service
public class AccountService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Autowired
    private AdminRepository administratorRepository;
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();  // Use BCryptPasswordEncoder directly

    public boolean isUsernameTaken(String username) {

        boolean customerExists = customerRepository.existsByUsername(username);

        boolean organizerExists = organizerRepository.existsByUsername(username);

        boolean adminExists = administratorRepository.existsByUsername(username);

        return customerExists || organizerExists || adminExists;
    }

    public Customer createCustomer(String name, String email, String password) {
        Customer customer = new Customer();
        customer.setUsername(name);
        customer.setEmail(email);
        customer.setPassword(passwordEncoder.encode(password));  // Encrypt the password
        return customerRepository.save(customer);
    }

    public Organizer createOrganizer(String name, String email, String password, String phoneNumber, String address, String companyName) {
        Organizer organizer = new Organizer();
        organizer.setUsername(name);
        organizer.setEmail(email);
        organizer.setPassword(passwordEncoder.encode(password));  // Encrypt the password
        organizer.setPhoneNumber(phoneNumber);
        organizer.setAddress(address);
        organizer.setCompanyName(companyName);
        return organizerRepository.save(organizer);
    }
    public Admin createAdministrator(String name, String email, String password) {
        Admin admin = new Admin();
        admin.setUsername(name);
        admin.setEmail(email);
        admin.setPassword(passwordEncoder.encode(password));  // Encrypt the password
        return administratorRepository.save(admin);
    }

    public AccountDTO getAccountByIdAndRole(Long id, String role) {
        return switch (role.toLowerCase()) {
            case "admin" -> convertToAccountDTO(getAdminById(id));
            case "customer" -> convertToAccountDTO(getCustomerById(id));
            case "organizer" -> convertToAccountDTO(getOrganizerById(id));
            default -> throw new IllegalArgumentException("Invalid role: " + role);
        };
    }
    public AccountDTO getAccountByUsernameAndRole(String username, String role) {
        return switch (role.toLowerCase()) {
            case "admin" -> convertToAccountDTO(getAdminByUsername(username));
            case "customer" -> convertToAccountDTO(getCustomerByUsername(username));
            case "organizer" -> convertToAccountDTO(getOrganizerByUsername(username));
            default -> throw new IllegalArgumentException("Invalid role: " + role);
        };
    }


    private Admin getAdminByUsername(String username) {
        return administratorRepository.findByUsername(username);
    }

    private Customer getCustomerByUsername(String username) {
        return customerRepository.findByUsername(username);
    }


    private Organizer getOrganizerByUsername(String username) {
        return organizerRepository.findByUsername(username);
    }
    public Long getIdByUsernameAndRole(String username, String role) {
        switch (role.toLowerCase()) {
            case "admin":
                Admin admin = getAdminByUsername(username);
                return admin != null ? admin.getId() : null;
            case "customer":
                Customer customer = getCustomerByUsername(username);
                return customer != null ? customer.getId() : null;
            case "organizer":
                Organizer organizer = getOrganizerByUsername(username);
                return organizer != null ? organizer.getId() : null;
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }


    // Convert Admin to AccountDTO
    private AccountDTO convertToAccountDTO(Admin admin) {
        if (admin == null) {
            return null;
        }
        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setUsername(admin.getUsername());
        accountDTO.setEmail(admin.getEmail());
        accountDTO.setPassword(admin.getPassword());
        // Add other necessary fields if needed
        return accountDTO;
    }

    // Convert Customer to AccountDTO
    private AccountDTO convertToAccountDTO(Customer customer) {
        if (customer == null) {
            return null;
        }
        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setUsername(customer.getUsername());
        accountDTO.setEmail(customer.getEmail());
        accountDTO.setPassword(customer.getPassword());
        // Add other necessary fields if needed
        return accountDTO;
    }

    // Convert Organizer to AccountDTO
    private AccountDTO convertToAccountDTO(Organizer organizer) {
        if (organizer == null) {
            return null;
        }
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setUsername(organizer.getUsername());
        accountDTO.setEmail(organizer.getEmail());
        accountDTO.setPassword(organizer.getPassword());
        accountDTO.setPhoneNumber(organizer.getPhoneNumber());
        accountDTO.setAddress(organizer.getAddress());
        accountDTO.setCompanyName(organizer.getCompanyName());
        // Add other necessary fields if needed
        return accountDTO;
    }
    public String getUsernameByIdAndRole(Long id, String role) {
        if ("admin".equalsIgnoreCase(role)) {
            Admin admin = getAdminById(id);
            return admin != null ? admin.getUsername() : null;
        } else if ("customer".equalsIgnoreCase(role)) {
            Customer customer = getCustomerById(id);
            return customer != null ? customer.getUsername() : null;
        } else if ("organizer".equalsIgnoreCase(role)) {
            Organizer organizer = getOrganizerById(id);
            return organizer != null ? organizer.getUsername() : null;
        }
        return null;
    }

    // Get An Account
    public Admin getAdminById(Long id) {
        return administratorRepository.findById(id).orElse(null);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    // Get Account lists
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public List<Organizer> getAllOrganizers() {
        return organizerRepository.findAll();
    }


    public List<Admin> getAllAdmins() {
        return administratorRepository.findAll();
    }


    // Delete one account
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }


    public void deleteOrganizer(Long id) {
        organizerRepository.deleteById(id);
    }


    public void deleteAdmin(Long id) {
        administratorRepository.deleteById(id);
    }

    // Update one account and return it back
    public Admin updateAdmin(Long id, AccountDTO accountDTO) {
        Optional<Admin> adminOptional = administratorRepository.findById(id);
        if (adminOptional.isPresent()) {
            Admin admin = adminOptional.get();
            admin.setUsername(accountDTO.getUsername());
            admin.setEmail(accountDTO.getEmail());
            if (accountDTO.getPassword() != null && !accountDTO.getPassword().isEmpty()) {
                BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                String encodedPassword = encoder.encode(accountDTO.getPassword()); // 对密码加密
                admin.setPassword(encodedPassword);
            }
            return administratorRepository.save(admin);
        } else {
            throw new RuntimeException("Admin not found with id: " + id);
        }
    }

    public Customer updateCustomer(Long id, AccountDTO accountDTO) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            Customer customer = customerOptional.get();
            customer.setUsername(accountDTO.getUsername());
            customer.setEmail(accountDTO.getEmail());
            if (accountDTO.getPassword() != null && !accountDTO.getPassword().isEmpty()) {
                BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                String encodedPassword = encoder.encode(accountDTO.getPassword()); // 对密码加密
                customer.setPassword(encodedPassword);
            }
            return customerRepository.save(customer);
        } else {
            throw new RuntimeException("Customer not found with id: " + id);
        }
    }

    public Organizer updateOrganizer(Long id, AccountDTO accountDTO) {
        Optional<Organizer> organizerOptional = organizerRepository.findById(id);
        if (organizerOptional.isPresent()) {
            Organizer organizer = organizerOptional.get();
            organizer.setUsername(accountDTO.getUsername());
            organizer.setEmail(accountDTO.getEmail());
            if (accountDTO.getPassword() != null && !accountDTO.getPassword().isEmpty()) {
                String encodedPassword = passwordEncoder.encode(accountDTO.getPassword()); // Encrypt password
                organizer.setPassword(encodedPassword);
            }
            if (accountDTO.getPhoneNumber() != null) {
                organizer.setPhoneNumber(accountDTO.getPhoneNumber());
            }
            if (accountDTO.getAddress() != null) {
                organizer.setAddress(accountDTO.getAddress());
            }
            if (accountDTO.getCompanyName() != null) {
                organizer.setCompanyName(accountDTO.getCompanyName());
            }
            return organizerRepository.save(organizer);
        } else {
            throw new RuntimeException("Organizer not found with id: " + id);
        }
    }
}
