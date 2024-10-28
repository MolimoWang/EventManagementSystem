package org.work1.eventmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.work1.eventmanagement.entity.DinnerTable;
import org.work1.eventmanagement.entity.Role;
import org.work1.eventmanagement.repository.RoleRepository;
import org.work1.eventmanagement.repository.TableRepository;
import org.work1.eventmanagement.repository.UserRepository;

import jakarta.annotation.PostConstruct;


@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private TableRepository tableRepository;


    @Override
    public void run(String... args) throws Exception {
        // 检查是否存在 ADMIN 角色，不存在则创建
        if (!roleRepository.existsByName("ADMIN")) {
            Role adminRole = new Role();
            adminRole.setName("ADMIN");
            roleRepository.save(adminRole);
        }

        // 检查是否存在 ORGANIZER 角色，不存在则创建
        if (!roleRepository.existsByName("ORGANIZER")) {
            Role organizerRole = new Role();
            organizerRole.setName("ORGANIZER");
            roleRepository.save(organizerRole);
        }

        // 检查是否存在 USER 角色，不存在则创建
        if (!roleRepository.existsByName("USER")) {
            Role userRole = new Role();
            userRole.setName("USER");
            roleRepository.save(userRole);
        }

        if (tableRepository.count() == 0) {
            // 如果没有任何表记录，插入表数据
            tableRepository.save(new DinnerTable(1, 4));
            tableRepository.save(new DinnerTable(2, 4));
            tableRepository.save(new DinnerTable(3, 4));
            tableRepository.save(new DinnerTable(4, 2));
            tableRepository.save(new DinnerTable(5, 2));
            tableRepository.save(new DinnerTable(6, 10));
            tableRepository.save(new DinnerTable(7, 10));
            tableRepository.save(new DinnerTable(8, 10));
            tableRepository.save(new DinnerTable(9, 6));
            tableRepository.save(new DinnerTable(10, 6));
            tableRepository.save(new DinnerTable(11, 6));
            tableRepository.save(new DinnerTable(12, 6));
        } else {
            System.out.println("Tables already exist in the database");
        }
}}
