package com.example.NSalon.Controller;

import com.example.NSalon.Entity.Booking;
import com.example.NSalon.Entity.ServiceInfo;
import com.example.NSalon.Repository.ServiceRepository;
import com.example.NSalon.Service.Implementation.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/Nouf")
    public String welcome(){
        return "** Nouf is here **";
    }

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return ResponseEntity.ok(bookings);
    }


    @PostMapping("/bookings/add")
    public ResponseEntity<String> addBooking(@RequestBody Booking booking) {
        try {
            Booking bookings = bookingService.addBooking(booking);
            String message = "User Created Successfully";
            return ResponseEntity.status(HttpStatus.CREATED).body(message);
        } catch (Exception e) {
            String errorMessage = "User Not Created" + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }
    @Autowired
    private ServiceRepository serviceInfoRepository;

    @PostMapping("/AddService")
    public ResponseEntity<ServiceInfo> AddService(@RequestBody ServiceInfo serviceInfo) {
        ServiceInfo savedService = serviceInfoRepository.save(serviceInfo);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedService);
    }

    @PutMapping("/bookings/update/{booking_id}")
    public String updateBooking (@PathVariable int booking_id , @RequestBody Booking booking){
        return bookingService.updateBooking(booking_id,booking);
    }
    @PatchMapping("/bookings/patch/{booking_id}")
    public Booking patchBooking(@PathVariable  int booking_id, @RequestBody Booking BookingUpdate) {
        return bookingService.patchBooking( booking_id, BookingUpdate);
    }
    @DeleteMapping("/bookings/delete/{booking_id}")
    public String deleteUser(@PathVariable int booking_id) {
        bookingService.deleteBooking(booking_id);
        return "User deleted";
    }}