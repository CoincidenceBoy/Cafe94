package org.example.controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.model.Customer;
import org.example.model.Employee;
import org.example.model.User;

public class LoginController {
    private TextField usernameField;
    private PasswordField passwordField;
    private ComboBox<String> roleComboBox;

    public LoginController(TextField usernameField, PasswordField passwordField, ComboBox<String> roleComboBox) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.roleComboBox = roleComboBox;
    }

    public void handleLogin() {
        // 获取用户输入信息
        String username = usernameField.getText();
        String password = passwordField.getText();
        String selectedRole = roleComboBox.getValue();

        // 检查角色选择
        if (selectedRole == null) {
            System.out.println("请选择一个角色！");
            return;
        }

        // 根据角色创建相应的用户对象
        User user;
        if ("顾客".equals(selectedRole)) {
            user = new Customer();
        } else {
            user = new Employee();
        }

        // 显示登录的用户信息
        System.out.println("用户名: " + username);
        System.out.println("密码: " + password);
        System.out.println("角色: " + selectedRole);

        // 在这里可以加入其他逻辑，比如验证用户信息、跳转到不同的页面等
        System.out.println("登录成功！");
    }
}
