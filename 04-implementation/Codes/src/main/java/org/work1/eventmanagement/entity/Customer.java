package org.work1.eventmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    // 在 Customer 和 Organizer 实体类中
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public Customer(String username, String email, String phoneNumber, String password) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // 默认构造函数
    public Customer() {}

    // 带参数的构造函数
    public Customer(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
