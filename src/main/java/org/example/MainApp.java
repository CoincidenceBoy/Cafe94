package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.controller.LoginController;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 创建标签
        Label label = new Label("请输入用户名、密码以及用户角色:");

        // 创建文本框
        TextField usernameField = new TextField();
        usernameField.setPromptText("用户名");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("密码");

        // 创建角色选择框
        ComboBox<String> roleComboBox = new ComboBox<>();
        roleComboBox.getItems().addAll("顾客", "员工");
        roleComboBox.setPromptText("选择角色");

        // 创建登录按钮
        Button loginButton = new Button("登录");

        // 创建控制器
        LoginController loginController = new LoginController(usernameField, passwordField, roleComboBox);

        // 登录按钮点击事件
        loginButton.setOnAction(event -> loginController.handleLogin());

        // 创建布局和场景
        VBox layout = new VBox(10, label, usernameField, passwordField, roleComboBox, loginButton);
        Scene scene = new Scene(layout, 400, 250);

        // 设置舞台
        primaryStage.setTitle("用户登录");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
