package org.example.model;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class DataStore {
//    private List<MenuItem> menuItems;
    private List<User> customers;
    private List<User> staff;
    private List<Booking> bookings;
//    private List<Order> orders;

    // JSON 文件路径
    private static final String USER_FILE = "users.json";

    // 保存数据
    public void saveUsersToFile() {
        try (FileWriter writer = new FileWriter(USER_FILE)) {
            Gson gson = new Gson();
            gson.toJson(customers, writer);  // 保存客户信息
            gson.toJson(staff, writer);      // 保存员工信息
        } catch (IOException e) {
            System.err.println("Error saving users data: " + e.getMessage());
        }
    }

    // 从文件加载用户数据
    public void loadUsersFromFile() {
        try (Reader reader = new FileReader(USER_FILE)) {
            Gson gson = new Gson();
            Type userListType = new TypeToken<List<User>>() {}.getType();
            customers = gson.fromJson(reader, userListType);
            staff = gson.fromJson(reader, userListType);
        } catch (IOException e) {
            System.err.println("Error loading users data: " + e.getMessage());
        }
    }

    // Getter 和 Setter
    public List<User> getCustomers() { return customers; }
    public void setCustomers(List<User> customers) { this.customers = customers; }

    public List<User> getStaff() { return staff; }
    public void setStaff(List<User> staff) { this.staff = staff; }
}

