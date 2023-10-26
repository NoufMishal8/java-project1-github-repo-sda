//package com.example.NSalon.Entity;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Objects;
//import java.util.Set;
//
//@Entity
//@Table(name = "bookings")
//public class Booking {
//
//    private double totalCost;
//    @Id
//int bookingId ;
//
//    @ManyToMany
//    @JoinTable(
//            name = "booking_services",
//            joinColumns = @JoinColumn(name = "booking_id"),
//            inverseJoinColumns = @JoinColumn(name = "service_id")
//    )
//    private Set<ServiceInfo> services = new HashSet<>();
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;
//
//    @ManyToOne
//    @JoinColumn(name = "staff_id")
//    private Staff staff;
//
//    private LocalDateTime bookingDateTime;
//    private String notes;
//
//    // Other fields, getters, and setters
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//
//    public void setStaff(Staff staff) {
//        this.staff = staff;
//    }
//
//    public void setBookingDateTime(LocalDateTime bookingDateTime) {
//        this.bookingDateTime = bookingDateTime;
//    }
//
//    public void setNotes(String notes) {
//        this.notes = notes;
//    }
//
//    public Set<ServiceInfo> getService() {
//        return services;
//    }
//
//    public void setService(Set<ServiceInfo> services) {
//        this.services = services;
//    }
//    public double getTotalCost() {
//        double totalCost = 0.0;
//        for (ServiceInfo service : services) {
//            totalCost += service.getServiceCost();
//        }
//        return totalCost;
//    }
//}



