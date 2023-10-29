package com.example.NSalon.Service.Interface;

import com.example.NSalon.Entity.Booking;
import com.example.NSalon.Entity.Customer;

import java.util.List;

public interface BookingServiceInterface {
    public List<Booking> getAllBookings();

    public Booking addBooking(Booking booking);
    String updateBooking(int booking_id,Booking booking);
    Booking patchBooking(int booking_id,Booking BookingUpdate);
    void deleteBooking(int Booking_id);

}
