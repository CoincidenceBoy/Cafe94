package org.example.model;

public class Customer extends User {
    private String reservationHistory; // 记录顾客的预定历史

    // Getter 和 Setter 方法
    public String getReservationHistory() {
        return reservationHistory;
    }

    public void setReservationHistory(String reservationHistory) {
        this.reservationHistory = reservationHistory;
    }
}
