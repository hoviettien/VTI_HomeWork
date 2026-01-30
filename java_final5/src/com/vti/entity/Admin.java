package com.vti.entity;

public class Admin extends User {

    public Admin(int id, String fullName, String email, String password, int projectId) {
        super(id, fullName, email, password, projectId, Role.ADMIN);
    }
}