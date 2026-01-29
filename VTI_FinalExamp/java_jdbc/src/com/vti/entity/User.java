package com.vti.entity;

public class User {
    protected int id;
	protected String fullName;
	protected String email;
	protected String password;
	protected int projectId;
	protected Role role;

    public User(int id, String fullName, String email, String password, int projectId, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.projectId = projectId;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getProjectId() {
        return projectId;
    }

    public Role getRole() {
        return role;
    }
}
