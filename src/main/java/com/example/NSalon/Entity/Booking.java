package com.example.NSalon.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {

    private double totalCost;
    private String BookingName;

    public Booking(double totalCost, String bookingName, int booking_id, List<ServiceInfo> services, Customer customers, Staff staff, LocalDateTime bookingDateTime) {
        this.totalCost = totalCost;
        BookingName = bookingName;
        this.booking_id = booking_id;
        this.services = services;
        this.customers = customers;
        this.staff = staff;
        this.bookingDateTime = bookingDateTime;
    }

    public Booking() {
    }

    public LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public String getBookingName() {
        return BookingName;
    }

    public void setBookingName(String bookingName) {
        BookingName = bookingName;
    }

    @Id
    @GeneratedValue
    private int booking_id;

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    @ManyToMany
    @JoinTable(
            name = "bookingServices",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private List<ServiceInfo> services;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    private LocalDateTime bookingDateTime;
    private String notes;


//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }


    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

}
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




