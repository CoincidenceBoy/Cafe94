package org.example.model;

public class Event extends Booking {
    @Override
    public void showBookingDetails() {
        System.out.println("Event Booking ID: " + bookingId + " for " + eventDescription + " on " + bookingDate + " at " + bookingTime);
    }
}
