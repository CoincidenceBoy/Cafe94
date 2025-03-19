package org.example.model;

public class DineIn extends Booking {
    private int tablesRequired;

    @Override
    public void showBookingDetails() {
        System.out.println("DineIn Booking ID: " + bookingId + " on " + bookingDate + " at " + bookingTime);
    }

    // Getter 和 Setter
    public int getTablesRequired() { return tablesRequired; }
    public void setTablesRequired(int tablesRequired) { this.tablesRequired = tablesRequired; }
}
