//package com.example.NSalon.Entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.OneToMany;
//
//import java.math.BigDecimal;
//import java.util.List;
////import com.example.NSalon.Entity.Booking.NoBookingsFoundException;
//
//
//@Entity
//public class Staff extends User {
//    private BigDecimal earnings;
//    private String position;
//    private String shift;
//    private String serviceSpecialization;
//
//    public BigDecimal getEarnings() {
//        return earnings;
//    }
//
//    public void setEarnings(BigDecimal earnings) {
//        this.earnings = earnings;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getShift() {
//        return shift;
//    }
//
//    public void setShift(String shift) {
//        this.shift = shift;
//    }
//
//    public String getServiceSpecialization() {
//        return serviceSpecialization;
//    }
//
//    public void setServiceSpecialization(String serviceSpecialization) {
//        this.serviceSpecialization = serviceSpecialization;
//    }
//
//    public List<Booking> getBookings() {
//        return bookings;
//    }
//
//    public void setBookings(List<Booking> bookings) {
//        this.bookings = bookings;
//    }
//
//    private List<Booking> bookings;
//
//
//    public List<Booking> checkBookings() {
//        if (bookings == null || bookings.isEmpty()) {
//            throw new NoBookingsFoundException("No bookings found for this staff.");
//        }
//
//        return bookings;
//    }
//
//
//
//    public double checkEarnings() {
//        if (bookings == null || bookings.isEmpty()) {
//            throw new NoBookingsFoundException("No bookings found for this staff.");
//        }
//
//        double earnings = 0.0;
//
//        for (Booking booking : bookings) {
//            earnings += booking.getTotalCost();
//        }
//
//        return earnings;
//    }
//
//}