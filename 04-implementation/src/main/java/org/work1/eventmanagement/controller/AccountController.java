package org.work1.eventmanagement.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.work1.eventmanagement.entity.Admin;
import org.work1.eventmanagement.entity.Customer;
import org.work1.eventmanagement.entity.Organizer;
import org.work1.eventmanagement.service.AccountService;
import org.work1.eventmanagement.service.VenueService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;

import java.util.List;

@Controller
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    // Create account
    @GetMapping("/createAccount")
    public String createAccountPage() {
        return "createAccount";
    }

    // Edit account
    @GetMapping("/editAccount/{role}/{id}")
    public ModelAndView editAccountPage(@PathVariable String role, @PathVariable Long id, Model model) {
        if (role == null || role.equals("undefined")) {
            throw new IllegalArgumentException("Invalid role: " + role);
        }
        System.out.println("Controller: Turn to page: edit; Role: " + role + ", ID: " + id);
        AccountDTO accountDTO = accountService.getAccountByIdAndRole(id, role);

        if (!role.equals("organizer")) {
            accountDTO.setPhoneNumber(null);
            accountDTO.setAddress(null);
            accountDTO.setCompanyName(null); // Ensure these things are not set for admin or customer
        }

        System.out.println("AccountDTO: " + accountDTO);

        model.addAttribute("account", accountDTO);
        model.addAttribute("role", role);
        model.addAttribute("accountId", id);

        return new ModelAndView("editAccount");
    }

    // Create customer account
    @PostMapping("/customers")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        if (accountService.isUsernameTaken(customer.getUsername())) {
            return ResponseEntity.badRequest().body("Username is already taken.");
        }
        accountService.createCustomer(
                customer.getUsername(),
                customer.getEmail(),
                customer.getPassword()
        );
        return ResponseEntity.ok("Account created successfully!");
    }

    // Create organizer account
    @PostMapping("/organizers")
    public ResponseEntity<String> createOrganizer(@RequestBody Organizer organizer) {
        if (accountService.isUsernameTaken(organizer.getUsername())) {
            return ResponseEntity.badRequest().body("Username is already taken.");
        }
        accountService.createOrganizer(
                organizer.getUsername(),
                organizer.getEmail(),
                organizer.getPassword(),
                organizer.getPhoneNumber(),
                organizer.getAddress(),
                organizer.getCompanyName()
        );
        return ResponseEntity.ok("Account created successfully!");
    }

    // Create admin account
    @PostMapping("/admins")
    public ResponseEntity<String> createAdmin(@RequestBody Admin admin) {
        if (accountService.isUsernameTaken(admin.getUsername())) {
            return ResponseEntity.badRequest().body("Username is already taken.");
        }
        accountService.createAdministrator(
                admin.getUsername(),
                admin.getEmail(),
                admin.getPassword()
        );
        return ResponseEntity.ok("Account created successfully!");
    }

    // View all admin account in account management page
    @GetMapping("/viewAllAdmins")
    public String viewAllAccounts(Model model) {

        model.addAttribute("role", "admin");
        model.addAttribute("admins", accountService.getAllAdmins());
        return "accountManagement";
    }

    // View all account in account management page
    @GetMapping("/{role}")
    public ResponseEntity<List<?>> getAccounts(@PathVariable String role) {
        switch (role.toLowerCase()) {
            case "customer":
                return ResponseEntity.ok(accountService.getAllCustomers());
            case "organizer":
                return ResponseEntity.ok(accountService.getAllOrganizers());
            case "admin":
                return ResponseEntity.ok(accountService.getAllAdmins());
            default:
                return ResponseEntity.badRequest().build();
        }
    }

    // Get account details by role and ID (fetch account information for edit page)
    @GetMapping("/{role}/{id}")
    public ResponseEntity<?> getAccount(@PathVariable String role, @PathVariable Long id) {
        if ("admin".equals(role)) {
            return ResponseEntity.ok(accountService.getAdminById(id));
        } else if ("customer".equals(role)) {
            return ResponseEntity.ok(accountService.getCustomerById(id));
        } else if ("organizer".equals(role)) {
            return ResponseEntity.ok(accountService.getOrganizerById(id));
        } else {
            return ResponseEntity.badRequest().body("Invalid role");
        }
    }

    // Update account details (save the updated data)
    @PutMapping("/update/{role}/{id}")
    public ResponseEntity<?> editAccount(@PathVariable String role, @PathVariable Long id, @RequestBody AccountDTO accountDTO) {
        String currentUsername = accountService.getUsernameByIdAndRole(id,role);
        if (accountDTO.getUsername() != null && !accountDTO.getUsername().equals(currentUsername)) {

            if (accountService.isUsernameTaken(accountDTO.getUsername())) {
                return ResponseEntity.badRequest().body("Username is already taken.");
            }
        }
        try {
            System.out.println("Edit submit: Role: " + role + ", ID: " + id);

            if ("admin".equals(role)) {
                // Update admin account
                accountService.updateAdmin(id, accountDTO);
            } else if ("customer".equals(role)) {
                // Update customer account
                accountService.updateCustomer(id, accountDTO);
            } else if ("organizer".equals(role)) {
                // Update organizer account
                accountService.updateOrganizer(id, accountDTO);
            } else {
                return ResponseEntity.badRequest().body("Invalid role.");
            }

            // If password is empty, don't update it
            if (accountDTO.getPassword() == null || accountDTO.getPassword().trim().isEmpty()) {
                accountDTO.setPassword(null); // Set to null so password won't be updated
            }

            return ResponseEntity.ok("Account updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating account: " + e.getMessage());
        }
    }


    // delete one account
    @DeleteMapping("/{role}/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable String role, @PathVariable Long id) {
        System.out.println("Received Role: " + role + ", ID: " + id);
        switch (role.toLowerCase()) {
            case "customer":
                accountService.deleteCustomer(id);
                break;
            case "organizer":
                accountService.deleteOrganizer(id);
                break;
            case "admin":
                accountService.deleteAdmin(id);
                break;
            default:
                return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/myAccount")
    public String getMyAccount(@RequestParam(value = "type", required = false) String type, Model model, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Object role = request.getSession().getAttribute("role");
        model.addAttribute("role", role);

        if (type != null) {
            type = type.trim().replaceAll("/$", "").toLowerCase();
        }
        System.out.println("role: " + role);
        System.out.println("type: " + type);

        if (role != null) {
            System.out.println("role not null");
            if ("organizer".equals(type)) {
                Organizer organizer = (Organizer)request.getSession().getAttribute("username");
                if (organizer!= null) {
                    AccountDTO accountDTO = accountService.getAccountByUsernameAndRole(organizer.getUsername(), "organizer");
                    Long accountId = accountService.getIdByUsernameAndRole(organizer.getUsername(), "organizer");

                    System.out.println("UserName: "+organizer.getUsername());
                    System.out.println("AccountDTO: " + accountDTO);
                    System.out.println("AccountID: " + accountId);
                    model.addAttribute("account", accountDTO);
                    model.addAttribute("accountId", accountId);
                    model.addAttribute("role", "organizer");
                    return "myAccountOrganizer";
                } else {
                    model.addAttribute("error", "Organizer information not found.");
                    return "errorPage";
                }
            }
            if ("customer".equals(type)) {
                String username = authentication.getName();
                if (username != null) {
                    Long accountId = accountService.getIdByUsernameAndRole(username, "customer");
                    AccountDTO accountDTO = accountService.getAccountByUsernameAndRole(username, "customer");
                    System.out.println("UserName: "+username);
                    System.out.println("AccountDTO: " + accountDTO);
                    System.out.println("AccountID: " + accountId);
                    model.addAttribute("account", accountDTO);  // Ensure this is correctly passed
                    model.addAttribute("role", "customer");
                    model.addAttribute("accountId", accountId);
                    return "myAccountCustomer";
                } else {
                    model.addAttribute("error", "Customer information not found.");
                    return "errorPage";
                }
            }
        }
        model.addAttribute("error", "You are not logged in or the session has expired.");
        return "errorPage";
    }

}