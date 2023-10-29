package com.example.NSalon.Service.Implementation;

import com.example.NSalon.Entity.*;
import com.example.NSalon.Repository.*;
import com.example.NSalon.Service.Interface.BookingServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService implements BookingServiceInterface {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }


    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }


    public String updateBooking(int booking_id, Booking booking) {
        Optional<Booking> bookingFound = bookingRepository.findById(booking_id);
        if(bookingFound.isPresent()){
            booking.setBooking_id(booking.getBooking_id());
            //3.Save it in the dataBase
            bookingRepository.save(booking);
            return "Booking details updated";
        }
        else
        {
            return "Booking with Booking Id " + booking_id+"not found";
        }
    }


    public Booking patchBooking(int bookingId, Booking updatedBooking) {
        Booking existingBooking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new EntityNotFoundException("Booking not found"));

        if (updatedBooking.getBookingName() != null) {
            existingBooking.setBookingName(updatedBooking.getBookingName());
        }
        if (updatedBooking.getBookingDateTime() != null) {
            existingBooking.setBookingDateTime(updatedBooking.getBookingDateTime());
        }
        // Add similar lines for other fields...

        return bookingRepository.save(existingBooking);
    }

    public void deleteBooking(int bookingId) {
        Booking existingBooking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new EntityNotFoundException("Booking not found"));

        bookingRepository.delete(existingBooking);
    }
}



