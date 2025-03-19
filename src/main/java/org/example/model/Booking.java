package org.example.model;

public abstract class Booking {
    protected int bookingId;
    protected String bookingDate;
    protected String bookingTime;
    protected int bookingDuration;
    protected String bookingType; // 可选：DineIn 或 Event
    protected String eventDescription; // 仅 Event 类型使用

    // 通用方法
    public abstract void showBookingDetails();

    // Getter 和 Setter
    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public String getBookingDate() { return bookingDate; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }

    public String getBookingTime() { return bookingTime; }
    public void setBookingTime(String bookingTime) { this.bookingTime = bookingTime; }

    public int getBookingDuration() { return bookingDuration; }
    public void setBookingDuration(int bookingDuration) { this.bookingDuration = bookingDuration; }

    public String getBookingType() { return bookingType; }
    public void setBookingType(String bookingType) { this.bookingType = bookingType; }

    public String getEventDescription() { return eventDescription; }
    public void setEventDescription(String eventDescription) { this.eventDescription = eventDescription; }
}

