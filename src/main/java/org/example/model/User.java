package org.example.model;

// 用户基类
public abstract class User {
    protected int idNumber;
    protected String firstName;
    protected String lastName;
    protected String customerAddress;
    protected String orderHistory; // 用户的订单历史

    // 载入用户数据
    public static void loadUsers(DataStore dataStore) {
        dataStore.loadUsersFromFile();
    }

    // 保存用户数据
    public static void saveUsers(DataStore dataStore) {
        dataStore.saveUsersToFile();
    }

    // Getter 和 Setter 方法
    public int getIdNumber() { return idNumber; }
    public void setIdNumber(int idNumber) { this.idNumber = idNumber; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCustomerAddress() { return customerAddress; }
    public void setCustomerAddress(String customerAddress) { this.customerAddress = customerAddress; }

    public String getOrderHistory() { return orderHistory; }
    public void setOrderHistory(String orderHistory) { this.orderHistory = orderHistory; }
}
