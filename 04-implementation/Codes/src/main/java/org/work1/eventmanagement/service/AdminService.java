package org.work1.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.work1.eventmanagement.entity.Admin;
import org.work1.eventmanagement.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminByEmail(String email) {
        return adminRepository.findByEmail(email);
    }
}
