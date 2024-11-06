package org.scrum.classes;

public class User {
    private int userId;
    private String name;
    private String role;
    private String department;

    // Constructor
    public User(int userId, String name, String role, String department) {
        this.userId = userId;
        this.name = name;
        this.role = role;
        this.department = department;
    }

    // Getters și Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
