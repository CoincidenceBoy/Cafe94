package org.example.model;

public class Employee extends User {
    private String role; // 员工角色，例如：厨师、服务员等

    // Getter 和 Setter 方法
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
