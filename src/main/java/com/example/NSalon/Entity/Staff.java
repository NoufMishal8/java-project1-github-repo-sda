package com.example.NSalon.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
//import com.example.NSalon.Entity.Booking.NoBookingsFoundException;


@Entity
@Table(name = "Staff")

public class Staff extends User {
   @Id
   @GeneratedValue
   private int Staff_id;
    private double earnings;
    private String StaffName;

    @OneToOne
    @JoinColumn(name = "User_id")
    private User users ;
    @OneToMany(mappedBy = "staff")
    List<Booking> bookings;
    @ManyToMany(mappedBy = "staff")
    private List<ServiceInfo> services;

    public Staff(String userid, String usernsme , int staff_id, double earnings, String staffName,List<Booking> bookings) {
        super(userid,usernsme);
        Staff_id = staff_id;
        this.earnings = earnings;
        StaffName = staffName;
        this.bookings = bookings;
    }

    public int getStaff_id() {
        return Staff_id;
    }

    public void setStaff_id(int staff_id) {
        Staff_id = staff_id;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String staffName) {
        StaffName = staffName;
    }





    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }



    public List<Booking> checkBookings() {
        if (bookings == null || bookings.isEmpty()) {
            throw new NoBookingsFoundException("No bookings found for this staff.");
        }

        return bookings;
    }


    public Staff(String userid , String usernsme) {
        super(userid,usernsme);
    }

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Staff_id == staff.Staff_id && Double.compare(earnings, staff.earnings) == 0 && Objects.equals(StaffName, staff.StaffName) && Objects.equals(users, staff.users) && Objects.equals(bookings, staff.bookings) && Objects.equals(services, staff.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Staff_id, earnings, StaffName, services, bookings);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Staff_id=" + Staff_id +
                ", earnings=" + earnings +
                ", StaffName='" + StaffName + '\'' +
                ", services=" + services +
                ", bookings=" + bookings +
                '}';
    }
}