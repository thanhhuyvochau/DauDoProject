package com.example.SpringBoot_CapstoneSystem_SWP.CapstoneSystem.model;

import javax.persistence.*;

@Entity
@Table(name="account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String account_name;
    private String mail;
    private String password;
    private String phone;
    private String role;
    @Column(name="is_Leader")
    private Boolean isLeader;

    private String gender;

    public User() {
    }

    public User(int id, String account_name, String mail, String password, String phone, String role, Boolean isLeader, String gender) {
        this.id = id;
        this.account_name = account_name;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.isLeader = isLeader;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getLeader() {
        return isLeader;
    }

    public void setLeader(Boolean leader) {
        isLeader = leader;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
