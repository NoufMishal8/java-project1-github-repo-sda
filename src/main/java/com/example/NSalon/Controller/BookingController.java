//package com.example.NSalon.Controller;
//
//import com.example.NSalon.DTO.BookingRequest;
//import com.example.NSalon.Entity.Booking;
//import com.example.NSalon.Service.Implementation.BookingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class BookingController {
//
//    @Autowired
//    private BookingService bookingService;
//
//    @PostMapping("/addBooking")
//    public ResponseEntity<Booking> createBooking(@RequestBody BookingRequest bookingRequest) {
//        Booking booking = bookingService.createBooking(bookingRequest);
//        return ResponseEntity.status(HttpStatus.CREATED).body(booking);
//    }
//}
